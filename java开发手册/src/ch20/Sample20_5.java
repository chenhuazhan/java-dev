package ch20;

import java.awt.event.*;
import javax.swing.*;

//����̳���JFrame����
public class Sample20_5 extends JFrame {
	// ���幹����
	public Sample20_5() {
		// ���ô���ı���
		this.setTitle("�رմ����¼��������¶���Ĵ���");
		// ���������һ����ǩ
		this.add(new JLabel("                          ����һ����ʾ���壬" + "������ʾ��μ�������ر��¼�������"));
		// ע��WindowListener������
		this.addWindowListener(new WindowAdapter() {
			// ʵ��WindowListener�ӿ��еĸ�������
			public void windowClosing(WindowEvent e) {
				System.out.println("������ر�ʱ��ִ������Ĵ��룡����");
				System.exit(0);
			}
		});
		// ���ô���Ĵ�С
		this.setBounds(100, 100, 500, 200);
		// ���ô���Ŀɼ���
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample20_5�������
		new Sample20_5();
	}
}
