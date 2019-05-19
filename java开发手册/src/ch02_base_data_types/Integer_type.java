package ch02_base_data_types;

/*
 * byte  8位    -128~127
 * short 16位   -32768~32767
 * int   32位  -2147483648~2147483647
 * long  64位  -9223372036854775808~9223372036854775807
 */
public class Integer_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个名为为a的整型变量，把值20赋予变量a
		int a = 20;
		// 定义一个名为为x的整型变量，把值-10赋予变量x
		int x = -10;
		// 定义一个名为为b的长整型变量，把值-100赋予变量b
		long b = -100L; // 长整型数据后面要加'L'
		// 定义一个名为为l的长整型变量，把值50赋予变量l
		long l = 50l;
		// 定义一个名为为c的短整型变量，把值50赋予变量c
		short c = 50;
		// 定义一个名为为y的短整型变量，把值-1赋予变量y
		short y = -1;
		// 定义一个名为为d的字节型变量，把值4赋予变量d
		byte d = 4;
		// 定义一个名为为z的字节型变量，把值0赋予变量z
		byte z = 0;
		// 输出这些变量的值
		System.out.println("a的值为：" + a);
		System.out.println("x的值为：" + x);
		System.out.println("b的值为：" + b);
		System.out.println("l的值为：" + l);
		System.out.println("c的值为：" + c);
		System.out.println("y的值为：" + y);
		System.out.println("d的值为：" + d);
		System.out.println("z的值为：" + z);

		// 数据溢出结果
		int i, k, j, m;
		i = 2147483647;
		k = -2147483648;
		j = i + 1;
		m = k - 1;
		System.out.println(j);
		System.out.println(m);

		// 计算10光年
		// 定义一个整型变量表示光速
		int lightSpeed;
		// 定义一个整型变量表示秒数
		long seconds;
		// 定义一个长整型变量表示光传播的距离
		long dis;
		// 光速
		lightSpeed = 300000000;
		// 计算十年的秒数
		seconds = 10 * 365 * 24 * 60 * 60;
		// 计算十光年的距离
		dis = lightSpeed * seconds;
		System.out.println("十光年大约为" + dis + "米");

	}
}
