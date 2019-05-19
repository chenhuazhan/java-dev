package ch20;

import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample20_6 extends JFrame {
	// 创建JPanel对象
	private JPanel jp = new JPanel();

	public Sample20_6() {
		// 将JPanel添加进该窗体
		this.add(jp);
		// 设置标题
		this.setTitle("动态添加标签的例子");
		// 设置当窗体发起关闭动作时不执行任何操作
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// 注册监听器，该监听器是一个匿名内部类
		this.addWindowListener(new WindowAdapter() {
			// 只重写用到的方法
			public void windowClosing(WindowEvent e) {
				// 向JPanel中添加一个新建的标签
				jp.add(new JLabel("对不起，这里的按扭不再具有关闭的作用！！！"));
				// 重新设置窗体的可见性，可以起到刷新屏幕的作用
				Sample20_6.this.setVisible(true);
			}
		});
		// 设置窗体的大小以及可见性
		this.setBounds(100, 100, 400, 130);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample20_6窗体对象
		new Sample20_6();
	}
}
