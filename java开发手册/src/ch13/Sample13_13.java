package ch13;

import java.util.regex.*;

public class Sample13_13 {
	public static void main(String[] args) {
		// �������ַ�����ʾ��������ʽ
		String patternStr = "\\d{4}-\\d{2}-\\d{2}";
		// ����������ƥ����ַ���
		String s1 = "9999-66-88";
		String s2 = "����Ϊ9999-66-88";
		// ���ַ���s1����ƥ����
		if (s1.matches(patternStr)) {
			// ƥ��ɹ������
			System.out.println("��ϲ�㣬�ַ���s1����ָ���ĸ�ʽҪ�󣡣���");
		} else {
			// ƥ��ʧ�ܵ����
			System.out.println("����ʧ�ܣ��ַ���s1������ָ���ĸ�ʽҪ�󣡣���");
		}
		// ���ַ���s2����ƥ����
		if (s2.matches(patternStr)) {
			// ƥ��ɹ������
			System.out.println("��ϲ�㣬�ַ���s2����ָ���ĸ�ʽҪ�󣡣���");
		} else {
			// ƥ��ʧ�ܵ����
			System.out.println("����ʧ�ܣ��ַ���s2������ָ���ĸ�ʽҪ�󣡣���");
		}
	}
}
