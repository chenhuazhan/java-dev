package ch25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

//�����Զ���ı����ģ����
class MyColumnModel extends DefaultTableColumnModel {
	// ��дaddColumn����
	public void addColumn(TableColumn tc) {
		// ���ø����addColumn����
		super.addColumn(tc);
		// ��ñ�ָ���б������е�����
		int newIndex = this.sorted(tc);
		// ���������Ƿ��ǵ�ǰ�е�����
		if (newIndex != tc.getModelIndex()) {
			// ����ǰ���ƶ�����ñ��Լ������������
			this.moveColumn(tc.getModelIndex(), newIndex);
		}
	}

	// �Զ���������Ƚ��б���ķ���
	public int sorted(TableColumn tc) {
		// ����е�����
		int count = this.getColumnCount();
		// ���ص�ǰ�е��б���
		String name = tc.getHeaderValue().toString();
		// ����ǰ�б�����ÿ���б�����бȽ�
		for (int i = 0; i < count; i++) {
			if (name.compareTo(this.getColumn(i).getHeaderValue().toString()) <= 0) {
				return i;// ��ɨ�赽���б����ָ���д��򷵻�ɨ�赽��������
			}
		}
		// ���ر��������������+1
		return count;
	}
}

// �������̳���JFrame
public class Sample25_4 extends JFrame {
	// �����б����ַ�������
	String[] head = { "a", "c", "d", "b", "h", "i", "p", "w", "f", "k" };
	// ����������ݶ�ά�ַ�������
	String[][] data = { { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" },
			{ "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" } };
	// �������ģ��
	DefaultTableModel dtm = new DefaultTableModel(data, head);
	// �����Զ������ģ��
	MyColumnModel mc = new MyColumnModel();
	// ʹ��ָ���ı��ģ��������ģ�ʹ���JTable����
	JTable jt = new JTable(dtm, mc);
	// ��JTable��װ����������
	JScrollPane jsp = new JScrollPane(jt);

	public Sample25_4() {
		// ����ָ���ı����ģ������ģ�ʹ���������
		jt.createDefaultColumnsFromModel();
		// ����JTable�Ĺ���������ӽ�������м�
		this.add(jsp, BorderLayout.CENTER);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�Զ�������ģ�Ͱ���");
		this.setBounds(100, 100, 600, 120);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample25_4�������
		new Sample25_4();
	}
}
