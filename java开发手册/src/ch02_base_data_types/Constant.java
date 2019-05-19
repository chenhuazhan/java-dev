package ch02_base_data_types;

public class Constant {
	public static void main(String[] args) {
		// 把十进制常量1赋值给整型变量a
		int a = 1;
		// 把八进制常量012赋值给整型变量b
		int b = 012;
		// 把十六进制常量0x10赋值给整型变量c
		int c = 0X10;
		// 把双精度浮点常量1.2D赋值给双精度变量d
		double d = 1.2D;
		// 把双精度浮点常量1.23e4赋值给双精度变量d
		double e = 1.23e4;
		// 把制表符\t赋值给字符型变量f
		char f = '\t';
		// 把换行符\n赋值给字符型变量g
		char g = '\n';
		// 把单引号\'赋值给字符型变量h
		char h = '\'';
		System.out.println("变量a的值为：" + a);
		System.out.println("变量b的值为：" + b);
		System.out.println("变量c的值为：" + c);
		System.out.println("变量d的值为：" + d);
		System.out.println("变量e的值为：" + e);
		System.out.println("输出一个制表符：" + f);
		System.out.println("输出一个换行符：" + g);
		System.out.println("输出一个单引号：" + h);
		System.out.println("输出字符串常量abcd：" + "abcd");

	}

}
