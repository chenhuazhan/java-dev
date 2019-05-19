package ch20;

import javax.swing.*;
import java.awt.*;

//定义该类继承自JFrame
public class Sample20_3 extends JFrame {
	// 定义无参构造器
	public Sample20_3() {
	}

	// 定义有参构造器，将接收一个boolean值
	public Sample20_3(boolean b) {
		// 向窗体中添加一个标签
		this.add(new JLabel("                          这是一个演示窗体，" + "用来演示JFrame类的基本功能"));
		// 设置窗体的标题
		this.setTitle("自定义的窗体");
		// 设置窗体的大小
		this.setBounds(100, 100, 500, 200);
		// 根据接收的boolean设置窗体是否可以调整大小
		this.setResizable(b);
		//去掉窗体修饰
		//this.setUndecorated(true);
		Image image=this.getToolkit().getImage("E:\\java开发手册\\src\\ch20\\1.jpg");
		this.setIconImage(image);
		// 设置窗体的可见性
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample20_3类的对象，并传递false值使得窗体不能调整大小
		new Sample20_3(false);
	}
}
