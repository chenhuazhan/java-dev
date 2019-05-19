package ch25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

//声明自定义的表格列模型类
class MyColumnModel extends DefaultTableColumnModel {
	// 重写addColumn方法
	public void addColumn(TableColumn tc) {
		// 调用父类的addColumn方法
		super.addColumn(tc);
		// 获得比指定列标题大的列的索引
		int newIndex = this.sorted(tc);
		// 检查该索引是否是当前列的索引
		if (newIndex != tc.getModelIndex()) {
			// 将当前列移动到获得比自己大的列索引处
			this.moveColumn(tc.getModelIndex(), newIndex);
		}
	}

	// 自定义的用来比较列标题的方法
	public int sorted(TableColumn tc) {
		// 获得列的总数
		int count = this.getColumnCount();
		// 返回当前列的列标题
		String name = tc.getHeaderValue().toString();
		// 将当前列标题与每个列标题进行比较
		for (int i = 0; i < count; i++) {
			if (name.compareTo(this.getColumn(i).getHeaderValue().toString()) <= 0) {
				return i;// 若扫描到的列标题比指定列大则返回扫描到的列索引
			}
		}
		// 返回表格中最大的列索引+1
		return count;
	}
}

// 定义该类继承自JFrame
public class Sample25_4 extends JFrame {
	// 创建列标题字符串数组
	String[] head = { "a", "c", "d", "b", "h", "i", "p", "w", "f", "k" };
	// 创建表格数据二维字符串数组
	String[][] data = { { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" },
			{ "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" } };
	// 创建表格模型
	DefaultTableModel dtm = new DefaultTableModel(data, head);
	// 创建自定义的列模型
	MyColumnModel mc = new MyColumnModel();
	// 使用指定的表格模型与表格列模型创建JTable对象
	JTable jt = new JTable(dtm, mc);
	// 将JTable封装进滚动窗格
	JScrollPane jsp = new JScrollPane(jt);

	public Sample25_4() {
		// 根据指定的表格列模型与表格模型创建各个列
		jt.createDefaultColumnsFromModel();
		// 将含JTable的滚动窗格添加进窗体的中间
		this.add(jsp, BorderLayout.CENTER);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("自定义表格列模型案例");
		this.setBounds(100, 100, 600, 120);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample25_4窗体对象
		new Sample25_4();
	}
}
