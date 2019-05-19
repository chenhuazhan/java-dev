package ch20;

import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample20_7 extends JFrame {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按扭对象
	private JButton jb = new JButton("按钮");
	// 创建标签对象
	private JLabel jl = new JLabel("按钮按下了0次");
	// 声明计数器属性
	private int count = 0;

	// 构造器
	public Sample20_7() {
		// 将按扭添加进JPanel
		jp.add(jb);
		// 将标签添加进JPanel
		jp.add(jl);
		// 将JPanel添加进该窗体
		this.add(jp);
		// 设置标题
		this.setTitle("记录按钮按下的次数");
		// 设置当窗体发起关闭动作时将退出程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 给按钮设置助记字符
		this.jb.setMnemonic('a');
		// 给按扭jb注册监听器，该监听器是一个匿名内部类
		jb.addActionListener(new ActionListener() {
			// 实现ActionListener接口中的方法
			public void actionPerformed(ActionEvent e) {
				// 修改标签的内容
				Sample20_7.this.jl.setText("按钮按下了" + (++count) + "次");
			}
		});
		// 设置窗体的大小以及可见性
		this.setBounds(100, 100, 400, 130);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample20_7窗体对象
		new Sample20_7();
	}
}
