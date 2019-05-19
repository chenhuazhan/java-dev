package ch20;

import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample20_8 extends JFrame {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按扭对象
	private JButton jb = new JButton("按钮");
	// 创建标签对象
	private JLabel jl = new JLabel("监听器执行顺序为：");

	public Sample20_8() {
		// 将按扭添加进JPanel
		jp.add(jb);
		// 将标签添加进JPanel
		jp.add(jl);
		// 将JPanel添加进该窗体
		this.add(jp);
		// 设置标题
		this.setTitle("多个监听器注册给同一个事件源");
		// 设置当窗体发起关闭动作时将退出程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 给按钮注册第一个监听器
		jb.addActionListener(new ActionListener() {
			// 只实现用到的方法
			public void actionPerformed(ActionEvent e) {
				// 修改标签的内容
				jl.setText(jl.getText() + "先注册的监听器、");
			}
		});
		// 再次给按扭注册一个监听器
		jb.addActionListener(new ActionListener() {
			// 只实现用到的方法
			public void actionPerformed(ActionEvent e) {
				// 修改标签的内容
				jl.setText(jl.getText() + "后注册的监听器、");
			}
		});
		// 设置窗体的大小以及可见性
		this.setBounds(100, 100, 400, 130);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample20_8窗体对象
		new Sample20_8();
	}
}
