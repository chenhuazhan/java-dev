package ch20;

import java.awt.event.*;
import javax.swing.*;//�������̳���JFrame
public class Sample20_4 extends JFrame implements WindowListener {
	//���幹����
	public Sample20_4()
		{
			//���ô���ı���
			this.setTitle("�رմ����¼��������¶���Ĵ���");
			//���������һ����ǩ
			this.add(new JLabel("����һ����ʾ���壬������ʾ��μ�������ر��¼�������"));		
			//ע��WindowListener������
			this.addWindowListener(this);
			//���ô���Ĵ�С
			this.setBounds(100,100,500,200);
			//���ô���Ŀɼ���
			this.setVisible(true);
		}//ʵ��WindowListener�ӿ��еĸ�������

	public void windowClosing(WindowEvent e)
		{		
			System.out.println("������ر�ʱ��ִ������Ĵ��룡����");
			System.exit(0);
		}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public static void main(String[] args)
		{
			//����Sample20_4�������
			new Sample20_4();		
		}
}
