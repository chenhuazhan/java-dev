package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample22_1 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建标签数组
	private JLabel[] jlArray = { new JLabel("用户名"), new JLabel("密    码"), new JLabel("") };
	// 创建按扭数组
	private JButton[] jbArray = { new JButton("登录"), new JButton("清空") };
	// 创建文本框以及密码框
	private JTextField jtxtName = new JTextField();
	private JPasswordField jtxtPassword = new JPasswordField();

	public Sample22_1() {
		// 设置JPanel的布局管理器
		jp.setLayout(null);
		// 对标签与按钮控件循环进行处理
		for (int i = 0; i < 2; i++) {
			// 设置标签与按扭的大小位置
			jlArray[i].setBounds(30, 20 + i * 50, 80, 26);
			jbArray[i].setBounds(50 + i * 110, 130, 80, 26);
			// 将标签与按扭添加到JPanel容器中
			jp.add(jlArray[i]);
			jp.add(jbArray[i]);
			// 为按钮注册动作事件监听器
			jbArray[i].addActionListener(this);
		}
		// 设置文本框的大小位置
		jtxtName.setBounds(80, 20, 180, 30);
		// 将文本框添加进JPanel容器
		jp.add(jtxtName);
		// 为文本框注册动作事件监听器
		jtxtName.addActionListener(this);
		// 设置密码框的大小位置
		jtxtPassword.setBounds(80, 70, 180, 30);
		// 将密码框添加进JPanel容器
		jp.add(jtxtPassword);
		// 设置密码框的回显字符
		jtxtPassword.setEchoChar('*');
		// 为密码框注册动作事件监听器
		jtxtPassword.addActionListener(this);
		// 设置用于显示登录状态的标签大小位置，并将其添加进JPanel容器
		jlArray[2].setBounds(10, 180, 300, 30);
		jp.add(jlArray[2]);
		// 将JPanel容器添加进窗体
		this.add(jp);
		// 设置窗体的标题、大小位置以及可见性
		this.setTitle("登录");
		this.setResizable(false);
		this.setBounds(100, 100, 300, 250);
		this.setVisible(true);
	}

	// 实现ActionListener接口中的方法
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jtxtName) {// 事件源为文本框
										// 切换输入焦点到密码框
			jtxtPassword.requestFocus();
		} else if (e.getSource() == jbArray[1]) {// 事件源为清空按扭
													// 清空所有信息
			jlArray[2].setText("");
			jtxtName.setText("");
			jtxtPassword.setText("");
			// 将输入焦点设置到文本框
			jtxtName.requestFocus();
		} else {// 事件源为登录按钮
				// 判断用户名和密码是否匹配
			if (jtxtName.getText().equals("wyf") && String.valueOf(jtxtPassword.getPassword()).equals("jc")) {// 登录成功
				jlArray[2].setText("恭喜您，登录成功！！！");
			} else {// 登录失败
				jlArray[2].setText("对不起，非法的用户名和密码！！！");
			}
		}
	}

	public static void main(String[] args) {
		// 创建Sample22_1窗体对象
		new Sample22_1();
	}
}
