package ch27;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.image.codec.jpeg.*;
import java.awt.image.*;
import java.io.*;
//��չJFrame��
public class Sample27_5 extends JFrame implements ActionListener
{
	//�������ֲ˵��ؼ�
	private JMenuBar jmb=new JMenuBar();
	private JMenu jm=new JMenu("����");
	private JMenuItem[] jmi={new JMenuItem("��ʼ��ͼ"),new JMenuItem("�ļ�����"),
							new JMenuItem("�������"),new JMenuItem("�˳�")};
	//����������ʾץȡͼ��ı�ǩ
	private JLabel jl=new JLabel();
	//�������ñ�ǩ�Ĺ�������
	private JScrollPane jsp=new JScrollPane(jl);
	//�����ļ�ѡ����
	private JFileChooser jfc=new JFileChooser();
	//����Image���͵�����image
	private Image image;
	public Sample27_5()
	{
		for(int i=0;i<jmi.length;i++)
		{//���˵�����ӽ��˵�����Ϊ�˵���ע�ᶯ���¼�������
			jm.add(jmi[i]);
			jmi[i].addActionListener(this);
		}
		//���ø����˵���Ŀ�ݼ�
		jmi[0].setAccelerator
		  (KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK+InputEvent.ALT_MASK));
		jmi[1].setAccelerator
		  (KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));
		jmi[2].setAccelerator
		  (KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_MASK));
		jmi[3].setAccelerator
		  (KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK));
		//���ò˵���Ŀ���״̬
		this.setMenuItemStatus(false);
		//���˵���ӽ��˵����������˵������õ�������
		jmb.add(jm);
		this.setJMenuBar(jmb);
		//��������ǩ�Ĺ���������ӽ�������
		this.add(jsp);
		//���ô���Ĵ�Сλ�á������Լ��ɼ���
		this.setBounds(100,100,500,400);
		this.setTitle("ץ�����ʾ��");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//���ò˵������״̬�ķ���
	public void setMenuItemStatus(boolean flag)
	{//flag==true �Ѿ�ץ�� flag==false û��ץ�� 
		jmi[1].setEnabled(flag);
		jmi[2].setEnabled(flag);
	}
	//ʵ��ActionListener�ӿ��еķ���
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jmi[0])
		{//�����ͼ�˵���ִ�еĴ���
			//�Ƚ�������С��
			this.setExtendedState(JFrame.ICONIFIED);
			//��ȡ��ǰ��Ļͼ��
			image=this.captureImage();
			//���������
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
			//����ͼ���ڱ�ǩ����ʾ
			jl.setIcon(new ImageIcon(image));
			//���ò˵���Ŀ���״̬
			this.setMenuItemStatus(true);
		}
		else if(ae.getSource()==jmi[1])
		{//��������ļ��˵���ִ�еĴ���
			this.saveAs();
		}
		else if(ae.getSource()==jmi[2])
		{//���������ݲ˵���ִ�еĴ���
			//���ñ�ǩ����Ϊ��
			jl.setIcon(null);
			//���ò˵���Ŀ���״̬
			this.setMenuItemStatus(false);
			//��image�����ÿ�
			image=null;
		}
		else if(ae.getSource()==jmi[3])
		{//����˳��˵���ִ�еĴ���
			System.exit(0);
		}
	}
	public Image captureImage()
	{
		Image temp=null;
		try
		{
			//����Robot����
			Robot r=new Robot();
			//��ȡ��Ļ�ĳߴ��С
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			//���ý�ͼ������
			Rectangle rec=new Rectangle(0,0,d.width,d.height);
			//�����ӳ�
			Thread.sleep(100);
			//��ȡָ�������ͼ��
			temp=r.createScreenCapture(rec);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return temp;//��ͼ�񷵻�
	}
	//����ץȡͼƬ�ķ���
	public void saveAs()
	{
		int save=jfc.showSaveDialog(this);//���������ļ��Ի���
		if(save==JFileChooser.APPROVE_OPTION)//����������ִ�еĴ���
		{
			try
			{   //�����û���ѡ������Ҫ������ļ���
				String fname=jfc.getSelectedFile().getPath()+".jpg";
				//����һ�������
				FileOutputStream fos=new FileOutputStream(fname);
				//���������װ��JPEG�������У�������������ӵ�������
				JPEGImageEncoder jie=JPEGCodec.createJPEGEncoder(fos);
				//��ָ��ͼ����б���
				jie.encode((BufferedImage)image);
				//ˢ�²��ر������
				fos.flush();
				fos.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}		
	}
	public static void main(String[] args)
	{
		//����Sample27_5�������
		new Sample27_5();
	}
}
