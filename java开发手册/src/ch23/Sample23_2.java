package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample23_2 extends JFrame {
	// 创建菜单
	private JMenu jmztfg = new JMenu("字体风格");
	private JMenu jmzt = new JMenu("字体");
	// 创建菜单项数组
	private JMenuItem[] jmi = new JMenuItem[] { new JMenuItem("复制"), new JMenuItem("粘贴"), new JMenuItem("剪切") };
	// 创建复选菜单项数组
	private JCheckBoxMenuItem[] jcbmi = new JCheckBoxMenuItem[] { new JCheckBoxMenuItem("斜体"),
			new JCheckBoxMenuItem("黑体") };
	// 创建单选菜单项数组
	private JRadioButtonMenuItem[] jrbmi = new JRadioButtonMenuItem[] { new JRadioButtonMenuItem("仿宋", true),
			new JRadioButtonMenuItem("楷体"), new JRadioButtonMenuItem("隶书"), new JRadioButtonMenuItem("华文行楷"), };
	// 创建弹出式菜单
	private JPopupMenu jpm = new JPopupMenu();
	// 创建按钮组
	ButtonGroup bg = new ButtonGroup();

	public Sample23_2() {
		for (int i = 0; i < jmi.length; i++) {// 将“复制”、“粘贴”、“剪切”菜单项添加进弹出式菜单
			jpm.add(jmi[i]);
		}
		// 向弹出式菜单中添加分隔线
		jpm.addSeparator();
		// 将"字体风格"菜单添加进弹出式菜单
		jpm.add(jmztfg);
		// 将"斜体"、"黑体"复选菜单项添加进"字体"菜单
		for (int i = 0; i < jcbmi.length; i++) {
			jmztfg.add(jcbmi[i]);
		}
		// 将"字体"菜单添加进弹出式菜单
		jpm.add(jmzt);
		// 将"仿宋"、"楷体"、"隶书"、"华文行楷"单选菜单项添加进"字体"菜单
		// 并同时对四个单选菜单项进行编组
		for (int i = 0; i < jrbmi.length; i++) {
			jmzt.add(jrbmi[i]);
			bg.add(jrbmi[i]);
		}
		// 创建鼠标监听器对象
		MouseListener mouseListener = new MouseAdapter() {
			// 重写相应的事件处理方法
			public void mouseReleased(MouseEvent e) {// 当鼠标释放时执行的动作
				if (jpm.isPopupTrigger(e)) {// 显示弹出式菜单
					jpm.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		};
		// 为窗体注册鼠标监听器
		this.addMouseListener(mouseListener);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("弹出式菜单与鼠标事件的综合示例");
		this.setBounds(100, 100, 400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample23_2窗体对象
		new Sample23_2();
	}
}
