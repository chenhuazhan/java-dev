package ch25;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

//�Զ���ı������ģ��
class MyTableModel extends AbstractTableModel {
	// ������ʾ���������͵���������
	Class[] colClass = { String.class, Number.class, Date.class };
	// �����б����ַ�������
	Object[] head = { "�ַ���", "��ֵ", "����" };
	// ������ʾ������ݵĶ�ά��������
	Object[][] data = { { "one", new Integer(70), new Date() }, { "two", new Integer(30), new Date(105, 7, 1) },
			{ "three", new Integer(70), new Date(107, 8, 1) }, { "four", new Integer(30), new Date(106, 0, 1) },
			{ "five", new Integer(50), new Date(107, 1, 1) }, { "six", new Integer(50), new Date(107, 8, 2) },
			{ "seven", new Integer(50), new Date(106, 9, 1) }, { "eight", new Integer(60), new Date(107, 5, 1) },
			{ "nine", new Integer(90), new Date(106, 7, 1) }, { "ten", new Integer(60), new Date(107, 11, 1) },
			{ "eleven", new Integer(60), new Date(105, 4, 1) } };

	// ��дgetColumnCount����
	public int getColumnCount() {
		return head.length;
	}

	// ��дgetRowCount����
	public int getRowCount() {
		return data.length;
	}

	// ��дgetColumnName����
	public String getColumnName(int col) {
		return head[col].toString();
	}

	// ��дgetValueAt����
	public Object getValueAt(int r, int c) {
		return data[r][c];
	}

	// ��дgetColumnClass����
	public Class getColumnClass(int c) {
		return colClass[c];
	}
}

// �Զ���Ĺ���������ȡ�ؼ����
class MyFilterPane extends JPanel implements ItemListener {
	// �����ʶ�����ַ���
	String snd;
	// ����һ����ѡ��
	JCheckBox jcb = new JCheckBox();
	// ����������ǩ�ؼ�
	JLabel jl1 = new JLabel();
	JLabel jl2 = new JLabel("���ø����������������Ĺ�ϵ");
	// ����һ���ı���ؼ�
	JTextField jtf = new JTextField();
	// ����һ����ѡ��Ť���飬��Ϊ�õ�ѡ��Ť�����еĵ�ѡ��Ť����һ����Ť��
	JRadioButton[] jrb = { new JRadioButton("���ϵ", true), new JRadioButton("���ϵ") };
	ButtonGroup bg = new ButtonGroup();

	public MyFilterPane(String snd) {
		// �������Ĳ��ֹ�����
		this.setLayout(null);
		// ���ñ�ʶ�ַ���
		this.snd = snd;
		// ���ø�ѡ����ı�����Сλ�ò�Ϊ��ע���������ͬʱ������ӵ������
		jcb.setText("����" + snd + "��������");
		jcb.addItemListener(this);
		jcb.setBounds(5, 5, 150, 26);
		this.add(jcb);
		// ����jl1��ǩ���ı��Լ���Сλ�ã���������ӵ������
		jl1.setText("��������" + snd + "ƥ���ֵ");
		jl1.setBounds(10, 30, 150, 26);
		this.add(jl1);
		// �����ı���Ĵ�Сλ���Լ��ɱ༭�ԣ���������ӵ������
		jtf.setBounds(160, 30, 80, 26);
		jtf.setEditable(false);
		this.add(jtf);
		// ����jl2��ǩ�Ĵ�Сλ�ã���������ӵ������
		jl2.setBounds(10, 60, 200, 26);
		this.add(jl2);
		// ѭ���Ե�ѡ��ť�����������
		for (int i = 0; i < jrb.length; i++) {
			// ���õ�ѡ��Ť�Ĵ�Сλ�á��ɱ༭�Բ��ҽ�����ӽ���Ť���������
			jrb[i].setBounds(10 + i * 80, 80, 80, 26);
			jrb[i].setEnabled(false);
			bg.add(jrb[i]);
			this.add(jrb[i]);
		}
	}

	// ��ȡ���������������Ӧ�������ķ���
	public RowFilter getFilter() {
		if (jcb.isSelected()) {// ���Ը�ѡ���Ƿ�ѡ��
			if (snd.equals("�ַ���")) {// ���Ա�ʶ�ַ�������ȷ���Ƿ����ַ����������������
									// ��������ַ�����װ�ɹ��������� �ù���������Ա��е�һ�н��й���
				return RowFilter.regexFilter(jtf.getText().trim(), 0);
			} else if (snd.equals("��ֵ")) {// ���Ա�ʶ�ַ�������ȷ���Ƿ�����ֵ�������������
											// ��ȡ������ַ���
				String str = jtf.getText().trim();
				// ����������Ƿ�������
				if (!str.matches("[0-9]+")) {// �����������򷵻�
					return null;
				}
				// ���ַ�����װ��Integer����
				Integer i = new Integer(str);
				// ����Integer�����װ�����������ù���������Ա��еڶ��н��й���
				return RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, i, 1);
			} else if (snd.equals("����")) {// ���Ա�ʶ�ַ�������ȷ���Ƿ������ڹ������������
											// ��ȡ������ַ���
				String str = jtf.getText().trim();
				try {
					// ���ַ�������������Date����
					String[] tempsa = str.split("-");
					Date d = new Date(Integer.parseInt(tempsa[0]) - 1900, Integer.parseInt(tempsa[1]) - 1,
							Integer.parseInt(tempsa[2]));
					// �������ڶ��󴴽����������ù���������Ա��е����н��й���
					return RowFilter.dateFilter(RowFilter.ComparisonType.EQUAL, d, 2);
				} catch (Exception e) {
					// �������ַ������ܽ����ɹ���������ʾ��
					JOptionPane.showMessageDialog(this, "��ʽ��������ӦΪ��2007-3-5����2006-12-30��������");
					return null;
				}
			}
		}
		return null;
	}

	// ʵ��ItemListener�ӿ��еķ���
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == jcb && jcb.isSelected()) {// ����ѡ��ѡ��ʱ�������пؼ��Ŀ�����
			this.setIsOpen(true);
		} else if (e.getSource() == jcb && !jcb.isSelected()) {// ����ѡ��δѡ��ʱ�������пؼ��Ŀ�����
			this.setIsOpen(false);
		}
	}

	// ���ÿؼ������Եķ���
	public void setIsOpen(boolean b) {
		// ���ݲ������ø����ؼ��Ŀ�����
		jtf.setEditable(b);
		jrb[0].setEnabled(b);
		jrb[1].setEnabled(b);
	}
}

// ����
public class Sample25_7 extends JFrame {
	// �����Զ���ı��ģ�Ͷ���
	MyTableModel mtm = new MyTableModel();
	// ����ģ�ʹ������ؼ�
	JTable jt = new JTable(mtm);
	// �����ؼ��ŵ�����������
	JScrollPane jsp = new JScrollPane(jt);
	// ����������������
	TableRowSorter sorter = new TableRowSorter(mtm);
	// ����ѡ�����
	JTabbedPane jtp = new JTabbedPane();
	// Ϊ�����д���3����ͬ�����
	MyFilterPane mfpStr = new MyFilterPane("�ַ���");
	MyFilterPane mfpNum = new MyFilterPane("��ֵ");
	MyFilterPane mfpDate = new MyFilterPane("����");
	// ������������������б�
	ArrayList andlist = new ArrayList();
	// ��Ż��������������б�
	ArrayList orlist = new ArrayList();
	// ����һ����Ť
	JButton jb = new JButton("�ύ");

	public Sample25_7() {
		// ���ô�������Ϊ�ղ���
		this.setLayout(null);
		// ���ð������Ĺ�������Ĵ�Сλ��
		jsp.setBounds(10, 10, 300, 180);
		// ������������ӽ�����
		this.add(jsp);
		// ��3�������ӵ�ѡ�������
		jtp.addTab("�����ַ���", mfpStr);
		jtp.addTab("������ֵ", mfpNum);
		jtp.addTab("��������", mfpDate);
		// ����ѡ�����Ĵ�Сλ�ã�����ѡ�������ӵ�������
		jtp.setBounds(320, 10, 260, 150);
		this.add(jtp);
		// ���ð�Ť�Ĵ�Сλ��
		jb.setBounds(400, 170, 120, 26);
		// ͨ�������ڲ���Ϊ��Ťע�����������д�¼��������
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb) {
					Sample25_7.this.creatGeneralFilter();
				}
			}
		});
		// ����Ť��ӽ�����
		this.add(jb);
		// Ϊ���������������
		jt.setRowSorter(sorter);
		// ���ô�����⡢��Сλ���Լ��ɼ���
		this.setTitle("����������������ʾ��");
		this.setResizable(false);
		this.setBounds(100, 100, 600, 230);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// ��ȡ�����װ�Ĺ������ķ���
	public void creatGeneralFilter() {
		// ��ȡ�ַ����������Ĺ�����
		RowFilter rf = mfpStr.getFilter();
		if (rf != null) {// ���Ի�ȡ�Ĺ������Ƿ�Ϊnull
			if (mfpStr.jrb[0].isSelected()) {// �����ַ�������е�ѡ��Ť�Ƿ�ѡ��������ϵ�������򽫹�������ӽ����б�
				andlist.add(rf);
			} else {// ���򽫹�������ӽ����б�
				orlist.add(rf);
			}
		}
		// ��ȡ��ֵ�������Ĺ�����
		rf = mfpNum.getFilter();
		if (rf != null) {// ���Ի�ȡ�Ĺ������Ƿ�Ϊnull
			if (mfpNum.jrb[0].isSelected()) {// ������ֵ����е�ѡ��Ť�Ƿ�ѡ��������ϵ�������򽫹�������ӽ����б�
				andlist.add(rf);
			} else {// ���򽫹�������ӽ����б�
				orlist.add(rf);
			}
		}
		// ��ȡ���ڹ������Ĺ�����
		rf = mfpDate.getFilter();
		if (rf != null) {// ���Ի�ȡ�Ĺ������Ƿ�Ϊnull
			if (mfpDate.jrb[0].isSelected()) {// ������������е�ѡ��Ť�Ƿ�ѡ��������ϵ�������򽫹�������ӽ����б�
				andlist.add(rf);
			} else {// ���򽫹�������ӽ����б�
				orlist.add(rf);
			}
		}
		if (!andlist.isEmpty()) {// �������б����Ƿ�û��Ԫ�أ�����Ԫ���򽫸��б��еĹ���������������������װ
			rf = RowFilter.andFilter(andlist);
			// ����װ��Ĺ�������ӽ����ϵ�б���
			orlist.add(rf);
		}
		if (!orlist.isEmpty()) {// ���Ի��б����Ƿ�û��Ԫ�أ�����Ԫ���򽫸��б��еĹ��������ݻ�����������װ
			rf = RowFilter.orFilter(orlist);
		}
		// �������װ�õĹ��������õ�����������н��������ڱ����
		sorter.setRowFilter(rf);
		// ������б�����б��е�����Ԫ��
		andlist.clear();
		orlist.clear();
	}

	public static void main(String args[]) {
		// ����Sample25_7�������
		new Sample25_7();
	}
}
