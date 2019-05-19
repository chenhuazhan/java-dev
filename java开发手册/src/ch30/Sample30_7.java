package ch30;

import java.sql.*;

public class Sample30_7 {
	public static void main(String[] args) {
		// 声明Connection引用
		Connection con = null;
		try {
			// 加载JDBC-ODBC桥驱动类
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// 创建数据库连接
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// 创建能够生成可滚动结果集的Statement对象
			Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// 执行检索获得可滚动结果集
			ResultSet rs = stat.executeQuery("SELECT * FROM course");
			// 打印表头信息
			System.out.println("=========记录从前至后的顺序=========");
			System.out.println("课程号\t课程名\t学时\t学分");
			// 按从前至后的位置依次打印结果集中的记录
			while (rs.next()) {
				// 获取当前记录中各个字段的内容
				String cid = rs.getString(1);
				String cname = rs.getString(2);
				String cperiod = rs.getString(3);
				String ccredit_hour = rs.getString(4);
				// 打印本条记录的内容
				System.out.println(cid + "\t" + cname + "\t" + cperiod + "\t" + ccredit_hour);
			}
			// 打印表头信息
			System.out.println("=========记录从后至前的顺序=========");
			System.out.println("课程号\t课程名\t学时\t学分");
			// 按从后至前的位置依次打印结果集中的记录
			while (rs.previous()) {
				// 获取当前行中的内容
				String cid = rs.getString(1);
				String cname = rs.getString(2);
				String cperiod = rs.getString(3);
				String ccredit_hour = rs.getString(4);
				// 打印本行的内容
				System.out.println(cid + "\t" + cname + "\t" + cperiod + "\t" + ccredit_hour);
			}
			// 关闭结果集
			rs.close();
			// 关闭语句
			stat.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭数据库连接
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
