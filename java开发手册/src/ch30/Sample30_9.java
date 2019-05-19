package ch30;

import java.sql.*;

public class Sample30_9 {
	public static void main(String[] args) {
		// 声明Connection引用
		Connection con = null;
		try { // 加载JDBC-ODBC桥驱动类
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// 创建数据库连接
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// 创建Statement对象
			Statement stat = con.createStatement();
			// 执行检索获取结果集
			ResultSet rs = stat.executeQuery("SELECT * FROM student");
			// 获取结果集的元数据
			ResultSetMetaData temprsmd = rs.getMetaData();
			// 打印表头信息
			System.out.println("字段名\t\t型字段类型\t\t显示宽度");
			// 从元数据中获取信息并打印
			for (int i = 1; i <= temprsmd.getColumnCount(); i++) {
				// 获取列名
				String listname = temprsmd.getColumnName(i);
				// 获取列类型
				String type = temprsmd.getColumnTypeName(i);
				// 获取列显示宽度
				int size = temprsmd.getColumnDisplaySize(i);
				// 打印信息
				System.out.println(listname + "\t\t" + type + "\t\t    " + size);
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
