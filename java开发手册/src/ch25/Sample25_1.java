package ch25;

import java.awt.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample25_1 extends JFrame {
	// ����������������ַ�������
	String[] head = { "���֤��", "����", "����", "ְҵ", "����" };
	// ��������������ݵ��ַ�������
	String[][] data = { { "130xxxxxxxxxxxxxxx", "����", "23", "��ʦ", "�ӱ�" },
			{ "130xxxxxxxxxxxxxxx", "����", "19", "ѧ��", "����" }, { "130xxxxxxxxxxxxxxx", "����", "26", "��ʦ", "ɽ��" },
			{ "130xxxxxxxxxxxxxxx", "����", "22", "�ʵ�Ա", "ɽ��" }, };
	// ����JTable����
	JTable jt = new JTable(data, head);
	// ��JTable��װ����������
	JScrollPane jsp = new JScrollPane(jt);

	public Sample25_1() {
		// ����JTable�Ĺ���������ӽ�����
		this.add(jsp);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("һ������ʾ��");
		this.setBounds(100, 100, 500, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample25_1�������
		new Sample25_1();
	}
}
