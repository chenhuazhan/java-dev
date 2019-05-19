package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample21_2 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������Ť����
	private JButton[] jbArray = new JButton[13];

	// �������ֹ���������
	public Sample21_2() {
		// ��ʼ������
		for (int i = 2; i < jbArray.length; i++) {
			jbArray[i] = new JButton("��Ŧ" + (i - 1));
		}
		// ΪǮ������Ť������ʾ���ı�
		jbArray[0] = new JButton("������");
		jbArray[1] = new JButton("���񲼾�");
		// �����ν���Ť��ӽ�JPanel
		for (int i = 0; i < jbArray.length; i++) {
			jp.add(jbArray[i]);
			// ����ŤΪjbArray[0]����jbArray[1]ʱΪ��ע�������
			if (i < 2) {
				jbArray[i].addActionListener(this);
			}
		}
		// ��JPanel��ӽ�����
		this.add(jp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("�����������񲼾�--����Ϊ������");
		this.setBounds(100, 100, 450, 200);
		this.setVisible(true);
	}

	// ʵ��ActionListener�еķ���
	public void actionPerformed(ActionEvent e) {
		// ������İ�Ť��jbArray[0]ʱ
		if (e.getSource() == jbArray[0]) {
			// ���ò��ֹ�����Ϊ������
			jp.setLayout(new FlowLayout());
			// �������ô������
			this.setTitle("�����������񲼾�--����Ϊ������");
			// ����ˢ��JPanel
			jp.revalidate();
		}
		// ������İ�Ť��jbArray[1]ʱ
		else if (e.getSource() == jbArray[1]) {
			// ���ò��ֹ�����Ϊ3��5�е����񲼾�
			jp.setLayout(new GridLayout(3, 5));
			// �������ô������
			this.setTitle("�����������񲼾�--����Ϊ���񲼾�[3��5]");
			// ����ˢ��JPanel
			jp.revalidate();
		}
	}

	public static void main(String[] args) {
		// ����Sample21_2�������
		new Sample21_2();
	}
}
