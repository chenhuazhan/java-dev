package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample22_3 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建显示灯泡开关情况图片与文本的标签
	private JLabel jlBulb = new JLabel();
	private JLabel jlMessage = new JLabel("现在灯泡熄灭了，您可以点击开关打开它！！！");
	// 加载四幅图片
	private ImageIcon[] iArray = { new ImageIcon("E:/java开发手册/src/ch22/3.jpg"), new ImageIcon("E:/java开发手册/src/ch22/4.jpg"),
			new ImageIcon("E:/java开发手册/src/ch22/1.jpg"), new ImageIcon("E:/java开发手册/src/ch22/2.jpg") };
	// 创建开关按钮
	private JToggleButton jtb = new JToggleButton();

	public Sample22_3() {
		// 设置布局管理器
		jp.setLayout(null);
		// 设置开关按扭的大小位置
		jtb.setBounds(300, 80, 72, 72);
		// 设置开关按钮四周没有边框
		jtb.setMargin(new Insets(0, 0, 0, 0));
		// 设置开关按钮的图标，iArray[2]为按钮非按下状态的图标，iArray[3]为按钮按下后的图标
		jtb.setIcon(iArray[2]);
		jtb.setSelectedIcon(iArray[3]);
		// 为开关按钮注册动作事件监听器
		jtb.addActionListener(this);
		// 将开关按钮添加到JPanel中
		jp.add(jtb);
		// 为显示灯泡状态图片的标签设置初始图片及其大小位置，
		// 并将其添加进容器JPanel中
		jlBulb.setIcon(iArray[0]);
		jlBulb.setBounds(124, 80, 49, 57);
		jp.add(jlBulb);
		// 设置提示信息标签的大小位置，并将其添加进容器JPanel中
		jlMessage.setBounds(20, 20, 300, 30);
		jp.add(jlMessage);
		// 将JPanel添加进窗体
		this.add(jp);
		// 设置窗体的标题、大小位置以及可见性
		this.setTitle("开关按扭示例");
		this.setResizable(false);
		this.setBounds(100, 100, 400, 250);
		this.setVisible(true);
	}

	// 实现ActionListener接口中的事件处理方法
	public void actionPerformed(ActionEvent e) {
		if (jtb.isSelected() == true) {// 开关按扭按下
			jlBulb.setIcon(iArray[1]);
			jlMessage.setText("恭喜你，灯泡点亮了！！！");
		} else {// 开关按扭弹回
			jlBulb.setIcon(iArray[0]);
			jlMessage.setText("现在灯泡熄灭了，您可以点击开关打开它！！！");
		}
	}

	public static void main(String[] args) {
		// 创建Sample22_3窗体对象
		new Sample22_3();
	}
}
