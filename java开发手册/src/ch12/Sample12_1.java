package ch12;

public class Sample12_1 {
	public static void main(String[] args) {
		// �����ӵĴ����
		try {
			// �����������
			int[] a = new int[4];
			System.out.println("�������鴴����ϣ���");
			// ��������Ԫ��
			a[3] = 9;
			System.out.println("���������е��ĸ�Ԫ�ص���ֵΪ" + a[3] + "!!!");
		}
		// �����±�Խ���쳣
		catch (ArrayIndexOutOfBoundsException aiobe) {
			// ��ӡ��ʾ��Ϣ
			System.out.println("������ֵĴ��������ǣ������±�Խ�磡��");
		}
		// ����������쳣
		catch (NullPointerException npe) {
			// ��ӡ��ʾ��Ϣ
			System.out.println("������ֵĴ��������ǣ������ã���");
		}
		System.out.println("��������������������");
	}
}
