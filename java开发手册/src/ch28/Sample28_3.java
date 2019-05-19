package ch28;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.applet.*;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Sample28_3 extends Applet {
	ServerSocket server; // �½�һ��ServerSocket����

	String message = "";

	TextField t;
	DataOutputStream output;
	Socket socket;

	public void init() {
		setSize(300, 300); // ����Applet���ڵĴ�С
		Label label1 = new Label("�����˿ں�:"); // ���Appletͼ�ν���ؼ�
		add(label1);
		t = new TextField(20);
		add(t);
		Button b = new Button("��ʼ�����˿�");
		mouseListener m = new mouseListener(); // ����¼�����
		b.addMouseListener(m); // Ϊ��ť�������¼�����
		add(b);
	}

	public void paint(Graphics g) {
		g.drawString(message, 20, 160); // ���message�ַ���
	}

	class mouseListener implements MouseListener { // mouseListener��ʵ������¼������ӿ�
		public void mouseReleased(MouseEvent m) {
		}

		public void mouseClicked(MouseEvent m) { // ���������¼�����ʱ
			try {
				socket = server.accept(); // �ͻ����Ѿ�����
				message += "\r\n�ͻ���������!";
				output = new DataOutputStream(socket.getOutputStream());
				output.writeUTF("�Ѿ��ɹ����ӵ���������"); // ��ͻ���д��Ϣ
				output.close(); // �ر�������
				server.close();
			} catch (SocketException e) {
				message += e.toString(); // �쳣����
				repaint();
				e.printStackTrace();
				System.exit(1);
			} catch (IOException e) {
				message += e.toString();
				repaint(); // �൱�����µ���paint()����
				e.printStackTrace();
				System.exit(1);
			}
			repaint();
		}

		public void mouseEntered(MouseEvent m) {
		}

		public void mousePressed(MouseEvent m) { // ����걻����
			try {
				server = new ServerSocket(Integer.parseInt(t.getText())); // ��ʼ����ָ���˿�
				message += "�˿�" + t.getText() + "\n\r�ȴ��ͻ������ӡ���";
				repaint();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void mouseExited(MouseEvent m) {
		}
	}
}
