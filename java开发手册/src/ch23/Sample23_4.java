package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Sample23_4 extends JFrame implements ActionListener {
	// 创建JPanel容器
	JPanel jp = new JPanel();
	// 创建按钮数组
	JButton[] jba = new JButton[] { new JButton("消息对话框"), new JButton("确认对话框"), new JButton("输入对话框"),
			new JButton("选项对话框") };
	// 创建标签
	JLabel jl = new JLabel("   ");

	public Sample23_4() {
		// 设置JPanel容器布局
		jp.setLayout(new GridLayout(1, 4));
		// 对按钮数组循环处理
		for (int i = 0; i < jba.length; i++) {
			// 将按钮添加进JPanel中
			jp.add(jba[i]);
			// 为按钮注册动作事件监听器
			jba[i].addActionListener(this);
		}
		// 将JPanel添加进窗体中
		this.add(jp);
		// 将标签添加进窗体中
		this.add(jl, BorderLayout.SOUTH);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JOptionPane对话框示例");
		this.setBounds(100, 100, 480, 90);
		this.setVisible(true);
	}

	// 实现ActionListener监听接口中的方法
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jba[0]) {// 按下"消息对话框"按钮
										// 创建消息对话框
			JOptionPane.showMessageDialog(this, "你好，我是消息对话框！！！", "我的消息对话框", JOptionPane.INFORMATION_MESSAGE);
			// 更新标签的内容
			jl.setText("您选择了消息对话框！！！");
		} else if (e.getSource() == jba[1]) {// 按下"确认对话框"按钮
												// 创建确认对话框
			int index = JOptionPane.showConfirmDialog(this, "你好，我是确认对话框！！！", "我的确认对话框", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			// 更新标签的内容
			jl.setText("您选择了确认对话框，并按下了" + ((index == 0) ? "是" : "否") + "按钮！！！");
		} else if (e.getSource() == jba[2]) {// 按下"输入对话框"按钮
												// 创建输入对话框
			String msg = JOptionPane.showInputDialog(this, "请输入信息：", "我的输入对话框", JOptionPane.PLAIN_MESSAGE);
			// 更新标签的内容
			jl.setText("您选择了输入对话框，并输入了“" + msg + "”消息！！！");
		} else if (e.getSource() == jba[3]) {// 按下"选项对话框"按钮
												// 创建选项数组
			String[] options = new String[] { "0-15岁", "16-25岁", "26-35岁", "36岁以上" };
			// 创建选项对话框
			int index = JOptionPane.showOptionDialog(this, "请选择年龄段：", "我的选项对话框", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, options, "26-35岁");
			// 生成年龄段字符串
			String ages = (index == 0) ? "0-15岁" : (index == 1) ? "16-25岁" : (index == 2) ? "26-35岁" : "36岁以上";
			// 更新标签的内容
			jl.setText("您选择了选项对话框，并选择了“" + ages + "”年龄段！！！");
		}
	}

	public static void main(String[] args) {
		// 创建Sample23_4窗体对象
		new Sample23_4();
	}
}
