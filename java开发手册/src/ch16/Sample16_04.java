package ch16;
	//定义继承Thread的类
	class MyThread1 extends Thread
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<=49;i++)
			{
				System.out.print("<Min"+i+"> ");
			}		
		}
	}
	//定义另外一个继承Thread的类
	class MyThread2 extends Thread
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<=49;i++)
			{
				System.out.print("[Max"+i+"] ");
			}	
		}
	}
	//主类
	public class Sample16_04
	{
		public static void main(String[] args)
		{
			//创建两个线程对象
			MyThread1 t1=new MyThread1();
			MyThread2 t2=new MyThread2();
			//设置两个线程的优先级
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
			//启动两个线程
			t1.start();
			t2.start();	
			
		}
	}
