package ch19;

public class Sample19_5 {
	// �õ�һ��1��100֮�������
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

		// ��С������в�������m=1��ʾ��ʼ����Ϊ��һ��Ԫ��
		for (m = 1; m < size; m++) {
			int tmp = array[m];
			n = m;
			/*
			 * �ж����������б��±�Ϊn-1��Ԫ��С��ֵ�����n-1��ֵ��tmp�󣬾Ͱ��±�Ϊn-141 ��ֵ ���� �±�Ϊn��λ��
			 */
			while (n > 0 && array[n - 1] >= tmp) {
				array[n] = array[n - 1];
				--n;
			}
			array[n] = tmp;
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

		// �Ӵ�С���в�������
		for (m = 1; m < anotherSize; m++) {
			int tmp = anotherArray[m];
			n = m;
			/*
			 * �ж����������б��±�Ϊn-1��Ԫ�ش��ֵ�����n-1��ֵ��tmpС���Ͱ��±�Ϊn-1 ��ֵ ���� �±�Ϊn��λ��
			 */
			while (n > 0 && anotherArray[n - 1] <= tmp) {
				anotherArray[n] = anotherArray[n - 1];
				--n;
			}
			anotherArray[n] = tmp;
		}
		System.out.println("�Ӵ�С�������������");
		for (int i = 0; i < 10; i++) {
			System.out.print(anotherArray[i] + " ");
		}
	}
}
