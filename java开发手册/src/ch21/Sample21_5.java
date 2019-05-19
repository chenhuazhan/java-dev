package ch21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample21_5 extends JFrame implements ActionListener {
	// ���尴ţ���鲢��ʼ��
	private JButton[] jbArray = new JButton[] { new JButton("ǰһ��"), new JButton("��һ��"), new JButton("��һ��"),
			new JButton("���һ��"), new JButton("��3��") };
	// ����JPanel����
	private JPanel jp = new JPanel();

	public Sample21_5() {
		// ���ô��ڵĲ��ֹ�����
		this.setLayout(null);
		// ����ÿ����Ť�Ĵ�Сλ�ã�����ӵ��������Լ�ע�ᶯ���¼�������
		for (int i = 0; i < jbArray.length; i++) {
			jbArray[i].setBounds(280, 30 + 40 * i, 100, 30);
			this.add(jbArray[i]);
			jbArray[i].addActionListener(this);
		}
		// ΪJPanel���ò��ֹ�����
		jp.setLayout(new CardLayout());
		// ��JPanel����ӿ�Ƭ
		for (int i = 0; i < 5; i++) {
			jp.add(new Card(i), "card" + (i + 1));
		}
		// ����JPanel�Ĵ�Сλ�ò�������ӽ�����
		jp.setBounds(10, 10, 250, 250);
		this.add(jp);
		// ���ô��ڵĹرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��Ƭ����ʾ��");
		this.setBounds(100, 100, 400, 300);
		this.setVisible(true);
	}

	// ʵ��ActionListener�еķ���
	public void actionPerformed(ActionEvent e) {
		// ��ȡ��Ƭ���ֹ���������
		CardLayout cl = (CardLayout) jp.getLayout();
		// Ϊÿ����Ť���嶯��
		if (e.getSource() == jbArray[0]) {// ����"ǰһ��"��ť
			cl.previous(jp);
		} else if (e.getSource() == jbArray[1]) {// ����"��һ��"��ť
			cl.next(jp);
		} else if (e.getSource() == jbArray[2]) {// ����"��һ��"��ť
			cl.first(jp);
		} else if (e.getSource() == jbArray[3]) {// ����"���һ��"��ť
			cl.last(jp);
		} else if (e.getSource() == jbArray[4]) {// ����"��3��"��ť
			cl.show(jp, "card3");
		}
	}

	public static void main(String[] args) {
		// ����Sample21_5����
		new Sample21_5();
	}
}

// �Զ���Ŀ�Ƭ��
class Card extends JPanel {
	// ���������Լ�Բ�İ뾶
	int index, R;

	// ����������
	public Card() {
	}

	public Card(int index) {
		// ����õ���Ƭ������뾶
		this.index = index + 1;
		this.R = index * 20 + 20;
	}

	public void paint(Graphics g) {
		// ��ʾ�ַ�����Ϣ�Լ���Բ
		g.clearRect(0, 0, 250, 250);
		g.drawString("������card" + index, 100, 10);
		g.setColor(new Color(40, 40, 40));
		g.fillRect(125 - R, 125 - R, R * 2, R * 2);
		g.setColor(new Color(205, 205, 205));
		g.fillOval(125 - R, 125 - R, R * 2, R * 2);
	}
}
