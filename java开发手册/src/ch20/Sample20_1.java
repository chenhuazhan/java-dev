package ch20;

//导入swing包
import javax.swing.*;

//扩展JFrame类
public class Sample20_1 extends JFrame {
	// 定义标签成员
	private JLabel jLableWelcome;

	// 定义构造器
	public Sample20_1() {
		// 设置窗体的布局管理器为null
		this.setLayout(null);
		// 创建标签对象并为其初始化显示的文字信息
		jLableWelcome = new JLabel();
		// 设置标签中需要显示的文字信息
		jLableWelcome.setText("欢迎您来到Swing的编程世界，" + "这将是您第一个图形界面交互程序！！！");
		// 设置标签在窗体中的位置
		jLableWelcome.setBounds(40, 30, 450, 30);
		// 将标签添加进窗体中
		this.add(jLableWelcome);
		// 设置窗体的标题、位置大小以及可见性
		this.setTitle("第一个Swing程序");
		this.setBounds(330, 250, 500, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建窗体对象
		new Sample20_1();
	}
}
