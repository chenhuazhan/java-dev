package ch08_father_and_son;

/*
 * ���󷽷�ֻ�ܴ����ڳ������У��������еķ������Բ��ǳ���ģ����󷽷�û�з�����
 * ������ĵ�һ���ǳ����������ʵ���丸�����еĳ��󷽷�����������̳еĳ��󷽷�
 * 
 * abstract��final�����෴��Ŀ�ģ�����ͬʱ����ͬһ������
 * abstract��private�಻��ͬʱʹ��
 */
abstract class Car3 {
	private double price;
	private String brand;
	private int speed;

	public abstract void startUp(); // ���󷽷�������

	// ���󷽷�������private�ģ���Ϊ������Ҫ���̳вſ����ã������÷���
	// private abstract void show();
}

// ���������Audi��ʹ����̳���Car
abstract class Audi extends Car3 {
	// ������󷽷�turbo
	public abstract void turbo();
}

// ����ǳ�����Audi_A6�̳���Audi
class Audi_A6 extends Audi {
	// ʵ��startUp����
	public void startUp() {
		System.out.println("�����˰µ�A6���������ܣ�����");
	}

	// ʵ��turbo����
	public void turbo() {
		System.out.println("�����˰µ�A6�ļ��ٹ��ܣ�����");
	}
}

// ����ǳ�����Audi_A8�̳���Audi
class Audi_A8 extends Audi {
	// ʵ��startUp����
	public void startUp() {
		System.out.println("�����˰µ�A8���������ܣ�����");
	}

	// ʵ��turbo����
	public void turbo() {
		System.out.println("�����˰µ�A8�ļ��ٹ��ܣ�����");
	}
}

public class Abstract_and_extends {
	public static void main(String[] args) {
		Car3 c; // ��������
		// c=new Car3();//����ʵ����������

		// ����Audi_A6����ʹ��������a6ָ��ö���
		Audi_A6 a6 = new Audi_A6();
		// ����Audi_A6�����еķ���
		a6.startUp();
		a6.turbo();
		// ����Audi_A8����ʹ��������a8ָ��ö���
		Audi_A8 a8 = new Audi_A8();
		// ����Audi_A8�����еķ���
		a8.startUp();
		a8.turbo();
	}

}
