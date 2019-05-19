package ch02_base_data_types;

public class Float_type {
	/*
	 * float 32位 1.4E-45~3.4E+38,-1.4E-45~-3.4E+38 double 64位
	 * 4.9E-324~1.7E+308,-4.9E-324~-1.7E+308
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b;
		double c, d;
		a = 20.1f; // 单精度浮点数必须加f或F
		b = -10.13455f;
		c = -100.64656; // 双精度浮点数可加d或D，也可不加
		d = 3.27;
		// 输出这些变量的值
		System.out.println("a的值为：" + a);
		System.out.println("b的值为：" + b);
		System.out.println("c的值为：" + c);
		System.out.println("d的值为：" + d);

		// 定义一个双精度浮点变量pi，表示圆周率
		double pi;
		// 定义一个双精度浮点变量r，表示半径
		double r;
		// 定义一个双精度浮点变量squ，表示面积
		double squ;
		// 把值3.141593赋给变量pi
		pi = 3.141593;
		// 把值12.15赋给变量r
		r = 12.15;
		// 计算面积，把计算的结果赋给变量squ
		squ = pi * r * r * 60 / 360;
		// 输出面积
		System.out.println(squ);

	}

}
