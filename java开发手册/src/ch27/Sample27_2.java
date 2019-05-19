package ch27;
import java.awt.*;
import javax.swing.*;
//�Զ����ͼ����
class MyIcon implements Icon
{
	//��������ͼ������߶ȵĳ�Ա����
	private int width=400;
	private int height=300;
	//ʵ��paintIcon����
	public void paintIcon(Component c,Graphics g,int x,int y)
	{
		//�򿪿����
		Graphics2D g2=(Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		                                   RenderingHints.VALUE_ANTIALIAS_ON);
		//�Զ����ͼ����ƴ���
		g.setColor(new Color(10,10,10,125));
		g.fillRect(10,10,90,90);
		g.fillOval(260,10,150,90);
		g.setColor(new Color(100,100,100,125));
		g.fillRect(70,70,90,90);
		g.fillOval(320,70,150,90);
		g.setColor(new Color(190,190,190,125));
		g.fillRect(130,130,90,90);	
		g.fillOval(380,130,150,90);	
	}
	//ʵ��getIconWidth����
	public int getIconWidth()
	{
		return this.width;
	}
	///ʵ��getIconHeight����
	public int getIconHeight()
	{
		return this.height;
	}
}
//����
public class Sample27_2 extends JFrame
{
	//���幹����
	public Sample27_2()
	{
		//�����Զ����ͼ�����
		Icon icon=new MyIcon();
		//����������ʾͼ��ı�ǩ
		JLabel jp=new JLabel(icon,JLabel.CENTER);
		//���ñ�ǩ�ı���ɫΪ��ɫ
		jp.setBackground(Color.white);
		//���ñ�ǩ����Ϊ��͸��
		jp.setOpaque(true);
		//����ǩ��ӽ�������
		this.add(jp);
		//���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setTitle("�Զ���ͼ����ʾ");
		this.setBounds(100,100,550,260);
		this.setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//������
	public static void main(String args[])
	{
		//����Sample27_2�������
		new Sample27_2();
	}
}
