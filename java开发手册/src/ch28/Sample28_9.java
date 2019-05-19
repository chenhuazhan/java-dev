package ch28;

import java.net.*;
import java.io.*;

public class Sample28_9 {
	public static void main(String args[]) {
		URL url = null;
		try {
			url = new URL("http://www.w3c.com"); // ��ʼ��url����
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try {
			InputStream input = url.openStream(); // �õ�����������
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String info = reader.readLine(); // ��������
			while (info != null) {
				System.out.println(info); // ����������Ļ
				info = reader.readLine(); // ��ȡһ��
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
