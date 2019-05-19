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
		Label label1 = new Label("服务器地址:"); // 添加图形界面控件
		add(label1);
		t1 = new TextField(20); // 由用户输入服务器地址
		add(t1);
		Label label2 = new Label("端口号:");
		add(label2);
		t2 = new TextField(20); // 由用户输入端口号
		add(t2);
		Button b = new Button("发送连接服务器请求");
		mouseListener m = new mouseListener(); // 鼠标事件监听
		b.addMouseListener(m); // 为按钮添加鼠标事件监听
		add(b);
	}

	public void paint(Graphics g) {

		g.drawString(ServerInfo, 20, 180); // 输出字符串ServerInfo
	}

	class mouseListener implements MouseListener { // mouseListener类实现鼠标事件监听36
													// 接口

		public void mouseReleased(MouseEvent m) {
		}

		public void mouseClicked(MouseEvent m) {
			try {
				String addr = t1.getText(); // 获取用户指定的IP地址与端口号
				String portStr = t2.getText();
				int port = Integer.parseInt(portStr); // 端口号转换为整数类型
				Socket connection; // 创建Socket连接
				if (addr.equals("localhost")) {
					connection = new Socket(InetAddress.getLocalHost(), port);
				} else {
					connection = new Socket(InetAddress.getByName(addr), port);
				}
				DataInputStream input = new DataInputStream(connection.getInputStream()); // 从服务器读取数据
				ServerInfo = input.readUTF();
				connection.close(); // 关闭连接
			} catch (SecurityException e) {
				ServerInfo = e.toString(); // 异常处理
				repaint();
			} catch (IOException e) {
				ServerInfo = e.toString();
				repaint();
			}
			repaint(); // 相当于重新调用paint()方法
		}

		public void mouseEntered(MouseEvent m) {
		}

		public void mousePressed(MouseEvent m) {
		}

		public void mouseExited(MouseEvent m) {
		}
	}
}
