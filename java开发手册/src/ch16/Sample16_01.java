package ch16;

//定义实现Runnable接口的类
class MyRunnable implements Runnable {
	// 实现run方法，指定线程执行的任务
	public void run() {
		System.out.println("恭喜你，线程被启动了，" + "执行了run方法中的代码！！！");
	}
}

// 主类
public class Sample16_01 {
	public static void main(String[] args) {
		// 创建实现Runnable接口的类的对象
		MyRunnable mr = new MyRunnable();
		// 创建Thread对象，将第一步创建对象的引用作为构造器参数传递，指定线程要执行的任务
		Thread t = new Thread(mr);
		// 启动线程
		t.start();
	}
}
