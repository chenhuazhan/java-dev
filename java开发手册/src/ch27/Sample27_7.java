package ch27;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.image.*;
import java.awt.color.*;
import java.io.*;
public class Sample27_7 extends JFrame implements ChangeListener
{
	//������ʾԴͼ��ı�ǩ����������õ�����������
	JLabel jls=new JLabel();
	JScrollPane jspz=new JScrollPane(jls);
	//������ʾĿ��ͼ��ı�ǩ����������õ�����������
	JLabel jlt=new JLabel();
	JScrollPane jspy=new JScrollPane(jlt);
	//�����ָ�񣬲����ø��Ӵ�������ʾ�Ŀؼ�
	JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jspz,jspy);
	//�����ļ�ѡ����
	JFileChooser jfc=new JFileChooser("D:\\");
	//������ʾͨ���ı�ǩ����
	JLabel[] jl={new JLabel("��ɫ"),new JLabel("��ɫ"),new JLabel("��ɫ")};
	//����3���������Ƹ�ͨ����ɫ�����Ļ���
	JSlider[] js={new JSlider(-255,255),new JSlider(-255,255),new JSlider(-255,255)};
	//����һ�����
	JPanel jp=new JPanel();
	//����һ��ͼ������
	ImageIcon ii;
	//�����Զ���Ĺ���������
	MyColorFilter mcf=new MyColorFilter(js[0].getValue(),js[1].getValue(),js[2].getValue());
	public Sample27_7()
	{
		//����ѡ���ͼƬ��ͼ�������
		ii=this.chooserFile();
		//��ͼƬ���õ�Դ��ǩ��
		jls.setIcon(ii);
		//����������ǩ��ˮƽ����ֱ���뷽ʽ
		jls.setVerticalAlignment(JLabel.CENTER);
		jls.setHorizontalAlignment(JLabel.CENTER);
		jlt.setVerticalAlignment(JLabel.CENTER);
		jlt.setHorizontalAlignment(JLabel.CENTER);
		//��������ͼƬ���õ�Ŀ���ǩ��
		jlt.setIcon(ii);
		//���÷ָ����Ŀ���Լ���ʼλ��
		jsp.setDividerLocation(500);
		jsp.setDividerSize(4);
		//���ָ����ӵ�������
		this.add(jsp,BorderLayout.CENTER);
		//����ǩ�Լ�������ӵ�����У���Ϊ����ע�������
		for(int i=0;i<js.length;i++)
		{
			jp.add(jl[i]);
			jp.add(js[i]);
			js[i].addChangeListener(this);
		}
		//�������ӵ�������
		this.add(jp,BorderLayout.SOUTH);
		//���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("RGBɫ��ͨ������");
		this.setBounds(0,0,1000,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	//ʵ��ChangeListener�ӿ��е��¼�������
	public void stateChanged(ChangeEvent e)
	{
		//����3��������ֵ
		mcf.setRGBValue(js[0].getValue(),js[1].getValue(),js[2].getValue());
		//��ȡ���˺��ͼ��
	    Image tempImg=createImage(new FilteredImageSource(ii.getImage().getSource(),mcf));
		//��������ͼ����ʾ��Ŀ���ǩ��
		jlt.setIcon(new ImageIcon(tempImg));
	}
	//����ѡ��ͼƬ�ķ���
	public ImageIcon chooserFile()
	{
		//�����ļ�ѡ����
		int i=jfc.showOpenDialog(this);
		//��ȡѡ���ļ���·��
		String dir=(jfc.getSelectedFile()!=null)?(jfc.getSelectedFile().getPath()):null;
		if(dir!=null&&!dir.equals(""))
		{
			//��ָ����·������ͼƬ��ͼ������в�����
			return new ImageIcon(dir);
		}
		return null;
	}
	public static void main(String[] args)
	{
		//����Sample27_7�������
		new Sample27_7();
	}
}
//�Զ����RGBɫ��ͨ����������
class MyColorFilter extends RGBImageFilter
{
	//RGBɫ��ͨ�����Եĵ���ֵ
	int rc,gc,bc;
	public MyColorFilter(int rc,int gc,int bc)
	{//��ʼ������ɫ��ͨ���ĵ���ֵ
		this.rc=rc;this.bc=bc;this.gc=gc;
	}
	public void setRGBValue(int rc,int gc,int bc)
	{//���ø���ɫ��ͨ���ĵ���ֵ
		this.rc=rc;this.bc=bc;this.gc=gc;		
	}
	public int filterRGB(int x, int y, int rgb) 
	{
		//ȡ����ɫͨ���е���ֵ
		int tempRed=(rgb&0x00ff0000)>>16;
		//�Ժ�ɫͨ��ֵ���д���
		tempRed+=rc;
		//�жϴ�������ֵ�Ƿ�Խλ����Խλ����д���
		tempRed=(tempRed<255)?((tempRed>0)?tempRed:0):255;
		//��������ֵ�ƻ�ָ��λ
		tempRed=tempRed<<16;
		//ȡ����ɫͨ���е���ֵ
		int tempGreen=(rgb&0x0000ff00)>>8;
		//����ɫͨ��ֵ���д���
		tempGreen+=gc;
		//�жϴ�������ֵ�Ƿ�Խλ����Խλ����д���
		tempGreen=(tempGreen<255)?((tempGreen>0)?tempGreen:0):255;
		//��������ֵ�ƻ�ָ��λ
		tempGreen=tempGreen<<8;
		//ȡ����ɫͨ���е���ֵ
		int tempBlue=(rgb&0x000000ff);
		//����ɫͨ��ֵ���д���
		tempBlue+=bc;
		//�жϴ�������ֵ�Ƿ�Խλ����Խλ����д���
		tempBlue=(tempBlue<255)?((tempBlue>0)?tempBlue:0):255;	 
		//����������ɫͨ����ֵ����ɫ�����и�8λ��������͸���ȵ�ֵ���а�λ�����㲢����
		return (rgb&0xff000000)|tempRed|tempGreen|tempBlue;
	}  
}
