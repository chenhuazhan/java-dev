package ch13;

import java.util.regex.*;

public class Sample13_15 {
	public static void main(String[] args) {
		// �������ַ�����ʾ��������ʽ�Լ���ƥ����ַ���
		String patternStr = ";|,";
		String str = "Tom;Lucy,Jerry;";
		// ��ӡ���и��ַ����ĳ�ʼ����
		System.out.print("���и��ַ����ĳ�ʼ����Ϊ��");
		System.out.println(str);
		// ���ַ����и�Ĭ�Ϸ�
		System.out.print("���ַ����и�Ĭ�Ϸݣ����Ϊ��");
		String[] arrStr = str.split(patternStr);
		// ��ӡ�и��Ľ��
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		// ���ַ�����3��
		System.out.print("\n���ַ�����3�ݣ����Ϊ��");
		arrStr = str.split(patternStr, 3);
		// ��ӡ�и��Ľ��
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		// ���ַ�����-2��
		System.out.print("\n���ַ�����-2�ݣ����Ϊ��");
		arrStr = str.split(patternStr, -2);
		// ��ӡ�и��Ľ��
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		// ���ַ�����0��
		System.out.print("\n���ַ�����0�ݣ����Ϊ��");
		arrStr = str.split(patternStr, 0);
		// ��ӡ�и��Ľ��
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		System.out.print("\n");
	}
}
