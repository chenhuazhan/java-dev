package ch13;

public class Sample13_04 {
	public static void main(String args[]) {
		// ʹ�ü��﷨�����ַ���s1��s2
		String s1 = "JavaSE7.0";
		String s2 = "JavaSE7.0";
		// ʹ�ù����������ַ���s3
		String s3 = new String("JavaSE7.0");
		// ʹ��==�Ƚ��ַ���s1��s2
		if (s1 == s2) {
			System.out.println("�ַ���s1���ַ���s2ͨ�����ڲ��ԣ��������true");
		} else {
			System.out.println("�ַ���s1���ַ���s2û��ͨ�����ڲ��ԣ��������false");
		}
		// ʹ��==�Ƚ��ַ���s1��s3
		if (s1 == s3) {
			System.out.println("�ַ���s1���ַ���s3ͨ�����ڲ��ԣ��������true");
		} else {
			System.out.println("�ַ���s1���ַ���s3û��ͨ�����ڲ��ԣ��������false");
		}
		// ʹ��equals�����Ƚ��ַ���s1��s3
		if (s1.equals(s3)) {
			System.out.println("�ַ���s1���ַ���s3������ͬ���������true");
		} else {
			System.out.println("�ַ���s1���ַ���s3���ݲ�ͬ���������false");
		}
	}
}
