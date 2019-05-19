package ch25;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;

//主类
public class Sample25_5 extends JFrame {
	// 创建列标题字符串数组
	String[] head = { "学号", "姓名", "科目", "成绩" };
	// 创建表格数据字符串数组
	String[][] data = { { "001", "王强", "语文", "80" }, { "002", "李勇", "数学", "90" }, { "003", "马跃", "数学", "85" },
			{ "002", "李勇", "外语", "90" }, { "003", "马跃", "外语", "85" } };
	// 创建表格模型
	DefaultTableModel dtm = new DefaultTableModel(data, head);
	// 创建JTable对象
	JTable jt = new JTable(dtm);
	// 将JTable封装进滚动窗格
	JScrollPane jsp = new JScrollPane(jt);
	// 创建输出提示信息的文本框
	JTextField jtf = new JTextField();
	// 创建自定义的监听器对象
	TableListener tl = new TableListener();

	// 声明自定义监听器内部类
	class TableListener implements ListSelectionListener, TableColumnModelListener, TableModelListener {
		// 记录行与列的成员变量
		int row;
		int col;

		// 实现ListSelectionListener监听接口中的方法
		public void valueChanged(ListSelectionEvent lse) {// 当选中行发生变化时会调用该方法
															// 获取当前选择的行索引
			row = jt.getSelectedRow();
			// 调用showMsg方法
			this.showMsg(row, col);
		}

		// 实现TableColumnModelListener监听接口中的方法
		public void columnSelectionChanged(ListSelectionEvent lse) {// 当选中列发生变化时会调用该方法
																	// 获取当前选择的列索引
			col = jt.getSelectedColumn();
			// 调用showMsg方法
			this.showMsg(row, col);
		}

		// 对TableColumnModelListener监听接口中不需要的方法进行空实现
		public void columnMarginChanged(ChangeEvent ce) {
		}

		public void columnMoved(TableColumnModelEvent tcme) {
		}

		public void columnRemoved(TableColumnModelEvent tcme) {
		}

		public void columnAdded(TableColumnModelEvent tcme) {
		}

		// 实现TableModelListener监听接口中的方法
		public void tableChanged(TableModelEvent e) {// 当表格内容变化时执行此方法
														// 获取当前选择单元格的值
			String str = (String) jt.getValueAt(row, col);
			// 设置显示信息
			jtf.setText("您编辑了第" + (row + 1) + "行第" + (col + 1) + "列的内容，新值为：" + str + "”。");
		}

		// 创建显示提示信息的方法
		public void showMsg(int r, int c) {
			// 获取当前选择单元格的值
			String str = (String) jt.getValueAt(r, c);
			// 设置显示信息
			jtf.setText("您当前选择的是第" + (r + 1) + "行第" + (c + 1) + "列，值为：“" + str + "”。");
		}
	}

	public Sample25_5() {
		// 设置本本框不可编辑
		jtf.setEditable(false);
		// 将文本框添加进窗体顶部
		this.add(jtf, BorderLayout.NORTH);
		// 使用TableModel接口中定义的getColumnCount方法根据数据模型创建表列
		jt.createDefaultColumnsFromModel();
		// 为表格选择模型注册监听器
		jt.getSelectionModel().addListSelectionListener(tl);
		// 为表格列模型注册监听器
		jt.getColumnModel().addColumnModelListener(tl);
		// 为表格模型注册监听器
		jt.getModel().addTableModelListener(tl);
		// 将含JTable的滚动窗格添加进窗体的中间
		this.add(jsp, BorderLayout.CENTER);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("表格相关事件的示例");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample25_5窗体对象
		new Sample25_5();
	}
}
