package ch26;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//�̳в���չJPanel��
public class Sample26_4 extends JPanel
{
	//��дpaint����
    public void paint(Graphics g)
    {
    	//��ȡGraphics2D����
        Graphics2D g2=(Graphics2D)g;
        //����BasicStroke��������������������
        BasicStroke bs=new BasicStroke(14,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        //Ϊ�������������ķ��
        g2.setStroke(bs);
        //��������ֱ��ͼ�ζ���
        Line2D L1=new Line2D.Double(15,20,230,100);
        Line2D L2=new Line2D.Double(15,100,230,20);
        //��������
        g2.draw(L1);
        g2.draw(L2);
}
	public static void main(String[] args)
	{
		//��������
		Sample26_4 jp=new Sample26_4();
		//��������
		JFrame jf=new JFrame();
		//��������ӽ�����
		jf.add(jp);
		//���ô����Сλ�á������Լ��ɼ���
		jf.setTitle("����������ϸ");
		jf.setBounds(100,100,250,150);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
