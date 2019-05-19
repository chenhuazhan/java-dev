package ch11;
//基本数据类型转换成字符串

public class Sample11_3 {
	public static void main(String[] args) {
		String s;
		boolean b;
		b = true;
		s = String.valueOf(b);
		System.out.println("boolean转换为String：" + s);
		char c;
		c = 'A';
		s = String.valueOf(c);
		System.out.println("char转换为String：" + s);
		char[] cs;
		cs = new char[] { 'A', 'b', 'E', 'H' };
		s = String.valueOf(cs);
		System.out.println("char[]转换为String：" + s);
		s = String.valueOf(cs, 1, 2);
		System.out.println("char[]转换为String：" + s);
		double d;
		d = -43.325;
		s = String.valueOf(d);
		System.out.println("double转换为String：" + s);
		float f;
		f = 23.4f;
		s = String.valueOf(f);
		System.out.println("float转换为String：" + s);
		int i;
		i = -32443;
		s = String.valueOf(i);
		System.out.println("int转换为String：" + s);
		long l;
		l = 3274862428322323332L;
		s = String.valueOf(l);
		System.out.println("long转换为String：" + s);
	}
}
