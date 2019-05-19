package ch20;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Sample20_2 {
	public static void main(String[] args) {
		// 创建窗体对象
		JFrame jf = new JFrame();
		// 设置窗体的标题
		jf.setTitle("直接创建JFrame对象");
		// 设置窗体的位置以及大小
		jf.setBounds(100, 100, 500, 200);
		jf.addWindowListener(new WindowAdapter() {
			// 实现WindowListener接口中的各个方法
			public void windowClosing(WindowEvent e) {
				System.out.println("当窗体关闭时将执行这里的代码！！！");
				System.exit(0);
			}
		});
		// 设置窗体的可见性
		jf.setVisible(true);
	}
}
