package ch13;

//����ʵ��
public class Sample13_06 {
	public static void main(String args[]) {
		// �����ַ�������s1��s2
		String s1 = "JavaSE6.0";
		String s2 = "���ļ�����ȫ";
		// ���ַ���s1��s2�����Ӳ����������s2
		s2 = s1.concat(s2);
		// ��ӡ�ַ���s1��s2
		System.out.println("���ַ���s1���������ַ����������ַ���s1��s2�Ľ��Ϊ��");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}
}
