package ch13;

import java.util.regex.*;

public class Sample13_15 {
	public static void main(String[] args) {
		// 创建用字符串表示的正则表达式以及待匹配的字符串
		String patternStr = ";|,";
		String str = "Tom;Lucy,Jerry;";
		// 打印待切割字符串的初始内容
		System.out.print("待切割字符串的初始内容为：");
		System.out.println(str);
		// 将字符串切割默认份
		System.out.print("将字符串切割默认份，结果为：");
		String[] arrStr = str.split(patternStr);
		// 打印切割后的结果
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		// 将字符串切3份
		System.out.print("\n将字符串切3份，结果为：");
		arrStr = str.split(patternStr, 3);
		// 打印切割后的结果
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		// 将字符串切-2份
		System.out.print("\n将字符串切-2份，结果为：");
		arrStr = str.split(patternStr, -2);
		// 打印切割后的结果
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		// 将字符串切0份
		System.out.print("\n将字符串切0份，结果为：");
		arrStr = str.split(patternStr, 0);
		// 打印切割后的结果
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		System.out.print("\n");
	}
}
