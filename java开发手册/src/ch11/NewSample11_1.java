package ch11;
//自动打包技术
public class NewSample11_1 {
	private Byte wByte;
	private Short wShort;
	private Boolean wBoolean;
	private Character wChar;
	private Integer wInt;
	private Double wDouble;
	private Float wFloat;
	private Long wLong;

	public NewSample11_1() {
		byte b;
		b = 10;
		wByte = b;
		short s;
		s = 12;
		wShort = s;
		boolean b1;
		b1 = true;
		wBoolean = b1;
		char c;
		c = 'A';
		wChar = c;
		int i;
		i = 12;
		wInt = i;
		double d;
		d = 12.321;
		wDouble = d;
		float f;
		f = 23.28f;
		wFloat = f;
		long l;
		l = 217864873872324324L;
		wLong = l;
	}

	public static void main(String[] args) {
		NewSample11_1 demo;
		demo = new NewSample11_1();
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
