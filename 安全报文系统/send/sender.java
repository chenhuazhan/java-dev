import java.security.*;
import javax.crypto.*;
import java.io.*;
import javax.crypto.spec.*;
import java.security.cert.*;
import java.util.Scanner;

public class sender
{
	public static final int kBufferSize = 8192;
	public static KeyStore oKs;
	public static String okeystorefile;
	public static String oAlias;
	public static String oPasswd;
	public static String oRecvcert;
	public static String oInputfile;
	public static String oOutputfile;
	
	public static void main(String[] args)
	{
		try{
			Scanner In=new Scanner(System.in);
			System.out.println("----欢迎使用安全报文系统发送端----");
			System.out.print("请输入发送者keystore文件:");
			okeystorefile = In.next();
			System.out.print("请输入keystore别名:");
			oAlias = In.next();
			System.out.print("请输入keystore口令:");
			oPasswd = In.next();
			System.out.print("请输入接收者的证书:");
			oRecvcert = In.next();
			System.out.print("请输入待传送的文件:");
			oInputfile = In.next();
			System.out.print("请输入加密数据存放文件:");
			oOutputfile = In.next();
			In.close();
			//打开发送者keystore文件
			oKs = KeyStore.getInstance("JKS");
			java.io.FileInputStream fis = new java.io.FileInputStream(okeystorefile);
			oKs.load(fis, oPasswd.toCharArray());
			fis.close();
			//产生随机会话密钥
			KeyGenerator keyGen = KeyGenerator.getInstance("DES");
			keyGen.init(56);
			Key key = keyGen.generateKey();
		 	byte[] keyencode=key.getEncoded();
			System.out.println("产生随机会话密钥:");
		 	PrintHex(keyencode,keyencode.length);
		 	
		 	
		 	
		 	//读取接收者证书
		 	InputStream inStream = new FileInputStream(oRecvcert);
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			X509Certificate oCert = (X509Certificate)cf.generateCertificate(inStream);
			inStream.close();
			//使用接收者证书加密会话密钥
			System.out.println("使用接收者公钥加密会话密钥:");
			Cipher cipherRsa = Cipher.getInstance("RSA/ECB/PKCS1Padding",new org.bouncycastle.jce.provider.BouncyCastleProvider());
			cipherRsa.init(Cipher.ENCRYPT_MODE, oCert);
			byte[] cipherkey = cipherRsa.doFinal(keyencode);
			PrintHex(cipherkey,cipherkey.length);
		 
			//对原文进行签名
			Key oKey = oKs.getKey(oAlias, oPasswd.toCharArray());
			//创建签名对象
			Signature oSign = Signature.getInstance("SHA1withRSA");
			//初始化签名对象
			oSign.initSign((PrivateKey)oKey); //参数为签名者私钥对象
			byte[] signedBuf = null;
			byte[] buffer = new byte[kBufferSize];
			int len;
			FileInputStream fin = new  FileInputStream(new File(oInputfile));
			try{
				System.out.println(oInputfile+"文件内容为：");
				while ((len = fin.read(buffer)) != -1){
					oSign.update(buffer,0,len);
					String str = new String(buffer,0,len,"UTF-8"); 
		            System.out.println(str);     //打印文件内容
				}
				fin.close();
			}catch (Exception e){
				System.out.println("Err");
				e.printStackTrace();
			}		
			//获得签名值
			signedBuf = oSign.sign();
			System.out.println("对原文签名，签名信息signedBuf如下:");
			PrintHex(signedBuf,signedBuf.length);
			
			//使用会话密钥对文件加密。
			System.out.println("使用会话密钥对文件加密...");
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE,key);
			fin = new java.io.FileInputStream(new File(oInputfile));
			// |签名信息长度4Bytes|签名信息|会话密钥的密文长度4Bytes|会话密钥密文|原文数据的密文
			java.io.FileOutputStream fout = new java.io.FileOutputStream(new File(oOutputfile));
			byte[] blen = new byte[4];
			int datalen = signedBuf.length;
			blen[0] = (byte)(datalen & 0xff);
			blen[1] = (byte)((datalen >> 8) & 0xff);
			blen[2] = (byte)((datalen >> 16) & 0xff);
			blen[3] = (byte)(datalen >>> 24);
			fout.write(blen);//写入签名值长度到输出文件
			fout.write(signedBuf);//写入签名值到输出文件
			datalen = cipherkey.length;
			blen[0] = (byte)(datalen & 0xff);
			blen[1] = (byte)((datalen >> 8) & 0xff);
			blen[2] = (byte)((datalen >> 16) & 0xff);
			blen[3] = (byte)(datalen >>> 24);
			fout.write(blen);//写入密文会话密钥长度到输出文件
			fout.write(cipherkey);//写入密文会话密钥到输出文件		
			byte[] cipherbuffer = null;
			try{
				while ((len = fin.read(buffer)) != -1)//读取原文，加密并写密文到输出文件。
				{				
					cipherbuffer = cipher.update(buffer,0,len);
					fout.write(cipherbuffer);
				}
				fin.close();
			}catch (Exception e){
				e.printStackTrace();
			}
			cipherbuffer = cipher.doFinal();
			fout.write(cipherbuffer);
			fout.close();
	 	}catch (Exception e){
			System.out.println("Err");
			e.printStackTrace();
		}
		System.out.println("加密完成");
		
	}
	public static void PrintHex(byte data[],int len)
	{
		int i;
		int tmp;
		String Tmp="";	
		for(i=0; i<len; i++)
		{
			if(i%16 == 0)
			{
				System.out.println("");
				//0x0000
				if(i<0x10)
					Tmp = "0x000";
				if((i<0x100) && (i>=0x10))
					Tmp = "0x00";
				if((i>=0x100)&&(i<0x1000))
					Tmp = "0x0";
				if(i>=0x1000)
					Tmp = "0x";		
				System.out.print(Tmp+Integer.toHexString(i)+"h: ");	
			}
			tmp = data[i];
			if(tmp < 0)
				tmp = 256 + tmp;
			if(tmp <0x10)
				System.out.print("0"+Integer.toHexString(tmp) +" ");
			else
				System.out.print(Integer.toHexString(tmp) +" ");						
		}
		System.out.println("\n");
	}
}