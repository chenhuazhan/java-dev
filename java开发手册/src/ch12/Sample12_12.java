package ch12;
//�쳣���������׳�

import java.io.*;
import java.net.*;

public class Sample12_12 {
	// ��������myFunction���п����׳�IOException�쳣
	public static void myFunction() throws IOException {
		// ����ServerSocket����
		ServerSocket ss = new ServerSocket(9999);
	}

	public static void main(String[] args) {
		// �ܼ��ӵĴ���
		try {
			// ����myFunction����
			myFunction();
		}
		// �쳣�������
		catch (IOException e) {
			// ��ӡ����ջ��Ϣ
			e.printStackTrace();
		}
		System.out.println("��ϲ�㣬�����������н���������");
	}
}
