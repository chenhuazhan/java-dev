package ch30;

import java.sql.*;

public class Sample30_4 {
	public static void main(String[] args) {
		// 声明Connection引用
		Connection con = null;
		// 声明Oracle数据库的连接字符串、用户名以及密码
		String url = "jdbc:oracle:thin:@localhost:1521:wyf";
		String user = "system";
		String password = "initial123";
		try {
			// 加载Oracle驱动类
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 创建数据库连接
			con = DriverManager.getConnection(url, user, password);
			// 创建Statement对象
			Statement stat = con.createStatement();
			// 执行SQL命令对music表进行检索
			ResultSet rs = stat.executeQuery("SELECT * FROM music");
			// 打印表头信息
			System.out.println("音乐编号\t音乐名称\t所属国家");
			// 循环打印结果集中的每一条记录
			while (rs.next()) {
				// 获取当前记录中字段的内容
				String mid = rs.getString(1);
				String mname = rs.getString(2);
				String mcountry = rs.getString(3);
				// 打印本条记录的内容
				System.out.println(mid + "\t\t" + mname + "\t\t" + mcountry);
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
