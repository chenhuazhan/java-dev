package ch13;
//��������ʹ��

class MyClass {
	// ����a������MyClass����
	public MyClass a() {
		System.out.println("��ϲ�㣬�ɹ�ʹ���˷����������ڵ��õ��˷���a");
		return this;
	}

	// ����b������MyClass����
	public MyClass b() {
		System.out.println("��ϲ�㣬�ɹ�ʹ���˷����������ڵ��õ��˷���b");
		return this;
	}

	// ����cʲôҲ������
	public void c() {
		System.out.println("��ϲ�㣬�ɹ�ʹ���˷����������ڵ��õ��˷���c");
	}
}

public class Sample13_09 {
	public static void main(String[] args) {
		// ��������
		MyClass mc = new MyClass();
		// ���÷�����
		mc.a().b().c();
	}
}
