package ch09_interface;

/*
 * �ӿڵĳ�Ա����������"public static final"�ģ����ûдϵͳ���Զ�����
 * ֻ�ܳ�ʼ��һ�Σ�����������ʱ��ʼ��
 * ͨ���ӿ�������ֱ�ӷ��ʳ�Ա������Ҳ����ͨ��ʵ���˽ӿڵ�����������������
 */
interface Flyer2 {
	// HIGH��MIDDLE��LOW�ֱ��ʾ�߿գ��еȣ��Ϳշ���
	public static final int HIGH = 1;
	public static final int MIDDLE = 2;
	public static final int LOW = 3;
}

class AirPlane2 implements Flyer2 {
	public void setFlyHeight(int height) {
		switch (height) { // �жϴ��ں��ַ���״̬
		case HIGH:
			System.out.println("�����ڴ��ڸ߿շ���״̬������");
			break;
		case MIDDLE:
			System.out.println("�����ڴ����еȸ߶ȷ���״̬������");
			break;
		case LOW:
			System.out.println("�����ڴ��ڵͿշ���״̬������");
			break;
		}
	}
}

public class Interface_menber {
	public static void main(String[] args) {
		// �������󣬵��÷���
		AirPlane2 ap = new AirPlane2();
		//ͨ���ӿ�������ֱ�ӷ��ʳ�Ա������Ҳ����ͨ��ʵ���˽ӿڵ�����������������
		ap.setFlyHeight(Flyer2.HIGH);
		ap.setFlyHeight(AirPlane2.MIDDLE);
		ap.setFlyHeight(ap.LOW);
	}
}
