package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample21_5 extends JFrame implements ActionListener {
	// 定义按牛数组并初始化
	private JButton[] jbArray = new JButton[] { new JButton("前一个"), new JButton("后一个"), new JButton("第一个"),
			new JButton("最后一个"), new JButton("第3个") };
	// 创建JPanel对象
	private JPanel jp = new JPanel();

	public Sample21_5() {
		// 设置窗口的布局管理器
		this.setLayout(null);
		// 设置每个按扭的大小位置，并添加到窗体中以及注册动作事件监听器
		for (int i = 0; i < jbArray.length; i++) {
			jbArray[i].setBounds(280, 30 + 40 * i, 100, 30);
			this.add(jbArray[i]);
			jbArray[i].addActionListener(this);
		}
		// 为JPanel设置布局管理器
		jp.setLayout(new CardLayout());
		// 向JPanel中添加卡片
		for (int i = 0; i < 5; i++) {
			jp.add(new Card(i), "card" + (i + 1));
		}
		// 设置JPanel的大小位置并将其添加进窗口
		jp.setBounds(10, 10, 250, 250);
		this.add(jp);
		// 设置窗口的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("卡片布局示例");
		this.setBounds(100, 100, 400, 300);
		this.setVisible(true);
	}

	// 实现ActionListener中的方法
	public void actionPerformed(ActionEvent e) {
		// 获取卡片布局管理器引用
		CardLayout cl = (CardLayout) jp.getLayout();
		// 为每个按扭定义动作
		if (e.getSource() == jbArray[0]) {// 按下"前一个"按钮
			cl.previous(jp);
		} else if (e.getSource() == jbArray[1]) {// 按下"后一个"按钮
			cl.next(jp);
		} else if (e.getSource() == jbArray[2]) {// 按下"第一个"按钮
			cl.first(jp);
		} else if (e.getSource() == jbArray[3]) {// 按下"最后一个"按钮
			cl.last(jp);
		} else if (e.getSource() == jbArray[4]) {// 按下"第3个"按钮
			cl.show(jp, "card3");
		}
	}

	public static void main(String[] args) {
		// 创建Sample21_5对象
		new Sample21_5();
	}
}

// 自定义的卡片类
class Card extends JPanel {
	// 定义索引以及圆的半径
	int index, R;

	// 两个构造器
	public Card() {
	}

	public Card(int index) {
		// 计算得到卡片索引与半径
		this.index = index + 1;
		this.R = index * 20 + 20;
	}

	public void paint(Graphics g) {
		// 显示字符串信息以及画圆
		g.clearRect(0, 0, 250, 250);
		g.drawString("这里是card" + index, 100, 10);
		g.setColor(new Color(40, 40, 40));
		g.fillRect(125 - R, 125 - R, R * 2, R * 2);
		g.setColor(new Color(205, 205, 205));
		g.fillOval(125 - R, 125 - R, R * 2, R * 2);
	}
}
