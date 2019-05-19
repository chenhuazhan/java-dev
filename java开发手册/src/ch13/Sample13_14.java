package ch13;

import java.util.regex.*;

public class Sample13_14 {
	public static void main(String[] args) {
		// 创建用字符串表示的正则表达式以及待匹配的字符串
		String patternStr = "\\b\\d*\\.\\d{3,}\\b";
		String s1 = "123.5 123.56 123.5678 123.5600 123.0098";
		// 打印待匹配字符串的初始内容
		System.out.print("初始字符串内容为：");
		System.out.println(s1);
		// 进行replaceAll全部匹配替换操作
		String s2 = s1.replaceAll(patternStr, "Error");
		// 打印replaceAll全部匹配替换操作后的结果
		System.out.print("使用replaceAll对其进行匹配替换后：");
		System.out.println(s2);
		// 进行replaceFirst第一个匹配替换操作
		s2 = s1.replaceFirst(patternStr, "Error");
		// 打印replaceFirst第一个匹配替换操作后的结果
		System.out.print("使用replaceFirst对其进行匹配替换后：");
		System.out.println(s2);
	}
}
