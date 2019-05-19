package ch26;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//�̳в���չJPanel��
public class Sample26_5 extends JPanel
{
	//��дpaint����
    public void paint(Graphics g)
    {
    	//��ȡGraphics2D����
        Graphics2D g2=(Graphics2D)g;
        //����GradientPaint����ɫ����
        GradientPaint gp=new GradientPaint(0,0,Color.WHITE,100,100,Color.BLACK,true);
        //Ϊ�������ý���ɫ
        g2.setPaint(gp);
        //������Բͼ�ζ���
        Ellipse2D r = new Ellipse2D.Float(10,10,800,200);
       	//���������Բ
       	g2.fill(r);
    }
	public static void main(String[] args)
	{
		//��������
		Sample26_5 jp=new Sample26_5();
		//��������
		JFrame jf=new JFrame();
		//��������ӽ�����
		jf.add(jp);
		//���ô����Сλ�á������Լ��ɼ���
		jf.setTitle("����ɫʾ��");
		jf.setBounds(100,100,830,250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
