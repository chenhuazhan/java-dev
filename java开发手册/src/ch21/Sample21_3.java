package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample21_3 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按扭数组
	private JButton[] jbArray = new JButton[] { new JButton("北边"), new JButton("南边"), new JButton("东边"),
			new JButton("西边"), };
	// 创建标签
	private JLabel jl = new JLabel("请点击周围4个按扭");

	public Sample21_3() {
		// 设置JPanel的布局管理器
		jp.setLayout(new BorderLayout());
		// 为每个按扭注册监听器
		for (int i = 0; i < jbArray.length; i++) {
			jbArray[i].addActionListener(this);
		}
		// 将4个按扭依次添加进JPanel指定的区域
		jp.add(jbArray[0], BorderLayout.NORTH);
		jp.add(jbArray[1], BorderLayout.SOUTH);
		jp.add(jbArray[2], BorderLayout.EAST);
		jp.add(jbArray[3], BorderLayout.WEST);
		// 将标签添加进JPanel的中间区域
		jp.add(jl, BorderLayout.CENTER);
		// 将JPanel添加进窗口
		this.add(jp);
		// 设置窗体的标题、大小位置以及可见性
		this.setTitle("边框布局");
		this.setBounds(100, 100, 450, 200);
		this.setVisible(true);
	}

	// 实现ActionListener中的方法
	public void actionPerformed(ActionEvent e) {
		// 点击北边的按扭所要执行的动作
		if (e.getSource() == jbArray[0]) {
			jl.setText("您点击的是北边区域的按扭！！！");
		}
		// 点击南边的按扭所要执行的动作
		else if (e.getSource() == jbArray[1]) {
			jl.setText("您点击的是南边区域的按扭！！！");
		}
		// 点击东边的按扭所要执行的动作
		else if (e.getSource() == jbArray[2]) {
			jl.setText("您点击的是东边区域的按扭！！！");
		}
		// 点击西边的按扭所要执行的动作
		else if (e.getSource() == jbArray[3]) {
			jl.setText("您点击的是西边区域的按扭！！！");
		}
	}

	public static void main(String[] args) {
		// 创建Sample21_3窗体对象
		new Sample21_3();
	}
}
