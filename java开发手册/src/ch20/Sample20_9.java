package ch20;

import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample20_9 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������Ť����
	private JButton jb1 = new JButton("��Ť1");
	private JButton jb2 = new JButton("��Ť2");
	// ������ǩ����
	private JLabel jl = new JLabel("���µİ�ťΪ��");

	public Sample20_9() {
		// ����Ť��ӽ�JPanel
		jp.add(jb1);
		jp.add(jb2);
		// ����ǩ��ӽ�JPanel
		jp.add(jl);
		// ��JPanel��ӽ��ô���
		this.add(jp);
		// ���ñ���
		this.setTitle("ͬһ��������ע�������¼�Դ");
		// ���õ����巢��رն���ʱ���˳�����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Ϊ������Ťע��ͬһ��������
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		// ���ô���Ĵ�С�Լ��ɼ���
		this.setBounds(100, 100, 300, 130);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// �ж��¼�Դ
		if (e.getSource() == jb1) {// �¼�ԴΪ��ťjb1
			this.jl.setText("���µİ�ťΪ����һ����ť");
		} else if (e.getSource() == jb2) {// �¼�ԴΪ��ťjb2
			this.jl.setText("���µİ�ťΪ���ڶ�����ť");
		}
	}

	public static void main(String[] args) {
		// ����Sample20_9�������
		new Sample20_9();
	}
}
