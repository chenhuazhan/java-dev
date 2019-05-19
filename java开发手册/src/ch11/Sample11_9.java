package ch11;
//����������
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
		bi1 = new BigInteger(s1, radix); // ��һ������
		BigInteger bi2;
		bi2 = new BigInteger(s2, radix); // �ڶ�������
		BigInteger result;
		result = bi1.add(bi2); // �ӷ���
		System.out.println(bi1 + " + " + bi2 + " = " + result);
		result = bi1.subtract(bi2); // ������
		System.out.println(bi1 + " - " + bi2 + " = " + result);
		result = bi1.multiply(bi2); // �˷���
		System.out.println(bi1 + " * " + bi2 + " = " + result);
		result = bi1.divide(bi2); // ������
		System.out.println(bi1 + " / " + bi2 + " = " + result);
		result = bi1.and(bi2); // �롣
		System.out.println(bi1 + " & " + bi2 + " = " + result);
		result = bi1.or(bi2); // ��
		System.out.println(bi1 + " | " + bi2 + " = " + result);
		result = bi1.not(); // �ǡ�
		System.out.println("!" + bi1 + " = " + result);
		result = bi1.andNot(bi2); // ��ǡ�
		System.out.println(bi1 + " & ~" + bi2 + " = " + result);
		result = bi1.gcd(bi2); // ȡ������ֵ����ֵ�����Լ����
		System.out.println(bi1 + " gcd " + bi2 + " = " + result);
		result = bi2.shiftLeft(5); // ���ơ�
		System.out.println(bi2 + " << 5 = " + result);
		result = bi2.shiftRight(10); // ���ơ�
		System.out.println(bi2 + " >> 10 = " + result);
	}
}
