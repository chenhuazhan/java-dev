package ch19;

public class Sample19_3 {
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

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];
		int[] anotherArray = new int[size];

		// ����Ԫ�����ֵΪ1~100֮����������
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

		// ����ð������
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				// ���ĳ��Ԫ�ص�ֵ�������Ԫ�ص�ֵ�󣬽������ߵ�λ��
				if (array[j] > array[j + 1]) {
					swapData(array, j, j + 1);
				}
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

		// ����ð������
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				// ���ĳ��Ԫ�ص�ֵ�������Ԫ�ص�С���򽻻����ߵ�λ��
				if (anotherArray[j] < anotherArray[j + 1]) {
					swapData(anotherArray, j, j + 1);
				}
			}
		}
		System.out.println("�Ӵ�С�������������");
		for (int i = 0; i < 10; i++) {
			System.out.print(anotherArray[i] + " ");
		}
	}
}
