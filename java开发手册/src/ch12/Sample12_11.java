package ch12;

import java.io.*;

public class Sample12_11 {
	// ��������myFunction���׳�EOFException�쳣
	public void myFunction() throws EOFException {
		// ����IOException����
		//IOException e = new EOFException();
		EOFException e = new EOFException();
		// ���쳣�׳�
		throw e;
	}
}