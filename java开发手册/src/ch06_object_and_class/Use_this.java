package ch06_object_and_class;

public class Use_this {
	// �����˳�Ա����i����ʼֵΪ500
	int i = 500;

	void showI() {
		// �����˾ֲ�����i����ʼֵΪ300
		int i = 300;
		System.out.println("The value of i is " + i + ".");
	}

	public static void main(String[] args) {
		// �������󲢵��÷���
		new Use_this().showI();
	}

}
