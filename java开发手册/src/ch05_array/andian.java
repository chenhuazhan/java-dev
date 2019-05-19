package ch05_array;
//鞍点：所在行最大，所在列最小，不一定存在
public class andian {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, // 声明并初始化
				{ 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 1, 2, 2, 3 } };
		// max记录每行最大值所在列的位置，n记录鞍点的个数
		int i, j, t, max, flag, n = 0;
		for (i = 0; i < 4; i++) {
			t = a[i][0];
			max = 0; // 假设每行第一个值是该行最大的值，并赋值至t
			// 找出该行（第i行）最大值，并记录该值所在列的位置
			for (j = 1; j < 4; j++) { // 使用循环查找第i行的最大值
				if (a[i][j] > t) {
					t = a[i][j];
					max = j; // 记录第i行最大的值的列j至max
				}
			}
			t = a[i][max]; // 使用t记录下该值
			// 假设（i,max）位置的元素就是鞍点，验证该点在max列是否最小
			flag = 1;
			for (j = 0; j < 4; j++) { // 使用循环比较t是否为该列的最小值
				if (a[j][max] < t) { // 如果有值小于t，则说明该点不是鞍点
					flag = 0;
					break;
				}
			}
			if (flag == 1) // flag等于1，表示该位置的元素为鞍点
			{
				System.out.println("鞍点是：（" + i + "." + max + "），值是：" + a[i][max]);
				n++;
			}
		}
		if (n == 0) // 没有鞍点
			System.out.println("没有鞍点！");
	}

}
