package ch19;

public class Sample19_3 {
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

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];
		int[] anotherArray = new int[size];

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

		// 进行冒泡排序
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				// 如果某个元素的值比其后面元素的值大，交换两者的位置
				if (array[j] > array[j + 1]) {
					swapData(array, j, j + 1);
				}
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

		// 进行冒泡排序
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				// 如果某个元素的值比其后面元素的小，则交换两者的位置
				if (anotherArray[j] < anotherArray[j + 1]) {
					swapData(anotherArray, j, j + 1);
				}
			}
		}
		System.out.println("从大到小对数组进行排序：");
		for (int i = 0; i < 10; i++) {
			System.out.print(anotherArray[i] + " ");
		}
	}
}
