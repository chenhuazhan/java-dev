package ch11;
//isNaN()����
public class Sample11_5 {
	public static void main(String[] args) {
		Double wDouble;
		double d;
		d = 0.0 / 0.0; // 0����0��
		boolean b;
		b = Double.isNaN(d); // ʹ�þ�̬�����ж��Ƿ���NaN��
		System.out.println("2.0 / 0.0 " + (b ? "is " : "is not ") + "NaN.");
		wDouble = Double.valueOf(d);
		b = wDouble.isNaN(); // ʹ�ó�Ա�����жϡ�
		System.out.println("2.0 / 0.0 " + (b ? "is " : "is not ") + "NaN.");
		System.out.println(Double.NaN == Double.NaN); // �Ƚ�NaN����
	}
}
