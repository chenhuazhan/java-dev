package ch19;

public class Sample19_5 {
	// 得到一个1到100之间的整数
	public static int getRandom() {
		int random = (int) (Math.random() * 100);
		return random;
	}

	public static void main(String[] args) {
		int size = 10;
		int anotherSize = 10;
		int m, n;
		int[] array = new int[size];
		int[] anotherArray = new int[anotherSize];

		// 数组元素里的值为1~100之间的随机整数
		for (int i = 0; i < 10; i++) {
			array[i] = getRandom();
		}
		for (int i = 0; i < 10; i++) {
			anotherArray[i] = getRandom();
		}

		System.out.println("排序前数组各个元素依次为：");
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// 从小到大进行插入排序，m=1表示初始序列为第一个元素
		for (m = 1; m < size; m++) {
			int tmp = array[m];
			n = m;
			/*
			 * 判断有序序列中比下标为n-1的元素小的值。如果n-1的值比tmp大，就把下标为n-141 的值 放在 下标为n的位置
			 */
			while (n > 0 && array[n - 1] >= tmp) {
				array[n] = array[n - 1];
				--n;
			}
			array[n] = tmp;
		}

		System.out.println("从小到大对数组进行排序：");
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("排序前数组各个元素依次为：");
		for (int i = 0; i < 10; i++) {
			System.out.print(anotherArray[i] + " ");
		}
		System.out.println();

		// 从大到小进行插入排序
		for (m = 1; m < anotherSize; m++) {
			int tmp = anotherArray[m];
			n = m;
			/*
			 * 判断有序序列中比下标为n-1的元素大的值。如果n-1的值比tmp小，就把下标为n-1 的值 放在 下标为n的位置
			 */
			while (n > 0 && anotherArray[n - 1] <= tmp) {
				anotherArray[n] = anotherArray[n - 1];
				--n;
			}
			anotherArray[n] = tmp;
		}
		System.out.println("从大到小对数组进行排序：");
		for (int i = 0; i < 10; i++) {
			System.out.print(anotherArray[i] + " ");
		}
	}
}
