package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

public class Sample23_5 extends JFrame implements ActionListener {
	// 创建标签
	JLabel jl = new JLabel("你好，我是一个标签！！！", JLabel.CENTER);
	// 创建菜单栏
	JMenuBar jmb = new JMenuBar();
	// 创建“设置”菜单
	JMenu jm = new JMenu("设置");
	// 创建颜色与文件菜单项
	JMenuItem jmiColor = new JMenuItem("设置颜色");
	JMenuItem jmiFile = new JMenuItem("打开文件");
	// 创建文件选择器
	JFileChooser jfc = new JFileChooser("d:\\");

	public Sample23_5() {
		// 将菜单栏添加到窗体中
		this.setJMenuBar(jmb);
		// 将设置菜单添加到菜单栏中
		jmb.add(jm);
		// 将菜单项添加到菜单中
		jm.add(jmiColor);
		jm.add(jmiFile);
		// 为菜单项注册ActionEvent事件监听器
		jmiColor.addActionListener(this);
		jmiFile.addActionListener(this);
		// 将标签添加到窗体中
		this.add(jl);
		// 对文件选择器进行初始化
		// 删除原有的文件选择器
		jfc.removeChoosableFileFilter(jfc.getChoosableFileFilters()[0]);
		// 添加可以接收jpeg图片文件的选择器
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("JPEG图片文件", "jpg", "jpeg"));
		// 添加可以接收gif图片文件的选择器
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("gif图片文件", "gif", "GIF"));
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("颜色文件对话框示例");
		this.setBounds(100, 100, 300, 90);
		this.setVisible(true);
	}

	// 实现ActionListener监听接口中的方法
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jmiColor) {// 选中设置颜色菜单项
			Color c = JColorChooser.showDialog(this, "请选择标签文字颜色", Color.cyan);
			jl.setForeground(c);
		} else if (e.getSource() == jmiFile) {// 选中打开文件菜单项
			jfc.showOpenDialog(this);
			jl.setText("您选择打开文件：" + jfc.getSelectedFile().getName());
		}
	}

	public static void main(String[] args) {
		// 创建Sample23_5窗体对象
		new Sample23_5();
	}
}
