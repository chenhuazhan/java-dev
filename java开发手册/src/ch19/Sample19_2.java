package ch19;

public class Sample19_2 {
	// 数组用来存储队列中的数据
	private int queue[];
	// 队头
	private int front;
	// 队尾
	private int rear;
	// 队列的大小
	private int queueSize;
	// 队列中元素个数
	private int eleNum;

	// 初始化队列
	public void iniQueue(int size) {
		queue = new int[size];
		queueSize = size;
		front = 0;
		rear = -1;
		eleNum = 0;
	}

	// 把元素插入队列
	public void insert(int data) {
		rear += 1;
		queue[rear] = data;
		eleNum++;
	}

	// 移出队列
	public int remove() {
		int remvData = queue[front];
		front += 1;
		// 如果被移出的元素是队列的结尾，队列此时为空
		if (front == queueSize)
			front = 0;
		eleNum--;
		return remvData;
	}

	// 返回队头元素
	public int frontData() {
		return queue[front];
	}

	// 判断队列是否为空
	public boolean isEmpty() {
		if (eleNum == 0)
			return true;
		else
			return false;
	}

	// 判断队列是否已满
	public boolean isFull() {
		if (eleNum == queueSize)
			return true;
		else
			return false;
	}

	// 返回队列中元素的个数
	public int size() {
		return eleNum;
	}

	public static void main(String[] args) {
		Sample19_2 Sample19_2 = new Sample19_2();
		int quequeSize = 10;

		// 初始化队列
		Sample19_2.iniQueue(quequeSize);

		// 向队列中插入元素
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

		// 得到队列的大小
		int eleNum = Sample19_2.size();
		System.out.println("队列的大小为：" + eleNum);

		// 如果队列不为空，则删除队头的元素
		while (!Sample19_2.isEmpty()) {
			int data = Sample19_2.remove();
			System.out.println(data + " ");
		}

		// 判断队列是否为空
		if (Sample19_2.isEmpty())
			System.out.println("队列为空。");
		else
			System.out.println("队列不为空。");
	}
}
