package ch03_class_math;

public class Math_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		System.out.println(Math.E);
		int a=Math.abs(20);
		long b=Math.abs(-20L);
		float c=Math.abs(-50.0F);
		double d=Math.abs(50.0);
		System.out.println(a+" "+b+" "+c+" "+d);
		System.out.println(Math.ceil(8.1));//���ش��ڵ��ڲ�������double���������ֵ,����ȡ��
		System.out.println(Math.floor(9.9));//����С�ڵ��ڲ�������double���������ֵ,����ȡ��
		System.out.println(Math.round(9.5)+" "+Math.round(-9.5));//��������
		System.out.println(Math.max(1,2));
		System.out.println(Math.min(1,2));
		System.out.println(Math.random());//0.0<=���ؽ��<1.0
		//sin(),cos(),tan(),sqrt(),toDegrees()������
		

	}

}

