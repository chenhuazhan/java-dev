package ch26;

import java.awt.*;
import javax.swing.*;

//扩展JPanel类
public class Sample26_1 extends JPanel {
	// 重写paint方法
	public void paint(Graphics g) {
		// 在画布中心画一个椭圆
		g.fillOval((this.getWidth() - 150) / 2, (this.getHeight() - 100) / 2, 150, 100);
	}

	public static void main(String[] args) {
		// 创建画布
		Sample26_1 jp = new Sample26_1();
		// 创建窗体
		JFrame jf = new JFrame();
		// 将画布添加进窗体
		jf.add(jp);
		// 设置窗体大小位置、标题以及可见性
		jf.setTitle("扩展JPanel实现画布");
		jf.setBounds(100, 100, 300, 150);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
