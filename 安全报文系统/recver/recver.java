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
			System.out.println("----��ӭʹ�ð�ȫ����ϵͳ���ն�----");
			System.out.print("����������ߵ�keystore�ļ�:");
			okeystorefile = In.next();
			System.out.print("������keystore����:");
			oAlias = In.next();
			System.out.print("������keystore����:");
			oPasswd = In.next();
			System.out.print("�����뷢���ߵ�֤��:");
			oSendcert = In.next();
			System.out.print("��������յ����ļ�:");
			oInputfile = In.next();
			System.out.print("������������ݴ���ļ�:");
			oOutputfile = In.next();
			In.close();
			//�򿪽�����keystore�ļ�
			oKs = KeyStore.getInstance("JKS");
			java.io.FileInputStream fis = new java.io.FileInputStream(okeystorefile);
			oKs.load(fis, oPasswd.toCharArray());
			fis.close();
	    
			/*
	     	�����ļ���ʽ��
	     	|ǩ����Ϣ����4Bytes|ǩ����Ϣ|�Ự��Կ�����ĳ���4Bytes|�Ự��Կ����|ԭ�����ݵ�����
			 */
	    
			//��ȡǩ��ֵ���Ự��Կ������
			int len;
			byte[] blen = new byte[4];
			java.io.FileInputStream fin = new java.io.FileInputStream(oInputfile);
			try{
				fin.read(blen);//��ȡǩ��ֵ����
			}catch (Exception e){
				e.printStackTrace();
				return;
			}
			len = (blen[0] & 0xff) | ((blen[1] << 8) & 0xff00) |((blen[2] << 24) >>> 8) | (blen[3] << 24);
			byte[] signedBuf = new byte[len];
			try{
				fin.read(signedBuf);//��ȡǩ��ֵ
			}catch (Exception e){
				e.printStackTrace();
				return;
			}
			try{
				fin.read(blen);//��ȡ���ĻỰ��Կ����
			}catch (Exception e){
				e.printStackTrace();
				return;
			}
			len = (blen[0] & 0xff) | ((blen[1] << 8) & 0xff00) |((blen[2] << 24) >>> 8) | (blen[3] << 24);
			byte[] cipherkey = new byte[len];
			try{
				fin.read(cipherkey);//��ȡ���ĻỰ��Կ
			}catch (Exception e)
			{
				e.printStackTrace();
				return;
			}
			System.out.println("��ȡǩ����ϢsignedBuf����:");
			PrintHex(signedBuf,signedBuf.length);
			System.out.println("��ȡ���ĻỰ��Կcipherkey����:");
			PrintHex(cipherkey,cipherkey.length);
			//����cipherkey
			Cipher cipherRsa = Cipher.getInstance("RSA/ECB/PKCS1Padding",new org.bouncycastle.jce.provider.BouncyCastleProvider());
			Key oRsaKey = oKs.getKey(oAlias, oPasswd.toCharArray());
			cipherRsa.init(Cipher.DECRYPT_MODE,oRsaKey);
			byte[] keyencode = cipherRsa.doFinal(cipherkey);
			System.out.println("����cipherkey�õ��Ự��Կ����:");
			PrintHex(keyencode,keyencode.length);
			Key oKey = new SecretKeySpec(keyencode, "DES");
			//��������
			System.out.println("���ûỰ��Կ�������Ĳ������ܺ������д���ļ�"+oOutputfile+"...");
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
			System.out.println("���ܺ���������£�");
			InputStream in = new FileInputStream(oOutputfile);
	        //ѭ��ȡ������
	        while (in.read(buffer) != -1) {
	            System.out.println(new String(buffer,"UTF-8"));
	        }
	        in.close();//�ر���
	        System.out.println();
			//��֤ǩ��
			//��ȡ֤��
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
		
			//��֤ǩ��
			boolean bVerifyed=false;
			try{
				bVerifyed = oSign.verify(signedBuf);
			}catch (SignatureException e){
				bVerifyed=false;
			}
			if(bVerifyed){
				System.out.println("��֤ǩ����ȷ��");
			}else{
				System.out.println("��֤ǩ������ȷ��ԭ�Ŀ��ܱ��۸�!");
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