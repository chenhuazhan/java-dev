package ch30;

import java.sql.*;

public class Sample30_3 {
	public static void main(String[] args) {
		// 声明Connection引用
		Connection con = null;
		try {
			// 加载MySQL的驱动类
			Class.forName("org.gjt.mm.mysql.Driver");
			// 创建数据库连接
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "", "");
			// 创建Statement对象
			Statement stat = con.createStatement();
			// 执行查询的SQL语句
			ResultSet rs = stat.executeQuery("SELECT * FROM book");
			// 打印表头信息
			System.out.println("书本号\t\t书本名\t\t价格");
			// 循环打印结果集中的每一条记录
			while (rs.next()) {
				// 获取当前记录中各字段内容
				String cid = rs.getString(1);
				String cname = rs.getString(2);
				String cperiod = rs.getString(3);
				// 打印本条记录的内容
				System.out.println(cid + "\t\t" + cname + "\t\t" + cperiod);
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
