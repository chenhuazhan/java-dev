package ch24;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class Sample24_1 extends JFrame {
	// �����ڵ�����
	DefaultMutableTreeNode[] dmtn = { new DefaultMutableTreeNode("A"), new DefaultMutableTreeNode("B"),
			new DefaultMutableTreeNode("C"), new DefaultMutableTreeNode("D"), new DefaultMutableTreeNode("E"),
			new DefaultMutableTreeNode("F"), new DefaultMutableTreeNode("G"), new DefaultMutableTreeNode("H") };
	// ������ģ��,�ƶ�ָ���ڵ�AΪ���ڵ�
	DefaultTreeModel dtm = new DefaultTreeModel(dmtn[0]);
	// ��������dtm��ģ�͵�JTree����
	JTree jt = new JTree(dtm);
	// ΪJTree������������
	JScrollPane jsp = new JScrollPane(jt);

	public Sample24_1() {
		for (int i = 1; i < 4; i++) {// ����ڵ�A����ӽڵ�B��C��D
			dtm.insertNodeInto(dmtn[i], dmtn[0], i - 1);
		}
		// ��ڵ�B����ӽڵ�E
		dmtn[1].add(dmtn[4]);
		// ��ڵ�D����ӽڵ�F
		dmtn[3].add(dmtn[5]);
		// ��ڵ�D����ӽڵ�G
		dmtn[3].add(dmtn[6]);
		// ��ڵ�F����ӽڵ�H
		dmtn[5].add(dmtn[7]);
		// ���ø����нڵ��ǿɱ༭��
		jt.setEditable(true);
		// ���������Ĺ���������ӽ�������
		this.add(jsp);
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��JTree��ʾ��");
		this.setBounds(100, 100, 300, 250);
		this.setVisible(true);
		// ������ʾ���ڵ�Ŀ���ͼ��
		jt.setShowsRootHandles(true);
		// //Ϊ��ָ���Զ�������ڵ������
		// jt.setCellRenderer(new MyTreeCellRenderer());
	}

	public static void main(String[] args) {
		// ����Sample25_1�������
		new Sample24_1();
	}
}
// class MyTreeCellRenderer extends DefaultTreeCellRenderer
// {
// //��д�����еķ���
// public Component getTreeCellRendererComponent (JTree tree,final Object value,
// final boolean selected, boolean expanded,boolean leaf,int row,boolean
// hasFocus)
// {
// //ʹ���Զ����JPanel��Ϊ���ƿؼ�
// JPanel jl=new JPanel()
// {
// {
// //���û��ƿؼ�����ѡ��С
// this.setPreferredSize(new Dimension(16,20));
// }
// //��дpaint����
// public void paint(Graphics g)
// {
// if(selected)
// {//����ѡ��״̬�����
// g.setColor(Color.DARK_GRAY);
// g.fillRect(0,0,100,30);
// g.setColor(Color.WHITE);
// g.drawString(value.toString(),4,15);
// g.drawRect(1,1,13,17) ;
// }
// else
// {//���ѡ��״̬�����
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
