package ch11;
//��̬��������
public class Sample11_4 {
	public static void main(String[] args) {
		Integer wInt; // ��װ��������ñ�����
		int i;
		i = 10; // ���ͱ���i��
		int radix;
		radix = 2; // ���ͱ������������ơ�
		String s;
		s = "1001011"; // �ַ���������
		wInt = Integer.valueOf(i); // ͨ�����ͱ������ɶ���
		System.out.println("int: " + i + " ;Integer: " + wInt);
		wInt = Integer.valueOf(s); // ͨ���ַ����������ɶ���
		System.out.println("String: " + s + " ;Integer(10����): " + wInt);
		wInt = Integer.valueOf(s, radix); // ͨ���ַ����ͽ����������ɶ���
		System.out.println("String: " + s + " ;Integer(2����): " + wInt);
		Boolean wBoolean; // ��װ��������ñ�����
		boolean b;
		b = true;
		s = "false";
		wBoolean = Boolean.valueOf(b); // ͨ��boolean�ͱ������ɶ���
		System.out.println("boolean: " + b + " ;Boolean��" + wBoolean);
		wBoolean = Boolean.valueOf(s); // ͨ���ַ������ɶ���
		System.out.println("String: " + s + " ;Boolean��" + wBoolean);
	}
}
