package ch05_array;

public class Two_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����
		 * ����       ������[][]
		 * ����[][]   ������
		 * ����[]   ������[]
		 */
		int[][] a;
		/*
		 * �����ڴ�
		 */
		int b[][]=new int[2][3];// ֱ�ӷ���
		int c[][]=new int[2][];//�Ӹ�ά����
		c[0]=new int[2];
		c[1]=new int[3];//��ά���ȿɲ���ͬ
		/*
		 * ��ʼ��
		 */
		int[][] d={{1,2,3},{3,4,5}};
		a=b;
		b=a;
		c=d;
	}

}
