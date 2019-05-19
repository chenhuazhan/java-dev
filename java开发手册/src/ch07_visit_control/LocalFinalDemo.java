package ch07_visit_control;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LocalFinalDemo {
	public static void localFinalDemo(String s) {
		JFrame f; // 窗体对象引用变量。
		f = new JFrame(s); // 生成对象。
		f.setSize(100, 100); // 设置窗体大小。
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体默认关闭动作。
		Container contentPane;
		contentPane = f.getContentPane(); // 内容窗格对象。
		final JButton b; // 按钮对象引用变量。
		b = new JButton("Button"); // 生成对象。
		JLabel l; // 标签对象引用变量。
		l = new JLabel("Label"); // 生成对象。
		contentPane.add(b); // 添加按钮。
		contentPane.add(l); // 添加标签。
		f.setVisible(true);
		l.addKeyListener(new KeyAdapter() // 添加按键监听器。
		{
			public void keyTyped(KeyEvent e) {
				b.requestFocus(); // 访问局部变量。
				System.out.println("Key Typed");
			}
		});
	}

	public static void main(String[] args) {
		String s = "hhh";
		LocalFinalDemo.localFinalDemo(s);
	}
	/*
	 * 错误示例： public void LocalFinalDemo(String s) { JFrame f; //窗体对象引用变量。 f =
	 * new JFrame(s); //生成对象。 f.setSize(100,100); //设置窗体大小。
	 * f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗体默认关闭动作。 Container
	 * contentPane; contentPane = f.getContentPane(); //内容窗格对象。 JButton b;
	 * //按钮对象引用变量。 b = new JButton("Button"); //生成对象。 JLabel l; //标签对象引用变量。 l =
	 * new JLabel("Label"); //生成对象。 contentPane.add(b); //添加按钮。
	 * contentPane.add(l); //添加标签。 f.setVisible(true); l.addKeyListener(new
	 * KeyAdapter() //添加按键监听器。 { public void keyTyped(KeyEvent e) {
	 * b.requestFocus(); //访问局部变量。 System.out.println("Key Typed"); } } ); }
	 */
}
