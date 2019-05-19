package ch19;

public class Sample19_4 {
	// �õ�һ��1��100֮�������
	public static int getRandom() {
		int random = (int) (Math.random() * 100);
		return random;
	}

	/**
	 * ��������������Ԫ�ص�λ��
	 * 
	 * @param array
	 *            ��ʾһ������
	 * @param pos
	 *            һ������Ԫ�ص��±�
	 * @param anothePos
	 *            ��һ������Ԫ�ص��±�
	 */
	public static void swapData(int[] array, int pos, int anothePos) {
		int temp = array[pos];
		array[pos] = array[anothePos];
		array[anothePos] = temp;
	}

	// ���������ָ���±귶Χ�����ֵ���±�
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

	// ���������ָ���±귶Χ����Сֵ���±�
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
		// ����Ԫ�ص�ֵΪ1~100֮����������
		for (int i = 0; i < 10; i++) {
			array[i] = getRandom();
		}
		for (int i = 0; i < 10; i++) {
			anotherArray[i] = getRandom();
		}

		System.out.println("����ǰ�������Ԫ������Ϊ��");
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// ��С�������ѡ������
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				// �õ��������±귶ΧΪj��i��Ԫ�ص����ֵ
				int k = getMax(array, j, i);
				// �õ������ֵ���±�Ϊi��Ԫ�ؽ���λ��
				swapData(array, i, k);
			}
		}

		System.out.println("��С����������������");
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println("����ǰ�������Ԫ������Ϊ��");
		for (int i = 0; i < 10; i++) {
			System.out.print(anotherArray[i] + " ");
		}
		System.out.println();

		// �Ӵ�С����ѡ������
		for (int i = anotherSize - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				// �õ��������±귶ΧΪj��i��Ԫ�ص���Сֵ
				int k = getMin(anotherArray, j, i);
				// �õ�����Сֵ���±�Ϊi��Ԫ�ؽ���λ��
				swapData(anotherArray, i, k);
			}
		}

		System.out.println("�Ӵ�С�������������");
		for (int i = 0; i < 10; i++) {
			System.out.print(anotherArray[i] + " ");
		}
	}
}
