package ch24;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
//�������̳���JFrame
public class Sample24_2 extends JFrame 
{
	//��������ʼ���������еĹ��߰�Ť����
	private JButton[] jbBar={new JButton("���"),new JButton("ɾ��")};
	//����������
	private JToolBar jtb=new JToolBar();
	//����������ʾ������ı���
	private JTextField jtf=new JTextField();
	//�������ڵ�
	private DefaultMutableTreeNode dmtnRoot=new DefaultMutableTreeNode("Ŀ¼");
	//������������ģ��
	private DefaultTreeModel dtm=new DefaultTreeModel(dmtnRoot);
	//������״�б�ؼ�
	private JTree jt=new JTree(dtm);
	//Ϊ��״�б�����������
	private JScrollPane jsp=new JScrollPane(jt);
	//������¼��ǰѡ�нڵ�ĳ�Ա����
	private DefaultMutableTreeNode tempNode;	
	//��������ʽ�˵�
	private JPopupMenu jpm=new JPopupMenu();
	//�����˵�������
	private JMenuItem[] jmi={new JMenuItem("�����Ҷ�ӽڵ�չ��ͼ��"),
	new JMenuItem("�����Ҷ�ӽڵ��۵�ͼ��"),new JMenuItem("����Ҷ�ӽڵ�ͼ��")};	
	//������Ϊ������¼����������ڲ���
	private class MyTreeListener implements TreeExpansionListener,
								TreeModelListener,TreeSelectionListener
	{
		//����������¼·���Ľڵ�����
		private Object[] tempNodes;
		//����StringBuffer����
		private StringBuffer tempMsg=new StringBuffer();
		//����������¼·��TreePath
		private TreePath tp;
		//����ѡ��ĳ�ڵ�����¼��ķ���
		public void valueChanged(TreeSelectionEvent tse)
		{
			//��ø��ڵ㵽ѡ�нڵ��·��
			tp=tse.getNewLeadSelectionPath();
			if(tp!=null)
			{
				//��·���л������·���еĽڵ�
				tempNodes=tp.getPath();
				//ѭ����·���е�ÿ���ڵ���д���
				for(int i=0;i<tempNodes.length;i++)
				{
					//�������ڵ������������������ӵ�StringBuffer��
					tempMsg.append(tempNodes[i]);
					if(i!=tempNodes.length-1)
					{//�ڸ����ڵ��м���ӡ�>>������
						tempMsg.append(">>");
					}
				}
				//���ı�������ʾ��Ӧ����Ϣ
				jtf.setText("��ѡ���ˣ���"+tempMsg.toString()+"���ڵ㣡����");
				//ɾ��StringBuffer�е���������
				tempMsg.delete(0,tempMsg.length());
				//��¼ѡ�еĽڵ�
				tempNode=(DefaultMutableTreeNode)tp.getLastPathComponent();
			}
		}
		//����ڵ��۵������¼��ķ���
		public void treeCollapsed(TreeExpansionEvent tee)
		{
			//��ø��ڵ㵽ѡ�нڵ��·��
			tp=tee.getPath();
			//�����ı�����ʾ��Ӧ����Ϣ
			jtf.setText("����"+tp.getLastPathComponent()+"�ڵ��۵��ˣ�����");
		}
		//����ڵ�չ�������¼��ķ���
		public void treeExpanded(TreeExpansionEvent tee)
		{
			//��ø��ڵ㵽ѡ�нڵ��·��
			tp=tee.getPath();
			//�����ı�����ʾ��Ӧ����Ϣ
			jtf.setText("������"+tp.getLastPathComponent()+"���ڵ�չ���ˣ�����");		
		}
		//�����ڵ����Ƹ���֮�����¼��ķ���
		public void treeNodesChanged(TreeModelEvent tme)
		{
			//�����ı�����ʾ�ڵ����Ƹ�����Ϣ
			jtf.setText("�����ڵ�ı����޸��ˣ�����");
		}		
		//���������������ڱ�����û��ʹ�ã����Ծ�Ϊ��ʵ��
		public void treeStructureChanged(TreeModelEvent tme){}
		public void treeNodesRemoved(TreeModelEvent tme){}
		public void treeNodesInserted(TreeModelEvent tme){}
	}
	//������Ϊ�������а�ť�����¼����������ڲ���
	class MyToolBarButtonListener implements ActionListener
	{
		//ʵ��ActionListener�����ӿ��еķ���
		public void actionPerformed(ActionEvent e)
		{
			//�����Ӱ�Ťִ�еĶ���
			if(e.getSource()==jbBar[0])
			{
				//����Ƿ���ѡ�нڵ�
				if(tempNode==null)
				{
					JOptionPane.showMessageDialog(Sample24_2.this,
					"����ѡ����ӽڵ����ڵ�Ŀ¼������","����"
					,JOptionPane.WARNING_MESSAGE);
					return;	
				}
				//�жϽڵ��Ƿ�Ϊ�����ڡ��Ľڵ�
				if(tempNode.getLevel()==2)
				{
					JOptionPane.showMessageDialog(Sample24_2.this,
					"�Բ��𣬡��ڡ��ڵ㲻������ӽڵ㣡����","����"
					,JOptionPane.WARNING_MESSAGE);
					return;						
				}
				//��������Ի���Ҫ������ڵ�����
				String tempName=JOptionPane.showInputDialog(Sample24_2.this,
				"��������ӽڵ������","�����룺",JOptionPane.INFORMATION_MESSAGE);
				//������������Ƿ�Ϊnull
				if(tempName==null) 
				{
					return;//��Ϊnull��������
				}
				//ȥ�������������˵Ĳ��ɼ��ַ�
				tempName=tempName.trim();
				//���������ַ����Ƿ�Ϊ���ַ���
				if(tempName.equals("")) 
				{
					return;//��Ϊ���ַ����򷽷�����
				}
				//��������Ի���Ҫ������ڵ��λ��
				String tempID=JOptionPane.showInputDialog(Sample24_2.this,
					"�����루�����һ���ڵ�ı��Ϊ1����","��������ӽڵ�ı��",
					JOptionPane.INFORMATION_MESSAGE);
				//������������Ƿ�Ϊnull
				if(tempID==null) 
				{
					return;//��Ϊnull��������
				}
				//ȥ�������������˵Ĳ��ɼ��ַ�
				tempID=tempID.trim();
				//���������ַ����Ƿ�����ָ���ĸ�ʽҪ��
				if(!tempID.matches("[1-9][0-9]*"))
				{
					JOptionPane.showMessageDialog(Sample24_2.this,
						"�������ָ�ʽ��Ч������","����",JOptionPane.WARNING_MESSAGE);
					return;						
				}
				//��������ַ���ת��Ϊ��ֵ
				int id=Integer.parseInt(tempID);
				//�����ֵ�����㷶ΧҪ��
				if(id<1||id>tempNode.getChildCount()+1)
				{
					JOptionPane.showMessageDialog(Sample24_2.this,
					"�������ֹ����̫С������","����",JOptionPane.WARNING_MESSAGE);
					return;			
				}
				//�����½ڵ�
				DefaultMutableTreeNode newNode=new DefaultMutableTreeNode(tempName);
				//���½ڵ���뵽ָ��λ��
				tempNode.insert(newNode,id-1);
				//������������ģ��
				((DefaultTreeModel)jt.getModel()).reload(tempNode);
				//����ά�ֵ�ǰ��ѡ��·��
				jt.setExpandsSelectedPaths(true);
				//�����ı����е���ʾ��Ϣ
				jtf.setText("����"+tempNode+"�������"+newNode+"�ڵ㣡����");	
			}
			else if(e.getSource()==jbBar[1])
			{//���ɾ����Ťִ�еĶ���
				//��鵱ǰ�Ƿ�ѡ����ĳ�ڵ�
				if(tempNode==null) 
				{
					JOptionPane.showMessageDialog(Sample24_2.this,
					"����ѡ��Ҫɾ���Ľڵ㣡����","����",JOptionPane.WARNING_MESSAGE);
					return;	
				}				
				//ȷ���Ƿ�Ҫɾ��ѡ�еĽڵ�
				int confirm=JOptionPane.showConfirmDialog(Sample24_2.this,
					"��ȷ��Ҫɾ���ýڵ�ô��","ȷ��",JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
				//ȷ����Ҫɾ��ִ�еĴ���
				if(confirm==JOptionPane.YES_OPTION)
				{
					//�õ�ѡ�нڵ�ĸ��ڵ�
					DefaultMutableTreeNode node=
					             (DefaultMutableTreeNode)tempNode.getParent();
					if(node==null)
					{
						//��û�и��ڵ�˵���ýڵ��Ǹ��ڵ㣬���治��ɾ��
						jtf.setText("��Ŀ¼����ɾ��������");
						JOptionPane.showMessageDialog(Sample24_2.this,
						"��Ŀ¼����ɾ��������","����",JOptionPane.WARNING_MESSAGE);	
					}
					else
					{//�����и��ڵ�ִ�еĴ���
						//������ʾ��Ϣ
						jtf.setText(tempNode+"��ɾ���ˣ�����");
						//ɾ����ѡ�нڵ�Ϊ���ڵ������
						tempNode.removeFromParent();
						//������������ģ��
						((DefaultTreeModel)jt.getModel()).reload(node);
						//����¼ѡ�нڵ�ĳ�Ա������Ϊnullֵ
						tempNode=null;
					}
				}
			}
		}
	}
	//������Ϊ����¼����������ڲ���
	class MyJPopupListener extends MouseAdapter
	{
		public MyJPopupListener(JPopupMenu j)
		{//������,��ʼ������ʽ�˵�
			for(int i=0;i<jmi.length;i++)
			{
				//���˵�����ӵ�����ʽ�˵���
				jpm.add(jmi[i]);
			}
		}
		public void mouseReleased(MouseEvent e)
		{//������ͷ�ʱִ�еĶ���
			//��������¼��Ƿ�Ϊƽ̨�޹صĴ�����
			if(e.isPopupTrigger())
			{//��ʾ����ʽ�˵�
				jpm.show(e.getComponent(),e.getX(),e.getY());
			}
		}
	}	
	//������Ϊ�˵�����¼����������ڲ���
	class MyPopMenuActionListener implements ActionListener
	{
		//�ļ�ѡ������Ա
		private JFileChooser jfc=new JFileChooser();
		//��ȡͼƬ��getIcon����
		public ImageIcon getIcon()
		{
			//����ͼƬ����
			ImageIcon icon=null;
			//�����򿪶Ի���
			jfc.showOpenDialog(Sample24_2.this);
			//��ȡѡ����ļ�
			File f=jfc.getSelectedFile();
			if(f!=null)
			{//����ȡ���ļ���Ϊnull������ݴ��ļ��е���Ϣ��ȡͼƬ
				icon=new ImageIcon(f.getPath());
			}
			//����ͼƬ
			return icon;
		}		
		//ʵ��ActionListener�����ӿ��е��¼�������
		public void actionPerformed(ActionEvent e)
		{
			//��ȡͼƬ
			ImageIcon newIcon=this.getIcon();
			//�����״�б�ǰ�Ľڵ������
			DefaultTreeCellRenderer dtcr
				=(DefaultTreeCellRenderer)jt.getCellRenderer();
			if(e.getSource()==jmi[0])
			{
				//����չ���ڵ��ͼ��
				dtcr.setOpenIcon(newIcon);
				//������ʾ��Ϣ
				jtf.setText("�����¶�����չ���ڵ��ͼ�꣡����");
			}
			else if(e.getSource()==jmi[1])
			{
				//�����۵��ڵ��ͼ��
				dtcr.setClosedIcon(newIcon);
				//������ʾ��Ϣ
				jtf.setText("�����¶������۵��ڵ��ͼ�꣡����");
			}
			else if(e.getSource()==jmi[2])
			{
				//����Ҷ�ӽڵ��ͼ��
				dtcr.setLeafIcon(newIcon);
				//������ʾ��Ϣ
				jtf.setText("�����¶�����Ҷ�ӽڵ��ͼ�꣡����");
			}
			//��¼��ǰѡ�е�·��
			TreePath tempTp=jt.getSelectionPath();
			//������������ģ��
			((DefaultTreeModel)jt.getModel()).reload();	
			//����ά�ֵ�ǰ��ѡ�е�·��
			jt.setSelectionPath(tempTp);
		}
	}	
	public Sample24_2()
	{
		for(int i=0;i<jbBar.length;i++)
		{//����Ť��ӵ���������
			jtb.add(jbBar[i]);
		}
		for(int i=0;i<5;i++)
		{//����ڵ������5��Ԥ������½ڵ�
			dmtnRoot.add(new DefaultMutableTreeNode("��"+(i+1)+"��"));
		}
		for(int i=0;i<dmtnRoot.getChildCount();i++)
		{
			DefaultMutableTreeNode temp=(DefaultMutableTreeNode)dmtnRoot.getChildAt(i);
			for(int j=0;j<2;j++)
			{//��ÿ���½ڽڵ������2��Ԥ�����С�ڽڵ�
				temp.add(new DefaultMutableTreeNode("��"+(j+1)+"��"));			
			}
		}
		//����JTreeΪ�ɱ༭״̬
		jt.setEditable(true);
		//����JTree����ʾ���ڵ�Ŀ���ͼ��
		jt.setShowsRootHandles(true);
		//�����ı���Ϊ���ɱ༭״̬
		jtf.setEditable(false);
		//����������ӽ�����
		this.add(jtb,BorderLayout.NORTH);
		//�ֱ���״�б��Լ��ı�����ӽ�������м��Լ��²�
		this.add(jsp,BorderLayout.CENTER);
		this.add(jtf,BorderLayout.SOUTH);
		//���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("Ŀ¼������");
		this.setResizable(false);
		this.setBounds(100,100,350,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��������������
		MyTreeListener mtl=new MyTreeListener();
		//ΪJTreeע��ѡ���¼��ļ�����
		jt.addTreeSelectionListener(mtl);
		//ΪJTreeע��ѡ��չ���Լ��۵��¼��ļ�����
		jt.addTreeExpansionListener(mtl);
		//ΪJTreeע������ģ�͸����¼��ļ�����
		dtm.addTreeModelListener(mtl);		
		//��������������
		MyToolBarButtonListener mtbl=new MyToolBarButtonListener();
		//Ϊ��Ӱ�Ťע�������
		jbBar[0].addActionListener(mtbl);
		//Ϊ��Ӱ�Ťע�������
		jbBar[1].addActionListener(mtbl);
		//��������¼��ļ�����
		MyJPopupListener mjpl=new MyJPopupListener(jpm);
		//ΪJTreeע������¼��ļ�����
		jt.addMouseListener(mjpl);
		//�����˵�����¼�����������
		MyPopMenuActionListener mpmal=new MyPopMenuActionListener();
		//Ϊ�˵���ע�ᶯ���¼�������
		for(int i=0;i<jmi.length;i++)
		{
			jmi[i].addActionListener(mpmal);
		}				
	}
	public static void main(String[] args)
	{
		//����Sample25_2�������
		new Sample24_2();
	}
}
