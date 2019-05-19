package ch28;

import java.applet.*;
import java.awt.*;
import java.net.*;

public class Sample28_8 extends Applet {
	Button button;

	Image img;

	URL url;

	public void init() {
		try {
			url = new URL("http://www.w3c.com/images/w3c.gif"); // 建立URL对象，需要异常处理
			img = getImage(url); // 获取远程图像
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		g.drawString("下面的图片地址为：", 0, 20); // 输出字符串
		g.drawString(url.toExternalForm(), 0, 40);
		g.drawImage(img, 0, 50, this); // 输出远程图像
	}
}
