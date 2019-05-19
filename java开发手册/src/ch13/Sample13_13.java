package ch13;

import java.util.regex.*;

public class Sample13_13 {
	public static void main(String[] args) {
		// 创建用字符串表示的正则表达式
		String patternStr = "\\d{4}-\\d{2}-\\d{2}";
		// 创建两个待匹配的字符串
		String s1 = "9999-66-88";
		String s2 = "内容为9999-66-88";
		// 对字符串s1进行匹配检测
		if (s1.matches(patternStr)) {
			// 匹配成功的情况
			System.out.println("恭喜你，字符串s1满足指定的格式要求！！！");
		} else {
			// 匹配失败的情况
			System.out.println("测试失败，字符串s1不满足指定的格式要求！！！");
		}
		// 对字符串s2进行匹配检测
		if (s2.matches(patternStr)) {
			// 匹配成功的情况
			System.out.println("恭喜你，字符串s2满足指定的格式要求！！！");
		} else {
			// 匹配失败的情况
			System.out.println("测试失败，字符串s2不满足指定的格式要求！！！");
		}
	}
}
