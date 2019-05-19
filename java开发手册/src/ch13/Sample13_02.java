package ch13;
//编码格式转换
public class Sample13_02 {
	public static void main(String[] args) throws Exception {
		// 创建字符串对象
		String s1 = "Java核心技术大全";
		// 将字符串转换为iso8859_1编码方式并输出
		String s2 = new String(s1.getBytes(), "iso8859_1");
		System.out.println("将s1转换为ISO8859_1编码格式，结果为：" + s2);
		// 将字符串转换为gb2312编码方式并输出
		String s3 = new String(s2.getBytes("iso8859_1"), "gb2312");
		System.out.println("将s1再转换为gb2312编码格式，结果为：" + s3);
	}
}
