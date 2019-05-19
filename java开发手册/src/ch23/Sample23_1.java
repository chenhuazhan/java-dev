package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample23_1 extends JFrame implements ActionListener, ItemListener {
	// 创建菜单数组
	private JMenu[] jm = { new JMenu("文件"), new JMenu("视图"), new JMenu("字体风格") };
	// 创建普通菜单项数组
	private JMenuItem[] jmi = new JMenuItem[] { new JMenuItem("打开"), new JMenuItem("保存") };
	// 创建单选按扭菜单项数组
	private JRadioButtonMenuItem[] jrbmi = new JRadioButtonMenuItem[] { new JRadioButtonMenuItem("左对齐", true),
			new JRadioButtonMenuItem("居中"), new JRadioButtonMenuItem("右对齐") };
	// 创建复选菜单项数组
	private JCheckBoxMenuItem[] jcbmi = new JCheckBoxMenuItem[] { new JCheckBoxMenuItem("斜体"),
			new JCheckBoxMenuItem("黑体") };
	// 创建菜单栏
	private JMenuBar jmb = new JMenuBar();
	// 创建按扭组
	private ButtonGroup bg = new ButtonGroup();
	// 创建文本区
	private JTextArea jta = new JTextArea();
	// 为jta文本区创建滚动条
	private JScrollPane jsp = new JScrollPane(jta);
	// 创建显示字体与对其情况的标签；
	JLabel jl = new JLabel("  当前的对齐方式是：左对齐，字体风格为：普通。");

	public Sample23_1() {
		// 将文件菜单添加进菜单栏
		jmb.add(jm[0]);
		// 将打开保存菜单项添加进文件菜单，并注册监听器
		for (int i = 0; i < jmi.length; i++) {
			jm[0].add(jmi[i]);
			jmi[i].addActionListener(this);
		}
		// 将视图菜单添加进菜单栏
		jmb.add(jm[1]);
		// 将3个单选按扭菜单项添加进视图菜单
		for (int i = 0; i < jrbmi.length; i++) {
			jm[1].add(jrbmi[i]);
			// 将单选按扭菜单项编为一组
			bg.add(jrbmi[i]);
			// 为单选按扭菜单项注册监听器
			jrbmi[i].addItemListener(this);
		}
		// 向视图菜单中添加分隔线
		jm[1].addSeparator();
		// 将字体菜单添加进视图菜单
		jm[1].add(jm[2]);
		// 将2个复选菜单项添加进字体菜单
		for (int i = 0; i < jcbmi.length; i++) {
			jm[2].add(jcbmi[i]);
			// 为复选菜单项注册监听器
			jcbmi[i].addItemListener(this);
		}
		// 将菜单栏添加进窗体
		this.setJMenuBar(jmb);
		// 将带滚动条的文本区添加进窗体
		this.add(jsp);
		// 将显示选择情况的标签添加进窗体
		this.add(jl, BorderLayout.SOUTH);
		// 设置窗口的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("菜单综合示例");
		this.setBounds(100, 100, 300, 200);
		this.setVisible(true);
	}

	// 实现ActionListener监听接口中的方法
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jmi[0]) {// 选中打开菜单项
			jta.append("您选中了打开菜单项！！！\n");
		} else if (e.getSource() == jmi[1]) {// 选中保存菜单项
			jta.append("您选中了保存菜单项！！！\n");
		}
	}

	// 实现ItemListener监听接口中的方法
	public void itemStateChanged(ItemEvent e) {
		String temps = "  当前的对齐方式是：";
		// 判断选择的是哪种对齐方式
		for (int i = 0; i < jrbmi.length; i++) {
			if (jrbmi[i].isSelected() == true) {
				switch (i) {
				case 0:
					temps = temps + "左对齐，字体风格为：";
					break;
				case 1:
					temps = temps + "居中，字体风格为：";
					break;
				case 2:
					temps = temps + "右对齐，字体风格为：";
					break;
				}
				break;
			}
		}
		// 判断字体风格情况
		int c = 0;
		if (jcbmi[0].isSelected() == true) {// 选中斜体复选菜单项
			c += 1;
		}
		if (jcbmi[1].isSelected() == true) {// 选中黑体复选菜单项
			c += 2;
		}
		switch (c) {// 根据不同情况组合生成字符串
		case 0:
			temps = temps + "普通。";
			break;
		case 1:
			temps = temps + "斜体。";
			break;
		case 2:
			temps = temps + "黑体。";
			break;
		case 3:
			temps = temps + "黑斜体。";
			break;
		}
		// 设置显示选择情况标签的内容
		jl.setText(temps);
	}

	public static void main(String[] args) {
		// 创建Sample23_1窗体对象
		new Sample23_1();
	}
}
