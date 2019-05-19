package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample23_2 extends JFrame {
	// �����˵�
	private JMenu jmztfg = new JMenu("������");
	private JMenu jmzt = new JMenu("����");
	// �����˵�������
	private JMenuItem[] jmi = new JMenuItem[] { new JMenuItem("����"), new JMenuItem("ճ��"), new JMenuItem("����") };
	// ������ѡ�˵�������
	private JCheckBoxMenuItem[] jcbmi = new JCheckBoxMenuItem[] { new JCheckBoxMenuItem("б��"),
			new JCheckBoxMenuItem("����") };
	// ������ѡ�˵�������
	private JRadioButtonMenuItem[] jrbmi = new JRadioButtonMenuItem[] { new JRadioButtonMenuItem("����", true),
			new JRadioButtonMenuItem("����"), new JRadioButtonMenuItem("����"), new JRadioButtonMenuItem("�����п�"), };
	// ��������ʽ�˵�
	private JPopupMenu jpm = new JPopupMenu();
	// ������ť��
	ButtonGroup bg = new ButtonGroup();

	public Sample23_2() {
		for (int i = 0; i < jmi.length; i++) {// �������ơ�����ճ�����������С��˵�����ӽ�����ʽ�˵�
			jpm.add(jmi[i]);
		}
		// �򵯳�ʽ�˵�����ӷָ���
		jpm.addSeparator();
		// ��"������"�˵���ӽ�����ʽ�˵�
		jpm.add(jmztfg);
		// ��"б��"��"����"��ѡ�˵�����ӽ�"����"�˵�
		for (int i = 0; i < jcbmi.length; i++) {
			jmztfg.add(jcbmi[i]);
		}
		// ��"����"�˵���ӽ�����ʽ�˵�
		jpm.add(jmzt);
		// ��"����"��"����"��"����"��"�����п�"��ѡ�˵�����ӽ�"����"�˵�
		// ��ͬʱ���ĸ���ѡ�˵�����б���
		for (int i = 0; i < jrbmi.length; i++) {
			jmzt.add(jrbmi[i]);
			bg.add(jrbmi[i]);
		}
		// ����������������
		MouseListener mouseListener = new MouseAdapter() {
			// ��д��Ӧ���¼�������
			public void mouseReleased(MouseEvent e) {// ������ͷ�ʱִ�еĶ���
				if (jpm.isPopupTrigger(e)) {// ��ʾ����ʽ�˵�
					jpm.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		};
		// Ϊ����ע����������
		this.addMouseListener(mouseListener);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("����ʽ�˵�������¼����ۺ�ʾ��");
		this.setBounds(100, 100, 400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample23_2�������
		new Sample23_2();
	}
}
