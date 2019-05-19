package ch27;
import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileFilter;
import java.io.*;
public class Sample27_3 extends JFrame
{
	//���幹����
	public Sample27_3()
	{
		//�����ļ��򿪶Ի���
		JFileChooser jfc=new JFileChooser("d:\\");
		//����jpg��gif�ļ����͹�����
		FileFilter filterJpeg = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
		FileFilter filterGif = new FileNameExtensionFilter("GIF file", "gif");
		//ɾ��Ĭ�ϵ��ļ���׺���͹�����
		jfc.removeChoosableFileFilter(jfc.getFileFilter());
		//Ϊ�ļ��Ի������ú�׺������
		jfc.addChoosableFileFilter(filterGif);
		jfc.addChoosableFileFilter(filterJpeg);		
		//��ʾ�ļ��Ի���
		jfc.showDialog(this,"��ѡ��Ҫ�򿪵�ͼƬ");
		//��ȡͼƬ�ļ�·��
		String path=jfc.getSelectedFile().getAbsolutePath();		
		//����ͼ�����
		Icon icon=new ImageIcon(path);
		//����������ʾͼ��ı�ǩ
		JLabel jp=new JLabel(icon,JLabel.CENTER);
		//����ǩ��ӽ�����������
		JScrollPane jsp=new JScrollPane(jp);
		//����ǩ��ӽ�������
		this.add(jsp);
		//���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setTitle("ͼƬ������ʾ��ʾ");
		this.setBounds(100,100,640,540);
		this.setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//������
	public static void main(String args[])
	{
		//����Sample27_3�������
		new Sample27_3();
	}
}
