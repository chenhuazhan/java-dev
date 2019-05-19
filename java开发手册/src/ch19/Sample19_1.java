package ch19;

public class Sample19_1 {
	// 利用数组来实现栈
	private int arrayStack[];
	// 栈的大小
	private int stackSize;
	// 栈的最上部
	private int top;

	// 初始化栈
	public void iniStack(int size) {
		stackSize = size;
		arrayStack = new int[size];
		top = -1;
	}

	// 判断栈是否为空
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	// 判断栈是否已满
	public boolean isFull() {
		int curTop = stackSize - 1;
		if (top == curTop)
			return true;
		else
			return false;
	}

	// 把一个数据元素进栈
	public void pushStack(int data) {
		top += 1;
		arrayStack[top] = data;
	}

	// 把一个数据元素出栈
	public int popStack() {
		int popData = arrayStack[top];
		top -= 1;
		return popData;
	}

	// 取栈顶数据元素
	public int topStack() {
		return arrayStack[top];
	}

	// 销毁栈
	public void destroyStack() {
		arrayStack = null;
	}

	public static void main(String[] args) {
		Sample19_1 Sample19_1 = new Sample19_1();
		int topData;
		// 初始化栈
		Sample19_1.iniStack(10);
		// 将数据入栈
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
		// 判断栈是否满
		if (Sample19_1.isFull())
			System.out.println("栈是满的。");
		else
			System.out.println("栈不是满的。");
		// 获得栈顶的数据
		topData = Sample19_1.topStack();
		System.out.println("栈顶的数据为：" + topData);
		System.out.println("栈中所有的数据为：");
		// 如果栈不为空，则将栈中元素依次出栈
		while (!Sample19_1.isEmpty()) {
			int data = Sample19_1.popStack();
			System.out.println(data);
		}
		System.out.println(Sample19_1.isEmpty());
	}
}
