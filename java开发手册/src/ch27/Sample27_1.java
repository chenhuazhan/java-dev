package ch27;
import java.awt.*;
import javax.swing.*;
public class Sample27_1 extends JFrame
{
	//ͨ�������ڲ���ķ����̳в���չJPanel����Ϊ����
	public JPanel jp=new JPanel()
	{
		//����ָ��ͼƬ��ȡImage����
		Image img=Toolkit.getDefaultToolkit().getImage("E:\\java�����ֲ�\\src\\ch27\\1.jpg");
		//��ͼ���������
		Image tempimg1=img.getScaledInstance(141,106,Image.SCALE_SMOOTH);
		Image tempimg2=img.getScaledInstance(70,53,Image.SCALE_SMOOTH);		
		public void paint(Graphics g)
		{
			//����ԭʼͼ��
			g.drawImage(img,10,10,this);
			//�������ź�ͼ��
			g.drawImage(tempimg1,310,10,this);
			g.drawImage(tempimg2,465,10,this);
		}
	};
	//���幹����
	public Sample27_1()
	{
		//��������ӽ�������
		this.add(jp);
		//���ش���ͼ��ͼ��
		Image icon=Toolkit.getDefaultToolkit().getImage("E:\\java�����ֲ�\\src\\ch27\\2.jpg");
		//���ô���ͼ��
		this.setIconImage(icon);
		//���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setTitle("ͼ�������ʾ");
		this.setBounds(100,100,550,260);
		this.setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	//������
	public static void main(String args[])
	{
		//����Sample27_1�������
		new Sample27_1();
	}
}
