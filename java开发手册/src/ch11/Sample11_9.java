package ch11;
//大整数计算
import java.math.BigInteger;

public class Sample11_9 {
	public static void main(String[] args) {
		String s1;
		s1 = "a75465adc654d534345a6b5d5335af";
		String s2;
		s2 = "a64873f9d";
		int radix;
		radix = 16;
		BigInteger bi1;
		bi1 = new BigInteger(s1, radix); // 第一个对象。
		BigInteger bi2;
		bi2 = new BigInteger(s2, radix); // 第二个对象。
		BigInteger result;
		result = bi1.add(bi2); // 加法。
		System.out.println(bi1 + " + " + bi2 + " = " + result);
		result = bi1.subtract(bi2); // 减法。
		System.out.println(bi1 + " - " + bi2 + " = " + result);
		result = bi1.multiply(bi2); // 乘法。
		System.out.println(bi1 + " * " + bi2 + " = " + result);
		result = bi1.divide(bi2); // 除法。
		System.out.println(bi1 + " / " + bi2 + " = " + result);
		result = bi1.and(bi2); // 与。
		System.out.println(bi1 + " & " + bi2 + " = " + result);
		result = bi1.or(bi2); // 或。
		System.out.println(bi1 + " | " + bi2 + " = " + result);
		result = bi1.not(); // 非。
		System.out.println("!" + bi1 + " = " + result);
		result = bi1.andNot(bi2); // 与非。
		System.out.println(bi1 + " & ~" + bi2 + " = " + result);
		result = bi1.gcd(bi2); // 取两个数值绝对值的最大公约数。
		System.out.println(bi1 + " gcd " + bi2 + " = " + result);
		result = bi2.shiftLeft(5); // 左移。
		System.out.println(bi2 + " << 5 = " + result);
		result = bi2.shiftRight(10); // 右移。
		System.out.println(bi2 + " >> 10 = " + result);
	}
}
