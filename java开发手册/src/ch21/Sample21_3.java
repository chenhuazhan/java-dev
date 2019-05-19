package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample21_3 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������Ť����
	private JButton[] jbArray = new JButton[] { new JButton("����"), new JButton("�ϱ�"), new JButton("����"),
			new JButton("����"), };
	// ������ǩ
	private JLabel jl = new JLabel("������Χ4����Ť");

	public Sample21_3() {
		// ����JPanel�Ĳ��ֹ�����
		jp.setLayout(new BorderLayout());
		// Ϊÿ����Ťע�������
		for (int i = 0; i < jbArray.length; i++) {
			jbArray[i].addActionListener(this);
		}
		// ��4����Ť������ӽ�JPanelָ��������
		jp.add(jbArray[0], BorderLayout.NORTH);
		jp.add(jbArray[1], BorderLayout.SOUTH);
		jp.add(jbArray[2], BorderLayout.EAST);
		jp.add(jbArray[3], BorderLayout.WEST);
		// ����ǩ��ӽ�JPanel���м�����
		jp.add(jl, BorderLayout.CENTER);
		// ��JPanel��ӽ�����
		this.add(jp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("�߿򲼾�");
		this.setBounds(100, 100, 450, 200);
		this.setVisible(true);
	}

	// ʵ��ActionListener�еķ���
	public void actionPerformed(ActionEvent e) {
		// ������ߵİ�Ť��Ҫִ�еĶ���
		if (e.getSource() == jbArray[0]) {
			jl.setText("��������Ǳ�������İ�Ť������");
		}
		// ����ϱߵİ�Ť��Ҫִ�еĶ���
		else if (e.getSource() == jbArray[1]) {
			jl.setText("����������ϱ�����İ�Ť������");
		}
		// ������ߵİ�Ť��Ҫִ�еĶ���
		else if (e.getSource() == jbArray[2]) {
			jl.setText("��������Ƕ�������İ�Ť������");
		}
		// ������ߵİ�Ť��Ҫִ�еĶ���
		else if (e.getSource() == jbArray[3]) {
			jl.setText("�����������������İ�Ť������");
		}
	}

	public static void main(String[] args) {
		// ����Sample21_3�������
		new Sample21_3();
	}
}
