package ch26;

import java.awt.*;
import javax.swing.*;

//��չJPanel��
public class Sample26_1 extends JPanel {
	// ��дpaint����
	public void paint(Graphics g) {
		// �ڻ������Ļ�һ����Բ
		g.fillOval((this.getWidth() - 150) / 2, (this.getHeight() - 100) / 2, 150, 100);
	}

	public static void main(String[] args) {
		// ��������
		Sample26_1 jp = new Sample26_1();
		// ��������
		JFrame jf = new JFrame();
		// ��������ӽ�����
		jf.add(jp);
		// ���ô����Сλ�á������Լ��ɼ���
		jf.setTitle("��չJPanelʵ�ֻ���");
		jf.setBounds(100, 100, 300, 150);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
