package ch28;

import java.net.MalformedURLException;
import java.net.URL;

public class Sample28_6 {

	public static void main(String args[]) throws MalformedURLException {
		URL url = new URL( // 以字符串的形式构造URL对象
				"http://gceclub.sun.com.cn:80/Java_Docs/html/zh_CN/api/overview-summary.html");
		System.out.println("协议名称：" + url.getProtocol()); // 获取协议名称
		System.out.println("端口号：" + url.getPort()); // 获取端口号
		System.out.println("主机名：" + url.getHost()); // 获取主机名
		System.out.println("文件名：" + url.getFile()); // 获取文件名
		System.out.println("文件路径：" + url.getPath()); // 获取文件路径
		// 获取URL对象的字符串表示形式
		System.out.println("URL对象的字符串表示形式：" + url.toExternalForm());
	}

}
