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

public class Sample28_5 extends Applet {
	TextField t;

	public void init() {
		Label label1 = new Label("�յ�����Ϣ:"); // ΪApplet���ͼ�ν���ؼ�
		add(label1);
		t = new TextField(20);
		add(t);
		Button b = new Button("��ʼ�������ݱ�"); // ����¼�����
		b.addMouseListener(new mouseListener()); // Ϊ��ť�������¼�����
		add(b);
	}

	public void paint(Graphics g) {
	}

	class mouseListener implements MouseListener { // mouseListener��ʵ������¼�����29
													// �ӿ�

		public void mouseReleased(MouseEvent m) {
		}

		public void mouseClicked(MouseEvent m) {

			DatagramSocket socket; // ����һ��DatagramSocket�׽��ֶ���

			while (true) {
				byte buffer[] = new byte[256]; // ������Ϣ���ջ�����
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length); // �������ڽ��յ����ݱ�����
				try {
					socket = new DatagramSocket(3000); // �����׽��֣�����3000�˿�
					socket.receive(packet); // �������ݱ�
					String str = new String(packet.getData()); // �����ݱ�������ȡ����
					t.setText(str); // ����ַ�����ʽ������
					socket.close(); // �ر��׽���
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		public void mouseEntered(MouseEvent m) {
		}

		public void mousePressed(MouseEvent m) {
		}

		public void mouseExited(MouseEvent m) {
		}
	}
}
