package ch12;
//������д���෽��Ҫע���쳣���ܱȱ���д������Χ��
import java.io.*;

class Father1 {
	// ���෽����û���׳��쳣
	public void myFunction() throws Exception{
		System.out.println("�����Ǹ��෽�����÷����׳�Exception�쳣����");
	}
}

class Son extends Father1 {
	// ������д���෽�����в����쳣�׳�
	public void myFunction() throws InterruptedException {
		System.out.println("���������෽�����÷����׳�InterruptedException�쳣����");
	}
}

public class Sample12_13 {
	public static void main(String[] args) {
		// �����������
		Son s = new Son();
		// �ܼ��ӵĴ���
		try {
			s.myFunction();
		}
		// �쳣�������
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
