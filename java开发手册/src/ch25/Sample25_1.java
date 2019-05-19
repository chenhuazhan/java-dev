package ch25;

import java.awt.*;
import javax.swing.*;

//定义该类继承自JFrame
public class Sample25_1 extends JFrame {
	// 创建描述表格标题的字符串数组
	String[] head = { "身份证号", "姓名", "年龄", "职业", "籍贯" };
	// 创建包含表格数据的字符串数组
	String[][] data = { { "130xxxxxxxxxxxxxxx", "张三", "23", "老师", "河北" },
			{ "130xxxxxxxxxxxxxxx", "李四", "19", "学生", "河南" }, { "130xxxxxxxxxxxxxxx", "王五", "26", "厨师", "山东" },
			{ "130xxxxxxxxxxxxxxx", "赵六", "22", "邮递员", "山西" }, };
	// 创建JTable对象
	JTable jt = new JTable(data, head);
	// 将JTable封装进滚动窗格
	JScrollPane jsp = new JScrollPane(jt);

	public Sample25_1() {
		// 将含JTable的滚动窗格添加进窗体
		this.add(jsp);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("一个表格的示例");
		this.setBounds(100, 100, 500, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample25_1窗体对象
		new Sample25_1();
	}
}
