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
			url = new URL("http://www.w3c.com/images/w3c.gif"); // ����URL������Ҫ�쳣����
			img = getImage(url); // ��ȡԶ��ͼ��
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		g.drawString("�����ͼƬ��ַΪ��", 0, 20); // ����ַ���
		g.drawString(url.toExternalForm(), 0, 40);
		g.drawImage(img, 0, 50, this); // ���Զ��ͼ��
	}
}
