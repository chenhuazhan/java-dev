package ch05_array;

public class Array_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6};
		int[] b=new int[6];
		System.arraycopy(a, 2, b, 0, 3);
		b=a;
		a=new int[10];
	}

}
