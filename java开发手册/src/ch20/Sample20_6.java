package ch20;

import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample20_6 extends JFrame {
	// ����JPanel����
	private JPanel jp = new JPanel();

	public Sample20_6() {
		// ��JPanel��ӽ��ô���
		this.add(jp);
		// ���ñ���
		this.setTitle("��̬��ӱ�ǩ������");
		// ���õ����巢��رն���ʱ��ִ���κβ���
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// ע����������ü�������һ�������ڲ���
		this.addWindowListener(new WindowAdapter() {
			// ֻ��д�õ��ķ���
			public void windowClosing(WindowEvent e) {
				// ��JPanel�����һ���½��ı�ǩ
				jp.add(new JLabel("�Բ�������İ�Ť���پ��йرյ����ã�����"));
				// �������ô���Ŀɼ��ԣ�������ˢ����Ļ������
				Sample20_6.this.setVisible(true);
			}
		});
		// ���ô���Ĵ�С�Լ��ɼ���
		this.setBounds(100, 100, 400, 130);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample20_6�������
		new Sample20_6();
	}
}
