package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Sample23_4 extends JFrame implements ActionListener {
	// ����JPanel����
	JPanel jp = new JPanel();
	// ������ť����
	JButton[] jba = new JButton[] { new JButton("��Ϣ�Ի���"), new JButton("ȷ�϶Ի���"), new JButton("����Ի���"),
			new JButton("ѡ��Ի���") };
	// ������ǩ
	JLabel jl = new JLabel("   ");

	public Sample23_4() {
		// ����JPanel��������
		jp.setLayout(new GridLayout(1, 4));
		// �԰�ť����ѭ������
		for (int i = 0; i < jba.length; i++) {
			// ����ť��ӽ�JPanel��
			jp.add(jba[i]);
			// Ϊ��ťע�ᶯ���¼�������
			jba[i].addActionListener(this);
		}
		// ��JPanel��ӽ�������
		this.add(jp);
		// ����ǩ��ӽ�������
		this.add(jl, BorderLayout.SOUTH);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JOptionPane�Ի���ʾ��");
		this.setBounds(100, 100, 480, 90);
		this.setVisible(true);
	}

	// ʵ��ActionListener�����ӿ��еķ���
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jba[0]) {// ����"��Ϣ�Ի���"��ť
										// ������Ϣ�Ի���
			JOptionPane.showMessageDialog(this, "��ã�������Ϣ�Ի��򣡣���", "�ҵ���Ϣ�Ի���", JOptionPane.INFORMATION_MESSAGE);
			// ���±�ǩ������
			jl.setText("��ѡ������Ϣ�Ի��򣡣���");
		} else if (e.getSource() == jba[1]) {// ����"ȷ�϶Ի���"��ť
												// ����ȷ�϶Ի���
			int index = JOptionPane.showConfirmDialog(this, "��ã�����ȷ�϶Ի��򣡣���", "�ҵ�ȷ�϶Ի���", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			// ���±�ǩ������
			jl.setText("��ѡ����ȷ�϶Ի��򣬲�������" + ((index == 0) ? "��" : "��") + "��ť������");
		} else if (e.getSource() == jba[2]) {// ����"����Ի���"��ť
												// ��������Ի���
			String msg = JOptionPane.showInputDialog(this, "��������Ϣ��", "�ҵ�����Ի���", JOptionPane.PLAIN_MESSAGE);
			// ���±�ǩ������
			jl.setText("��ѡ��������Ի��򣬲������ˡ�" + msg + "����Ϣ������");
		} else if (e.getSource() == jba[3]) {// ����"ѡ��Ի���"��ť
												// ����ѡ������
			String[] options = new String[] { "0-15��", "16-25��", "26-35��", "36������" };
			// ����ѡ��Ի���
			int index = JOptionPane.showOptionDialog(this, "��ѡ������Σ�", "�ҵ�ѡ��Ի���", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, options, "26-35��");
			// ����������ַ���
			String ages = (index == 0) ? "0-15��" : (index == 1) ? "16-25��" : (index == 2) ? "26-35��" : "36������";
			// ���±�ǩ������
			jl.setText("��ѡ����ѡ��Ի��򣬲�ѡ���ˡ�" + ages + "������Σ�����");
		}
	}

	public static void main(String[] args) {
		// ����Sample23_4�������
		new Sample23_4();
	}
}
