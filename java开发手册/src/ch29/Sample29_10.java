package ch29;

import java.io.*;

public class Sample29_10 {
	public static void main(String[] args) {
		try {
			// 缓冲System.in字符输入流
			BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
			// 缓冲FileWriter字符输出流
			BufferedWriter bufWriter = new BufferedWriter(new FileWriter("Sample29_10.bak"));
			String input = null;
			// 每读一行进行一次写入动作
			while (!(input = bufReader.readLine()).equals("quit")) {
				bufWriter.write(input);
				// 写入与操作系统相应的换行符
				bufWriter.newLine();
			}
			bufReader.close(); // 关闭bufReader
			bufWriter.close(); // 关闭bufWriter
		} catch (Exception e) { // 捕获异常
			e.printStackTrace(); // 异常信息输出
		}
	}
}
