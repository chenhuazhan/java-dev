package ch28;

import java.net.MalformedURLException;
import java.net.URL;

public class Sample28_6 {

	public static void main(String args[]) throws MalformedURLException {
		URL url = new URL( // ���ַ�������ʽ����URL����
				"http://gceclub.sun.com.cn:80/Java_Docs/html/zh_CN/api/overview-summary.html");
		System.out.println("Э�����ƣ�" + url.getProtocol()); // ��ȡЭ������
		System.out.println("�˿ںţ�" + url.getPort()); // ��ȡ�˿ں�
		System.out.println("��������" + url.getHost()); // ��ȡ������
		System.out.println("�ļ�����" + url.getFile()); // ��ȡ�ļ���
		System.out.println("�ļ�·����" + url.getPath()); // ��ȡ�ļ�·��
		// ��ȡURL������ַ�����ʾ��ʽ
		System.out.println("URL������ַ�����ʾ��ʽ��" + url.toExternalForm());
	}

}
