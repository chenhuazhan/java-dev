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
			System.out.println("----��ӭʹ�ð�ȫ����ϵͳ���Ͷ�----");
			System.out.print("�����뷢����keystore�ļ�:");
			okeystorefile = In.next();
			System.out.print("������keystore����:");
			oAlias = In.next();
			System.out.print("������keystore����:");
			oPasswd = In.next();
			System.out.print("����������ߵ�֤��:");
			oRecvcert = In.next();
			System.out.print("����������͵��ļ�:");
			oInputfile = In.next();
			System.out.print("������������ݴ���ļ�:");
			oOutputfile = In.next();
			In.close();
			//�򿪷�����keystore�ļ�
			oKs = KeyStore.getInstance("JKS");
			java.io.FileInputStream fis = new java.io.FileInputStream(okeystorefile);
			oKs.load(fis, oPasswd.toCharArray());
			fis.close();
			//��������Ự��Կ
			KeyGenerator keyGen = KeyGenerator.getInstance("DES");
			keyGen.init(56);
			Key key = keyGen.generateKey();
		 	byte[] keyencode=key.getEncoded();
			System.out.println("��������Ự��Կ:");
		 	PrintHex(keyencode,keyencode.length);
		 	
		 	
		 	
		 	//��ȡ������֤��
		 	InputStream inStream = new FileInputStream(oRecvcert);
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			X509Certificate oCert = (X509Certificate)cf.generateCertificate(inStream);
			inStream.close();
			//ʹ�ý�����֤����ܻỰ��Կ
			System.out.println("ʹ�ý����߹�Կ���ܻỰ��Կ:");
			Cipher cipherRsa = Cipher.getInstance("RSA/ECB/PKCS1Padding",new org.bouncycastle.jce.provider.BouncyCastleProvider());
			cipherRsa.init(Cipher.ENCRYPT_MODE, oCert);
			byte[] cipherkey = cipherRsa.doFinal(keyencode);
			PrintHex(cipherkey,cipherkey.length);
		 
			//��ԭ�Ľ���ǩ��
			Key oKey = oKs.getKey(oAlias, oPasswd.toCharArray());
			//����ǩ������
			Signature oSign = Signature.getInstance("SHA1withRSA");
			//��ʼ��ǩ������
			oSign.initSign((PrivateKey)oKey); //����Ϊǩ����˽Կ����
			byte[] signedBuf = null;
			byte[] buffer = new byte[kBufferSize];
			int len;
			FileInputStream fin = new  FileInputStream(new File(oInputfile));
			try{
				System.out.println(oInputfile+"�ļ�����Ϊ��");
				while ((len = fin.read(buffer)) != -1){
					oSign.update(buffer,0,len);
					String str = new String(buffer,0,len,"UTF-8"); 
		            System.out.println(str);     //��ӡ�ļ�����
				}
				fin.close();
			}catch (Exception e){
				System.out.println("Err");
				e.printStackTrace();
			}		
			//���ǩ��ֵ
			signedBuf = oSign.sign();
			System.out.println("��ԭ��ǩ����ǩ����ϢsignedBuf����:");
			PrintHex(signedBuf,signedBuf.length);
			
			//ʹ�ûỰ��Կ���ļ����ܡ�
			System.out.println("ʹ�ûỰ��Կ���ļ�����...");
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE,key);
			fin = new java.io.FileInputStream(new File(oInputfile));
			// |ǩ����Ϣ����4Bytes|ǩ����Ϣ|�Ự��Կ�����ĳ���4Bytes|�Ự��Կ����|ԭ�����ݵ�����
			java.io.FileOutputStream fout = new java.io.FileOutputStream(new File(oOutputfile));
			byte[] blen = new byte[4];
			int datalen = signedBuf.length;
			blen[0] = (byte)(datalen & 0xff);
			blen[1] = (byte)((datalen >> 8) & 0xff);
			blen[2] = (byte)((datalen >> 16) & 0xff);
			blen[3] = (byte)(datalen >>> 24);
			fout.write(blen);//д��ǩ��ֵ���ȵ�����ļ�
			fout.write(signedBuf);//д��ǩ��ֵ������ļ�
			datalen = cipherkey.length;
			blen[0] = (byte)(datalen & 0xff);
			blen[1] = (byte)((datalen >> 8) & 0xff);
			blen[2] = (byte)((datalen >> 16) & 0xff);
			blen[3] = (byte)(datalen >>> 24);
			fout.write(blen);//д�����ĻỰ��Կ���ȵ�����ļ�
			fout.write(cipherkey);//д�����ĻỰ��Կ������ļ�		
			byte[] cipherbuffer = null;
			try{
				while ((len = fin.read(buffer)) != -1)//��ȡԭ�ģ����ܲ�д���ĵ�����ļ���
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
		System.out.println("�������");
		
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