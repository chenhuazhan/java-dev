package ch13;

public class Sample13_10 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java6.0");
		System.out.println("����֮ǰ����sb1������Ϊ��" + sb1);
		// ��sb1����һϵ�в���
		sb1.append("���ļ�����ȫ").insert(4, "SE").delete(9, 15).reverse();
		System.out.println("һϵ�в���֮�����sb1������Ϊ��" + sb1);
		// ����������sb1��ͬ��StringBuffer����sb2
		StringBuffer sb2 = new StringBuffer(sb1.toString());
		// ʹ��StringBuffer��equals��������
		System.out.println("====ʹ��StringBuffer��equals�������Զ���sb1��sb2������====");
		if (sb1.equals(sb2)) {
			System.out.println("����sb1��sb2��������ͬ������");
		} else {
			System.out.println("����sb1��sb2�����ݲ���ͬ������");
		}
		// ʹ��toString������ʹ��equals��������
		System.out.println("====ʹ��toString������ʹ��equals�������Զ���sb1��sb2������====");
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if (s1.equals(s2)) {
			System.out.println("����sb1��sb2��������ͬ����");
		} else {
			System.out.println("����sb1��sb2�����ݲ���ͬ����");
		}
	}
}
