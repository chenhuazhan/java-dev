package ch16;

//����ʵ��Runnable�ӿڵ���
class MyRunnable implements Runnable {
	// ʵ��run������ָ���߳�ִ�е�����
	public void run() {
		System.out.println("��ϲ�㣬�̱߳������ˣ�" + "ִ����run�����еĴ��룡����");
	}
}

// ����
public class Sample16_01 {
	public static void main(String[] args) {
		// ����ʵ��Runnable�ӿڵ���Ķ���
		MyRunnable mr = new MyRunnable();
		// ����Thread���󣬽���һ�����������������Ϊ�������������ݣ�ָ���߳�Ҫִ�е�����
		Thread t = new Thread(mr);
		// �����߳�
		t.start();
	}
}
