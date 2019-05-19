package ch29;

import java.io.*;

public class Sample29_3 {
	public static void main(String[] args) {
		try {
			System.out.print("请输入字符: "); // 输出字符串
			System.out.println("输入字符十进制表示为: " + System.in.read()); // 获取键盘数据，并输出
		} catch (IOException e) { // 捕获异常
			e.printStackTrace(); // 输出信息
		}
	}
}
