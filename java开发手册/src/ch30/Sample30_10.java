package ch30;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;

//��������
public class Sample30_10 extends JFrame {
	// ����������¼���ݿ�������ȫ���������ַ���
	String driverClass;
	// ����������¼���ݿ������ַ������ַ���
	String url;
	// ����������¼���ݿ��û�����������ַ���
	String user;
	String password;
	// ������ʾ���ݿ��б���������ĸ��ڵ�
	DefaultMutableTreeNode dmtnroot = new DefaultMutableTreeNode();
	// ������ģ��
	DefaultTreeModel dtm = new DefaultTreeModel(dmtnroot);
	// ������״�б�ؼ�
	JTree jtr = new JTree(dtm);
	// ����״�б���õ�����������
	JScrollPane jspl = new JScrollPane(jtr);
	// ������ʾ��ϸ��Ϣ�ı��
	JTable jta = new JTable();
	// �������õ�����������
	JScrollPane jspy = new JScrollPane(jta);
	// ��������������ķָ��
	JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jspl, jspy);

	public Sample30_10() {
		// ���÷ָ����ĳ�ʼλ���Լ����
		jsp.setDividerLocation(200);
		jsp.setDividerSize(4);
		// ���ָ����ӽ�����
		this.add(jsp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("���ݿ������--DBManager");
		this.setBounds(100, 100, 600, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// �Զ��������������ȫ���������ݿ������ַ������û����Լ�����ķ���
	public void setUNP(String driverClass, String url, String user, String password) {
		this.driverClass = driverClass;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public static void main(String[] args) {
		new Sample30_10();
	}
}
