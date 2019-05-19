package ch29;

import java.io.*;

public class Sample29_8 {
	public static void main(String[] args) {
		try {
			// 创建，并初始化FileInputStream 对象fileInputStream
			FileInputStream fileInputStream = new FileInputStream("Sample29_8.java");
			// 为FileInputStream加上字符处理功能
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			// 创建，并初始化FileOutputStream对象fileOutputStream
			FileOutputStream fileOutputStream = new FileOutputStream("Sample29_8.bak");
			// 为FileOutputStream加上字符处理功能
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			int ch = 0;
			// 以字符方式显示文件内容
			while ((ch = inputStreamReader.read()) != -1) {
				System.out.print((char) ch); // 输出字符
				outputStreamWriter.write(ch); // 写入字符
			}
			System.out.println(); // 输出换行符
			inputStreamReader.close(); // 关闭inputStreamReader
			outputStreamWriter.close(); // 关闭outputStreamWriter
		} catch (Exception e) { // 捕获异常
			e.printStackTrace(); // 异常信息输出
		}
	}
}
