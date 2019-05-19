import java.security.*;
import javax.crypto.*;
import java.io.*;
import javax.crypto.spec.*;
import java.security.cert.*;
import java.util.Scanner;

public class recver
{
	public static final int kBufferSize = 8192;
	public static KeyStore oKs;
	public static String okeystorefile;
	public static String oAlias;
	public static String oPasswd;
	public static String oSendcert;
	public static String oInputfile;
	public static String oOutputfile;
	
	public static void main(String[] args)
	{
		try
		{
			Scanner In=new Scanner(System.in);
			System.out.println("----欢迎使用安全报文系统接收端----");
			System.out.print("请输入接收者的keystore文件:");
			okeystorefile = In.next();
			System.out.print("请输入keystore别名:");
			oAlias = In.next();
			System.out.print("请输入keystore口令:");
			oPasswd = In.next();
			System.out.print("请输入发送者的证书:");
			oSendcert = In.next();
			System.out.print("请输入接收到的文件:");
			oInputfile = In.next();
			System.out.print("请输入解密数据存放文件:");
			oOutputfile = In.next();
			In.close();
			//打开接收者keystore文件
			oKs = KeyStore.getInstance("JKS");
			java.io.FileInputStream fis = new java.io.FileInputStream(okeystorefile);
			oKs.load(fis, oPasswd.toCharArray());
			fis.close();
	    
			/*
	     	密文文件格式：
	     	|签名信息长度4Bytes|签名信息|会话密钥的密文长度4Bytes|会话密钥密文|原文数据的密文
			 */
	    
			//读取签名值、会话密钥的密文
			int len;
			byte[] blen = new byte[4];
			java.io.FileInputStream fin = new java.io.FileInputStream(oInputfile);
			try{
				fin.read(blen);//读取签名值长度
			}catch (Exception e){
				e.printStackTrace();
				return;
			}
			len = (blen[0] & 0xff) | ((blen[1] << 8) & 0xff00) |((blen[2] << 24) >>> 8) | (blen[3] << 24);
			byte[] signedBuf = new byte[len];
			try{
				fin.read(signedBuf);//读取签名值
			}catch (Exception e){
				e.printStackTrace();
				return;
			}
			try{
				fin.read(blen);//读取密文会话密钥长度
			}catch (Exception e){
				e.printStackTrace();
				return;
			}
			len = (blen[0] & 0xff) | ((blen[1] << 8) & 0xff00) |((blen[2] << 24) >>> 8) | (blen[3] << 24);
			byte[] cipherkey = new byte[len];
			try{
				fin.read(cipherkey);//读取密文会话密钥
			}catch (Exception e)
			{
				e.printStackTrace();
				return;
			}
			System.out.println("读取签名信息signedBuf如下:");
			PrintHex(signedBuf,signedBuf.length);
			System.out.println("读取密文会话密钥cipherkey如下:");
			PrintHex(cipherkey,cipherkey.length);
			//解密cipherkey
			Cipher cipherRsa = Cipher.getInstance("RSA/ECB/PKCS1Padding",new org.bouncycastle.jce.provider.BouncyCastleProvider());
			Key oRsaKey = oKs.getKey(oAlias, oPasswd.toCharArray());
			cipherRsa.init(Cipher.DECRYPT_MODE,oRsaKey);
			byte[] keyencode = cipherRsa.doFinal(cipherkey);
			System.out.println("解密cipherkey得到会话密钥如下:");
			PrintHex(keyencode,keyencode.length);
			Key oKey = new SecretKeySpec(keyencode, "DES");
			//解密密文
			System.out.println("利用会话密钥解密密文并将解密后的数据写入文件"+oOutputfile+"...");
			byte[] buffer = new byte[kBufferSize];
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE,oKey);
			byte[] plainbuffer = null;
			java.io.FileOutputStream fout = new java.io.FileOutputStream(new File(oOutputfile));
			try{
				while ((len = fin.read(buffer)) != -1){
			 		plainbuffer = cipher.update(buffer,0,len);
					fout.write(plainbuffer);
				}
				fin.close();
				System.out.println("");
			}catch (Exception e){
				e.printStackTrace();
			}
			plainbuffer = cipher.doFinal();
			fout.write(plainbuffer);
			fout.close();
			System.out.println("解密后的数据如下：");
			InputStream in = new FileInputStream(oOutputfile);
	        //循环取出数据
	        while (in.read(buffer) != -1) {
	            System.out.println(new String(buffer,"UTF-8"));
	        }
	        in.close();//关闭流
	        System.out.println();
			//验证签名
			//读取证书
		 	InputStream inStream = new FileInputStream(oSendcert);
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			X509Certificate oCert = (X509Certificate)cf.generateCertificate(inStream);
			inStream.close();
			Signature oSign = Signature.getInstance("SHA1withRSA");
			oSign.initVerify(oCert);
			fin = new  FileInputStream(new File(oOutputfile));
			try{
				while ((len = fin.read(buffer)) != -1){
					 oSign.update(buffer,0,len);
				}
				fin.close();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		
			//验证签名
			boolean bVerifyed=false;
			try{
				bVerifyed = oSign.verify(signedBuf);
			}catch (SignatureException e){
				bVerifyed=false;
			}
			if(bVerifyed){
				System.out.println("验证签名正确。");
			}else{
				System.out.println("验证签名不正确，原文可能被篡改!");
			}
	 	}catch (Exception e){
			System.out.println("Err");
			e.printStackTrace();
		}
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