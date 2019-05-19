package ch16;
	//定义Runnable实现接口的类
	class MyRunnable1 implements Runnable
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<50;i++)
			{
				//打印线程运行过程的情况
				System.out.print("["+i+"] ");
			}
		}
	}
	//定义另外一个实现Runnable接口的类
	class MyRunnable2 implements Runnable
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<50;i++)
			{
				//打印线程运行过程的情况
				System.out.print("<"+i+"> ");
			}
		}
	}
	//主类
	public class Sample16_02
	{
		public static void main(String[] args)
		{
			//创建实现Runnable接口的类的对象
			MyRunnable1 mr1=new MyRunnable1();
			MyRunnable2 mr2=new MyRunnable2();
			//创建线程Thread对象，并指定target
			Thread t1=new Thread(mr1);
			Thread t2=new Thread(mr2);
			//启动线程
			t1.start();
			t2.start();
		}
	}
