package ch25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

//定义该类继承自JFrame
public class Sample25_3 extends JFrame implements ActionListener {
	// 创建用于摆放按扭的JPanel容器
	JPanel jp = new JPanel();
	// 创建按扭数组
	JButton[] jb = { new JButton("添加行"), new JButton("删除行"), new JButton("添加列"), new JButton("删除列") };
	// 创建初始列标题
	String[] head = { "第1列" };
	// 创建初始表格数据
	String[][] data = { { "1行1列" } };
	// 创建表格模型
	DefaultTableModel dtm = new DefaultTableModel(data, head);
	// 创建JTable对象
	JTable jt = new JTable(dtm);
	// 将JTable封装进滚动窗格
	JScrollPane jsp = new JScrollPane(jt);

	public Sample25_3() {
		// 对按钮进行循环初始化
		for (int i = 0; i < jb.length; i++) {
			// 将按扭添加进JPanel容器中
			jp.add(jb[i]);
			// 为按扭注册动作事件监听器
			jb[i].addActionListener(this);
		}
		// 将按扭容器添加进窗体的顶部
		this.add(jp, BorderLayout.NORTH);
		// 将含JTable的滚动窗格添加进窗体的中间
		this.add(jsp, BorderLayout.CENTER);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("动态表格的实现");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
	}

	// 实现ActionListener接口中的方法
	public void actionPerformed(ActionEvent e) {
		// 获得表格模型
		DefaultTableModel temp = (DefaultTableModel) jt.getModel();
		// 获得表格的列数
		int c = temp.getColumnCount();
		// 获得表格的行数
		int r = temp.getRowCount();
		if (e.getSource() == jb[0]) {// 按下添加行按钮执行的代码
										// 创建新行的数据向量
			Vector newR = new Vector();
			for (int i = 0; i < c; i++) {
				// 为数据向量添加数据
				newR.add((r + 1) + "行" + (i + 1) + "列");
			}
			// 将新的数据向量添加进表格模型中
			temp.getDataVector().add(newR);
			// 刷新表格重新绘制
			((DefaultTableModel) jt.getModel()).fireTableStructureChanged();
		} else if (e.getSource() == jb[1]) {// 按下删除行按钮执行的代码
			if (r > 0)// 检查行数是否大于0
			{
				// 删除最后一行
				temp.removeRow(r - 1);
			}
		} else if (e.getSource() == jb[2]) {// 按下添加列按钮执行的代码
											// 创建新列的数据向量
			Vector newC = new Vector();
			for (int i = 0; i < r; i++) {
				// 为数据向量添加数据
				newC.add((i + 1) + "行" + (c + 1) + "列");
			}
			// 将新列添加进数据模型中
			temp.addColumn("第" + (c + 1) + "列", newC);
		} else if (e.getSource() == jb[3]) {// 按下删除列按钮执行的代码
			if (c - 1 > 0)// 检查当前列数是否大于1
			{
				// 设置表的列数为当前列数减1，从而最后一列被删除
				temp.setColumnCount(c - 1);
			}
		}
	}

	public static void main(String[] args) {
		// 创建Sample25_3窗体对象
		new Sample25_3();
	}
}
