package ch11;
//������������ת�����ַ���

public class Sample11_3 {
	public static void main(String[] args) {
		String s;
		boolean b;
		b = true;
		s = String.valueOf(b);
		System.out.println("booleanת��ΪString��" + s);
		char c;
		c = 'A';
		s = String.valueOf(c);
		System.out.println("charת��ΪString��" + s);
		char[] cs;
		cs = new char[] { 'A', 'b', 'E', 'H' };
		s = String.valueOf(cs);
		System.out.println("char[]ת��ΪString��" + s);
		s = String.valueOf(cs, 1, 2);
		System.out.println("char[]ת��ΪString��" + s);
		double d;
		d = -43.325;
		s = String.valueOf(d);
		System.out.println("doubleת��ΪString��" + s);
		float f;
		f = 23.4f;
		s = String.valueOf(f);
		System.out.println("floatת��ΪString��" + s);
		int i;
		i = -32443;
		s = String.valueOf(i);
		System.out.println("intת��ΪString��" + s);
		long l;
		l = 3274862428322323332L;
		s = String.valueOf(l);
		System.out.println("longת��ΪString��" + s);
	}
}
