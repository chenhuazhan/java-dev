package ch15;

//�����ⲿ��
class OuterClass {
	// ����Ǿ�̬�ڲ��ӿ�
	public interface InnerInterface {
		public void show();
	}

	// ����ʵ����InnerInterface�ӿڵ��ڲ���
	public class InnerClass implements InnerInterface {
		// ʵ�ֽӿ��еķ���
		public void show() {
			System.out.println("�������ڲ����еķ��������ڲ�" + "��ʵ����˽���ڲ��ӿ�InnerInterface������");
		}
	}

	// �����ø��ڲ������ķ���
	public InnerInterface getIn() {
		return new InnerClass();
	}
}

// ʵ���ڲ��ӿڵ���ͨ��
class Common implements OuterClass.InnerInterface {
	// ʵ�ֽӿ��еķ���
	public void show() {
		System.out.println("��������ͨ���еķ���������ͨ" + "��ʵ����˽���ڲ��ӿ�InnerInterface������");
	}
}

// ����
public class Sample15_15 {
	public static void main(String[] args) {
		// �����ⲿ�����
		OuterClass oc = new OuterClass();
		// �����ڲ��ӿڵ�����
		OuterClass.InnerInterface ic = null;
		// ���ʵ���ڲ��ӿڵ��ڲ������
		ic = oc.getIn();
		// �����ڲ��ӿ��еķ���
		ic.show();
		// ����ʵ���ڲ��ӿڵ���ͨ�����
		ic = new Common();
		// �����ڲ��ӿ��еķ���
		ic.show();
	}
}
