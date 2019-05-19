package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample21_6 extends JFrame {
	// 定义按扭数组并初始化
	private JButton[] jbArray = { new JButton("按扭1"), new JButton("按扭2"), new JButton("按扭3"), new JButton("按扭4") };
	// 创建横向Box容器
	private Box b1 = Box.createHorizontalBox();
	// 创建纵向Box容器
	private Box b2 = Box.createVerticalBox();

	public Sample21_6() {
		// 将外层横向Box添加进窗体
		this.add(b1);
		// 依次向外层横向Box中添加控件=====================
		// 添加高度为200的垂直支架
		b1.add(Box.createVerticalStrut(200));
		// 添加按钮1
		b1.add(jbArray[0]);
		// 添加长度为40的水平支架
		b1.add(Box.createHorizontalStrut(40));
		// 添加按钮2
		b1.add(jbArray[1]);
		// 添加水平胶水
		b1.add(Box.createHorizontalGlue());
		// 添加嵌套的纵向Box容器
		b1.add(b2);
		// 依次向内层嵌套纵向Box中添加控件==================
		// 添加宽度为100，高度为20的固定区域
		b2.add(Box.createRigidArea(new Dimension(100, 20)));
		// 添加按钮3
		b2.add(jbArray[2]);
		// 添加垂直胶水
		b2.add(Box.createVerticalGlue());
		// 添加按钮4
		b2.add(jbArray[3]);
		// 添加长度为40的垂直支架
		b2.add(Box.createVerticalStrut(40));
		// 设置窗体的关闭动作、标题、大小位置以及可见性等
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("箱式布局示例");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// 创建Sample21_6窗体对象
		new Sample21_6();
	}
}
