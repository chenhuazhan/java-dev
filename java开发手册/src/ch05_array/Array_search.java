package ch05_array;

import java.util.Arrays;

public class Array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 顺序查找

		// 二分查找
		// 声明并初始化数组a
		int a[] = { 1, 3, 5, 6, 7, 8, 9, 23, 34, 45, 46, 67 };
		int index = -1, left = 0, mid = -1, right; // left为数组起始位置下标
		right = a.length; // right为数组终点位置下标
		int num = 46;
		while (left <= right) { // 如果左右下标重叠，则循环结束
			mid = (left + right) / 2; // 中点元素的下标
			if (a[mid] == num) { // 若中点元素等于待查值，则跳出
				index = mid;
				break;
			} else if (a[mid] < num) // 如果比待查值小，则到中点元素左边的元素中去16 找
				left = mid + 1;
			else if (a[mid] > num) // 如果比待查值大，则到中点元素右边的元素中去19 找
				right = mid - 1;
		}
		if (index == -1)
			System.out.println("数字" + num + "不在数组中！");
		else
			System.out.println("数字" + num + "在数组中的位置是：" + index);

		//Array类的binarySearch方法（实际上就是二分查找）
		int b[] = { 1, 3, 5, 8, 10 };
		System.out.println(Arrays.binarySearch(b, 3));
		System.out.println(Arrays.binarySearch(b, 4));
		System.out.println(-(Arrays.binarySearch(b, 4) + 1));

	}

}
