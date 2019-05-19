package ch30;

import java.sql.*;

public class Sample30_1 {
	public static void main(String[] args) {
		// 声明Connection引用
		Connection con = null;
		try {
			// 加载JDBC-ODBC桥驱动类
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// 创建数据库连接
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// 创建Statement对象
			Statement stat = con.createStatement();
			// 在数据库中插入一条记录
			int count = stat.executeUpdate("insert into student values(2007004,'王强',23,'1234567')");
			System.out.println("成功插入了" + count + "条记录！！！");
			// 将所有学生的年龄加一岁
			count = stat.executeUpdate("update student set sage=sage+1");
			System.out.println("成功更新了" + count + "条记录！！！");
			// 对student表进行全表检索
			ResultSet rs = stat.executeQuery("select * from student");
			// 打印表头信息
			System.out.println("==================================");
			System.out.println("学号\t姓名\t年龄\t电话");
			// 循环打印结果集中的每一条记录
			while (rs.next()) {
				// 获取当前记录中第一列内容
				String sid = rs.getString(1);
				// 获取当前记录中第二列内容
				String sname = rs.getString(2);
				// 获取当前记录中第三列内容
				String sage = rs.getString(3);
				// 获取当前记录中第四列内容
				String stel = rs.getString(4);
				// 打印本条记录的内容
				System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + stel);
			}
			// 关闭结果集合
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
