package ch21;

import javax.swing.*;

public class Sample21_7 extends JFrame {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������ť����
	private JLabel jl = new JLabel("������");
	// �����ı���������
	private JTextField jtf = new JTextField();
	// �������ɲ��ֹ�����
	private SpringLayout sl = new SpringLayout();

	// Sample21_7���幹����
	public Sample21_7() {
		// Ϊ����JPanel���ò��ֹ�����
		jp.setLayout(sl);
		// �������ؼ���ӵ�������
		jp.add(jtf);
		jp.add(jl);
		// �����ı����ϱ��������ϱ�֮���֧��
		sl.putConstraint(SpringLayout.NORTH, jtf, 20, SpringLayout.NORTH, jp);
		// ���ñ�ǩ�ϱ��������ϱ�֮���֧��
		sl.putConstraint(SpringLayout.NORTH, jl, 20, SpringLayout.NORTH, jp);
		// �����ı���������������֮���֧��
		sl.putConstraint(SpringLayout.WEST, jtf, 60, SpringLayout.WEST, jp);
		// �����ı����ұ��������ұ�֮���֧��
		sl.putConstraint(SpringLayout.EAST, jp, 10, SpringLayout.EAST, jtf);
		// �����������ı�����������֮��ĵ���
		Spring jtfw = Spring.constant(0, 100, 400);
		sl.putConstraint(SpringLayout.EAST, jtf, jtfw, SpringLayout.WEST, jtf);
		// ���ñ�ǩ������������֮���֧��
		sl.putConstraint(SpringLayout.WEST, jl, 10, SpringLayout.WEST, jp);
		// ���ñ�ǩ��������֮���֧��
		sl.putConstraint(SpringLayout.EAST, jl, 40, SpringLayout.WEST, jl);
		// ������JPanel��ӽ�����
		this.add(jp);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("���ɲ���ʾ��");
		this.setBounds(100, 100, 200, 100);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample21_7�������
		new Sample21_7();
	}
}
