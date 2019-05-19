package ch16;
	//定义Runnable的实现类
	class MyRunnable05 implements Runnable
	{
		//声明标识线程的两个字符串
		private String flagl;
		private String flagr;
		//MyRunnable的构造器
		public MyRunnable05(String flagl,String flagr)
		{
			//初始化标识字符串
			this.flagl=flagl;
			this.flagr=flagr;
		}	
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<30;i++)
			{
				System.out.print(flagl+i+flagr);
				//调用yield方法使当前正在执行的线程让步
				Thread.yield();
			}
		}
	}
	//主类
	public class Sample16_05
	{
		public static void main(String[] args)
		{
			//创建两个实现Runnable接口的类的对象
			MyRunnable05 mr1=new MyRunnable05("[","] ");
			MyRunnable05 mr2=new MyRunnable05("<","> ");
			//创建两个线程Thread对象，并指定执行的target
			Thread t1=new Thread(mr1);
			Thread t2=new Thread(mr2);
			//启动线程t1、t2
			t1.start();	
			t2.start();	
		}
	}
