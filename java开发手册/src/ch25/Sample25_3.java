package ch25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

//�������̳���JFrame
public class Sample25_3 extends JFrame implements ActionListener {
	// �������ڰڷŰ�Ť��JPanel����
	JPanel jp = new JPanel();
	// ������Ť����
	JButton[] jb = { new JButton("�����"), new JButton("ɾ����"), new JButton("�����"), new JButton("ɾ����") };
	// ������ʼ�б���
	String[] head = { "��1��" };
	// ������ʼ�������
	String[][] data = { { "1��1��" } };
	// �������ģ��
	DefaultTableModel dtm = new DefaultTableModel(data, head);
	// ����JTable����
	JTable jt = new JTable(dtm);
	// ��JTable��װ����������
	JScrollPane jsp = new JScrollPane(jt);

	public Sample25_3() {
		// �԰�ť����ѭ����ʼ��
		for (int i = 0; i < jb.length; i++) {
			// ����Ť��ӽ�JPanel������
			jp.add(jb[i]);
			// Ϊ��Ťע�ᶯ���¼�������
			jb[i].addActionListener(this);
		}
		// ����Ť������ӽ�����Ķ���
		this.add(jp, BorderLayout.NORTH);
		// ����JTable�Ĺ���������ӽ�������м�
		this.add(jsp, BorderLayout.CENTER);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��̬����ʵ��");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
	}

	// ʵ��ActionListener�ӿ��еķ���
	public void actionPerformed(ActionEvent e) {
		// ��ñ��ģ��
		DefaultTableModel temp = (DefaultTableModel) jt.getModel();
		// ��ñ�������
		int c = temp.getColumnCount();
		// ��ñ�������
		int r = temp.getRowCount();
		if (e.getSource() == jb[0]) {// ��������а�ťִ�еĴ���
										// �������е���������
			Vector newR = new Vector();
			for (int i = 0; i < c; i++) {
				// Ϊ���������������
				newR.add((r + 1) + "��" + (i + 1) + "��");
			}
			// ���µ�����������ӽ����ģ����
			temp.getDataVector().add(newR);
			// ˢ�±�����»���
			((DefaultTableModel) jt.getModel()).fireTableStructureChanged();
		} else if (e.getSource() == jb[1]) {// ����ɾ���а�ťִ�еĴ���
			if (r > 0)// ��������Ƿ����0
			{
				// ɾ�����һ��
				temp.removeRow(r - 1);
			}
		} else if (e.getSource() == jb[2]) {// ��������а�ťִ�еĴ���
											// �������е���������
			Vector newC = new Vector();
			for (int i = 0; i < r; i++) {
				// Ϊ���������������
				newC.add((i + 1) + "��" + (c + 1) + "��");
			}
			// ��������ӽ�����ģ����
			temp.addColumn("��" + (c + 1) + "��", newC);
		} else if (e.getSource() == jb[3]) {// ����ɾ���а�ťִ�еĴ���
			if (c - 1 > 0)// ��鵱ǰ�����Ƿ����1
			{
				// ���ñ������Ϊ��ǰ������1���Ӷ����һ�б�ɾ��
				temp.setColumnCount(c - 1);
			}
		}
	}

	public static void main(String[] args) {
		// ����Sample25_3�������
		new Sample25_3();
	}
}
