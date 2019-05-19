package ch30;

import java.sql.*;
import java.sql.*;

public class Sample30_8 {
	public static void main(String[] args) {
		// 声明Connection引用
		Connection con = null;
		try {
			// 加载JDBC-ODBC桥驱动类
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// 创建数据库连接
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// 获取DatabaseMetaData对象
			DatabaseMetaData dbmd = con.getMetaData();
			// 从DatabaseMetaData中获取关于表的描述信息
			ResultSet rsTables = dbmd.getTables(null, null, null, new String[] { "TABLE" });
			// 遍历获取的表信息结果集
			while (rsTables.next()) {
				// 从结果集中获取表名
				String tableName = rsTables.getString(3);
				// 打印获取的表名
				System.out.println("======================" + tableName + "表======================");
				// 从数据库元数据中获取关于指定表的字段信息
				ResultSet rsFields = dbmd.getColumns(null, null, tableName, null);
				// 打印表头
				System.out.println("字段名\t\t字段类型\t字段首选宽度");
				while (rsFields.next()) {// 打印各个列的信息
					System.out.println(
							rsFields.getString(4) + "\t\t" + rsFields.getString(6) + "\t\t" + rsFields.getString(7));
				}
				// 关闭结果集
				rsFields.close();
			}
			// 关闭结果集
			rsTables.close();
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
