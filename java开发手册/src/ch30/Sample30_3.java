package ch30;

import java.sql.*;

public class Sample30_3 {
	public static void main(String[] args) {
		// ����Connection����
		Connection con = null;
		try {
			// ����MySQL��������
			Class.forName("org.gjt.mm.mysql.Driver");
			// �������ݿ�����
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "", "");
			// ����Statement����
			Statement stat = con.createStatement();
			// ִ�в�ѯ��SQL���
			ResultSet rs = stat.executeQuery("SELECT * FROM book");
			// ��ӡ��ͷ��Ϣ
			System.out.println("�鱾��\t\t�鱾��\t\t�۸�");
			// ѭ����ӡ������е�ÿһ����¼
			while (rs.next()) {
				// ��ȡ��ǰ��¼�и��ֶ�����
				String cid = rs.getString(1);
				String cname = rs.getString(2);
				String cperiod = rs.getString(3);
				// ��ӡ������¼������
				System.out.println(cid + "\t\t" + cname + "\t\t" + cperiod);
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
