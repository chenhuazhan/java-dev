package ch20;

import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample20_8 extends JFrame {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������Ť����
	private JButton jb = new JButton("��ť");
	// ������ǩ����
	private JLabel jl = new JLabel("������ִ��˳��Ϊ��");

	public Sample20_8() {
		// ����Ť��ӽ�JPanel
		jp.add(jb);
		// ����ǩ��ӽ�JPanel
		jp.add(jl);
		// ��JPanel��ӽ��ô���
		this.add(jp);
		// ���ñ���
		this.setTitle("���������ע���ͬһ���¼�Դ");
		// ���õ����巢��رն���ʱ���˳�����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ����ťע���һ��������
		jb.addActionListener(new ActionListener() {
			// ֻʵ���õ��ķ���
			public void actionPerformed(ActionEvent e) {
				// �޸ı�ǩ������
				jl.setText(jl.getText() + "��ע��ļ�������");
			}
		});
		// �ٴθ���Ťע��һ��������
		jb.addActionListener(new ActionListener() {
			// ֻʵ���õ��ķ���
			public void actionPerformed(ActionEvent e) {
				// �޸ı�ǩ������
				jl.setText(jl.getText() + "��ע��ļ�������");
			}
		});
		// ���ô���Ĵ�С�Լ��ɼ���
		this.setBounds(100, 100, 400, 130);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample20_8�������
		new Sample20_8();
	}
}
