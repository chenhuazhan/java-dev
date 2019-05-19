package ch21;

import javax.swing.*;

//�������̳���JFrame
public class Sample21_8 extends JFrame {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������ǩ
	private JLabel jl = new JLabel("�뽫��עд������:");
	// �����ı���
	private JTextArea jta = new JTextArea();
	// Ϊ�ı�������������
	private JScrollPane jsp = new JScrollPane(jta);
	// �������ɲ��ֹ�����
	private SpringLayout sl = new SpringLayout();

	public Sample21_8() {
		// Ϊ����JPanel���ò��ֹ�����
		jp.setLayout(sl);
		// ������ǩ��������������֮���֧��
		Spring jlx = Spring.constant(20);
		// ������ǩ�ϲ���������ϲ��֮���֧��
		Spring jly = Spring.constant(10);
		// ������ǩ���������֮���֧��
		Spring jlw = Spring.constant(150);
		// ������ǩ���������֮���֧��
		Spring jlh = Spring.constant(15);
		// ����ǩ����Լ��������ӽ�����JPanel
		jp.add(jl, new SpringLayout.Constraints(jlx, jly, jlw, jlh));
		// ��ô���������ȵĵ���
		Spring jpw = sl.getConstraint(SpringLayout.EAST, jp);
		// ��ô��������߶ȵĵ���
		Spring jph = sl.getConstraint(SpringLayout.SOUTH, jp);
		// ��ô����ǩ�ױߵ��������ߵĵ���
		Spring jls = sl.getConstraint(SpringLayout.SOUTH, jl);
		// �����ı�����������������֮���֧��
		Spring jspx = Spring.constant(5);
		// ����������ı����ϲ���������ϲ��֮�����ĵ���
		Spring jspy = Spring.sum(Spring.constant(5), jls);
		// ����������ı�����ȵĵ���
		Spring jspw = Spring.sum(jpw, Spring.minus(Spring.scale(jspx, 2.0f)));
		// ����������ı����߶ȵĵ���
		Spring jsph = Spring.sum(jph, Spring.minus(Spring.sum(jspx, jspy)));
		// �������������ı�����ָ����Լ����ӽ�����JPanel
		jp.add(jsp, new SpringLayout.Constraints(jspx, jspy, jspw, jsph));
		// ������JPanel��ӽ�����
		this.add(jp);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("���ɲ���ʾ��");
		this.setBounds(100, 100, 300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample21_8�������
		new Sample21_8();
	}
}
