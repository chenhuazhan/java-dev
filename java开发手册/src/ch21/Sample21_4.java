package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample21_4 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������Ť����
	private JButton jb = new JButton("�ƶ�");
	// ������ǩ
	private JLabel jl = new JLabel("����ʹ�õ��ǿղ���");

	public Sample21_4() {
		// ����JPanel�Ĳ��ֹ�����
		jp.setLayout(null);
		// ���ð�Ť�Ĵ�С��λ��
		jb.setBounds(25, 50, 70, 30);
		// Ϊ��Ťע�������
		jb.addActionListener(this);
		// ����Ť��ӽ�JPanel
		jp.add(jb);
		// ���ñ�ǩ�Ĵ�С�Լ�λ��
		jl.setBounds(120, 25, 150, 30);
		// ����ǩ��ӽ�JPanel
		jp.add(jl);
		// ��JPanel��ӽ�����
		this.add(jp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("�ղ����иı�����");
		this.setBounds(100, 100, 260, 200);
		this.setVisible(true);
	}

	// ʵ��ActionListener�еķ���
	public void actionPerformed(ActionEvent e) {
		jl.setBounds(120, 125, 200, 30);
	}

	public static void main(String[] args) {
		// ����Sample21_4����
		new Sample21_4();
	}
}
