package ch30;

import java.sql.*;

public class Sample30_9 {
	public static void main(String[] args) {
		// ����Connection����
		Connection con = null;
		try { // ����JDBC-ODBC��������
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// �������ݿ�����
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// ����Statement����
			Statement stat = con.createStatement();
			// ִ�м�����ȡ�����
			ResultSet rs = stat.executeQuery("SELECT * FROM student");
			// ��ȡ�������Ԫ����
			ResultSetMetaData temprsmd = rs.getMetaData();
			// ��ӡ��ͷ��Ϣ
			System.out.println("�ֶ���\t\t���ֶ�����\t\t��ʾ���");
			// ��Ԫ�����л�ȡ��Ϣ����ӡ
			for (int i = 1; i <= temprsmd.getColumnCount(); i++) {
				// ��ȡ����
				String listname = temprsmd.getColumnName(i);
				// ��ȡ������
				String type = temprsmd.getColumnTypeName(i);
				// ��ȡ����ʾ���
				int size = temprsmd.getColumnDisplaySize(i);
				// ��ӡ��Ϣ
				System.out.println(listname + "\t\t" + type + "\t\t    " + size);
			}
			// �رս����
			rs.close();
			// �ر����
			stat.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// �ر����ݿ�����
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
