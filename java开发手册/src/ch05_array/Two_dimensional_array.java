package ch05_array;

public class Two_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 声明
		 * 类型       数组名[][]
		 * 类型[][]   数组名
		 * 类型[]   数组名[]
		 */
		int[][] a;
		/*
		 * 分配内存
		 */
		int b[][]=new int[2][3];// 直接分配
		int c[][]=new int[2][];//从高维分配
		c[0]=new int[2];
		c[1]=new int[3];//低维长度可不相同
		/*
		 * 初始化
		 */
		int[][] d={{1,2,3},{3,4,5}};
		a=b;
		b=a;
		c=d;
	}

}
