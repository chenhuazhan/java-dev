package ch12;

//�Զ����쳣��
class MyException extends Exception {
	// ���ְ汾�Ĺ�����
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}
}

// ����
public class Sample12_15 {
	public static void main(String[] args) {
		// �����Զ����쳣�����
		MyException me = new MyException("�Զ����쳣��");
		// ���ü̳еķ���
		System.out.println("�Զ����쳣������ַ�����ʾΪ����" + me.toString() + "����");
		System.out.println("�Զ����쳣����Я���ĳ�����ϢΪ����" + me.getMessage() + "����");
	}
}
