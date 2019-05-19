package ch29;

import java.io.*;

public class Sample29_4 {
	public static void main(String[] args) {
		try {
			byte[] buffer = new byte[1024];
			// ��Դ�ļ�
			FileInputStream fileInputStream = new FileInputStream(new File(args[0]));
			// Ŀ���ļ�
			FileOutputStream fileOutputStream = new FileOutputStream(new File(args[1]));
			// available()��ȡ��δ��ȡ�����ݳ���
			System.out.println("�����ļ���" + fileInputStream.available() + "�ֽ�");
			while (true) {
				if (fileInputStream.available() < 1024) {
					// ʣ������ݱ�1024�ֽ���
					// һλһλ������д��Ŀ���ļ�
					int remain = -1;
					while ((remain = fileInputStream.read()) != -1) {
						fileOutputStream.write(remain);
					}
					break; // ��ֹѭ��
				} else {
					// ����Դ�ļ���ȡ������������
					fileInputStream.read(buffer);
					// ����������д��Ŀ���ļ�
					fileOutputStream.write(buffer);
				}
			}
			// �ر���
			fileInputStream.close();
			fileOutputStream.close();
			System.out.println("�������");
		} catch (ArrayIndexOutOfBoundsException e) { // ����ArrayIndexOutOfBoundsException�쳣
			e.printStackTrace(); // ���������Ϣ
		} catch (IOException e) { // ����IOException�쳣
			e.printStackTrace(); // ���������Ϣ
		}
	}
}
