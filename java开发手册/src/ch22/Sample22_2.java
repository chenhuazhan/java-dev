package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample22_2 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������Ť����
	private JButton[] jbArray = { new JButton("�Զ�����"), new JButton("������"), new JButton("���ʱ߽�"), new JButton("�ַ��߽�") };
	// �����ı���
	private JTextArea jta = new JTextArea();
	// ���ı�����Ϊ�������ؼ�������������
	private JScrollPane jsp = new JScrollPane(jta);

	public Sample22_2() {
		// ����JPanel�Ĳ��ֹ�����
		jp.setLayout(null);
		// ѭ���԰�ť���д���
		for (int i = 0; i < 4; i++) {
			// ���ð�ť�Ĵ�С��ְ
			jbArray[i].setBounds(20 + i * 110, 120, 90, 20);
			// ����ť��ӵ�JPanel��
			jp.add(jbArray[i]);
			// Ϊ��ťע�ᶯ���¼�������
			jbArray[i].addActionListener(this);
		}
		// ����JScrollPane�Ĵ�С��λ��
		jsp.setBounds(20, 20, 450, 80);
		// ��JScrollPane��ӵ�JPanel������
		jp.add(jsp);
		// ����JTextAreaΪ�Զ�����
		jta.setLineWrap(true);
		// ΪJTextArea���10���ı�
		for (int i = 0; i < 20; i++) {
			jta.append("[" + i + "]Hello, this is an Example!");
		}
		// ��JPanel������ӽ�����
		this.add(jp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("�ı����������");
		this.setResizable(false);
		this.setBounds(100, 100, 500, 180);
		this.setVisible(true);
	}

	// ʵ��ActionListener�еķ���
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbArray[0]) {// �����Զ����а�
			jta.setLineWrap(true);
		} else if (e.getSource() == jbArray[1]) {// ���²����а�ť
			jta.setLineWrap(false);
		} else if (e.getSource() == jbArray[2]) {// ���µ��ʱ߽簴ť
			jta.setWrapStyleWord(true);
		} else if (e.getSource() == jbArray[3]) {// �����ַ��߽簴
			jta.setWrapStyleWord(false);
		}
	}

	public static void main(String[] args) {
		// ����Sample22_2�������
		new Sample22_2();
	}
}
