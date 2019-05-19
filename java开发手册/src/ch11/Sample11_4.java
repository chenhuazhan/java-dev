package ch11;
//静态工厂方法
public class Sample11_4 {
	public static void main(String[] args) {
		Integer wInt; // 封装类对象引用变量。
		int i;
		i = 10; // 整型变量i。
		int radix;
		radix = 2; // 整型变量，描述进制。
		String s;
		s = "1001011"; // 字符串变量。
		wInt = Integer.valueOf(i); // 通过整型变量生成对象。
		System.out.println("int: " + i + " ;Integer: " + wInt);
		wInt = Integer.valueOf(s); // 通过字符串变量生成对象。
		System.out.println("String: " + s + " ;Integer(10进制): " + wInt);
		wInt = Integer.valueOf(s, radix); // 通过字符串和进制属性生成对象。
		System.out.println("String: " + s + " ;Integer(2进制): " + wInt);
		Boolean wBoolean; // 封装类对象引用变量。
		boolean b;
		b = true;
		s = "false";
		wBoolean = Boolean.valueOf(b); // 通过boolean型变量生成对象。
		System.out.println("boolean: " + b + " ;Boolean：" + wBoolean);
		wBoolean = Boolean.valueOf(s); // 通过字符串生成对象。
		System.out.println("String: " + s + " ;Boolean：" + wBoolean);
	}
}
