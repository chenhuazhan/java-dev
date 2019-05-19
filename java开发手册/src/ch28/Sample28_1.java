package ch28;

import java.net.*;

public class Sample28_1 {
	public static void main(String args[]) throws UnknownHostException {
		InetAddress addr1, addr2;
		addr1 = InetAddress.getLocalHost(); // 获取本地IP地址
		System.out.println(addr1);
		addr2 = InetAddress.getByName("www.baidu.com"); // 获取百度网站IP地址
		System.out.println(addr2);
		InetAddress addr3[] = new InetAddress[InetAddress // 初始化数组长度
				.getAllByName("www.sohu.com").length];
		addr3 = InetAddress.getAllByName("www.sohu.com"); // 获取搜狐网站所有的IP地14 址
		for (int n = 0; n < addr3.length; n++)
			System.out.println(addr3[n]);
	}
}
