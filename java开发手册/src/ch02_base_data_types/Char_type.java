package ch02_base_data_types;

public class Char_type  {
/*
 * java�ַ�����Unicode���룬ÿ���ַ�ռ�����ֽڣ�java���char�ı�ʾ��ΧΪ0~65536
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1,c2;
		c1=66;
		c2='z';
		System.out.print("���c1��c2��");
		System.out.println(c1+" "+c2);
		
		c1++;    //�������㣬��ʾ��c1+1
		System.out.println((int)c1);
		System.out.println(c1);
	}

}
