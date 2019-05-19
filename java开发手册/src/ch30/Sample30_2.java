package ch30;

import java.sql.*;

public class Sample30_2 {
	public static void main(String[] args) {
		// ����Connection����
		Connection con = null;
		// ����PreparedStatement����
		PreparedStatement psInsert = null;
		PreparedStatement psSelect = null;
		try {
			// ����JDBC-ODBC��������
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// �������ݿ�����
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// ����ִ�в������������PreparedStatement������
			psInsert = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
			// ��������4��������ֵ
			psInsert.setInt(1, 2003005);
			psInsert.setString(2, "����");
			psInsert.setInt(3, 24);
			psInsert.setString(4, "9876541");
			// ִ�в������
			int count = psInsert.executeUpdate();
			System.out.println("�ɹ�������" + count + "����¼������");
			// ����ִ�в�ѯ�����PreparedStatement������
			psSelect = con.prepareStatement("SELECT * FROM student WHERE sid=?");
			// ���ñ�ʾsid�Ĳ�����ֵ
			psSelect.setInt(1, 2003005);
			// ִ�м���
			ResultSet rs = psSelect.executeQuery();
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
			psInsert.close();
			psSelect.close();
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
