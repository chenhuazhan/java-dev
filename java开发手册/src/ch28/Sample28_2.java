package ch28;

import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Sample28_2 extends Applet {
	TextField t1, t2;

	String ServerInfo = "";

	public void init() {
		Label label1 = new Label("��������ַ:"); // ���ͼ�ν���ؼ�
		add(label1);
		t1 = new TextField(20); // ���û������������ַ
		add(t1);
		Label label2 = new Label("�˿ں�:");
		add(label2);
		t2 = new TextField(20); // ���û�����˿ں�
		add(t2);
		Button b = new Button("�������ӷ���������");
		mouseListener m = new mouseListener(); // ����¼�����
		b.addMouseListener(m); // Ϊ��ť�������¼�����
		add(b);
	}

	public void paint(Graphics g) {

		g.drawString(ServerInfo, 20, 180); // ����ַ���ServerInfo
	}

	class mouseListener implements MouseListener { // mouseListener��ʵ������¼�����36
													// �ӿ�

		public void mouseReleased(MouseEvent m) {
		}

		public void mouseClicked(MouseEvent m) {
			try {
				String addr = t1.getText(); // ��ȡ�û�ָ����IP��ַ��˿ں�
				String portStr = t2.getText();
				int port = Integer.parseInt(portStr); // �˿ں�ת��Ϊ��������
				Socket connection; // ����Socket����
				if (addr.equals("localhost")) {
					connection = new Socket(InetAddress.getLocalHost(), port);
				} else {
					connection = new Socket(InetAddress.getByName(addr), port);
				}
				DataInputStream input = new DataInputStream(connection.getInputStream()); // �ӷ�������ȡ����
				ServerInfo = input.readUTF();
				connection.close(); // �ر�����
			} catch (SecurityException e) {
				ServerInfo = e.toString(); // �쳣����
				repaint();
			} catch (IOException e) {
				ServerInfo = e.toString();
				repaint();
			}
			repaint(); // �൱�����µ���paint()����
		}

		public void mouseEntered(MouseEvent m) {
		}

		public void mousePressed(MouseEvent m) {
		}

		public void mouseExited(MouseEvent m) {
		}
	}
}
