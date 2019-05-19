package ch26;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
//�̳в���չJPanel��
public class Sample26_8 extends JPanel implements ActionListener
{
	//����Բ�Ǿ��εı��������Ĳ���
	int recY=60;
	//�����ַ����Լ���Բ�����Ĳ���
	int rW=60;
	//����ַ����Լ���Բ��������Ĳ���
	int flag=0;
	//������ʱΪ5�����Timer����
	Timer t=new Timer(5,this);
	public Sample26_8()
	{
		//����Timer����
		t.start();
	}
	//��дpaint����
	public void paint(Graphics g) 
	{
		//���Graphics2D����
		Graphics2D g2=(Graphics2D)g;
		//�򿪿����
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			                RenderingHints.VALUE_ANTIALIAS_ON);
		//������䱳��Բ�Ǿ��εĽ���ɫ��ͨ��recY�������ƽ���ɫ�ı仯
		//�Բ���������Ч��
		GradientPaint gp = new GradientPaint(0,recY,Color.WHITE,
											0,recY+60,Color.DARK_GRAY,true);
		//Ϊ�������ý���ɫ
		g2.setPaint(gp);
		//����Բ�Ǿ��ζ���
		RoundRectangle2D rec=new RoundRectangle2D.Double(10,10,370,250,20,20);
		//����Բ�Ǿ��ζ���
		g2.fill(rec);
		//������������Բ�Ľ���ɫ
		gp=new GradientPaint(0,260-rW,Color.WHITE,380,260,Color.BLACK,true);
		//������Բ,��rW����������Բ�ĸ�
		Ellipse2D r = new Ellipse2D.Float(30,260-rW,330,rW);
		//Ϊ�������ý���ɫ
		g2.setPaint(gp);
		//������Բ
		g2.fill(r);
		//��������
		g2.setFont(new Font("Serif",Font.BOLD,85));
		//���û�����ɫ
		g2.setPaint(Color.LIGHT_GRAY);
		//�����ַ�����Ӱ,��rW���������ַ�����λ��
		g2.drawString("Java 2D",50+4,280-rW+4);
		//�������û�����ɫ
		g2.setPaint(Color.DARK_GRAY);
		//�����ַ������壬,��rW���������ַ�����λ��
		g2.drawString("Java 2D",50,280-rW);
	}
	public void actionPerformed(ActionEvent e)
	{
		//����yֵ�Ƿ�С��180����y�Ƿ�����������60
		if(recY<180)
		{
			//��С��180��y��������1������
			recY++;
		}
		else
		{
			//�����Բ�������ʹyֵ���µ���60��
			recY=60;
		}
		//����rwֵ�Ƿ񳬹�180
		if(rW>180)
		{//��rW����180����flagΪ1����ʾ��ԲӦ����������
			flag=1;
		}
		else if(rW<60)
		{//��rWС��60����flagΪ0����ʾ��ԲӦ����������
			flag=0;
		}
		//��������rw������setRW����
		this.setRW();
		//�������»��ƻ���
		this.repaint();
	}
	//����rw������setRW����
	public void setRW()
	{
		if(flag==0)
		{
			//��flagΪ0��rW����
			rW=rW+2;
		}
		else if(flag==1)
		{
			//��flagΪ0��rW�Լ�
			rW=rW-2;
		}
	}
	public static void main(String[] args)
	{
		//��������
		Sample26_8 jp=new Sample26_8();
		//��������
		JFrame jf=new JFrame();
		//��������ӽ�����
		jf.add(jp);
		//���ô����Сλ�á������Լ��ɼ���
		jf.setTitle("Java2D����ʾ��");
		jf.setBounds(100,100,400,300);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
