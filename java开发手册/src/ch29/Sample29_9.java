package ch29;

import java.io.*;

public class Sample29_9 {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("Sample29_9.java"); // ����������ʼ��FileReader����fileReader
			FileWriter fileWriter = new FileWriter("Sample29_9.bak"); // ����������ʼ��FileWriter����fileWriter
			int in = 0;
			char[] wlnChar = { '\r', '\n' }; // ����������ʼ���ַ�����wlnChar
			while ((in = fileReader.read()) != -1) {
				if (in == '\n') {
					// д��"\r\n"
					fileWriter.write(wlnChar); // fileWriterд����
				} else
					fileWriter.write(in); // д����
			}
			fileReader.close(); // �ر�fileReader
			fileWriter.close(); // �ر�fileWriter
		} catch (Exception e) { // �����쳣
			e.printStackTrace(); // �쳣��Ϣ���
		}
	}
}
