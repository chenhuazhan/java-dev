package ch12;

//�쳣�����׳�
public class Sample12_9 {
	public static void main(String[] args) {
		// ���÷���a
		a();
		System.out.println("��ϲ�㣬���÷����ɹ�������������������");
	}

	static void a() {
		// �ܼ��ӵĴ���
		try {
			// ���÷���b
			b();
		}
		// �쳣�������
		catch (RuntimeException re) {
			// ��ӡ��ʾ��Ϣ
			System.out.println("�쳣��a�����������������");
		}
	}

	static void b() {
		// ���÷���c
		c();
	}

	static void c() {
		int[] a = new int[3];
		// �����±�Խ���쳣
		a[4] = 12;
	}
}
