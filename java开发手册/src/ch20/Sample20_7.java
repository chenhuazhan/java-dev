package ch20;

import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample20_7 extends JFrame {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������Ť����
	private JButton jb = new JButton("��ť");
	// ������ǩ����
	private JLabel jl = new JLabel("��ť������0��");
	// ��������������
	private int count = 0;

	// ������
	public Sample20_7() {
		// ����Ť��ӽ�JPanel
		jp.add(jb);
		// ����ǩ��ӽ�JPanel
		jp.add(jl);
		// ��JPanel��ӽ��ô���
		this.add(jp);
		// ���ñ���
		this.setTitle("��¼��ť���µĴ���");
		// ���õ����巢��رն���ʱ���˳�����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ����ť���������ַ�
		this.jb.setMnemonic('a');
		// ����Ťjbע����������ü�������һ�������ڲ���
		jb.addActionListener(new ActionListener() {
			// ʵ��ActionListener�ӿ��еķ���
			public void actionPerformed(ActionEvent e) {
				// �޸ı�ǩ������
				Sample20_7.this.jl.setText("��ť������" + (++count) + "��");
			}
		});
		// ���ô���Ĵ�С�Լ��ɼ���
		this.setBounds(100, 100, 400, 130);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample20_7�������
		new Sample20_7();
	}
}
