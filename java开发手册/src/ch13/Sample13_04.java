package ch13;

public class Sample13_04 {
	public static void main(String args[]) {
		// 使用简单语法创建字符串s1与s2
		String s1 = "JavaSE7.0";
		String s2 = "JavaSE7.0";
		// 使用构造器创建字符串s3
		String s3 = new String("JavaSE7.0");
		// 使用==比较字符串s1与s2
		if (s1 == s2) {
			System.out.println("字符串s1与字符串s2通过等于测试，结果返回true");
		} else {
			System.out.println("字符串s1与字符串s2没有通过等于测试，结果返回false");
		}
		// 使用==比较字符串s1与s3
		if (s1 == s3) {
			System.out.println("字符串s1与字符串s3通过等于测试，结果返回true");
		} else {
			System.out.println("字符串s1与字符串s3没有通过等于测试，结果返回false");
		}
		// 使用equals方法比较字符串s1与s3
		if (s1.equals(s3)) {
			System.out.println("字符串s1与字符串s3内容相同，结果返回true");
		} else {
			System.out.println("字符串s1与字符串s3内容不同，结果返回false");
		}
	}
}
