package ch26;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//�̳в���չJPanel��
public class Sample26_7 extends JPanel
{
	//��дpaint����
    public void paint(Graphics g)
    {
    	//���û���ΪXORģʽ
   		g.setXORMode(Color.LIGHT_GRAY);
   		//ʹ�ñ���ɫ���л��� ������ɫ+����ɫ=ǳ��ɫ
   		g.setColor(this.getBackground());
   		g.fillOval(10,10,150,100);
   		//ʹ����ͬ��ɫ���������ص���ͼ�Σ�c+c=����ɫ
   		g.setColor(Color.GRAY);
   		g.fillOval(170,10,150,100);
   		g.fillOval(220,10,150,100);
   		//ʹ�ò�ͬ����ɫ���������ص���ͼ�Σ���c+d=c��d�Ļ��ɫ
   		g.fillOval(380,10,150,100);
   		g.setColor(Color.DARK_GRAY);
   		g.fillOval(430,10,150,100);
    }
	public static void main(String[] args)
	{
		//��������
		Sample26_7 jp=new Sample26_7();
		//��������
		JFrame jf=new JFrame();
		//���ô��屳��ɫΪ��ɫ
		jf.setBackground(Color.WHITE);
		//��������ӽ�����
		jf.add(jp);
		//���ô����Сλ�á������Լ��ɼ���
		jf.setTitle("ͼ�α任ʾ��");
		jf.setBounds(100,100,610,150);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
