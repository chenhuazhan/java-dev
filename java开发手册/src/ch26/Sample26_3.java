package ch26;

import java.awt.*;
import javax.swing.*;
//�̳в���չJPanel��
public class Sample26_3 extends JPanel
{
	//������ʾ�����С�ĳ���
	static int fs=36;
	//������������
	Font[] f={new Font("����",Font.BOLD|Font.ITALIC,fs),
			new Font("����",Font.BOLD|Font.ITALIC,fs),
			new Font("����",Font.ITALIC,fs),
			new Font("����",Font.ITALIC,fs),
			new Font("����",Font.BOLD,fs),
			new Font("����",Font.BOLD,fs),
			};
	//��дpaint����
	public void paint(Graphics g)
	{
		//���û�����ɫ
		g.setColor(Color.WHITE);
		//���������Ϊ��ɫ
		g.fillRect(0,0,1200,1200);
		//ѭ�����Ʋ�ͬ������ı�
		for(int i=0;i<f.length;i++)
		{
			//��������
			g.setFont(f[i]);
			//���û�����ɫ
			g.setColor(Color.LIGHT_GRAY);
			//��ָ����������ı�����Ӱ���֣�
			g.drawString("���ã���ӭ��������Hello!!!",8+(i%2)*505,43+(i/2)*70);
			//���û�����ɫ
			g.setColor(Color.black);
			//��ָ����������ı���ʵ�ʲ��֣�
			g.drawString("���ã���ӭ��������Hello!!!",5+(i%2)*505,40+(i/2)*70);
		}
	}
	public static void main(String[] args)
	{
		//��������
		Sample26_3 jp=new Sample26_3();
		//��������
		JFrame jf=new JFrame();
		//��������ӽ�����
		jf.add(jp);
		//���ô����Сλ�á������Լ��ɼ���
		jf.setTitle("���Ƹ�������");
		jf.setBounds(0,0,1020,240);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
