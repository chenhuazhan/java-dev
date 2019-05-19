package ch13;

public class Sample13_10 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java6.0");
		System.out.println("操作之前对象sb1的内容为：" + sb1);
		// 对sb1进行一系列操作
		sb1.append("核心技术大全").insert(4, "SE").delete(9, 15).reverse();
		System.out.println("一系列操作之后对象sb1的内容为：" + sb1);
		// 创建内容与sb1相同的StringBuffer对象sb2
		StringBuffer sb2 = new StringBuffer(sb1.toString());
		// 使用StringBuffer的equals方法测试
		System.out.println("====使用StringBuffer的equals方法测试对象sb1与sb2的内容====");
		if (sb1.equals(sb2)) {
			System.out.println("对象sb1与sb2的内容相同！！！");
		} else {
			System.out.println("对象sb1与sb2的内容不相同！！！");
		}
		// 使用toString方法后使用equals方法测试
		System.out.println("====使用toString方法后使用equals方法测试对象sb1与sb2的内容====");
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if (s1.equals(s2)) {
			System.out.println("对象sb1与sb2的内容相同！！");
		} else {
			System.out.println("对象sb1与sb2的内容不相同！！");
		}
	}
}
