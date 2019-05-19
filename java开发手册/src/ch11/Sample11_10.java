package ch11;
//大浮点数计算
import java.math.BigDecimal;

public class Sample11_10 {
	public static void main(String[] args) {
		String s1;
		s1 = "874398985432987989.43859479866";
		String s2;
		s2 = "-380979864656.324535357";
		BigDecimal bd1;
		bd1 = new BigDecimal(s1); // 第一个对象。
		BigDecimal bd2;
		bd2 = new BigDecimal(s2); // 第二个对象。
		BigDecimal result;
		result = bd1.add(bd2); // 加法。
		System.out.println(bd1 + " + " + bd2 + " = " + result);
		result = bd1.subtract(bd2); // 减法。
		System.out.println(bd1 + " - " + bd2 + " = " + result);
		result = bd1.multiply(bd2); // 乘法。
		System.out.println(bd1 + " * " + bd2 + " = " + result);
		result = bd1.divide(bd2, 5, BigDecimal.ROUND_HALF_UP); // 除法，将结果保留小数点后5位，进行四舍23
																// 五入。
		System.out.println(bd1 + " / " + bd2 + " = " + result);
		result = bd2.abs(); // 绝对值。
		System.out.println("abs(" + bd2 + ") = " + result);
		result = bd1.movePointLeft(3); // 小数点左移。
		System.out.println(bd1 + " / 1000 = " + result);
		result = bd1.movePointRight(5); // 小数点右移。
		System.out.println(bd1 + " * 100000 = " + result);
	}
}
