package ch06_object_and_class;

public class Sample6_2 {
	
	boolean a;
	byte b;
	short c;
	int d;
	long e;
	float f;
	double g;
	char h;
	String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample6_2 ref=new Sample6_2();
		System.out.println("各成员变量默认初始值为:"+ref.a+" "+ref.b+" "+ref.c+" "+ref.d+" "+
		    ref.e+" "+ref.f+" "+ref.g+" "+ref.h+" "+ref.s);
		System.out.println(ref.s=="");//字符串引用为空不等于字符串为空

	}

}
