package ch13;

//代码实现
public class Sample13_05 {
	public static void main(String args[]) {
		// 使用简单语法创建字符串对象s1
		String s1 = "JavaSE6.0";
		// 使用构造器创建字符串对象s2
		String s2 = new String("JavaSE6.0");
		// 使用==比较字符串对象s1与s2
		if (s1 == s2) {
			System.out.println("字符串s1与字符串s2引用的是同一个对象！！！");
		} else {
			System.out.println("字符串s1与字符串s2引用的不是同一个对象！！！");
		}
		// 比较字符串s1与s2在字符串常量池中联系的是否是同一个对象
		if (s1.intern() == s2.intern()) {
			System.out.println("字符串s1与字符串s2在字符串常量池中联系的是同一个对象！！！");
		} else {
			System.out.println("字符串s1与字符串s2在字符串常量池中联系的不是同一个对象！！！");
		}
	}
}
