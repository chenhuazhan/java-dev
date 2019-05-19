package ch28;

import java.net.*;
import java.net.URLConnection;
import java.util.Date;

public class Sample28_7 {

	public static void main(String args[]) throws Exception {
			URL url = new URL(								//���ַ�������ʽ����һ��URL����
					"http://gceclub.sun.com.cn:80/Java_Docs/html/zh_CN/api/overview-summary.html");
			URLConnection con = url.openConnection();			//��ø�URL������
			System.out.println(con.getContentType());				//��ȡ��URL��Դ�����Ͳ���ӡ���
			System.out.println(con.getContentLength());			//��ȡ��URL��Դ�Ĵ�С
	
			Date d = new Date(con.getLastModified());			// ��long���͵����ڷ���ֵת��Ϊ����16	��ʽ
			System.out.println(d.getMonth() + "��" + d.getDay() + "��" + d.getHours()
					+ "��" + d.getMinutes() + "��" + d.getSeconds() + "��");
			System.out.println(con.getExpiration());				//��ȡURL��Դ����������
			System.out.println(con.getHeaderField(1));			//��ȡURL��Դ�ĵ�n��ͷ�ֶε�ֵ
	
		}
}