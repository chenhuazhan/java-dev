package ch13;

import java.util.regex.*;

public class Sample13_14 {
	public static void main(String[] args) {
		// �������ַ�����ʾ��������ʽ�Լ���ƥ����ַ���
		String patternStr = "\\b\\d*\\.\\d{3,}\\b";
		String s1 = "123.5 123.56 123.5678 123.5600 123.0098";
		// ��ӡ��ƥ���ַ����ĳ�ʼ����
		System.out.print("��ʼ�ַ�������Ϊ��");
		System.out.println(s1);
		// ����replaceAllȫ��ƥ���滻����
		String s2 = s1.replaceAll(patternStr, "Error");
		// ��ӡreplaceAllȫ��ƥ���滻������Ľ��
		System.out.print("ʹ��replaceAll�������ƥ���滻��");
		System.out.println(s2);
		// ����replaceFirst��һ��ƥ���滻����
		s2 = s1.replaceFirst(patternStr, "Error");
		// ��ӡreplaceFirst��һ��ƥ���滻������Ľ��
		System.out.print("ʹ��replaceFirst�������ƥ���滻��");
		System.out.println(s2);
	}
}
