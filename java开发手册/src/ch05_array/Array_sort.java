package ch05_array;

import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ð������
		int list[] = { 83, 33, 54, 25, 5, 35, 26, 74, 98, 102 };
		int i, j, x;
		for (i = list.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) { // �Ƚ������������Ĵ�С
				if (list[i] < list[j]) // ���ǰһ�����Ⱥ�һ����С���򽻻�˳��
				{
					x = list[i]; // ��list[i]�е�ֵ��ʱ��ֵ����ʱ����x
					list[i] = list[j]; // ��list[j]�е�ֵ��ֵ��list[i]
					list[j] = x; // ����ʱ����x��ֵ��ֵ��list[j]Ԫ��
				}
			}
		}
		System.out.print("The sorted list is:"); // ����б��е�ֵ
		for (i = 0; i < list.length; i++) {
			System.out.print(" " + list[i]);
		}

		// ѡ������
		
		// ��������
		
		// ϣ������
		
		// ��������
		
		//Array���sort����
		int a0[] = { 1, 3, 6, 5, 2 };
		Arrays.sort(a0);
		System.out.println();
		for (int i0 = 0; i0 < a0.length; i0++)
			System.out.print(a0[i0] + " ");
	}

}
