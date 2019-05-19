package ch30;

import java.sql.*;
import java.sql.*;

public class Sample30_8 {
	public static void main(String[] args) {
		// ����Connection����
		Connection con = null;
		try {
			// ����JDBC-ODBC��������
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// �������ݿ�����
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// ��ȡDatabaseMetaData����
			DatabaseMetaData dbmd = con.getMetaData();
			// ��DatabaseMetaData�л�ȡ���ڱ��������Ϣ
			ResultSet rsTables = dbmd.getTables(null, null, null, new String[] { "TABLE" });
			// ������ȡ�ı���Ϣ�����
			while (rsTables.next()) {
				// �ӽ�����л�ȡ����
				String tableName = rsTables.getString(3);
				// ��ӡ��ȡ�ı���
				System.out.println("======================" + tableName + "��======================");
				// �����ݿ�Ԫ�����л�ȡ����ָ������ֶ���Ϣ
				ResultSet rsFields = dbmd.getColumns(null, null, tableName, null);
				// ��ӡ��ͷ
				System.out.println("�ֶ���\t\t�ֶ�����\t�ֶ���ѡ���");
				while (rsFields.next()) {// ��ӡ�����е���Ϣ
					System.out.println(
							rsFields.getString(4) + "\t\t" + rsFields.getString(6) + "\t\t" + rsFields.getString(7));
				}
				// �رս����
				rsFields.close();
			}
			// �رս����
			rsTables.close();
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
