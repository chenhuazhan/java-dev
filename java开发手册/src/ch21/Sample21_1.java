package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample21_1 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������Ť����
	private JButton[] jbArray = new JButton[] { new JButton("LEFT"), new JButton("CENTER"), new JButton("RIGHT"),
			new JButton("LEADING"), new JButton("TRAILING") };
	// �������ֹ���������
	private FlowLayout fl = new FlowLayout();

	public Sample21_1() {
		// ����JPanel�Ĳ��ֹ�����
		jp.setLayout(fl);
		// ���ν���Ť��ӽ�JPanel������Ϊÿ����Ťע�������
		for (int i = 0; i < jbArray.length; i++) {
			jp.add(jbArray[i]);
			jbArray[i].addActionListener(this);
		}
		// ��JPanel��ӽ�����
		this.add(jp);
		// ���ô��ڵı��⡢��Сλ���Լ��ɼ���
		this.setTitle("�������ж�̬���ö��뷽ʽ");
		this.setBounds(100, 100, 400, 150);
		this.setVisible(true);
	}

	// ʵ��ActionListener�еķ���
	public void actionPerformed(ActionEvent e) {
		// ɨ�谴ť���飬�жϰ��µ����ĸ���ť
		for (int i = 0; i < jbArray.length; i++) {
			// ʹ��getSource�����ж��¼�Դ
			if (e.getSource() == jbArray[i]) {
				// ���ò��ֹ������Ķ��뷽ʽ
				fl.setAlignment(FlowLayout.LEFT + i);
				// ����ˢ��JPanel
				jp.revalidate();
			}
		}
	}

	public static void main(String[] args) {
		// ����Sample21_1�������
		new Sample21_1();
	}
}
