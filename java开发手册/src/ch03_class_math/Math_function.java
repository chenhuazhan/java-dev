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
		System.out.println(Math.ceil(8.1));//返回大于等于操作数的double型最近整数值,向上取整
		System.out.println(Math.floor(9.9));//返回小于等于操作数的double型最近整数值,向下取整
		System.out.println(Math.round(9.5)+" "+Math.round(-9.5));//四舍五入
		System.out.println(Math.max(1,2));
		System.out.println(Math.min(1,2));
		System.out.println(Math.random());//0.0<=返回结果<1.0
		//sin(),cos(),tan(),sqrt(),toDegrees()···
		

	}

}

