package ch12;

public class Sample12_18 {
	public static void main(String[] args) {
		// �ܼ��ӵĴ���
		try {
			// �����������
			int[] a = new int[4];
			// ����Χ��������Ԫ��
			a[4] = 9;
		}
		// �쳣�������
		catch (Exception e) {
			System.out.println("�쳣���༰��ϢΪ����" + e.toString() + "����");
		}
	}
}
