package ch13;

public class Sample13_11 {
	public static void main(String[] args) { // 创建StringBuilder对象sb
		StringBuilder sb = new StringBuilder("Java6.0");
		System.out.println("操作之前对象sb1的内容为：" + sb);
		// 对StringBuilder对象sb进行连接、插入、删除以及倒置操作
		sb.append("核心技术大全").insert(4, "SE").delete(9, 15).reverse();
		// 打印StringBuilder对象sb
		System.out.println("一系列操作之后对象sb1的内容为：" + sb);
	}
}
