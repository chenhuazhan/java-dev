package ch29;

import java.io.*;

public class Sample29_9 {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("Sample29_9.java"); // 创建，并初始化FileReader对象fileReader
			FileWriter fileWriter = new FileWriter("Sample29_9.bak"); // 创建，并初始化FileWriter对象fileWriter
			int in = 0;
			char[] wlnChar = { '\r', '\n' }; // 声明，并初始化字符数组wlnChar
			while ((in = fileReader.read()) != -1) {
				if (in == '\n') {
					// 写入"\r\n"
					fileWriter.write(wlnChar); // fileWriter写操作
				} else
					fileWriter.write(in); // 写操作
			}
			fileReader.close(); // 关闭fileReader
			fileWriter.close(); // 关闭fileWriter
		} catch (Exception e) { // 捕获异常
			e.printStackTrace(); // 异常信息输出
		}
	}
}
