package ch16;
	//自定义线程类
	class MyThread11 extends Thread
	{
		//需要访问的两个资源对象引用
		private Object resource1;
		private Object resource2;
		//无参构造器
		public MyThread11()
		{	}
		//有参构造器
		public MyThread11(Object resource1,Object resource2,String name)
		{
			//传递资源对象的引用
			this.resource1=resource1;
			this.resource2=resource2;
			//设置线程的名称
			this.setName(name);
		}
		//重写run方法
		public void run()
		{
			//获得资源o1的锁，对资源o1进行操作
			synchronized(resource1)
			{
				System.out.println(this.getName()+"线程拿到"
				                 +resource1+"对象的锁！！！");
				//睡眠10毫秒
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{	
				    e.printStackTrace();
			}
				System.out.println(this.getName()+"等待"
				            +resource1+"对象的锁释放！！！");
				//在拿着资源o1锁的同时，需要拿到
				//资源o2的缩对两个资源同时进行操作
				synchronized(resource2)
				{
					System.out.println(this.getName()
					+"线程拿到了"+resource2.toString()+"的锁！！！");
					System.out.println(this.getName()
					       +"可以对两个资源同时操作了！！！");
				}
			}
		}	
	}
	//主类
	public class Sample16_11
	{
		public static void main(String args[])
		{
			//创建3个资源对象
			String s1="tom";
			String s2="jerry";
			String s3="lucy";
			//创建3个线程对象
			MyThread11 mt1=new MyThread11(s1,s2,"MT1");
			MyThread11 mt2=new MyThread11(s2,s3,"MT2");
			MyThread11 mt3=new MyThread11(s3,s1,"MT3");
			//启动上述3个线程
			mt1.start();
			mt2.start();
			mt3.start();
		}
	}
