package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample21_2 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按扭数组
	private JButton[] jbArray = new JButton[13];

	// 创建布局管理器对象
	public Sample21_2() {
		// 初始化数组
		for (int i = 2; i < jbArray.length; i++) {
			jbArray[i] = new JButton("按纽" + (i - 1));
		}
		// 为钱两个按扭设置显示的文本
		jbArray[0] = new JButton("流布局");
		jbArray[1] = new JButton("网格布局");
		// 将依次将按扭添加进JPanel
		for (int i = 0; i < jbArray.length; i++) {
			jp.add(jbArray[i]);
			// 当按扭为jbArray[0]或者jbArray[1]时为其注册监听器
			if (i < 2) {
				jbArray[i].addActionListener(this);
			}
		}
		// 将JPanel添加进窗体
		this.add(jp);
		// 设置窗体的标题、大小位置以及可见性
		this.setTitle("流布局与网格布局--现在为流布局");
		this.setBounds(100, 100, 450, 200);
		this.setVisible(true);
	}

	// 实现ActionListener中的方法
	public void actionPerformed(ActionEvent e) {
		// 当点击的按扭是jbArray[0]时
		if (e.getSource() == jbArray[0]) {
			// 设置布局管理器为流布局
			jp.setLayout(new FlowLayout());
			// 重新设置窗体标题
			this.setTitle("流布局与网格布局--现在为流布局");
			// 请求刷新JPanel
			jp.revalidate();
		}
		// 当点击的按扭是jbArray[1]时
		else if (e.getSource() == jbArray[1]) {
			// 设置布局管理器为3行5列的网格布局
			jp.setLayout(new GridLayout(3, 5));
			// 重新设置窗体标题
			this.setTitle("流布局与网格布局--现在为网格布局[3，5]");
			// 请求刷新JPanel
			jp.revalidate();
		}
	}

	public static void main(String[] args) {
		// 创建Sample21_2窗体对象
		new Sample21_2();
	}
}
