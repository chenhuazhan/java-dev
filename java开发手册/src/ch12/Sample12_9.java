package ch12;

//异常的再抛出
public class Sample12_9 {
	public static void main(String[] args) {
		// 调用方法a
		a();
		System.out.println("恭喜你，调用方法成功，程序正常工作！！");
	}

	static void a() {
		// 受监视的代码
		try {
			// 调用方法b
			b();
		}
		// 异常处理程序
		catch (RuntimeException re) {
			// 打印提示信息
			System.out.println("异常在a方法被解决掉！！！");
		}
	}

	static void b() {
		// 调用方法c
		c();
	}

	static void c() {
		int[] a = new int[3];
		// 将报下标越界异常
		a[4] = 12;
	}
}
