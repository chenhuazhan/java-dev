package ch05_array;

import java.util.Arrays;

public class Array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ˳�����

		// ���ֲ���
		// ��������ʼ������a
		int a[] = { 1, 3, 5, 6, 7, 8, 9, 23, 34, 45, 46, 67 };
		int index = -1, left = 0, mid = -1, right; // leftΪ������ʼλ���±�
		right = a.length; // rightΪ�����յ�λ���±�
		int num = 46;
		while (left <= right) { // ��������±��ص�����ѭ������
			mid = (left + right) / 2; // �е�Ԫ�ص��±�
			if (a[mid] == num) { // ���е�Ԫ�ص��ڴ���ֵ��������
				index = mid;
				break;
			} else if (a[mid] < num) // ����ȴ���ֵС�����е�Ԫ����ߵ�Ԫ����ȥ16 ��
				left = mid + 1;
			else if (a[mid] > num) // ����ȴ���ֵ�����е�Ԫ���ұߵ�Ԫ����ȥ19 ��
				right = mid - 1;
		}
		if (index == -1)
			System.out.println("����" + num + "���������У�");
		else
			System.out.println("����" + num + "�������е�λ���ǣ�" + index);

		//Array���binarySearch������ʵ���Ͼ��Ƕ��ֲ��ң�
		int b[] = { 1, 3, 5, 8, 10 };
		System.out.println(Arrays.binarySearch(b, 3));
		System.out.println(Arrays.binarySearch(b, 4));
		System.out.println(-(Arrays.binarySearch(b, 4) + 1));

	}

}
