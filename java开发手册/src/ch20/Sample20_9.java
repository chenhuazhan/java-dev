package ch20;

import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample20_9 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按扭对象
	private JButton jb1 = new JButton("按扭1");
	private JButton jb2 = new JButton("按扭2");
	// 创建标签对象
	private JLabel jl = new JLabel("按下的按钮为：");

	public Sample20_9() {
		// 将按扭添加进JPanel
		jp.add(jb1);
		jp.add(jb2);
		// 将标签添加进JPanel
		jp.add(jl);
		// 将JPanel添加进该窗体
		this.add(jp);
		// 设置标题
		this.setTitle("同一个监听器注册给多个事件源");
		// 设置当窗体发起关闭动作时将退出程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 为两个按扭注册同一个监听器
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		// 设置窗体的大小以及可见性
		this.setBounds(100, 100, 300, 130);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// 判断事件源
		if (e.getSource() == jb1) {// 事件源为按钮jb1
			this.jl.setText("按下的按钮为：第一个按钮");
		} else if (e.getSource() == jb2) {// 事件源为按钮jb2
			this.jl.setText("按下的按钮为：第二个按钮");
		}
	}

	public static void main(String[] args) {
		// 创建Sample20_9窗体对象
		new Sample20_9();
	}
}
