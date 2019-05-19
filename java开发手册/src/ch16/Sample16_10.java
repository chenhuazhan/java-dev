package ch16;
	//自定义的线程类
	class MyThread10 extends Thread 
	{
		//该引用为资源对象
		private Object resource;
		//无参构造器
		public MyThread10()
		{}
		//有参构造器
		public MyThread10(Object resource,String name)
		{
			//对线程进行初始化
			this.resource=resource;
		this.setName(name);
		}
		public void run()
		{
			//同步语句块
			synchronized(resource)
			{
	            System.out.println(this.getName()
	            +"线程访问了资源！！！");
	            System.out.println(this.getName()
	            +"线程带着锁睡觉去了！！！");
	            try
	            {
	            	Thread.sleep(1000);
	            }
	            catch(Exception e)
	            {
	            	e.printStackTrace();
	            }
	            System.out.println(this.getName()
	            +"线程带着锁睡醒后释放了锁！！！");
			}
		}
	}
	//主类
	public class Sample16_10
	{
		public static void main(String[] args)
		{
			//创建资源对象
			Object resource=new Object();
			//创建2个线程
			MyThread10 mt1=new MyThread10(resource,"MT1");
			MyThread10 mt2=new MyThread10(resource,"MT2");
			//启动这2个线程
			mt1.start();
			mt2.start();
		}
	}
