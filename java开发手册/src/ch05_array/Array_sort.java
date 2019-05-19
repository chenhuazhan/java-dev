package ch05_array;

import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 冒泡排序
		int list[] = { 83, 33, 54, 25, 5, 35, 26, 74, 98, 102 };
		int i, j, x;
		for (i = list.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) { // 比较相邻两个数的大小
				if (list[i] < list[j]) // 如果前一个数比后一个数小，则交换顺序
				{
					x = list[i]; // 将list[i]中的值暂时赋值给临时变量x
					list[i] = list[j]; // 将list[j]中的值赋值给list[i]
					list[j] = x; // 将临时变量x的值赋值给list[j]元素
				}
			}
		}
		System.out.print("The sorted list is:"); // 输出列表中的值
		for (i = 0; i < list.length; i++) {
			System.out.print(" " + list[i]);
		}

		// 选择排序
		
		// 插入排序
		
		// 希尔排序
		
		// 快速排序
		
		//Array类的sort方法
		int a0[] = { 1, 3, 6, 5, 2 };
		Arrays.sort(a0);
		System.out.println();
		for (int i0 = 0; i0 < a0.length; i0++)
			System.out.print(a0[i0] + " ");
	}

}
