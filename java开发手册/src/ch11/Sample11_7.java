package ch11;
//toString()����
public class Sample11_7 {
	public static void main(String[] args) {
		Integer wInt;
		wInt = Integer.valueOf("2345");
		System.out.println("wInt��" + wInt.toString());
		Boolean wBoolean;
		wBoolean = Boolean.valueOf(true);
		System.out.println("wBoolean��" + wBoolean.toString());
	}
}
