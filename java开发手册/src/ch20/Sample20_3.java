package ch20;

import javax.swing.*;
import java.awt.*;

//�������̳���JFrame
public class Sample20_3 extends JFrame {
	// �����޲ι�����
	public Sample20_3() {
	}

	// �����вι�������������һ��booleanֵ
	public Sample20_3(boolean b) {
		// ���������һ����ǩ
		this.add(new JLabel("                          ����һ����ʾ���壬" + "������ʾJFrame��Ļ�������"));
		// ���ô���ı���
		this.setTitle("�Զ���Ĵ���");
		// ���ô���Ĵ�С
		this.setBounds(100, 100, 500, 200);
		// ���ݽ��յ�boolean���ô����Ƿ���Ե�����С
		this.setResizable(b);
		//ȥ����������
		//this.setUndecorated(true);
		Image image=this.getToolkit().getImage("E:\\java�����ֲ�\\src\\ch20\\1.jpg");
		this.setIconImage(image);
		// ���ô���Ŀɼ���
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ����Sample20_3��Ķ��󣬲�����falseֵʹ�ô��岻�ܵ�����С
		new Sample20_3(false);
	}
}
