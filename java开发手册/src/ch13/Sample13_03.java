package ch13;
//String类的常用方法
public class Sample13_03 {
	public static void main(String args[]) {
		String s1 = "JavaSE6.0核心技术大全欢迎您！！";
		String s2 = new String("恭喜你分别用两种不同的语法创建了字符串！！");
		String s3;
		// 使用charAt方法获取字符串中某个字符
		System.out.println("=====================charAt=======================");
		char c = s1.charAt(4);
		System.out.println("从0开始数，字符串s1中第4个字符为：" + c);
		// 使用toCharArray方法将字符串转换为字符数组
		System.out.println("=====================toCharArray==================");
		char[] array = s1.toCharArray();
		System.out.print("将char数组倒着打印：");
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i]);
		// 使用concat方法连接两个字符串
		System.out.println("\n=====================concat=======================");
		s3 = s1.concat(s2);
		System.out.println("将两个字符串连接后的结果为：" + s3);
		// 使用equals方法比较两个字符串的内容
		System.out.println("=====================equals=======================");
		s3 = "JavaSE6.0核心技术大全欢迎您！！";
		if (s1.equals(s3))
			System.out.println("恭喜你测试成功，s1与s3中的内容是完全相同的！！");
		// 使用equalsIgnoreCase方法在不区分大小写的情况下比较两个字符串的内容
		System.out.println("=================equalsIgnoreCase=================");
		s3 = "JAVASE6.0核心技术大全欢迎您！！";
		if (s1.equalsIgnoreCase(s3))
			System.out.println("s1与s3中的内容在不区分大小写的情况下是相同的！！");
		// 使用length方法获取字符串的长度
		System.out.println("======================length======================");
		int size = s1.length();
		System.out.println("s1中字符的个数为：" + size);
		// 使用replace方法替换字符串中某个字符
		System.out.println("======================replace=====================");
		s3 = s1.replace('a', 'X');
		System.out.println("将s1中所有的字母a换成字母X：" + s3);
		// 使用substring方法获取字符串的某个子串
		System.out.println("======================substring===================");
		s3 = s1.substring(10);
		System.out.println("从0开始数，s1中第10个字符往后字符串为：" + s3);
		s3 = s1.substring(2, 10);
		System.out.println("从0开始数，s1中第2个字符到第10个字符的字符串为：" + s3);
		// 使用toLowerCase方法将字符串的字符全换成小写
		System.out.println("======================toLowerCase=================");
		s3 = s1.toLowerCase();
		System.out.println("将s1中的字符全换成小写：" + s3);
		// 使用toUpperCase方法将字符串的字符全换成大写
		System.out.println("======================toUpperCase=================");
		s3 = s1.toUpperCase();
		System.out.println("将s1中的字符全换成大写：" + s3);
		// 使用trim方法去掉字符串头部和尾部的不可见字符
		System.out.println("======================trim========================");
		s3 = "          Java SE6.0        ";
		System.out.println("s3没有用过trim方法前：[" + s3 + "]");
		s3 = s3.trim();
		System.out.println("s3用过trim方法后：[" + s3 + "]");
	}
}
