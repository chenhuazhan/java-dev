package ch11;
//equals()����
public class Sample11_6 {
	public static void main(String[] args) {
		Integer wInt;
		int i;
		i = 125;
		wInt = Integer.valueOf(i);
		System.out.println("wInt " + (wInt.equals(wInt) ? "���� " : "������ ") + "wInt");
		System.out.println("wInt " + (wInt == wInt ? "== " : "!= ") + "wInt");
		Integer wInt1;
		wInt1 = Integer.valueOf(i);
		System.out.println("wInt " + (wInt.equals(wInt1) ? "���� " : "������ ") + "wInt1");
		System.out.println("wInt " + (wInt == wInt1 ? "== " : "!= ") + "wInt1");
		int i1;
		i1 = 127;
		wInt1 = Integer.valueOf(i1);
		System.out.println("wInt " + (wInt.equals(wInt1) ? "���� " : "������ ") + "wInt1");
		System.out.println("wInt " + (wInt == wInt1 ? "== " : "!= ") + "wInt1");
	}
}
