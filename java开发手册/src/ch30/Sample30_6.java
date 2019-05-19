package ch30;

import java.sql.*;

public class Sample30_6 {
	public static void main(String[] args) {
		// 声明Connection引用
		Connection con = null;
		// 声明Oracle数据库的连接字符串、用户名以及密码
		String url = "jdbc:oracle:thin:@localhost:1521:wyf";
		String user = "system";
		String password = "initial123";
		try {
			// 加载oracle驱动类
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 创建数据库连接
			con = DriverManager.getConnection(url, user, password);
			// 禁用自动提交模式，并开始一个事务
			con.setAutoCommit(false);
			// 创建Statement对象
			Statement stat = con.createStatement();
			// 添加批处理中的SQL命令
			stat.addBatch("delete from music");
			stat.addBatch("INSERT INTO music VALUES('10004','音乐4','China')");
			stat.addBatch("INSERT INTO music VALUES('10005','音乐5','UK')");
			// 执行批处理
			stat.executeBatch();
			// 将事务提交
			con.commit();
			// 恢复自动提交模式
			con.setAutoCommit(true);
			// 执行检索，查看music表
			ResultSet rs = stat.executeQuery("select * from music");
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
		} catch (Exception e) {// 如果出现错误将发起回滚操作
			e.printStackTrace();
			try {
				con.rollback();
			} catch (Exception ae) {
				e.printStackTrace();
			}
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
