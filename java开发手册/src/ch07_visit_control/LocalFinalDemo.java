package ch07_visit_control;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LocalFinalDemo {
	public static void localFinalDemo(String s) {
		JFrame f; // ����������ñ�����
		f = new JFrame(s); // ���ɶ���
		f.setSize(100, 100); // ���ô����С��
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���Ĭ�Ϲرն�����
		Container contentPane;
		contentPane = f.getContentPane(); // ���ݴ������
		final JButton b; // ��ť�������ñ�����
		b = new JButton("Button"); // ���ɶ���
		JLabel l; // ��ǩ�������ñ�����
		l = new JLabel("Label"); // ���ɶ���
		contentPane.add(b); // ��Ӱ�ť��
		contentPane.add(l); // ��ӱ�ǩ��
		f.setVisible(true);
		l.addKeyListener(new KeyAdapter() // ��Ӱ�����������
		{
			public void keyTyped(KeyEvent e) {
				b.requestFocus(); // ���ʾֲ�������
				System.out.println("Key Typed");
			}
		});
	}

	public static void main(String[] args) {
		String s = "hhh";
		LocalFinalDemo.localFinalDemo(s);
	}
	/*
	 * ����ʾ���� public void LocalFinalDemo(String s) { JFrame f; //����������ñ����� f =
	 * new JFrame(s); //���ɶ��� f.setSize(100,100); //���ô����С��
	 * f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ô���Ĭ�Ϲرն����� Container
	 * contentPane; contentPane = f.getContentPane(); //���ݴ������ JButton b;
	 * //��ť�������ñ����� b = new JButton("Button"); //���ɶ��� JLabel l; //��ǩ�������ñ����� l =
	 * new JLabel("Label"); //���ɶ��� contentPane.add(b); //��Ӱ�ť��
	 * contentPane.add(l); //��ӱ�ǩ�� f.setVisible(true); l.addKeyListener(new
	 * KeyAdapter() //��Ӱ����������� { public void keyTyped(KeyEvent e) {
	 * b.requestFocus(); //���ʾֲ������� System.out.println("Key Typed"); } } ); }
	 */
}
