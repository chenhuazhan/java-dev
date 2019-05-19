package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//�������̳���JFrame
public class Sample23_3 extends JFrame implements ActionListener, ChangeListener {
	// �������߰�Ť����������
	private String[] jbname = { "�����", "����", "�Ҷ���" };
	// ����������
	private JToolBar jtb = new JToolBar("�ҵĹ�����");
	// �������߰�Ť����
	private JButton[] jb = { new JButton(new ImageIcon("D:/left.gif")), new JButton(new ImageIcon("center.gif")),
			new JButton(new ImageIcon("D:/right.gif")) };
	// ����΢��������
	JSpinner jsp = new JSpinner(new SpinnerNumberModel(50, 0, 100, 2));
	// ������ǩ
	private JLabel jl = new JLabel("��ѡ���ֵΪ��50������");

	public Sample23_3() {
		// ѭ���Թ��߰�ť������г�ʼ��
		for (int i = 0; i < jb.length; i++) {
			// ����Ť��ӽ�������
			jtb.add(jb[i]);
			// Ϊ��Ťע�������
			jb[i].addActionListener(this);
			// Ϊ��Ť���ù�����ʾ��Ϣ
			jb[i].setToolTipText(jbname[i]);
		}
		// �ڹ���������ӷָ���
		jtb.addSeparator();
		// ��΢����������ӽ�������
		jtb.add(jsp);
		// Ϊ΢��������Ϊ��ע�������
		jsp.addChangeListener(this);
		// Ϊ΢�����������ù�����ʾ��Ϣ
		jsp.setToolTipText("���õ�ǰֵ");
		// ���ù��������Գ�Ϊ����������
		jtb.setFloatable(true);
		// ����ǩ��ӽ�����
		this.add(jl);
		// ����������ӽ����嶥��
		this.add(jtb, BorderLayout.NORTH);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("ʹ�ù�������ʾ��");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
	}

	// ʵ��ActionListener�ӿ��еķ���
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb[0]) {// ��������밴Ťִ�еĶ���
			jl.setHorizontalAlignment(JLabel.LEFT);
		} else if (e.getSource() == jb[1]) {// ���¾��а�Ťִ�еĶ���
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (e.getSource() == jb[2]) {// �����Ҷ��밴Ťִ�еĶ���
			jl.setHorizontalAlignment(JLabel.RIGHT);
		}
	}

	// ʵ��ChangeListener�ӿ��еķ���
	public void stateChanged(ChangeEvent e) {
		// �޸ı�ǩ����
		jl.setText("��ѡ���ֵΪ��" + jsp.getValue() + "������");
	}

	public static void main(String[] args) {
		// ����Sample23_3�������
		new Sample23_3();
	}
}
