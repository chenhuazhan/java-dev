package ch05_array;
import java.util.Arrays;

public class Array_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3};
		int b[]={1,2,3};
		int c[]=a;
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(a==b);
		System.out.println(a==c);
		c[1]=5;
		System.out.println(Arrays.equals(a, b));
		
	}

}
