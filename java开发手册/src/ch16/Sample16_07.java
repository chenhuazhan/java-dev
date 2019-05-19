package ch16;
//定义前台线程的target类
	class MyCommon implements Runnable
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<10;i++)			
{
				System.out.print("["+i+"] ");
			}
			System.out.print("{前台用户线程执行完毕} ");
		}
	}
	//定义守护线程的target类
	class MyDaemon implements Runnable
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			for(int i=0;i<100000;i++)
			{
				System.out.print("<"+i+"> ");
			}
			System.out.print("{后台守护线程执行完毕} ");
		}
	}
	//主类
	public class Sample16_07
	{
		public static void main(String[] args)
		{
			//创建实现Runnable接口的类的对象
			Runnable mc=new MyCommon();
			Runnable md=new MyDaemon();
			//创建线程Thread对象，并指定target
			Thread tc=new Thread(mc);
			Thread td=new Thread(md);
			//将t2设置为守护线程
			td.setDaemon(true);
			//启动线程
			tc.start();
			td.start();	
		}
	}
