package ch13;

//代码实现
public class Sample13_06 {
	public static void main(String args[]) {
		// 创建字符串对象s1与s2
		String s1 = "JavaSE6.0";
		String s2 = "核心技术大全";
		// 将字符串s1与s2相连接并将结果赋给s2
		s2 = s1.concat(s2);
		// 打印字符串s1与s2
		System.out.println("对字符串s1进行连接字符串操作，字符串s1与s2的结果为：");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}
}
