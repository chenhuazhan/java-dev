package ch13;

//����ʵ��
public class Sample13_05 {
	public static void main(String args[]) {
		// ʹ�ü��﷨�����ַ�������s1
		String s1 = "JavaSE6.0";
		// ʹ�ù����������ַ�������s2
		String s2 = new String("JavaSE6.0");
		// ʹ��==�Ƚ��ַ�������s1��s2
		if (s1 == s2) {
			System.out.println("�ַ���s1���ַ���s2���õ���ͬһ�����󣡣���");
		} else {
			System.out.println("�ַ���s1���ַ���s2���õĲ���ͬһ�����󣡣���");
		}
		// �Ƚ��ַ���s1��s2���ַ�������������ϵ���Ƿ���ͬһ������
		if (s1.intern() == s2.intern()) {
			System.out.println("�ַ���s1���ַ���s2���ַ�������������ϵ����ͬһ�����󣡣���");
		} else {
			System.out.println("�ַ���s1���ַ���s2���ַ�������������ϵ�Ĳ���ͬһ�����󣡣���");
		}
	}
}
