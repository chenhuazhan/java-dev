package ch11;
//�󸡵�������
import java.math.BigDecimal;

public class Sample11_10 {
	public static void main(String[] args) {
		String s1;
		s1 = "874398985432987989.43859479866";
		String s2;
		s2 = "-380979864656.324535357";
		BigDecimal bd1;
		bd1 = new BigDecimal(s1); // ��һ������
		BigDecimal bd2;
		bd2 = new BigDecimal(s2); // �ڶ�������
		BigDecimal result;
		result = bd1.add(bd2); // �ӷ���
		System.out.println(bd1 + " + " + bd2 + " = " + result);
		result = bd1.subtract(bd2); // ������
		System.out.println(bd1 + " - " + bd2 + " = " + result);
		result = bd1.multiply(bd2); // �˷���
		System.out.println(bd1 + " * " + bd2 + " = " + result);
		result = bd1.divide(bd2, 5, BigDecimal.ROUND_HALF_UP); // ���������������С�����5λ����������23
																// ���롣
		System.out.println(bd1 + " / " + bd2 + " = " + result);
		result = bd2.abs(); // ����ֵ��
		System.out.println("abs(" + bd2 + ") = " + result);
		result = bd1.movePointLeft(3); // С�������ơ�
		System.out.println(bd1 + " / 1000 = " + result);
		result = bd1.movePointRight(5); // С�������ơ�
		System.out.println(bd1 + " * 100000 = " + result);
	}
}
