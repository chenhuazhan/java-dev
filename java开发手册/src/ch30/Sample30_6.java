package ch30;

import java.sql.*;

public class Sample30_6 {
	public static void main(String[] args) {
		// ����Connection����
		Connection con = null;
		// ����Oracle���ݿ�������ַ������û����Լ�����
		String url = "jdbc:oracle:thin:@localhost:1521:wyf";
		String user = "system";
		String password = "initial123";
		try {
			// ����oracle������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// �������ݿ�����
			con = DriverManager.getConnection(url, user, password);
			// �����Զ��ύģʽ������ʼһ������
			con.setAutoCommit(false);
			// ����Statement����
			Statement stat = con.createStatement();
			// ����������е�SQL����
			stat.addBatch("delete from music");
			stat.addBatch("INSERT INTO music VALUES('10004','����4','China')");
			stat.addBatch("INSERT INTO music VALUES('10005','����5','UK')");
			// ִ��������
			stat.executeBatch();
			// �������ύ
			con.commit();
			// �ָ��Զ��ύģʽ
			con.setAutoCommit(true);
			// ִ�м������鿴music��
			ResultSet rs = stat.executeQuery("select * from music");
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
		} catch (Exception e) {// ������ִ��󽫷���ع�����
			e.printStackTrace();
			try {
				con.rollback();
			} catch (Exception ae) {
				e.printStackTrace();
			}
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
