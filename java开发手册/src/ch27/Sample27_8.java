package ch27;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.color.*;
import java.io.*;
public class Sample27_8 extends JFrame implements ActionListener
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
	JFileChooser jfc=new JFileChooser("d:\\");
	//�����˵������˵��Լ��˵���
	JMenuBar jmb=new JMenuBar();
	JMenu jm=new JMenu("����˾�����");
	JMenuItem[] jmi={new JMenuItem("��ǿ��Ե"),new JMenuItem("��"),
	                 new JMenuItem("ģ��"),new JMenuItem("����")};
	//������ʾ��ͬ�˾��ľ����������
	float[][] data =
	{
	 //��ǿ��Ե
	 {0f,-1f,0f,
	  -1f,5f,-1f,
	  0f,-1f,0f},
	 //�� 
     {-0.125f,-0.125f,-0.125f,
      -0.125f,2f,-0.125f,
      -0.125f,-0.125f,-0.125f},
     //ģ��	
     {0.09375f,0.09375f,0.09375f,
      0.09375f,0.25f,0.09375f,
      0.09375f,0.09375f,0.09375f},
     //����
     {2f,0f,2f,
      0f,0f,0f,
      2f,0f,-5f}
    };	
	//����һ��ͼ������
	ImageIcon ii;
	public Sample27_8()
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
		this.add(jsp);
		//ѭ�����˵�����ӽ��˵�����Ϊÿ���˵���ע�ᶯ���¼�������
		for(int i=0;i<jmi.length;i++)
		{
			jm.add(jmi[i]);
			jmi[i].addActionListener(this);
		}
		//���˵���ӽ��˵����������˵�����ӽ�����
		jmb.add(jm);
		this.setJMenuBar(jmb);
		//���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("����˾�����ʾ��");
		this.setBounds(0,0,1000,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//ʵ��ActionListener�ӿ��е��¼�������
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<jmi.length;i++)
		{
			if(e.getSource()==jmi[i])
			{//���¼�Դ�����жϣ�����ʹ����һ�־��������д���
				//��ȡ������ͼ��Ŀ����߶�
				int width=ii.getImage().getWidth(null);
				int height=ii.getImage().getHeight(null); 
				//��������BufferedImage����ֱ��������ô�����ͼ���봦����ͼ��     
				BufferedImage sourceBuf=
				     new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
				BufferedImage targetBuf=
				     new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
				//��������ͼ����Ƽ��ص�ԴBufferedImage������
				Graphics g=sourceBuf.getGraphics();
				g.drawImage(ii.getImage(),0,0,Color.white,null);     
				//������װ��������Kernel����	
				Kernel kernel = new Kernel(3,3,data[i]);
				//����ConvolveOp���󲢽��о������
				ConvolveOp co = new ConvolveOp(kernel,ConvolveOp.EDGE_NO_OP,null);
				co.filter(sourceBuf,targetBuf);		
				//��ȡ������ͼ�����õ�Ŀ���ǩ��
				jlt.setIcon(new ImageIcon(targetBuf));
			}	
		}
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
		//����Sample27_8�������
		new Sample27_8();
	}
}
