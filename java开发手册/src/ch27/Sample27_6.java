package ch27;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.color.*;
import java.io.*;
public class Sample27_6 extends JFrame
{
	//������ʾԴͼ��ı�ǩ
	JLabel jls=new JLabel();
	//����ʾԴͼ��ı�ǩ�ŵ�����������
	JScrollPane jspz=new JScrollPane(jls);
	//������ʾĿ��ͼ��ı�ǩ
	JLabel jlt=new JLabel();
	//����ʾĿ��ͼ��ı�ǩ�ŵ�����������
	JScrollPane jspy=new JScrollPane(jlt);
	//�����ָ��
	JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jspz,jspy);
	//�����ļ�ѡ����
	JFileChooser jfc=new JFileChooser("D:\\");
	public Sample27_6()
	{
		//����ѡ���ͼƬ
		ImageIcon ii=this.chooserFile();
		//��ͼƬ���õ�Դ��ǩ��
		jls.setIcon(ii);
		//����Դͼ���ǩ��ˮƽ����ֱ���뷽ʽΪ����
		jls.setVerticalAlignment(JLabel.CENTER);
		jls.setHorizontalAlignment(JLabel.CENTER);
		//����Ŀ��ͼ���ǩ��ˮƽ����ֱ���뷽ʽΪ����
		jlt.setVerticalAlignment(JLabel.CENTER);
		jlt.setHorizontalAlignment(JLabel.CENTER);
		//��ȡ�����ͼ���Ӧ��ͼ��
		ii=this.processGrayImage(ii.getImage());
		//��������ͼƬ���õ�Ŀ���ǩ��
		jlt.setIcon(ii);
		//���÷ָ����ĳ�ʼλ��
		jsp.setDividerLocation(500);
		//���÷ָ����Ŀ��
		jsp.setDividerSize(4);
		//���ָ����ӵ�������
		this.add(jsp);
		//���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("ͼ��Ҷȴ�����ʾ");
		this.setBounds(0,0,1000,500);
		this.setVisible(true);
		//���ô����Ĭ�Ϲرն���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
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
		else
		{
			return null;
		}		
	}	
	//��ͼ����лҶȴ���ķ���
	public ImageIcon processGrayImage(Image source)
	{
		//��ȡͼ��Ŀ����߶�
		int width=source.getWidth(null);
		int height=source.getHeight(null);
		//������ʾԴͼ���BufferedImage����
		BufferedImage sourceBuf=new BufferedImage(
			                           width,height,BufferedImage.TYPE_INT_ARGB);
		//������ʾ�����Ŀ��ͼ���BufferedImage����
		BufferedImage targetBuf=new BufferedImage(
			                        width,height,BufferedImage.TYPE_USHORT_GRAY);
		//��ȡ��ʾԴͼ���BufferedImage����Ļ���
		Graphics g=sourceBuf.getGraphics();
		//���������ͼ����Ƶ�ԴBufferedImage������
		g.drawImage(source,0,0,Color.white,null);      
		//�����������лҶȴ����ColorConvertOp����
		ColorConvertOp cco=new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_sRGB),
		                                 ColorSpace.getInstance(ColorSpace.CS_GRAY),null);
		//���лҶȴ���
		cco.filter(sourceBuf,targetBuf);      
		//���ش����ͼ���Ӧ��ͼ�����
		return new ImageIcon(targetBuf);
	}	
	public static void main(String[] args)
	{
		//����Sample27_6�������
		new Sample27_6();
	}
}
