package ch26;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//�̳в���չJPanel��
public class Sample26_6 extends JPanel
{
	//��дpaint����
    public void paint(Graphics g)
    {
    	//��ȡGraphics2D����
        Graphics2D g2=(Graphics2D)g;
        //������Բ
        Ellipse2D r = new Ellipse2D.Float(400,160,80,40);
        //����2������
        QuadCurve2D e2=new QuadCurve2D.Double(15,125,115,80,175,100);
        //��������AffineTransform����
        AffineTransform atf1=new AffineTransform();
        AffineTransform atf2=new AffineTransform();
        //ѭ�����Ʊ任���ͼ��
        for(int i=1;i<=24;i++)
        {
        	//����ͼ�εĽ�������
        	atf1.scale(0.9,0.9);
        	//����ͼ�ν�����ת
        	atf1.rotate(15.0*Math.PI/180,150,200);
        	//Ϊ�������ñ任
        	g2.setTransform(atf1);
        	//����2������
        	g2.draw(e2);
        	//����ͼ�εĽ�������
        	atf2.scale(0.9,0.9);
        	//����ͼ�ν�����ת
        	atf2.rotate(15.0*Math.PI/180,360,200);
        	//Ϊ�������ñ任
        	g2.setTransform(atf2);
        	//������Բ
        	g2.draw(r);
        }
    }
	public static void main(String[] args)
	{
		//��������
		Sample26_6 jp=new Sample26_6();
		//��������
		JFrame jf=new JFrame();
		//��������ӽ�����
		jf.add(jp);
		//���ô����Сλ�á������Լ��ɼ���
		jf.setTitle("ͼ�α任ʾ��");
		jf.setBounds(100,100,480,250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
