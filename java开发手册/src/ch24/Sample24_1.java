package ch24;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class Sample24_1 extends JFrame {
	// 创建节点数组
	DefaultMutableTreeNode[] dmtn = { new DefaultMutableTreeNode("A"), new DefaultMutableTreeNode("B"),
			new DefaultMutableTreeNode("C"), new DefaultMutableTreeNode("D"), new DefaultMutableTreeNode("E"),
			new DefaultMutableTreeNode("F"), new DefaultMutableTreeNode("G"), new DefaultMutableTreeNode("H") };
	// 创建树模型,制定指定节点A为根节点
	DefaultTreeModel dtm = new DefaultTreeModel(dmtn[0]);
	// 创建包含dtm树模型的JTree对象
	JTree jt = new JTree(dtm);
	// 为JTree创建滚动窗体
	JScrollPane jsp = new JScrollPane(jt);

	public Sample24_1() {
		for (int i = 1; i < 4; i++) {// 向根节点A中添加节点B、C、D
			dtm.insertNodeInto(dmtn[i], dmtn[0], i - 1);
		}
		// 向节点B中添加节点E
		dmtn[1].add(dmtn[4]);
		// 向节点D中添加节点F
		dmtn[3].add(dmtn[5]);
		// 向节点D中添加节点G
		dmtn[3].add(dmtn[6]);
		// 向节点F中添加节点H
		dmtn[5].add(dmtn[7]);
		// 设置该树中节点是可编辑的
		jt.setEditable(true);
		// 将包含树的滚动窗体添加进窗体中
		this.add(jsp);
		// 设置窗体的关闭动作、标题、大小位置以及可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("简单JTree的示例");
		this.setBounds(100, 100, 300, 250);
		this.setVisible(true);
		// 设置显示根节点的控制图标
		jt.setShowsRootHandles(true);
		// //为树指定自定义的树节点绘制器
		// jt.setCellRenderer(new MyTreeCellRenderer());
	}

	public static void main(String[] args) {
		// 创建Sample25_1窗体对象
		new Sample24_1();
	}
}
// class MyTreeCellRenderer extends DefaultTreeCellRenderer
// {
// //重写父类中的方法
// public Component getTreeCellRendererComponent (JTree tree,final Object value,
// final boolean selected, boolean expanded,boolean leaf,int row,boolean
// hasFocus)
// {
// //使用自定义的JPanel作为绘制控件
// JPanel jl=new JPanel()
// {
// {
// //设置绘制控件的首选大小
// this.setPreferredSize(new Dimension(16,20));
// }
// //重写paint方法
// public void paint(Graphics g)
// {
// if(selected)
// {//绘制选中状态的情况
// g.setColor(Color.DARK_GRAY);
// g.fillRect(0,0,100,30);
// g.setColor(Color.WHITE);
// g.drawString(value.toString(),4,15);
// g.drawRect(1,1,13,17) ;
// }
// else
// {//绘非选中状态的情况
// g.setColor(Color.WHITE);
// g.fillRect(0,0,100,30);
// g.setColor(Color.DARK_GRAY);
// g.drawString(value.toString(),4,15);
// }
// }
// };
// return jl;
// }
// }
