package ch21;

import javax.swing.*;

public class Sample21_7 extends JFrame {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建按钮对象
	private JLabel jl = new JLabel("姓名：");
	// 创建文本框对象对象
	private JTextField jtf = new JTextField();
	// 创建弹簧布局管理器
	private SpringLayout sl = new SpringLayout();

	// Sample21_7窗体构造器
	public Sample21_7() {
		// 为容器JPanel设置布局管理器
		jp.setLayout(sl);
		// 将两个控件添加到容器中
		jp.add(jtf);
		jp.add(jl);
		// 设置文本框上边与容器上边之间的支架
		sl.putConstraint(SpringLayout.NORTH, jtf, 20, SpringLayout.NORTH, jp);
		// 设置标签上边与容器上边之间的支架
		sl.putConstraint(SpringLayout.NORTH, jl, 20, SpringLayout.NORTH, jp);
		// 设置文本框左边与容器左边之间的支架
		sl.putConstraint(SpringLayout.WEST, jtf, 60, SpringLayout.WEST, jp);
		// 设置文本框右边与容器右边之间的支架
		sl.putConstraint(SpringLayout.EAST, jp, 10, SpringLayout.EAST, jtf);
		// 创建并设置文本框左右两边之间的弹簧
		Spring jtfw = Spring.constant(0, 100, 400);
		sl.putConstraint(SpringLayout.EAST, jtf, jtfw, SpringLayout.WEST, jtf);
		// 设置标签左边与容器左边之间的支架
		sl.putConstraint(SpringLayout.WEST, jl, 10, SpringLayout.WEST, jp);
		// 设置标签左右两边之间的支架
		sl.putConstraint(SpringLayout.EAST, jl, 40, SpringLayout.WEST, jl);
		// 将容器JPanel添加进窗体
		this.add(jp);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("弹簧布局示例");
		this.setBounds(100, 100, 200, 100);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample21_7窗体对象
		new Sample21_7();
	}
}
