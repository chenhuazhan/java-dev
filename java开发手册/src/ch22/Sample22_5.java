package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample22_5 extends JFrame implements ActionListener {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建复选框数组
	private JCheckBox[] jcbArray = { new JCheckBox("上网聊天/交友"), new JCheckBox("体育/户外/健身"), new JCheckBox("汽车/购物"),
			new JCheckBox("旅游/度假 "), new JCheckBox("时尚服装/化妆品") };
	// 创建单选按扭数组
	private JRadioButton[] jrbArray = { new JRadioButton("5~15岁"), new JRadioButton("16~25岁", true),
			new JRadioButton("26~35岁"), new JRadioButton("36~45岁"), new JRadioButton("46~55岁") };
	// 创建按扭数组
	private JButton[] jbArray = { new JButton("提交"), new JButton("清空") };
	// 创建标签数组
	private JLabel[] jlArray = { new JLabel("年龄段："), new JLabel("兴趣爱好："), new JLabel("调查的结果为：") };
	// 创建文本框
	private JTextField jtf = new JTextField();
	// 创建按扭组
	private ButtonGroup bg = new ButtonGroup();

	public Sample22_5() {
		// 设置JPanel布局管理器
		jp.setLayout(null);
		// 对各个控件进行设置
		for (int i = 0; i < 5; i++) {
			// 设置单选按扭与复选框的大小位置
			jrbArray[i].setBounds(40 + i * 100, 40, 80, 30);
			jcbArray[i].setBounds(40 + i * 120, 100, 120, 30);
			// 将单选按钮与复选框添加到JPanel中
			jp.add(jrbArray[i]);
			jp.add(jcbArray[i]);
			// 为单选按钮与复选框注册动作事件监听器
			jrbArray[i].addActionListener(this);
			jcbArray[i].addActionListener(this);
			// 将单选按钮添加到按钮组中
			bg.add(jrbArray[i]);
			if (i > 1)
				continue;
			// 设置标签与普通按扭的大小位置
			jlArray[i].setBounds(20, 20 + i * 50, 80, 30);
			jbArray[i].setBounds(400 + i * 120, 200, 80, 26);
			// 将标签与普通按扭添加到JPanel中
			jp.add(jlArray[i]);
			jp.add(jbArray[i]);
			// 为普通按钮注册动作事件监听器
			jbArray[i].addActionListener(this);
		}
		// 设置调查结果标签的大小位置，并将其添加到JPanel中
		jlArray[2].setBounds(20, 150, 120, 30);
		jp.add(jlArray[2]);
		// 设置调查结果文本框的大小位置，并将其添加到JPanel中
		jtf.setBounds(120, 150, 500, 26);
		jp.add(jtf);
		// 设置显示调查结果的文本框为不可编辑状态
		jtf.setEditable(false);
		// 将JPanel添加进窗体
		this.add(jp);
		// 设置窗体的标题、大小位置以及可见性等
		this.setTitle("个人信息调查");
		this.setBounds(100, 100, 700, 280);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jbArray[1]) {// 清空按扭执行的动作
			bg.clearSelection();
			for (int i = 0; i < jcbArray.length; i++)
				jcbArray[i].setSelected(false);
			jtf.setText("");
		} else {// 其他按钮执行的动作
				// 创建两个临时字符串
			StringBuffer temp1 = new StringBuffer("你是一个");
			StringBuffer temp2 = new StringBuffer();
			for (int i = 0; i < 5; i++) {
				// 获取年龄段的选中值
				if (jrbArray[i].isSelected()) {
					temp1.append(jrbArray[i].getText());
				}
				// 获取爱好的选中值
				if (jcbArray[i].isSelected()) {
					temp2.append(jcbArray[i].getText() + "，");
				}
			}
			// 打印结果
			if (temp2.length() == 0) {// 如果没有选取爱好
				jtf.setText("兴趣爱好选项不能为空！！！");
			} else {// 选取了爱好
				temp1.append("的人，你比较喜欢");
				temp1.append(temp2.substring(0, temp2.length() - 1));
				jtf.setText(temp1.append("。").toString());
			}
		}
	}

	public static void main(String[] args) {
		// 创建Sample22_5窗体对象
		new Sample22_5();
	}
}
