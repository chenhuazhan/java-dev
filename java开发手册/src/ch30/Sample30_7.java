package ch30;

import java.sql.*;

public class Sample30_7 {
	public static void main(String[] args) {
		// ����Connection����
		Connection con = null;
		try {
			// ����JDBC-ODBC��������
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// �������ݿ�����
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// �����ܹ����ɿɹ����������Statement����
			Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// ִ�м�����ÿɹ��������
			ResultSet rs = stat.executeQuery("SELECT * FROM course");
			// ��ӡ��ͷ��Ϣ
			System.out.println("=========��¼��ǰ�����˳��=========");
			System.out.println("�γ̺�\t�γ���\tѧʱ\tѧ��");
			// ����ǰ�����λ�����δ�ӡ������еļ�¼
			while (rs.next()) {
				// ��ȡ��ǰ��¼�и����ֶε�����
				String cid = rs.getString(1);
				String cname = rs.getString(2);
				String cperiod = rs.getString(3);
				String ccredit_hour = rs.getString(4);
				// ��ӡ������¼������
				System.out.println(cid + "\t" + cname + "\t" + cperiod + "\t" + ccredit_hour);
			}
			// ��ӡ��ͷ��Ϣ
			System.out.println("=========��¼�Ӻ���ǰ��˳��=========");
			System.out.println("�γ̺�\t�γ���\tѧʱ\tѧ��");
			// ���Ӻ���ǰ��λ�����δ�ӡ������еļ�¼
			while (rs.previous()) {
				// ��ȡ��ǰ���е�����
				String cid = rs.getString(1);
				String cname = rs.getString(2);
				String cperiod = rs.getString(3);
				String ccredit_hour = rs.getString(4);
				// ��ӡ���е�����
				System.out.println(cid + "\t" + cname + "\t" + cperiod + "\t" + ccredit_hour);
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
