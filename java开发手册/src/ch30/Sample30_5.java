package ch30;

import java.sql.*;

public class Sample30_5 {
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
			// �����Զ��ύģʽ����ʼһ������
			con.setAutoCommit(false);
			System.out.println("================����ʼ====================");
			// ����Statement����
			Statement stat = con.createStatement();
			// ��ѯ���music��
			System.out.println("==============��ӡmusic���м�¼=============");
			seleceAllFromMusic(stat);
			// ����в���һ�м�¼
			stat.executeUpdate("INSERT INTO music VALUES('10004','����4','China')");
			// �ٴ�����в���һ�м�¼
			stat.executeUpdate("INSERT INTO music VALUES('10005','����5','UK')");
			System.out.println("==============������¼����ɹ�==============");
			// ��ѯ���music��
			System.out.println("==============��ӡmusic���м�¼=============");
			seleceAllFromMusic(stat);
			// �������ύ
			con.commit();
			// �ָ��Զ��ύģʽ
			con.setAutoCommit(true);
			// �ر����
			stat.close();
		} catch (Exception e) {// ������ִ��󽫷���ع�����
			e.printStackTrace();
			try {
				con.rollback();
				System.out.println("==============�������⣬����ع�=============");
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

	// �Զ���ļ���music��ȫ��ķ���
	public static void seleceAllFromMusic(Statement stat) throws SQLException {
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
	}
}
