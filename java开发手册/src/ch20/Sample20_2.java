package ch20;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Sample20_2 {
	public static void main(String[] args) {
		// �����������
		JFrame jf = new JFrame();
		// ���ô���ı���
		jf.setTitle("ֱ�Ӵ���JFrame����");
		// ���ô����λ���Լ���С
		jf.setBounds(100, 100, 500, 200);
		jf.addWindowListener(new WindowAdapter() {
			// ʵ��WindowListener�ӿ��еĸ�������
			public void windowClosing(WindowEvent e) {
				System.out.println("������ر�ʱ��ִ������Ĵ��룡����");
				System.exit(0);
			}
		});
		// ���ô���Ŀɼ���
		jf.setVisible(true);
	}
}
