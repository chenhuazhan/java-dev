package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample22_5 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������ѡ������
	private JCheckBox[] jcbArray = { new JCheckBox("��������/����"), new JCheckBox("����/����/����"), new JCheckBox("����/����"),
			new JCheckBox("����/�ȼ� "), new JCheckBox("ʱ�з�װ/��ױƷ") };
	// ������ѡ��Ť����
	private JRadioButton[] jrbArray = { new JRadioButton("5~15��"), new JRadioButton("16~25��", true),
			new JRadioButton("26~35��"), new JRadioButton("36~45��"), new JRadioButton("46~55��") };
	// ������Ť����
	private JButton[] jbArray = { new JButton("�ύ"), new JButton("���") };
	// ������ǩ����
	private JLabel[] jlArray = { new JLabel("����Σ�"), new JLabel("��Ȥ���ã�"), new JLabel("����Ľ��Ϊ��") };
	// �����ı���
	private JTextField jtf = new JTextField();
	// ������Ť��
	private ButtonGroup bg = new ButtonGroup();

	public Sample22_5() {
		// ����JPanel���ֹ�����
		jp.setLayout(null);
		// �Ը����ؼ���������
		for (int i = 0; i < 5; i++) {
			// ���õ�ѡ��Ť�븴ѡ��Ĵ�Сλ��
			jrbArray[i].setBounds(40 + i * 100, 40, 80, 30);
			jcbArray[i].setBounds(40 + i * 120, 100, 120, 30);
			// ����ѡ��ť�븴ѡ����ӵ�JPanel��
			jp.add(jrbArray[i]);
			jp.add(jcbArray[i]);
			// Ϊ��ѡ��ť�븴ѡ��ע�ᶯ���¼�������
			jrbArray[i].addActionListener(this);
			jcbArray[i].addActionListener(this);
			// ����ѡ��ť��ӵ���ť����
			bg.add(jrbArray[i]);
			if (i > 1)
				continue;
			// ���ñ�ǩ����ͨ��Ť�Ĵ�Сλ��
			jlArray[i].setBounds(20, 20 + i * 50, 80, 30);
			jbArray[i].setBounds(400 + i * 120, 200, 80, 26);
			// ����ǩ����ͨ��Ť��ӵ�JPanel��
			jp.add(jlArray[i]);
			jp.add(jbArray[i]);
			// Ϊ��ͨ��ťע�ᶯ���¼�������
			jbArray[i].addActionListener(this);
		}
		// ���õ�������ǩ�Ĵ�Сλ�ã���������ӵ�JPanel��
		jlArray[2].setBounds(20, 150, 120, 30);
		jp.add(jlArray[2]);
		// ���õ������ı���Ĵ�Сλ�ã���������ӵ�JPanel��
		jtf.setBounds(120, 150, 500, 26);
		jp.add(jtf);
		// ������ʾ���������ı���Ϊ���ɱ༭״̬
		jtf.setEditable(false);
		// ��JPanel��ӽ�����
		this.add(jp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ��Ե�
		this.setTitle("������Ϣ����");
		this.setBounds(100, 100, 700, 280);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jbArray[1]) {// ��հ�Ťִ�еĶ���
			bg.clearSelection();
			for (int i = 0; i < jcbArray.length; i++)
				jcbArray[i].setSelected(false);
			jtf.setText("");
		} else {// ������ťִ�еĶ���
				// ����������ʱ�ַ���
			StringBuffer temp1 = new StringBuffer("����һ��");
			StringBuffer temp2 = new StringBuffer();
			for (int i = 0; i < 5; i++) {
				// ��ȡ����ε�ѡ��ֵ
				if (jrbArray[i].isSelected()) {
					temp1.append(jrbArray[i].getText());
				}
				// ��ȡ���õ�ѡ��ֵ
				if (jcbArray[i].isSelected()) {
					temp2.append(jcbArray[i].getText() + "��");
				}
			}
			// ��ӡ���
			if (temp2.length() == 0) {// ���û��ѡȡ����
				jtf.setText("��Ȥ����ѡ���Ϊ�գ�����");
			} else {// ѡȡ�˰���
				temp1.append("���ˣ���Ƚ�ϲ��");
				temp1.append(temp2.substring(0, temp2.length() - 1));
				jtf.setText(temp1.append("��").toString());
			}
		}
	}

	public static void main(String[] args) {
		// ����Sample22_5�������
		new Sample22_5();
	}
}
