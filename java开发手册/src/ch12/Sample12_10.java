package ch12;
//�쳣���������׳�
import java.net.*;
import java.io.*;

public class Sample12_10 {
	// ����connect�������п����׳�IOException�쳣
	public void connect() throws IOException {
		// �ܼ��ӵĴ���
		try {
			// ����ServerSocket����
			ServerSocket ss = new ServerSocket(9999);
		}
		// �쳣�������
		catch (IOException e) {
			// ���쳣�׳�
			throw e;
		}
	}
}
