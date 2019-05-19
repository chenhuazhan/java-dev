package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample21_1 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按扭数组
	private JButton[] jbArray = new JButton[] { new JButton("LEFT"), new JButton("CENTER"), new JButton("RIGHT"),
			new JButton("LEADING"), new JButton("TRAILING") };
	// 创建布局管理器对象
	private FlowLayout fl = new FlowLayout();

	public Sample21_1() {
		// 设置JPanel的布局管理器
		jp.setLayout(fl);
		// 依次将按扭添加进JPanel，并且为每个按扭注册监听器
		for (int i = 0; i < jbArray.length; i++) {
			jp.add(jbArray[i]);
			jbArray[i].addActionListener(this);
		}
		// 将JPanel添加进窗口
		this.add(jp);
		// 设置窗口的标题、大小位置以及可见性
		this.setTitle("流布局中动态设置对齐方式");
		this.setBounds(100, 100, 400, 150);
		this.setVisible(true);
	}

	// 实现ActionListener中的方法
	public void actionPerformed(ActionEvent e) {
		// 扫描按钮数组，判断按下的是哪个按钮
		for (int i = 0; i < jbArray.length; i++) {
			// 使用getSource方法判断事件源
			if (e.getSource() == jbArray[i]) {
				// 设置布局管理器的对齐方式
				fl.setAlignment(FlowLayout.LEFT + i);
				// 请求刷新JPanel
				jp.revalidate();
			}
		}
	}

	public static void main(String[] args) {
		// 创建Sample21_1窗体对象
		new Sample21_1();
	}
}
