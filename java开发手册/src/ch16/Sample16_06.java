package ch16;
	//定义Runnable的实现类
	class MyThread extends Thread
	{
		//重写run方法，指定该线程执行的代码
		public void run()
		{
			//循环打印数字
			for(int i=0;i<30;i++)
			{
				System.out.print("["+i+"] ");
			}
			//打印完成信息
			System.out.print("{子线程执行结束} ");
		}
	}
	//主类
	public class Sample16_06
	{
		public static void main(String[] args)
		{
			//创建MyThread对象
			Thread t=new MyThread();
			//启动线程t1
			t.start();	
			//在主线程内打印数字
			for(int i=0;i<30;i++)
			{
				if(i==10)
				{
					//调用join方法使主线程进行让步
					try
					{
						System.out.print("{使用了Jion方法} ");
						t.join();
					}
					catch(InterruptedException ie)
					{
						ie.printStackTrace();
					}				
				}
				System.out.print("<"+i+"> ");
			}
		}
	}
