package ch28;

import java.net.*;

public class Sample28_1 {
	public static void main(String args[]) throws UnknownHostException {
		InetAddress addr1, addr2;
		addr1 = InetAddress.getLocalHost(); // ��ȡ����IP��ַ
		System.out.println(addr1);
		addr2 = InetAddress.getByName("www.baidu.com"); // ��ȡ�ٶ���վIP��ַ
		System.out.println(addr2);
		InetAddress addr3[] = new InetAddress[InetAddress // ��ʼ�����鳤��
				.getAllByName("www.sohu.com").length];
		addr3 = InetAddress.getAllByName("www.sohu.com"); // ��ȡ�Ѻ���վ���е�IP��14 ַ
		for (int n = 0; n < addr3.length; n++)
			System.out.println(addr3[n]);
	}
}
