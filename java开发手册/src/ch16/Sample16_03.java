package ch16;
	//定义实现Runnable接口的类
	class MyRunnable103 implements Runnable
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("["+i+"] 我是线程1！！！");
				//使此线程进入睡眠状态
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}			
			}
		}
	}
	//定义另外一个实现Runnable接口的类
	class MyRunnable203 implements Runnable
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("<"+i+"> 我是线程2！！！");
				//使此线程进入睡眠状态
				try
		{
					Thread.sleep(100);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}			
			}
		}
	}
	public class Sample16_03
	{
		public static void main(String[] args)
		{
			//创建实现Runnable接口的类
			MyRunnable103 mr1=new MyRunnable103();
			MyRunnable203 mr2=new MyRunnable203();
			//创建线程Thread对象，并指定各自的target
			Thread t1=new Thread(mr1);
			Thread t2=new Thread(mr2);
			//启动线程t1
			t1.start();
			//使主线程进入睡眠状态
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}		
			//启动线程t2
			t2.start();
		}
	}
