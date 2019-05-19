package ch02_base_data_types;

public class Obiect_packaging_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=Byte.parseByte("12");
		short b=Short.parseShort("50");
		int c=Integer.parseInt("500");
		long d=Long.parseLong("1500");
		float e=Float.parseFloat("0.354");
		double f=Double.parseDouble("1.11");
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
		a=Byte.parseByte("1101", 2);
		b=Short.parseShort("1001",2);
		System.out.println(a+" "+b);
		

	}

}
