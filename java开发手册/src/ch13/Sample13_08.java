package ch13;

//代码实现
public class Sample13_08 {
	public static void main(String[] args) {
		// 创建字符串对象s
		String s = "JavaSE6.0";
		// 创建StringBuffer对象sb
		StringBuffer sb = new StringBuffer("JavaSE6.0");
		// 创建字符串对象str
		String str = "核心技术大全";
		// 将str连接至字符串s
		s.concat(str);
		// 将str连接至StringBuffer对象sb
		sb.append(str);
		// 打印连接后的结果
		System.out.println("对String对象s以及StringBuffer对象sb做字符串连接操作，结果如下：");
		System.out.println("操作后s = " + s);
		System.out.println("操作后sb = " + sb);
	}
}
