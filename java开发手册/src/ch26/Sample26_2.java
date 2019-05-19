package ch26;

import java.awt.*;
import javax.swing.*;

//继承并扩展JPanel类
public class Sample26_2 extends JPanel {
	// 重写paint方法
	public void paint(Graphics g) {
		// 设置画笔颜色
		g.setColor(new Color(50, 50, 50));
		// 在画布中心绘制椭圆
		g.fillOval((this.getWidth() - 200) / 2, (this.getHeight() - 150) / 2, 200, 150);
		// 将画笔颜色设置为白色
		g.setColor(Color.WHITE);
		// 在画布中心绘制圆角矩形
		g.fillRoundRect((this.getWidth() - 100) / 2, (this.getHeight() - 75) / 2, 100, 75, 20, 20);
		// 将画笔颜色设置指定的带有透明度的颜色
		g.setColor(new Color(200, 200, 200, 200));
		// 在画布中绘制扇形
		g.fillArc((this.getWidth() - 100) / 2 - 20, (this.getHeight() - 75) / 2 - 20, 100, 75, 0, 270);
		// 将画笔颜色设置为黑色
		g.setColor(Color.BLACK);
		// 在画布中心绘制直线
		g.drawLine((this.getWidth() - 100) / 2, (this.getHeight() - 75) / 2, (this.getWidth() - 100) / 2 + 100,
				(this.getHeight() - 75) / 2 + 75);
	}

	public static void main(String[] args) {
		// 创建画布
		Sample26_2 jp = new Sample26_2();
		// 创建窗体
		JFrame jf = new JFrame();
		// 将画布添加进窗体
		jf.add(jp);
		// 设置窗体大小位置、标题以及可见性
		jf.setTitle("绘制二维简单图形");
		jf.setBounds(100, 100, 300, 200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
