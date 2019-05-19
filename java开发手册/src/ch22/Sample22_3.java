package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample22_3 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������ʾ���ݿ������ͼƬ���ı��ı�ǩ
	private JLabel jlBulb = new JLabel();
	private JLabel jlMessage = new JLabel("���ڵ���Ϩ���ˣ������Ե�����ش���������");
	// �����ķ�ͼƬ
	private ImageIcon[] iArray = { new ImageIcon("E:/java�����ֲ�/src/ch22/3.jpg"), new ImageIcon("E:/java�����ֲ�/src/ch22/4.jpg"),
			new ImageIcon("E:/java�����ֲ�/src/ch22/1.jpg"), new ImageIcon("E:/java�����ֲ�/src/ch22/2.jpg") };
	// �������ذ�ť
	private JToggleButton jtb = new JToggleButton();

	public Sample22_3() {
		// ���ò��ֹ�����
		jp.setLayout(null);
		// ���ÿ��ذ�Ť�Ĵ�Сλ��
		jtb.setBounds(300, 80, 72, 72);
		// ���ÿ��ذ�ť����û�б߿�
		jtb.setMargin(new Insets(0, 0, 0, 0));
		// ���ÿ��ذ�ť��ͼ�꣬iArray[2]Ϊ��ť�ǰ���״̬��ͼ�꣬iArray[3]Ϊ��ť���º��ͼ��
		jtb.setIcon(iArray[2]);
		jtb.setSelectedIcon(iArray[3]);
		// Ϊ���ذ�ťע�ᶯ���¼�������
		jtb.addActionListener(this);
		// �����ذ�ť��ӵ�JPanel��
		jp.add(jtb);
		// Ϊ��ʾ����״̬ͼƬ�ı�ǩ���ó�ʼͼƬ�����Сλ�ã�
		// ��������ӽ�����JPanel��
		jlBulb.setIcon(iArray[0]);
		jlBulb.setBounds(124, 80, 49, 57);
		jp.add(jlBulb);
		// ������ʾ��Ϣ��ǩ�Ĵ�Сλ�ã���������ӽ�����JPanel��
		jlMessage.setBounds(20, 20, 300, 30);
		jp.add(jlMessage);
		// ��JPanel��ӽ�����
		this.add(jp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("���ذ�Ťʾ��");
		this.setResizable(false);
		this.setBounds(100, 100, 400, 250);
		this.setVisible(true);
	}

	// ʵ��ActionListener�ӿ��е��¼�������
	public void actionPerformed(ActionEvent e) {
		if (jtb.isSelected() == true) {// ���ذ�Ť����
			jlBulb.setIcon(iArray[1]);
			jlMessage.setText("��ϲ�㣬���ݵ����ˣ�����");
		} else {// ���ذ�Ť����
			jlBulb.setIcon(iArray[0]);
			jlMessage.setText("���ڵ���Ϩ���ˣ������Ե�����ش���������");
		}
	}

	public static void main(String[] args) {
		// ����Sample22_3�������
		new Sample22_3();
	}
}
