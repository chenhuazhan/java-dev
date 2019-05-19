package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample23_1 extends JFrame implements ActionListener, ItemListener {
	// �����˵�����
	private JMenu[] jm = { new JMenu("�ļ�"), new JMenu("��ͼ"), new JMenu("������") };
	// ������ͨ�˵�������
	private JMenuItem[] jmi = new JMenuItem[] { new JMenuItem("��"), new JMenuItem("����") };
	// ������ѡ��Ť�˵�������
	private JRadioButtonMenuItem[] jrbmi = new JRadioButtonMenuItem[] { new JRadioButtonMenuItem("�����", true),
			new JRadioButtonMenuItem("����"), new JRadioButtonMenuItem("�Ҷ���") };
	// ������ѡ�˵�������
	private JCheckBoxMenuItem[] jcbmi = new JCheckBoxMenuItem[] { new JCheckBoxMenuItem("б��"),
			new JCheckBoxMenuItem("����") };
	// �����˵���
	private JMenuBar jmb = new JMenuBar();
	// ������Ť��
	private ButtonGroup bg = new ButtonGroup();
	// �����ı���
	private JTextArea jta = new JTextArea();
	// Ϊjta�ı�������������
	private JScrollPane jsp = new JScrollPane(jta);
	// ������ʾ�������������ı�ǩ��
	JLabel jl = new JLabel("  ��ǰ�Ķ��뷽ʽ�ǣ�����룬������Ϊ����ͨ��");

	public Sample23_1() {
		// ���ļ��˵���ӽ��˵���
		jmb.add(jm[0]);
		// ���򿪱���˵�����ӽ��ļ��˵�����ע�������
		for (int i = 0; i < jmi.length; i++) {
			jm[0].add(jmi[i]);
			jmi[i].addActionListener(this);
		}
		// ����ͼ�˵���ӽ��˵���
		jmb.add(jm[1]);
		// ��3����ѡ��Ť�˵�����ӽ���ͼ�˵�
		for (int i = 0; i < jrbmi.length; i++) {
			jm[1].add(jrbmi[i]);
			// ����ѡ��Ť�˵����Ϊһ��
			bg.add(jrbmi[i]);
			// Ϊ��ѡ��Ť�˵���ע�������
			jrbmi[i].addItemListener(this);
		}
		// ����ͼ�˵�����ӷָ���
		jm[1].addSeparator();
		// ������˵���ӽ���ͼ�˵�
		jm[1].add(jm[2]);
		// ��2����ѡ�˵�����ӽ�����˵�
		for (int i = 0; i < jcbmi.length; i++) {
			jm[2].add(jcbmi[i]);
			// Ϊ��ѡ�˵���ע�������
			jcbmi[i].addItemListener(this);
		}
		// ���˵�����ӽ�����
		this.setJMenuBar(jmb);
		// �������������ı�����ӽ�����
		this.add(jsp);
		// ����ʾѡ������ı�ǩ��ӽ�����
		this.add(jl, BorderLayout.SOUTH);
		// ���ô��ڵĹرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�˵��ۺ�ʾ��");
		this.setBounds(100, 100, 300, 200);
		this.setVisible(true);
	}

	// ʵ��ActionListener�����ӿ��еķ���
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jmi[0]) {// ѡ�д򿪲˵���
			jta.append("��ѡ���˴򿪲˵������\n");
		} else if (e.getSource() == jmi[1]) {// ѡ�б���˵���
			jta.append("��ѡ���˱���˵������\n");
		}
	}

	// ʵ��ItemListener�����ӿ��еķ���
	public void itemStateChanged(ItemEvent e) {
		String temps = "  ��ǰ�Ķ��뷽ʽ�ǣ�";
		// �ж�ѡ��������ֶ��뷽ʽ
		for (int i = 0; i < jrbmi.length; i++) {
			if (jrbmi[i].isSelected() == true) {
				switch (i) {
				case 0:
					temps = temps + "����룬������Ϊ��";
					break;
				case 1:
					temps = temps + "���У�������Ϊ��";
					break;
				case 2:
					temps = temps + "�Ҷ��룬������Ϊ��";
					break;
				}
				break;
			}
		}
		// �ж����������
		int c = 0;
		if (jcbmi[0].isSelected() == true) {// ѡ��б�帴ѡ�˵���
			c += 1;
		}
		if (jcbmi[1].isSelected() == true) {// ѡ�к��帴ѡ�˵���
			c += 2;
		}
		switch (c) {// ���ݲ�ͬ�����������ַ���
		case 0:
			temps = temps + "��ͨ��";
			break;
		case 1:
			temps = temps + "б�塣";
			break;
		case 2:
			temps = temps + "���塣";
			break;
		case 3:
			temps = temps + "��б�塣";
			break;
		}
		// ������ʾѡ�������ǩ������
		jl.setText(temps);
	}

	public static void main(String[] args) {
		// ����Sample23_1�������
		new Sample23_1();
	}
}
