package ch26;

import java.awt.*;
import javax.swing.*;

//�̳в���չJPanel��
public class Sample26_2 extends JPanel {
	// ��дpaint����
	public void paint(Graphics g) {
		// ���û�����ɫ
		g.setColor(new Color(50, 50, 50));
		// �ڻ������Ļ�����Բ
		g.fillOval((this.getWidth() - 200) / 2, (this.getHeight() - 150) / 2, 200, 150);
		// ��������ɫ����Ϊ��ɫ
		g.setColor(Color.WHITE);
		// �ڻ������Ļ���Բ�Ǿ���
		g.fillRoundRect((this.getWidth() - 100) / 2, (this.getHeight() - 75) / 2, 100, 75, 20, 20);
		// ��������ɫ����ָ���Ĵ���͸���ȵ���ɫ
		g.setColor(new Color(200, 200, 200, 200));
		// �ڻ����л�������
		g.fillArc((this.getWidth() - 100) / 2 - 20, (this.getHeight() - 75) / 2 - 20, 100, 75, 0, 270);
		// ��������ɫ����Ϊ��ɫ
		g.setColor(Color.BLACK);
		// �ڻ������Ļ���ֱ��
		g.drawLine((this.getWidth() - 100) / 2, (this.getHeight() - 75) / 2, (this.getWidth() - 100) / 2 + 100,
				(this.getHeight() - 75) / 2 + 75);
	}

	public static void main(String[] args) {
		// ��������
		Sample26_2 jp = new Sample26_2();
		// ��������
		JFrame jf = new JFrame();
		// ��������ӽ�����
		jf.add(jp);
		// ���ô����Сλ�á������Լ��ɼ���
		jf.setTitle("���ƶ�ά��ͼ��");
		jf.setBounds(100, 100, 300, 200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
