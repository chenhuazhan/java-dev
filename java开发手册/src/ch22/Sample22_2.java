package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample22_2 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按扭数组
	private JButton[] jbArray = { new JButton("自动换行"), new JButton("不换行"), new JButton("单词边界"), new JButton("字符边界") };
	// 创建文本区
	private JTextArea jta = new JTextArea();
	// 将文本区作为被滚动控件创建滚动窗体
	private JScrollPane jsp = new JScrollPane(jta);

	public Sample22_2() {
		// 设置JPanel的布局管理器
		jp.setLayout(null);
		// 循环对按钮进行处理
		for (int i = 0; i < 4; i++) {
			// 设置按钮的大小文职
			jbArray[i].setBounds(20 + i * 110, 120, 90, 20);
			// 将按钮添加到JPanel中
			jp.add(jbArray[i]);
			// 为按钮注册动作事件监听器
			jbArray[i].addActionListener(this);
		}
		// 设置JScrollPane的大小与位置
		jsp.setBounds(20, 20, 450, 80);
		// 将JScrollPane添加到JPanel容器中
		jp.add(jsp);
		// 设置JTextArea为自动换行
		jta.setLineWrap(true);
		// 为JTextArea添加10条文本
		for (int i = 0; i < 20; i++) {
			jta.append("[" + i + "]Hello, this is an Example!");
		}
		// 将JPanel容器添加进窗体
		this.add(jp);
		// 设置窗体的标题、大小位置以及可见性
		this.setTitle("文本区与滚动条");
		this.setResizable(false);
		this.setBounds(100, 100, 500, 180);
		this.setVisible(true);
	}

	// 实现ActionListener中的方法
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbArray[0]) {// 按下自动换行按
			jta.setLineWrap(true);
		} else if (e.getSource() == jbArray[1]) {// 按下不换行按钮
			jta.setLineWrap(false);
		} else if (e.getSource() == jbArray[2]) {// 按下单词边界按钮
			jta.setWrapStyleWord(true);
		} else if (e.getSource() == jbArray[3]) {// 按下字符边界按
			jta.setWrapStyleWord(false);
		}
	}

	public static void main(String[] args) {
		// 创建Sample22_2窗体对象
		new Sample22_2();
	}
}
