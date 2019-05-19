package ch30;

import java.sql.*;

public class Sample30_2 {
	public static void main(String[] args) {
		// 声明Connection引用
		Connection con = null;
		// 声明PreparedStatement引用
		PreparedStatement psInsert = null;
		PreparedStatement psSelect = null;
		try {
			// 加载JDBC-ODBC桥驱动类
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// 创建数据库连接
			con = DriverManager.getConnection("jdbc:odbc:stu", "", "");
			// 创建执行插入数据任务的PreparedStatement语句对象
			psInsert = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
			// 依次设置4个参数的值
			psInsert.setInt(1, 2003005);
			psInsert.setString(2, "赵六");
			psInsert.setInt(3, 24);
			psInsert.setString(4, "9876541");
			// 执行插入操作
			int count = psInsert.executeUpdate();
			System.out.println("成功插入了" + count + "条记录！！！");
			// 创建执行查询任务的PreparedStatement语句对象
			psSelect = con.prepareStatement("SELECT * FROM student WHERE sid=?");
			// 设置表示sid的参数的值
			psSelect.setInt(1, 2003005);
			// 执行检索
			ResultSet rs = psSelect.executeQuery();
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
			psInsert.close();
			psSelect.close();
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
