package ch11;
//∞À÷÷∑‚◊∞¿‡
public class Sample11_1 {
	private Byte wByte;
	private Short wShort;
	private Boolean wBoolean;
	private Character wChar;
	private Integer wInt;
	private Double wDouble;
	private Float wFloat;
	private Long wLong;

	public Sample11_1() {
		byte b = 10;
		wByte = new Byte(b);
		short s = 12;
		wShort = new Short(s);
		boolean b1 = true;
		wBoolean = new Boolean(b1);
		char c = 'A';
		wChar = new Character(c);
		int i = 12;
		wInt = new Integer(i);
		double d = 12.321;
		wDouble = new Double(d);
		float f = 23.28f;
		wFloat = new Float(f);
		long l = 217864873872324324L;
		wLong = new Long(l);
	}

	public static void main(String[] args) {
		Sample11_1 demo;
		demo = new Sample11_1();
		System.out.println("Byte: " + demo.wByte);
		System.out.println("Short: " + demo.wShort);
		System.out.println("Boolean: " + demo.wBoolean);
		System.out.println("Character: " + demo.wChar);
		System.out.println("Integer: " + demo.wInt);
		System.out.println("Double: " + demo.wDouble);
		System.out.println("Float: " + demo.wFloat);
		System.out.println("Long: " + demo.wLong);
	}
}
