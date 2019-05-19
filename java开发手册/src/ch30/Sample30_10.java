package ch30;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;

//主窗体类
public class Sample30_10 extends JFrame {
	// 声明用来记录数据库驱动类全称类名的字符串
	String driverClass;
	// 声明用来记录数据库连接字符串的字符串
	String url;
	// 声明用来记录数据库用户名、密码的字符串
	String user;
	String password;
	// 创建显示数据库中表情况的树的根节点
	DefaultMutableTreeNode dmtnroot = new DefaultMutableTreeNode();
	// 创建树模型
	DefaultTreeModel dtm = new DefaultTreeModel(dmtnroot);
	// 创建树状列表控件
	JTree jtr = new JTree(dtm);
	// 将树状列表放置到滚动窗口中
	JScrollPane jspl = new JScrollPane(jtr);
	// 创建显示详细信息的表格
	JTable jta = new JTable();
	// 将表格放置到滚动窗口中
	JScrollPane jspy = new JScrollPane(jta);
	// 创建包含树与表格的分割窗格
	JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jspl, jspy);

	public Sample30_10() {
		// 设置分隔条的初始位置以及宽度
		jsp.setDividerLocation(200);
		jsp.setDividerSize(4);
		// 将分割窗格添加进窗体
		this.add(jsp);
		// 设置窗体的标题、大小位置以及可见性
		this.setTitle("数据库管理器--DBManager");
		this.setBounds(100, 100, 600, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 自定义的设置驱动类全称名、数据库连接字符串、用户名以及密码的方法
	public void setUNP(String driverClass, String url, String user, String password) {
		this.driverClass = driverClass;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public static void main(String[] args) {
		new Sample30_10();
	}
}
