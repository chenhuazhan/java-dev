package ch29;

import java.io.*;

public class Sample29_10 {
	public static void main(String[] args) {
		try {
			// ����System.in�ַ�������
			BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
			// ����FileWriter�ַ������
			BufferedWriter bufWriter = new BufferedWriter(new FileWriter("Sample29_10.bak"));
			String input = null;
			// ÿ��һ�н���һ��д�붯��
			while (!(input = bufReader.readLine()).equals("quit")) {
				bufWriter.write(input);
				// д�������ϵͳ��Ӧ�Ļ��з�
				bufWriter.newLine();
			}
			bufReader.close(); // �ر�bufReader
			bufWriter.close(); // �ر�bufWriter
		} catch (Exception e) { // �����쳣
			e.printStackTrace(); // �쳣��Ϣ���
		}
	}
}
