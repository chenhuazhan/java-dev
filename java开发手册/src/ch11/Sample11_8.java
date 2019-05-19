package ch11;
//进制转换方法
public class Sample11_8 {
	public static void main(String[] args) {
		String s = "";
		int i = 60; // 整型变量。
		s = Integer.toBinaryString(i); // 二进制转换。
		System.out.println(i + "转换为二进制：" + s);
		s = Integer.toOctalString(i); // 八进制转换。
		System.out.println(i + "转换为八进制：" + s);
		s = Integer.toHexString(i); // 十六进制转换。
		System.out.println(i + "转换为十六进制：" + s);
	}
}