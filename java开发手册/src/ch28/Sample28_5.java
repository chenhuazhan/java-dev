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
		Label label1 = new Label("收到的消息:"); // 为Applet添加图形界面控件
		add(label1);
		t = new TextField(20);
		add(t);
		Button b = new Button("开始接受数据报"); // 鼠标事件监听
		b.addMouseListener(new mouseListener()); // 为按钮添加鼠标事件监听
		add(b);
	}

	public void paint(Graphics g) {
	}

	class mouseListener implements MouseListener { // mouseListener类实现鼠标事件监听29
													// 接口

		public void mouseReleased(MouseEvent m) {
		}

		public void mouseClicked(MouseEvent m) {

			DatagramSocket socket; // 创建一个DatagramSocket套接字对象

			while (true) {
				byte buffer[] = new byte[256]; // 创建消息接收缓冲区
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length); // 创建用于接收的数据报对象
				try {
					socket = new DatagramSocket(3000); // 创建套接字，监听3000端口
					socket.receive(packet); // 接收数据报
					String str = new String(packet.getData()); // 从数据报对象中取数据
					t.setText(str); // 输出字符串形式的数据
					socket.close(); // 关闭套接字
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
