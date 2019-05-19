package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample21_4 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按扭数组
	private JButton jb = new JButton("移动");
	// 创建标签
	private JLabel jl = new JLabel("这里使用的是空布局");

	public Sample21_4() {
		// 设置JPanel的布局管理器
		jp.setLayout(null);
		// 设置按扭的大小与位置
		jb.setBounds(25, 50, 70, 30);
		// 为按扭注册监听器
		jb.addActionListener(this);
		// 将按扭添加进JPanel
		jp.add(jb);
		// 设置标签的大小以及位置
		jl.setBounds(120, 25, 150, 30);
		// 将标签添加进JPanel
		jp.add(jl);
		// 将JPanel添加进窗口
		this.add(jp);
		// 设置窗体的标题、大小位置以及可见性
		this.setTitle("空布局中改变坐标");
		this.setBounds(100, 100, 260, 200);
		this.setVisible(true);
	}

	// 实现ActionListener中的方法
	public void actionPerformed(ActionEvent e) {
		jl.setBounds(120, 125, 200, 30);
	}

	public static void main(String[] args) {
		// 创建Sample21_4对象
		new Sample21_4();
	}
}
