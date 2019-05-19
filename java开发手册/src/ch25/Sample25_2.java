package ch25;

import java.awt.*;
import javax.swing.*;
import java.util.*;

//定义该类继承自JFrame
public class Sample25_2 extends JFrame {
	// 创建包含表格数据的向量
	Vector vdata = new Vector();
	{
		// 创建表示行数据的子向量
		Vector tempv1 = new Vector();
		tempv1.add("123456");
		tempv1.add("手表");
		tempv1.add("2000.0");
		tempv1.add("现金交易");
		tempv1.add("等待发货");
		Vector tempv2 = new Vector();
		tempv2.add("456123");
		tempv2.add("足球");
		tempv2.add("120.0");
		tempv2.add("网上支付");
		tempv2.add("等待付款");
		Vector tempv3 = new Vector();
		tempv3.add("951357");
		tempv3.add("U盘");
		tempv3.add("300.0");
		tempv3.add("现金交易");
		tempv3.add("交易完毕");
		Vector tempv4 = new Vector();
		tempv4.add("268453");
		tempv4.add("图书");
		tempv4.add("65.0");
		tempv4.add("网上支付");
		tempv4.add("等待发货");
		// 将表示行数据的子向量添加到包含表格数据的向量中
		vdata.add(tempv1);
		vdata.add(tempv2);
		vdata.add(tempv3);
		vdata.add(tempv4);
	}
	// 创建包含表格标题的向量
	Vector vhead = new Vector();
	{
		vhead.add("定单号");
		vhead.add("商品名称");
		vhead.add("金额");
		vhead.add("交易方式");
		vhead.add("交易情况");
	}
	// 创建JTable对象
	JTable jt = new JTable(vdata, vhead);
	// 将JTable封装进滚动窗格
	JScrollPane jsp = new JScrollPane(jt);

	public Sample25_2() {
		// 设置不绘制表格的垂直线
		jt.setShowVerticalLines(false);
		// 设置指定行行高
		jt.setRowHeight(2, 35);
		// 设置网格线的颜色为蓝色
		jt.setGridColor(Color.BLUE);
		// 将含JTable的滚动窗格添加进窗体
		this.add(jsp);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("一个表格的示例");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample25_2窗体对象
		new Sample25_2();
	}
}
