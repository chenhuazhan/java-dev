package ch29;

import java.io.*;

public class Sample29_5 {
	public static void main(String[] args) {
		try {
			byte[] data = new byte[1]; // ����byte��������
			File srcFile = new File(args[0]); // ����������ʼ��File����srcFile
			File desFile = new File(args[1]); // ����������ʼ��File����desFile
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile)); // ��������ʼ��BufferedInputStream����
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desFile)); // ��������ʼ��BufferedOutputStream����
			System.out.println("�����ļ���" + srcFile.length() + "�ֽ�"); // ����ļ�����
			while (bufferedInputStream.read(data) != -1) // ѭ����ȡ����
			{
				bufferedOutputStream.write(data); // ѭ��д������
			}
			bufferedOutputStream.flush(); // ���������е�����ȫ��д��
			bufferedInputStream.close(); // �ر�����������
			bufferedOutputStream.close(); // �ر����������
			System.out.println("�������"); // ����ַ�����Ϣ
		} catch (Exception e) { // �����쳣
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}
}
