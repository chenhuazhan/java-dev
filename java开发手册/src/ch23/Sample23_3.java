package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//定义该类继承自JFrame
public class Sample23_3 extends JFrame implements ActionListener, ChangeListener {
	// 创建工具按扭的名称数组
	private String[] jbname = { "左对齐", "居中", "右对齐" };
	// 创建工具栏
	private JToolBar jtb = new JToolBar("我的工具栏");
	// 创建工具按扭数组
	private JButton[] jb = { new JButton(new ImageIcon("D:/left.gif")), new JButton(new ImageIcon("center.gif")),
			new JButton(new ImageIcon("D:/right.gif")) };
	// 创建微调控制器
	JSpinner jsp = new JSpinner(new SpinnerNumberModel(50, 0, 100, 2));
	// 创建标签
	private JLabel jl = new JLabel("您选择的值为：50！！！");

	public Sample23_3() {
		// 循环对工具按钮数组进行初始化
		for (int i = 0; i < jb.length; i++) {
			// 将按扭添加进工具栏
			jtb.add(jb[i]);
			// 为按扭注册监听器
			jb[i].addActionListener(this);
			// 为按扭设置工具提示信息
			jb[i].setToolTipText(jbname[i]);
		}
		// 在工具栏中添加分隔条
		jtb.addSeparator();
		// 将微调控制器添加进工具栏
		jtb.add(jsp);
		// 为微调控制器为条注册监听器
		jsp.addChangeListener(this);
		// 为微调控制器设置工具提示信息
		jsp.setToolTipText("设置当前值");
		// 设置工具栏可以成为浮动工具栏
		jtb.setFloatable(true);
		// 将标签添加进窗体
		this.add(jl);
		// 将工具栏添加进窗体顶部
		this.add(jtb, BorderLayout.NORTH);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("使用工具栏的示例");
		this.setBounds(100, 100, 400, 200);
		this.setVisible(true);
	}

	// 实现ActionListener接口中的方法
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb[0]) {// 按下左对齐按扭执行的动作
			jl.setHorizontalAlignment(JLabel.LEFT);
		} else if (e.getSource() == jb[1]) {// 按下居中按扭执行的动作
			jl.setHorizontalAlignment(JLabel.CENTER);
		} else if (e.getSource() == jb[2]) {// 按下右对齐按扭执行的动作
			jl.setHorizontalAlignment(JLabel.RIGHT);
		}
	}

	// 实现ChangeListener接口中的方法
	public void stateChanged(ChangeEvent e) {
		// 修改标签内容
		jl.setText("您选择的值为：" + jsp.getValue() + "！！！");
	}

	public static void main(String[] args) {
		// 创建Sample23_3窗体对象
		new Sample23_3();
	}
}
