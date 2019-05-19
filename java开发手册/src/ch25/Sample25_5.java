package ch25;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;

//����
public class Sample25_5 extends JFrame {
	// �����б����ַ�������
	String[] head = { "ѧ��", "����", "��Ŀ", "�ɼ�" };
	// ������������ַ�������
	String[][] data = { { "001", "��ǿ", "����", "80" }, { "002", "����", "��ѧ", "90" }, { "003", "��Ծ", "��ѧ", "85" },
			{ "002", "����", "����", "90" }, { "003", "��Ծ", "����", "85" } };
	// �������ģ��
	DefaultTableModel dtm = new DefaultTableModel(data, head);
	// ����JTable����
	JTable jt = new JTable(dtm);
	// ��JTable��װ����������
	JScrollPane jsp = new JScrollPane(jt);
	// ���������ʾ��Ϣ���ı���
	JTextField jtf = new JTextField();
	// �����Զ���ļ���������
	TableListener tl = new TableListener();

	// �����Զ���������ڲ���
	class TableListener implements ListSelectionListener, TableColumnModelListener, TableModelListener {
		// ��¼�����еĳ�Ա����
		int row;
		int col;

		// ʵ��ListSelectionListener�����ӿ��еķ���
		public void valueChanged(ListSelectionEvent lse) {// ��ѡ���з����仯ʱ����ø÷���
															// ��ȡ��ǰѡ���������
			row = jt.getSelectedRow();
			// ����showMsg����
			this.showMsg(row, col);
		}

		// ʵ��TableColumnModelListener�����ӿ��еķ���
		public void columnSelectionChanged(ListSelectionEvent lse) {// ��ѡ���з����仯ʱ����ø÷���
																	// ��ȡ��ǰѡ���������
			col = jt.getSelectedColumn();
			// ����showMsg����
			this.showMsg(row, col);
		}

		// ��TableColumnModelListener�����ӿ��в���Ҫ�ķ������п�ʵ��
		public void columnMarginChanged(ChangeEvent ce) {
		}

		public void columnMoved(TableColumnModelEvent tcme) {
		}

		public void columnRemoved(TableColumnModelEvent tcme) {
		}

		public void columnAdded(TableColumnModelEvent tcme) {
		}

		// ʵ��TableModelListener�����ӿ��еķ���
		public void tableChanged(TableModelEvent e) {// ��������ݱ仯ʱִ�д˷���
														// ��ȡ��ǰѡ��Ԫ���ֵ
			String str = (String) jt.getValueAt(row, col);
			// ������ʾ��Ϣ
			jtf.setText("���༭�˵�" + (row + 1) + "�е�" + (col + 1) + "�е����ݣ���ֵΪ��" + str + "����");
		}

		// ������ʾ��ʾ��Ϣ�ķ���
		public void showMsg(int r, int c) {
			// ��ȡ��ǰѡ��Ԫ���ֵ
			String str = (String) jt.getValueAt(r, c);
			// ������ʾ��Ϣ
			jtf.setText("����ǰѡ����ǵ�" + (r + 1) + "�е�" + (c + 1) + "�У�ֵΪ����" + str + "����");
		}
	}

	public Sample25_5() {
		// ���ñ����򲻿ɱ༭
		jtf.setEditable(false);
		// ���ı�����ӽ����嶥��
		this.add(jtf, BorderLayout.NORTH);
		// ʹ��TableModel�ӿ��ж����getColumnCount������������ģ�ʹ�������
		jt.createDefaultColumnsFromModel();
		// Ϊ���ѡ��ģ��ע�������
		jt.getSelectionModel().addListSelectionListener(tl);
		// Ϊ�����ģ��ע�������
		jt.getColumnModel().addColumnModelListener(tl);
		// Ϊ���ģ��ע�������
		jt.getModel().addTableModelListener(tl);
		// ����JTable�Ĺ���������ӽ�������м�
		this.add(jsp, BorderLayout.CENTER);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�������¼���ʾ��");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample25_5�������
		new Sample25_5();
	}
}
