package ch28;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Sample28_4 extends Applet {
	TextField t;

	public void init() {

		Label label1 = new Label("���͵���Ϣ:"); // ���Appletͼ�ν���ؼ�
		add(label1);
		t = new TextField(20);
		add(t);
		Button b = new Button("������Ϣ");
		mouseListener m = new mouseListener(); // ����¼�����
		b.addMouseListener(m); // Ϊ��ť�������¼�����
		add(b);
	}

	public void paint(Graphics g) {
	}

	class mouseListener implements MouseListener { // mouseListener��ʵ������¼�����33
													// �ӿ�

		public void mouseReleased(MouseEvent m) {
		}

		public void mouseClicked(MouseEvent m) {

			String host = "localhost"; // ָ����ַΪ������ַ
			byte message[] = new byte[256];

			try {
				InetAddress addr = InetAddress.getByName(host); // ��ȡ������ַ
				message = t.getText().getBytes(); // ��ȡ�û�ָ����Ҫ���͵���46 Ϣ
				DatagramPacket packet = new DatagramPacket(message, message.length, addr, 3000); // �������ݱ�����ָ��Ŀ�ĵ�ַ�Ͷ˿�49
																									// ��
				DatagramSocket socket;

				try {
					socket = new DatagramSocket(); // ����DatagramSocket�׽��ֶ���
					socket.send(packet); // �������ݱ�
					t.setText(""); // �����Ϣ�����
					socket.close(); // �ر��׽���
				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}

		public void mouseEntered(MouseEvent m) { // ������Ȼû���õ���Щ�¼�
			// ���Ǳ���ʵ�����з���,�������п����޴�67 ��
		}

		public void mousePressed(MouseEvent m) {
		}

		public void mouseExited(MouseEvent m) {
		}
	}
}
