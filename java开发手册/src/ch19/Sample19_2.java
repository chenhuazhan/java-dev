package ch19;

public class Sample19_2 {
	// ���������洢�����е�����
	private int queue[];
	// ��ͷ
	private int front;
	// ��β
	private int rear;
	// ���еĴ�С
	private int queueSize;
	// ������Ԫ�ظ���
	private int eleNum;

	// ��ʼ������
	public void iniQueue(int size) {
		queue = new int[size];
		queueSize = size;
		front = 0;
		rear = -1;
		eleNum = 0;
	}

	// ��Ԫ�ز������
	public void insert(int data) {
		rear += 1;
		queue[rear] = data;
		eleNum++;
	}

	// �Ƴ�����
	public int remove() {
		int remvData = queue[front];
		front += 1;
		// ������Ƴ���Ԫ���Ƕ��еĽ�β�����д�ʱΪ��
		if (front == queueSize)
			front = 0;
		eleNum--;
		return remvData;
	}

	// ���ض�ͷԪ��
	public int frontData() {
		return queue[front];
	}

	// �ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		if (eleNum == 0)
			return true;
		else
			return false;
	}

	// �ж϶����Ƿ�����
	public boolean isFull() {
		if (eleNum == queueSize)
			return true;
		else
			return false;
	}

	// ���ض�����Ԫ�صĸ���
	public int size() {
		return eleNum;
	}

	public static void main(String[] args) {
		Sample19_2 Sample19_2 = new Sample19_2();
		int quequeSize = 10;

		// ��ʼ������
		Sample19_2.iniQueue(quequeSize);

		// ������в���Ԫ��
		Sample19_2.insert(1);
		Sample19_2.insert(100);
		Sample19_2.insert(12);
		Sample19_2.insert(13);
		Sample19_2.insert(154);
		Sample19_2.insert(112);
		Sample19_2.insert(166);
		Sample19_2.insert(8);
		Sample19_2.insert(45);
		Sample19_2.insert(67);

		// �õ����еĴ�С
		int eleNum = Sample19_2.size();
		System.out.println("���еĴ�СΪ��" + eleNum);

		// ������в�Ϊ�գ���ɾ����ͷ��Ԫ��
		while (!Sample19_2.isEmpty()) {
			int data = Sample19_2.remove();
			System.out.println(data + " ");
		}

		// �ж϶����Ƿ�Ϊ��
		if (Sample19_2.isEmpty())
			System.out.println("����Ϊ�ա�");
		else
			System.out.println("���в�Ϊ�ա�");
	}
}
