package ch28;

import java.net.*;
import java.net.URLConnection;
import java.util.Date;

public class Sample28_7 {

	public static void main(String args[]) throws Exception {
			URL url = new URL(								//以字符串的形式创建一个URL对象
					"http://gceclub.sun.com.cn:80/Java_Docs/html/zh_CN/api/overview-summary.html");
			URLConnection con = url.openConnection();			//获得该URL的连接
			System.out.println(con.getContentType());				//获取该URL资源的类型并打印输出
			System.out.println(con.getContentLength());			//获取该URL资源的大小
	
			Date d = new Date(con.getLastModified());			// 将long类型的日期返回值转换为日期16	格式
			System.out.println(d.getMonth() + "月" + d.getDay() + "日" + d.getHours()
					+ "点" + d.getMinutes() + "分" + d.getSeconds() + "秒");
			System.out.println(con.getExpiration());				//获取URL资源的期满日期
			System.out.println(con.getHeaderField(1));			//获取URL资源的第n个头字段的值
	
		}
}