package ch12;

public class Sample12_3 {
	public static void main(String[] args) {
		// �ܼ��ӵĴ����
		try { // ��������Ϊ4��int������
			int[] a = new int[4];
			System.out.println("�������鴴����ϣ���");
			// Ϊ�������һ��Ԫ�ظ�ֵ
			a[3] = 9;
			System.out.println("���������е��ĸ�Ԫ�ص���ֵΪ" + a[3]);
		}
		// ����������쳣�����
		catch (NullPointerException npe) {
			// ��ӡ��ʾ��Ϣ
			System.out.println("������ֵĴ��������ǣ������ã���");
		}
		// finally��
		finally {
			// ��ӡ��ʾ��Ϣ
			System.out.println("������finally�飬�����Ƿ��׳��쳣����������ִ�У�");
		}
	}
}
