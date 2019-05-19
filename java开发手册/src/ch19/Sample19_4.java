package ch19;

public class Sample19_4 {
	// 得到一个1到100之间的整数
	public static int getRandom() {
		int random = (int) (Math.random() * 100);
		return random;
	}

	/**
	 * 交换数组里两个元素的位置
	 * 
	 * @param array
	 *            表示一个数组
	 * @param pos
	 *            一个数组元素的下标
	 * @param anothePos
	 *            另一个数组元素的下标
	 */
	public static void swapData(int[] array, int pos, int anothePos) {
		int temp = array[pos];
		array[pos] = array[anothePos];
		array[anothePos] = temp;
	}

	// 获得数组里指定下标范围内最大值的下标
	public static int getMax(int[] array, int pos, int anotherPos) {
		int temp = array[pos];
		int maxPos = pos;
		for (int i = pos; i <= anotherPos; i++) {
			if (array[i] > temp) {
				temp = array[i];
				maxPos = i;
			}
		}
		return maxPos;
	}

	// 获得数组里指定下标范围内最小值的下标
	public static int getMin(int[] array, int pos, int anotherPos) {
		int temp = array[pos];
		int minPos = pos;
		for (int i = pos; i <= anotherPos; i++) {
			if (array[i] < temp) {
				temp = array[i];
				minPos = i;
			}
		}
		return minPos;
	}

	public static void main(String[] args) {
		int size = 10;
		int anotherSize = 10;
		int[] array = new int[size];
		int[] anotherArray = new int[size];
		// 数组元素的值为1~100之间的随机整数
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

		// 从小到大进行选择排序
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				// 得到数组中下标范围为j到i中元素的最大值
				int k = getMax(array, j, i);
				// 得到的最大值与下标为i的元素交换位置
				swapData(array, i, k);
			}
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

		// 从大到小进行选择排序
		for (int i = anotherSize - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				// 得到数组中下标范围为j到i中元素的最小值
				int k = getMin(anotherArray, j, i);
				// 得到的最小值与下标为i的元素交换位置
				swapData(anotherArray, i, k);
			}
		}

		System.out.println("从大到小对数组进行排序：");
		for (int i = 0; i < 10; i++) {
			System.out.print(anotherArray[i] + " ");
		}
	}
}
