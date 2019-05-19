package ch25;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

//自定义的表格数据模型
class MyTableModel extends AbstractTableModel {
	// 创建表示各个列类型的类型数组
	Class[] colClass = { String.class, Number.class, Date.class };
	// 创建列标题字符串数组
	Object[] head = { "字符串", "数值", "日期" };
	// 创建表示表格数据的二维对象数组
	Object[][] data = { { "one", new Integer(70), new Date() }, { "two", new Integer(30), new Date(105, 7, 1) },
			{ "three", new Integer(70), new Date(107, 8, 1) }, { "four", new Integer(30), new Date(106, 0, 1) },
			{ "five", new Integer(50), new Date(107, 1, 1) }, { "six", new Integer(50), new Date(107, 8, 2) },
			{ "seven", new Integer(50), new Date(106, 9, 1) }, { "eight", new Integer(60), new Date(107, 5, 1) },
			{ "nine", new Integer(90), new Date(106, 7, 1) }, { "ten", new Integer(60), new Date(107, 11, 1) },
			{ "eleven", new Integer(60), new Date(105, 4, 1) } };

	// 重写getColumnCount方法
	public int getColumnCount() {
		return head.length;
	}

	// 重写getRowCount方法
	public int getRowCount() {
		return data.length;
	}

	// 重写getColumnName方法
	public String getColumnName(int col) {
		return head[col].toString();
	}

	// 重写getValueAt方法
	public Object getValueAt(int r, int c) {
		return data[r][c];
	}

	// 重写getColumnClass方法
	public Class getColumnClass(int c) {
		return colClass[c];
	}
}

// 自定义的过滤条件获取控件面板
class MyFilterPane extends JPanel implements ItemListener {
	// 定义标识面板的字符串
	String snd;
	// 创建一个复选框
	JCheckBox jcb = new JCheckBox();
	// 创建两个标签控件
	JLabel jl1 = new JLabel();
	JLabel jl2 = new JLabel("设置该条件与其他条件的关系");
	// 创建一个文本框控件
	JTextField jtf = new JTextField();
	// 创建一个单选按扭数组，并为该单选按扭数组中的单选按扭创建一个按扭组
	JRadioButton[] jrb = { new JRadioButton("与关系", true), new JRadioButton("或关系") };
	ButtonGroup bg = new ButtonGroup();

	public MyFilterPane(String snd) {
		// 设置面板的布局管理器
		this.setLayout(null);
		// 设置标识字符串
		this.snd = snd;
		// 设置复选框的文本、大小位置并为其注册监听器，同时将其添加到面板中
		jcb.setText("设置" + snd + "过滤条件");
		jcb.addItemListener(this);
		jcb.setBounds(5, 5, 150, 26);
		this.add(jcb);
		// 设置jl1标签的文本以及大小位置，并将其添加到面板中
		jl1.setText("请输入与" + snd + "匹配的值");
		jl1.setBounds(10, 30, 150, 26);
		this.add(jl1);
		// 设置文本框的大小位置以及可编辑性，并将其添加到面板中
		jtf.setBounds(160, 30, 80, 26);
		jtf.setEditable(false);
		this.add(jtf);
		// 设置jl2标签的大小位置，并将其添加到面板中
		jl2.setBounds(10, 60, 200, 26);
		this.add(jl2);
		// 循环对单选按钮数组进行设置
		for (int i = 0; i < jrb.length; i++) {
			// 设置单选按扭的大小位置、可编辑性并且将其添加进按扭组与面板中
			jrb[i].setBounds(10 + i * 80, 80, 80, 26);
			jrb[i].setEnabled(false);
			bg.add(jrb[i]);
			this.add(jrb[i]);
		}
	}

	// 获取各个面板中条件对应过滤器的方法
	public RowFilter getFilter() {
		if (jcb.isSelected()) {// 测试复选框是否选中
			if (snd.equals("字符串")) {// 测试标识字符串进而确定是否是字符串过滤条件的面板
									// 将输入的字符串封装成过滤器返回 该过滤器将针对表中第一列进行过滤
				return RowFilter.regexFilter(jtf.getText().trim(), 0);
			} else if (snd.equals("数值")) {// 测试标识字符串进而确定是否是数值过滤条件的面板
											// 获取输入的字符串
				String str = jtf.getText().trim();
				// 测试输入的是否是整数
				if (!str.matches("[0-9]+")) {// 若不是整数则返回
					return null;
				}
				// 将字符串封装成Integer对象
				Integer i = new Integer(str);
				// 根据Integer对象封装进过滤器，该过滤器将针对表中第二列进行过滤
				return RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, i, 1);
			} else if (snd.equals("日期")) {// 测试标识字符串进而确定是否是日期过滤条件的面板
											// 获取输入的字符串
				String str = jtf.getText().trim();
				try {
					// 将字符串解析成日期Date对象
					String[] tempsa = str.split("-");
					Date d = new Date(Integer.parseInt(tempsa[0]) - 1900, Integer.parseInt(tempsa[1]) - 1,
							Integer.parseInt(tempsa[2]));
					// 根据日期对象创建过滤器，该过滤器将针对表中第三列进行过滤
					return RowFilter.dateFilter(RowFilter.ComparisonType.EQUAL, d, 2);
				} catch (Exception e) {
					// 若输入字符串不能解析成功将弹出提示框
					JOptionPane.showMessageDialog(this, "格式错误，例如应为“2007-3-5”或“2006-12-30”！！！");
					return null;
				}
			}
		}
		return null;
	}

	// 实现ItemListener接口中的方法
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == jcb && jcb.isSelected()) {// 当复选框选中时设置所有控件的可用性
			this.setIsOpen(true);
		} else if (e.getSource() == jcb && !jcb.isSelected()) {// 当复选框未选中时设置所有控件的可用性
			this.setIsOpen(false);
		}
	}

	// 设置控件可用性的方法
	public void setIsOpen(boolean b) {
		// 根据参数设置各个控件的可用性
		jtf.setEditable(b);
		jrb[0].setEnabled(b);
		jrb[1].setEnabled(b);
	}
}

// 主类
public class Sample25_7 extends JFrame {
	// 创建自定义的表格模型对象
	MyTableModel mtm = new MyTableModel();
	// 根据模型创建表格控件
	JTable jt = new JTable(mtm);
	// 将表格控件放到滚动窗体中
	JScrollPane jsp = new JScrollPane(jt);
	// 创建表格的行排序器
	TableRowSorter sorter = new TableRowSorter(mtm);
	// 创建选项卡窗格
	JTabbedPane jtp = new JTabbedPane();
	// 为三个列创建3个不同的面板
	MyFilterPane mfpStr = new MyFilterPane("字符串");
	MyFilterPane mfpNum = new MyFilterPane("数值");
	MyFilterPane mfpDate = new MyFilterPane("日期");
	// 存放与条件过滤器的列表
	ArrayList andlist = new ArrayList();
	// 存放或条件过滤器的列表
	ArrayList orlist = new ArrayList();
	// 创建一个按扭
	JButton jb = new JButton("提交");

	public Sample25_7() {
		// 设置窗体容器为空布局
		this.setLayout(null);
		// 设置包含表格的滚动窗体的大小位置
		jsp.setBounds(10, 10, 300, 180);
		// 将滚动窗体添加进窗体
		this.add(jsp);
		// 将3个面板添加到选项卡窗格中
		jtp.addTab("过滤字符串", mfpStr);
		jtp.addTab("过滤数值", mfpNum);
		jtp.addTab("过滤日期", mfpDate);
		// 设置选项卡窗格的大小位置，并将选项卡窗格添加到窗体中
		jtp.setBounds(320, 10, 260, 150);
		this.add(jtp);
		// 设置按扭的大小位置
		jb.setBounds(400, 170, 120, 26);
		// 通过匿名内部类为按扭注册监听器并编写事件处理代码
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb) {
					Sample25_7.this.creatGeneralFilter();
				}
			}
		});
		// 将按扭添加进窗体
		this.add(jb);
		// 为表格设置行排序器
		jt.setRowSorter(sorter);
		// 设置窗体标题、大小位置以及可见性
		this.setTitle("表格排序器与过滤器示例");
		this.setResizable(false);
		this.setBounds(100, 100, 600, 230);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 获取最后组装的过滤器的方法
	public void creatGeneralFilter() {
		// 获取字符串过滤面板的过滤器
		RowFilter rf = mfpStr.getFilter();
		if (rf != null) {// 测试获取的过滤器是否为null
			if (mfpStr.jrb[0].isSelected()) {// 测试字符串面板中单选按扭是否选择的是与关系，若是则将过滤器添加进与列表
				andlist.add(rf);
			} else {// 否则将过滤器添加进或列表
				orlist.add(rf);
			}
		}
		// 获取数值过滤面板的过滤器
		rf = mfpNum.getFilter();
		if (rf != null) {// 测试获取的过滤器是否为null
			if (mfpNum.jrb[0].isSelected()) {// 测试数值面板中单选按扭是否选择的是与关系，若是则将过滤器添加进与列表
				andlist.add(rf);
			} else {// 否则将过滤器添加进或列表
				orlist.add(rf);
			}
		}
		// 获取日期过滤面板的过滤器
		rf = mfpDate.getFilter();
		if (rf != null) {// 测试获取的过滤器是否为null
			if (mfpDate.jrb[0].isSelected()) {// 测试日期面板中单选按扭是否选择的是与关系，若是则将过滤器添加进与列表
				andlist.add(rf);
			} else {// 否则将过滤器添加进或列表
				orlist.add(rf);
			}
		}
		if (!andlist.isEmpty()) {// 测试与列表中是否没有元素，若有元素则将该列表中的过滤器根据与条件进行组装
			rf = RowFilter.andFilter(andlist);
			// 将组装后的过滤器添加进或关系列表中
			orlist.add(rf);
		}
		if (!orlist.isEmpty()) {// 测试或列表中是否没有元素，若有元素则将该列表中的过滤器根据或条件进行组装
			rf = RowFilter.orFilter(orlist);
		}
		// 将最后组装好的过滤器设置到表格排序器中进而体现在表格中
		sorter.setRowFilter(rf);
		// 清除与列表与或列表中的所有元素
		andlist.clear();
		orlist.clear();
	}

	public static void main(String args[]) {
		// 创建Sample25_7窗体对象
		new Sample25_7();
	}
}
