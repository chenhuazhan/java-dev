package ch27;
import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileFilter;
import java.io.*;
import Acme.JPM.Encoders.*;
public class Sample27_4
{
	public static void main(String args[]) throws Exception 
	{
		//�����ļ��򿪶Ի���
		JFileChooser jfc=new JFileChooser("d:\\");
		//����jpg�ļ����͹�����
		FileFilter filterJpeg = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
		//ɾ��Ĭ�ϵ��ļ���׺���͹�����
		jfc.removeChoosableFileFilter(jfc.getFileFilter());
		//Ϊ�ļ��Ի������ú�׺������
		jfc.addChoosableFileFilter(filterJpeg);		
		//��ʾ�ļ��Ի���
		jfc.showDialog(null,"��ѡ��Ҫת����ͼƬ");
		//��ȡͼƬ�ļ�·��
		String path=jfc.getSelectedFile().getAbsolutePath();
		//��ȡ�ļ���
		String jpegName=jfc.getSelectedFile().getName();
		//�����µ�gif�ļ���
		String gifName=jpegName.substring(0,jpegName.indexOf("."))+".gif";
		//����ͼƬ��ȡImage����
		Image image=(new ImageIcon(path)).getImage();
		System.out.println("����1��ͼƬ�ļ�"+jpegName+"���سɹ�������");
		//���������
		OutputStream fout=new FileOutputStream(gifName);
		//����GifEncoder����
		GifEncoder ge=new GifEncoder(image,fout);
		//���б���
		ge.encode();
		//ˢ�������
		fout.flush();
		//�ر������
		fout.close();
		System.out.println("����2��ͼƬ�ļ�"+gifName+"���ɳɹ�������");	
	}
}
