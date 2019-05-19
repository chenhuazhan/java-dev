package ch22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�������̳���JFrame
public class Sample22_1 extends JFrame implements ActionListener {
	// ����JPanel����
	private JPanel jp = new JPanel();
	// ������ǩ����
	private JLabel[] jlArray = { new JLabel("�û���"), new JLabel("��    ��"), new JLabel("") };
	// ������Ť����
	private JButton[] jbArray = { new JButton("��¼"), new JButton("���") };
	// �����ı����Լ������
	private JTextField jtxtName = new JTextField();
	private JPasswordField jtxtPassword = new JPasswordField();

	public Sample22_1() {
		// ����JPanel�Ĳ��ֹ�����
		jp.setLayout(null);
		// �Ա�ǩ�밴ť�ؼ�ѭ�����д���
		for (int i = 0; i < 2; i++) {
			// ���ñ�ǩ�밴Ť�Ĵ�Сλ��
			jlArray[i].setBounds(30, 20 + i * 50, 80, 26);
			jbArray[i].setBounds(50 + i * 110, 130, 80, 26);
			// ����ǩ�밴Ť��ӵ�JPanel������
			jp.add(jlArray[i]);
			jp.add(jbArray[i]);
			// Ϊ��ťע�ᶯ���¼�������
			jbArray[i].addActionListener(this);
		}
		// �����ı���Ĵ�Сλ��
		jtxtName.setBounds(80, 20, 180, 30);
		// ���ı�����ӽ�JPanel����
		jp.add(jtxtName);
		// Ϊ�ı���ע�ᶯ���¼�������
		jtxtName.addActionListener(this);
		// ���������Ĵ�Сλ��
		jtxtPassword.setBounds(80, 70, 180, 30);
		// ���������ӽ�JPanel����
		jp.add(jtxtPassword);
		// ���������Ļ����ַ�
		jtxtPassword.setEchoChar('*');
		// Ϊ�����ע�ᶯ���¼�������
		jtxtPassword.addActionListener(this);
		// ����������ʾ��¼״̬�ı�ǩ��Сλ�ã���������ӽ�JPanel����
		jlArray[2].setBounds(10, 180, 300, 30);
		jp.add(jlArray[2]);
		// ��JPanel������ӽ�����
		this.add(jp);
		// ���ô���ı��⡢��Сλ���Լ��ɼ���
		this.setTitle("��¼");
		this.setResizable(false);
		this.setBounds(100, 100, 300, 250);
		this.setVisible(true);
	}

	// ʵ��ActionListener�ӿ��еķ���
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jtxtName) {// �¼�ԴΪ�ı���
										// �л����뽹�㵽�����
			jtxtPassword.requestFocus();
		} else if (e.getSource() == jbArray[1]) {// �¼�ԴΪ��հ�Ť
													// ���������Ϣ
			jlArray[2].setText("");
			jtxtName.setText("");
			jtxtPassword.setText("");
			// �����뽹�����õ��ı���
			jtxtName.requestFocus();
		} else {// �¼�ԴΪ��¼��ť
				// �ж��û����������Ƿ�ƥ��
			if (jtxtName.getText().equals("wyf") && String.valueOf(jtxtPassword.getPassword()).equals("jc")) {// ��¼�ɹ�
				jlArray[2].setText("��ϲ������¼�ɹ�������");
			} else {// ��¼ʧ��
				jlArray[2].setText("�Բ��𣬷Ƿ����û��������룡����");
			}
		}
	}

	public static void main(String[] args) {
		// ����Sample22_1�������
		new Sample22_1();
	}
}
