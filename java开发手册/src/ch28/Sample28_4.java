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

		Label label1 = new Label("发送的消息:"); // 添加Applet图形界面控件
		add(label1);
		t = new TextField(20);
		add(t);
		Button b = new Button("发送消息");
		mouseListener m = new mouseListener(); // 鼠标事件监听
		b.addMouseListener(m); // 为按钮添加鼠标事件监听
		add(b);
	}

	public void paint(Graphics g) {
	}

	class mouseListener implements MouseListener { // mouseListener类实现鼠标事件监听33
													// 接口

		public void mouseReleased(MouseEvent m) {
		}

		public void mouseClicked(MouseEvent m) {

			String host = "localhost"; // 指定地址为本机地址
			byte message[] = new byte[256];

			try {
				InetAddress addr = InetAddress.getByName(host); // 获取本机地址
				message = t.getText().getBytes(); // 获取用户指定的要发送的消46 息
				DatagramPacket packet = new DatagramPacket(message, message.length, addr, 3000); // 创建数据报对象，指定目的地址和端口49
																									// 号
				DatagramSocket socket;

				try {
					socket = new DatagramSocket(); // 创建DatagramSocket套接字对象
					socket.send(packet); // 发送数据报
					t.setText(""); // 清空消息输入框
					socket.close(); // 关闭套接字
				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}

		public void mouseEntered(MouseEvent m) { // 这里虽然没有用到这些事件
			// 但是必须实现下列方法,方法体中可以无代67 码
		}

		public void mousePressed(MouseEvent m) {
		}

		public void mouseExited(MouseEvent m) {
		}
	}
}
