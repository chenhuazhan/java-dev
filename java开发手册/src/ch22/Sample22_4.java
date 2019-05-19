package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample22_4 extends JFrame implements ItemListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������ѡ��Ť����
	private JRadioButton[] jrbArray = { new JRadioButton("ѡ��1", true), new JRadioButton("ѡ��2"),
			new JRadioButton("ѡ��3") };
	// ������Ť��
	private ButtonGroup bg = new ButtonGroup();

	public Sample22_4() {
		// ����JPanel�Ĳ��ֹ�����
		jp.setLayout(null);
		// �Ե�ѡ��ť������д�������
		for (int i = 0; i < 3; i++) {
			// ���õ�ѡ��ť�Ĵ�С��λ��
			jrbArray[i].setBounds(20 + i * 150, 20, 100, 26);
			// ����ѡ��ť��ӵ�JPanel��
			jp.add(jrbArray[i]);
			// ����ѡ��ť��Ӱ�ť����
			bg.add(jrbArray[i]);
			// Ϊ��ѡ��ťע��ItemEvent�¼�������
			jrbArray[i].addItemListener(this);
		}
		// ������JPanel��ӽ�����
		this.add(jp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("ItemEvent�¼�ʾ��");
		this.setResizable(false);
		this.setBounds(100, 100, 450, 100);
		this.setVisible(true);
	}

	// ʵ��ItemListener�ӿ��е��¼�������
	public void itemStateChanged(ItemEvent e) {
		// ѭ����ѡ��ť���飬�ж��ĸ���ѡ��ť������ItemEvent�¼�
		for (int i = 0; i < 3; i++) {
			if (e.getSource() == jrbArray[i]) {
				System.out.println("��ѡ��Ť" + (i + 1) + "������ItemEvent�¼�");
			}
		}
	}

	public static void main(String[] args) {
		// ����Sample22_4�������
		new Sample22_4();
	}
}