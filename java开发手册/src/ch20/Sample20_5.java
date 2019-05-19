package ch20;

import java.awt.event.*;
import javax.swing.*;

//定义继承自JFrame的类
public class Sample20_5 extends JFrame {
	// 定义构造器
	public Sample20_5() {
		// 设置窗体的标题
		this.setTitle("关闭窗体事件处理被重新定义的窗体");
		// 向窗体中添加一个标签
		this.add(new JLabel("                          这是一个演示窗体，" + "用来演示如何监听窗体关闭事件！！！"));
		// 注册WindowListener监听器
		this.addWindowListener(new WindowAdapter() {
			// 实现WindowListener接口中的各个方法
			public void windowClosing(WindowEvent e) {
				System.out.println("当窗体关闭时将执行这里的代码！！！");
				System.exit(0);
			}
		});
		// 设置窗体的大小
		this.setBounds(100, 100, 500, 200);
		// 设置窗体的可见性
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample20_5窗体对象
		new Sample20_5();
	}
}
