package ch15;
/*
 * ���ⲿ��֮�������ڲ�������ʱ����Ҫ���ⲿ���������Ա�ʶ��Outter3.Inner i=o.new Inner();��
 * �����ڲ������ʱ��������Ҫ�����ⲿ��Ķ���Ȼ����ܴ����ڲ������
 * 
 * ���ڲ����п��Է����ⲿ����κγ�Ա�����ⲿ����Ҳ���Է����ڲ�����κγ�Ա
 * ���ⲿ���з����ڲ���Ǿ�̬��Աʱ����Ҫ�ȴ����ڲ�������ڲ��಻�����о�̬��Ա
 * 
 */


//�ⲿ��
class Outter1 {
	// �����ⲿ���˽�г�Ա����
	private int x = 100;

	// �����ڲ���
	class Inner {
		// �����ڲ��෽��show��������ӡ���
		public void show() {
			// ��ӡ���
			System.out.println("��ϲ�㣬�������ڲ���Ķ���" + "���ҵ������ڲ����еķ���������");
			// ��ӡ������������ⲿ���˽�г�Ա����
			System.out.println("�ⲿ��ĳ�Ա����x��ֵΪ��" + x + "������");
		}

		// �����ڲ��෽��show��������ӡ���
		private void show1() {
			System.out.println("��ϲ�㣬�ɹ��������ڲ����е�˽�з���������");
		}
	}

	// �ⲿ���еķ���
	public void createrInner() {
		// ���ⲿ���д����ڲ���Ķ���
		Inner i = new Inner();
		// �����ڲ����еķ���
		i.show();
	}

	// �����ⲿ��ķ���getInnerShow,�����ڲ���ķǾ�̬��Ա
	public void getInnerShow() {
		// �����ڲ������
		Inner i = new Inner();
		// �����ڲ�����˽�з���
		i.show1();
	}
}

// ����
public class Sample15_01 {
	public static void main(String[] args) {
		// �����ⲿ��Ķ���
		Outter1 o = new Outter1();
		// �����ⲿ���д����ڲ������ķ���
		o.createrInner();
		// �����ڲ���Ķ���
		Outter1.Inner i = o.new Inner();
		// �����ڲ����еķ���
		i.show();
		o.getInnerShow();
	}
}
