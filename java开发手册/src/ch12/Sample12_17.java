package ch12;

//�����Զ����쳣��
class MyExceptionToHighLevel extends Exception {
	// ����MyExceptionToHighLevel�������������
	public MyExceptionToHighLevel() {
	}

	public MyExceptionToHighLevel(String msg) {
		super(msg);
	}
}

class MyExceptionFromLowLevel extends Exception {
	// ����MyExceptionFromLowLevel�������������
	public MyExceptionFromLowLevel() {
	}

	public MyExceptionFromLowLevel(String msg) {
		super(msg);
	}
}

// ִ��ҵ�����
class MyClass {
	public void doLowLevelStaff(int a) throws MyExceptionFromLowLevel {
		// ִ���ж�
		if (a > 50) {// �������
			System.out.println("��ϲ�㣬�Ͳ㷽��ִ�гɹ�������");
		} else {// ������������׳��쳣
			System.out.println("�Ͳ㷢���¹ʣ��ϱ�������");
			throw new MyExceptionFromLowLevel("ֵ������50�������¹ʣ�����");
		}
	}

	// ����doMiddleLevelStaff�������׳�MyExceptionToHighLevel�쳣
	public void doMiddleLevelStaff() throws MyExceptionToHighLevel {
		// �ܼ��ӵĴ���
		try {
			int value = (int) Math.round(Math.random() * 100);
			System.out.println("����ֵΪ��" + value + "��");
			this.doLowLevelStaff(value);
		}
		// �쳣�������
		catch (MyExceptionFromLowLevel e) {
			System.out.println("�����¹ʣ��в��Ƚ���һЩ����Ȼ���ϱ����ϲ㣡����");
			// �ٴ��׳��쳣
			throw new MyExceptionToHighLevel("���¹ʷ��������ϲ㴦������");
		}
	}

	// ����doHighLevelStaff����
	public void doHighLevelStaff() {
		// �ܼ��ӵĴ���
		try {
			this.doMiddleLevelStaff();
		}
		// �쳣�������
		catch (MyExceptionToHighLevel e) {
			System.out.println("�ϲ����մ����¹ʣ�����");
		}
	}
}

public class Sample12_17 {
	public static void main(String[] args) {
		// ����MyClass����
		MyClass mc = new MyClass();
		// ����doHighLevelStaff����
		mc.doHighLevelStaff();
	}
}
