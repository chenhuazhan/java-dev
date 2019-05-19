package ch20;

import java.awt.event.*;
import javax.swing.*;//定义该类继承自JFrame
public class Sample20_4 extends JFrame implements WindowListener {
	//定义构造器
	public Sample20_4()
		{
			//设置窗体的标题
			this.setTitle("关闭窗体事件处理被重新定义的窗体");
			//向窗体中添加一个标签
			this.add(new JLabel("这是一个演示窗体，用来演示如何监听窗体关闭事件！！！"));		
			//注册WindowListener监听器
			this.addWindowListener(this);
			//设置窗体的大小
			this.setBounds(100,100,500,200);
			//设置窗体的可见性
			this.setVisible(true);
		}//实现WindowListener接口中的各个方法

	public void windowClosing(WindowEvent e)
		{		
			System.out.println("当窗体关闭时将执行这里的代码！！！");
			System.exit(0);
		}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public static void main(String[] args)
		{
			//创建Sample20_4窗体对象
			new Sample20_4();		
		}
}
