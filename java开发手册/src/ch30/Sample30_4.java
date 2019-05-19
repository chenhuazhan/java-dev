package ch30;

import java.sql.*;

public class Sample30_4 {
	public static void main(String[] args) {
		// ����Connection����
		Connection con = null;
		// ����Oracle���ݿ�������ַ������û����Լ�����
		String url = "jdbc:oracle:thin:@localhost:1521:wyf";
		String user = "system";
		String password = "initial123";
		try {
			// ����Oracle������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// �������ݿ�����
			con = DriverManager.getConnection(url, user, password);
			// ����Statement����
			Statement stat = con.createStatement();
			// ִ��SQL�����music����м���
			ResultSet rs = stat.executeQuery("SELECT * FROM music");
			// ��ӡ��ͷ��Ϣ
			System.out.println("���ֱ��\t��������\t��������");
			// ѭ����ӡ������е�ÿһ����¼
			while (rs.next()) {
				// ��ȡ��ǰ��¼���ֶε�����
				String mid = rs.getString(1);
				String mname = rs.getString(2);
				String mcountry = rs.getString(3);
				// ��ӡ������¼������
				System.out.println(mid + "\t\t" + mname + "\t\t" + mcountry);
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
