package ch21;

import javax.swing.*;

//定义该类继承自JFrame
public class Sample21_8 extends JFrame {
	// 创建JPanel对象
	private JPanel jp = new JPanel();
	// 创建标签
	private JLabel jl = new JLabel("请将备注写在这里:");
	// 创建文本区
	private JTextArea jta = new JTextArea();
	// 为文本区创建滚动条
	private JScrollPane jsp = new JScrollPane(jta);
	// 创建弹簧布局管理器
	private SpringLayout sl = new SpringLayout();

	public Sample21_8() {
		// 为容器JPanel设置布局管理器
		jp.setLayout(sl);
		// 创建标签左侧边与容器左侧边之间的支架
		Spring jlx = Spring.constant(20);
		// 创建标签上侧边与容器上侧边之间的支架
		Spring jly = Spring.constant(10);
		// 创建标签左右两侧边之间的支架
		Spring jlw = Spring.constant(150);
		// 创建标签上下两侧边之间的支架
		Spring jlh = Spring.constant(15);
		// 将标签按照约束条件添加进容器JPanel
		jp.add(jl, new SpringLayout.Constraints(jlx, jly, jlw, jlh));
		// 获得代表容器宽度的弹簧
		Spring jpw = sl.getConstraint(SpringLayout.EAST, jp);
		// 获得代表容器高度的弹簧
		Spring jph = sl.getConstraint(SpringLayout.SOUTH, jp);
		// 获得代表标签底边到容器顶边的弹簧
		Spring jls = sl.getConstraint(SpringLayout.SOUTH, jl);
		// 创建文本区左侧边与容器左侧边之间的支架
		Spring jspx = Spring.constant(5);
		// 计算出代表文本区上侧边与容器上侧边之间距离的弹簧
		Spring jspy = Spring.sum(Spring.constant(5), jls);
		// 计算出代表文本区宽度的弹簧
		Spring jspw = Spring.sum(jpw, Spring.minus(Spring.scale(jspx, 2.0f)));
		// 计算出代表文本区高度的弹簧
		Spring jsph = Spring.sum(jph, Spring.minus(Spring.sum(jspx, jspy)));
		// 将带滚动条的文本区按指定的约束添加进容器JPanel
		jp.add(jsp, new SpringLayout.Constraints(jspx, jspy, jspw, jsph));
		// 将容器JPanel添加进窗体
		this.add(jp);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("弹簧布局示例");
		this.setBounds(100, 100, 300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 创建Sample21_8窗体对象
		new Sample21_8();
	}
}
