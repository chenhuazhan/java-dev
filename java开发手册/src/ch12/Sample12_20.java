package ch12;

public class Sample12_20 {
	public static void main(String[] args) {
		// ����myFunction����
		myFunction(-12);
	}

	private static void myFunction(int i) {
		// ʹ�ö��ԶԳ����߼������ж�
		assert (i >= 0) : " ����ʧ�ܣ���ֵiС��0����ֵΪi=" + i;
		System.out.println("��ϲ�㣬�����жϳɹ�����������������У���");
	}
}
