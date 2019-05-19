package ch19;

public class Sample19_1 {
	// ����������ʵ��ջ
	private int arrayStack[];
	// ջ�Ĵ�С
	private int stackSize;
	// ջ�����ϲ�
	private int top;

	// ��ʼ��ջ
	public void iniStack(int size) {
		stackSize = size;
		arrayStack = new int[size];
		top = -1;
	}

	// �ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	// �ж�ջ�Ƿ�����
	public boolean isFull() {
		int curTop = stackSize - 1;
		if (top == curTop)
			return true;
		else
			return false;
	}

	// ��һ������Ԫ�ؽ�ջ
	public void pushStack(int data) {
		top += 1;
		arrayStack[top] = data;
	}

	// ��һ������Ԫ�س�ջ
	public int popStack() {
		int popData = arrayStack[top];
		top -= 1;
		return popData;
	}

	// ȡջ������Ԫ��
	public int topStack() {
		return arrayStack[top];
	}

	// ����ջ
	public void destroyStack() {
		arrayStack = null;
	}

	public static void main(String[] args) {
		Sample19_1 Sample19_1 = new Sample19_1();
		int topData;
		// ��ʼ��ջ
		Sample19_1.iniStack(10);
		// ��������ջ
		Sample19_1.pushStack(1);
		Sample19_1.pushStack(2);
		Sample19_1.pushStack(5);
		Sample19_1.pushStack(7);
		Sample19_1.pushStack(100);
		Sample19_1.pushStack(121);
		Sample19_1.pushStack(113);
		Sample19_1.pushStack(109);
		Sample19_1.pushStack(12);
		Sample19_1.pushStack(11);
		// �ж�ջ�Ƿ���
		if (Sample19_1.isFull())
			System.out.println("ջ�����ġ�");
		else
			System.out.println("ջ�������ġ�");
		// ���ջ��������
		topData = Sample19_1.topStack();
		System.out.println("ջ��������Ϊ��" + topData);
		System.out.println("ջ�����е�����Ϊ��");
		// ���ջ��Ϊ�գ���ջ��Ԫ�����γ�ջ
		while (!Sample19_1.isEmpty()) {
			int data = Sample19_1.popStack();
			System.out.println(data);
		}
		System.out.println(Sample19_1.isEmpty());
	}
}
