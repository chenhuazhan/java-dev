package ch30;

import java.sql.*;

public class Sample30_1 {
	public static void main(String[] args) {
		// ����Connection����
		Connection con = null;
		try {
			// ����JDBC-ODBC��������
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// �������ݿ�����
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// ����Statement����
			Statement stat = con.createStatement();
			// �����ݿ��в���һ����¼
			int count = stat.executeUpdate("insert into student values(2007004,'��ǿ',23,'1234567')");
			System.out.println("�ɹ�������" + count + "����¼������");
			// ������ѧ���������һ��
			count = stat.executeUpdate("update student set sage=sage+1");
			System.out.println("�ɹ�������" + count + "����¼������");
			// ��student�����ȫ�����
			ResultSet rs = stat.executeQuery("select * from student");
			// ��ӡ��ͷ��Ϣ
			System.out.println("==================================");
			System.out.println("ѧ��\t����\t����\t�绰");
			// ѭ����ӡ������е�ÿһ����¼
			while (rs.next()) {
				// ��ȡ��ǰ��¼�е�һ������
				String sid = rs.getString(1);
				// ��ȡ��ǰ��¼�еڶ�������
				String sname = rs.getString(2);
				// ��ȡ��ǰ��¼�е���������
				String sage = rs.getString(3);
				// ��ȡ��ǰ��¼�е���������
				String stel = rs.getString(4);
				// ��ӡ������¼������
				System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + stel);
			}
			// �رս������
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
