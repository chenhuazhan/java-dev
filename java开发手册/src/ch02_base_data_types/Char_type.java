package ch02_base_data_types;

public class Char_type  {
/*
 * java字符采用Unicode编码，每个字符占两个字节，java里的char的表示范围为0~65536
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1,c2;
		c1=66;
		c2='z';
		System.out.print("输出c1和c2：");
		System.out.println(c1+" "+c2);
		
		c1++;    //自增运算，表示把c1+1
		System.out.println((int)c1);
		System.out.println(c1);
	}

}
