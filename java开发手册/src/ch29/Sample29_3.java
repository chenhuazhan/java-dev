package ch29;

import java.io.*;

public class Sample29_3 {
	public static void main(String[] args) {
		try {
			System.out.print("�������ַ�: "); // ����ַ���
			System.out.println("�����ַ�ʮ���Ʊ�ʾΪ: " + System.in.read()); // ��ȡ�������ݣ������
		} catch (IOException e) { // �����쳣
			e.printStackTrace(); // �����Ϣ
		}
	}
}
