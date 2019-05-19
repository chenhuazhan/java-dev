package ch29;

import java.io.*;

public class Sample29_8 {
	public static void main(String[] args) {
		try {
			// ����������ʼ��FileInputStream ����fileInputStream
			FileInputStream fileInputStream = new FileInputStream("Sample29_8.java");
			// ΪFileInputStream�����ַ�������
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			// ����������ʼ��FileOutputStream����fileOutputStream
			FileOutputStream fileOutputStream = new FileOutputStream("Sample29_8.bak");
			// ΪFileOutputStream�����ַ�������
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			int ch = 0;
			// ���ַ���ʽ��ʾ�ļ�����
			while ((ch = inputStreamReader.read()) != -1) {
				System.out.print((char) ch); // ����ַ�
				outputStreamWriter.write(ch); // д���ַ�
			}
			System.out.println(); // ������з�
			inputStreamReader.close(); // �ر�inputStreamReader
			outputStreamWriter.close(); // �ر�outputStreamWriter
		} catch (Exception e) { // �����쳣
			e.printStackTrace(); // �쳣��Ϣ���
		}
	}
}
