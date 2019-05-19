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
	ServerSocket server; // 新建一个ServerSocket对象

	String message = "";

	TextField t;
	DataOutputStream output;
	Socket socket;

	public void init() {
		setSize(300, 300); // 设置Applet窗口的大小
		Label label1 = new Label("监听端口号:"); // 添加Applet图形界面控件
		add(label1);
		t = new TextField(20);
		add(t);
		Button b = new Button("开始监听端口");
		mouseListener m = new mouseListener(); // 鼠标事件监听
		b.addMouseListener(m); // 为按钮添加鼠标事件监听
		add(b);
	}

	public void paint(Graphics g) {
		g.drawString(message, 20, 160); // 输出message字符串
	}

	class mouseListener implements MouseListener { // mouseListener类实现鼠标事件监听接口
		public void mouseReleased(MouseEvent m) {
		}

		public void mouseClicked(MouseEvent m) { // 当点击鼠标事件发生时
			try {
				socket = server.accept(); // 客户端已经连接
				message += "\r\n客户端已连接!";
				output = new DataOutputStream(socket.getOutputStream());
				output.writeUTF("已经成功连接到服务器！"); // 向客户端写消息
				output.close(); // 关闭数据流
				server.close();
			} catch (SocketException e) {
				message += e.toString(); // 异常处理
				repaint();
				e.printStackTrace();
				System.exit(1);
			} catch (IOException e) {
				message += e.toString();
				repaint(); // 相当于重新调用paint()方法
				e.printStackTrace();
				System.exit(1);
			}
			repaint();
		}

		public void mouseEntered(MouseEvent m) {
		}

		public void mousePressed(MouseEvent m) { // 当鼠标被按下
			try {
				server = new ServerSocket(Integer.parseInt(t.getText())); // 开始监听指定端口
				message += "端口" + t.getText() + "\n\r等待客户端连接……";
				repaint();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void mouseExited(MouseEvent m) {
		}
	}
}
