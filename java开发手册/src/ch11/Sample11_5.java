package ch11;
//isNaN()方法
public class Sample11_5 {
	public static void main(String[] args) {
		Double wDouble;
		double d;
		d = 0.0 / 0.0; // 0除以0。
		boolean b;
		b = Double.isNaN(d); // 使用静态方法判断是否是NaN。
		System.out.println("2.0 / 0.0 " + (b ? "is " : "is not ") + "NaN.");
		wDouble = Double.valueOf(d);
		b = wDouble.isNaN(); // 使用成员方法判断。
		System.out.println("2.0 / 0.0 " + (b ? "is " : "is not ") + "NaN.");
		System.out.println(Double.NaN == Double.NaN); // 比较NaN自身。
	}
}
