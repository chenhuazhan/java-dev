package ch25;

import java.awt.*;
import javax.swing.*;
import java.util.*;

//�������̳���JFrame
public class Sample25_2 extends JFrame {
	// ��������������ݵ�����
	Vector vdata = new Vector();
	{
		// ������ʾ�����ݵ�������
		Vector tempv1 = new Vector();
		tempv1.add("123456");
		tempv1.add("�ֱ�");
		tempv1.add("2000.0");
		tempv1.add("�ֽ���");
		tempv1.add("�ȴ�����");
		Vector tempv2 = new Vector();
		tempv2.add("456123");
		tempv2.add("����");
		tempv2.add("120.0");
		tempv2.add("����֧��");
		tempv2.add("�ȴ�����");
		Vector tempv3 = new Vector();
		tempv3.add("951357");
		tempv3.add("U��");
		tempv3.add("300.0");
		tempv3.add("�ֽ���");
		tempv3.add("�������");
		Vector tempv4 = new Vector();
		tempv4.add("268453");
		tempv4.add("ͼ��");
		tempv4.add("65.0");
		tempv4.add("����֧��");
		tempv4.add("�ȴ�����");
		// ����ʾ�����ݵ���������ӵ�����������ݵ�������
		vdata.add(tempv1);
		vdata.add(tempv2);
		vdata.add(tempv3);
		vdata.add(tempv4);
	}
	// �������������������
	Vector vhead = new Vector();
	{
		vhead.add("������");
		vhead.add("��Ʒ����");
		vhead.add("���");
		vhead.add("���׷�ʽ");
		vhead.add("�������");
	}
	// ����JTable����
	JTable jt = new JTable(vdata, vhead);
	// ��JTable��װ����������
	JScrollPane jsp = new JScrollPane(jt);

	public Sample25_2() {
		// ���ò����Ʊ��Ĵ�ֱ��
		jt.setShowVerticalLines(false);
		// ����ָ�����и�
		jt.setRowHeight(2, 35);
		// ���������ߵ���ɫΪ��ɫ
		jt.setGridColor(Color.BLUE);
		// ����JTable�Ĺ���������ӽ�����
		this.add(jsp);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("һ������ʾ��");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample25_2�������
		new Sample25_2();
	}
}
