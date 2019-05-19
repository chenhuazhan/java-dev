package ch16;
	class Resource
	{
		synchronized void function1(Thread currThread)
		{
			System.out.println(currThread.getName()+
			"线程执行function1方法！！！");
		try
			{
				Thread.sleep(1000);
				System.out.println(currThread.getName()
				+"线程睡醒了！！！");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
		synchronized void function2(Thread currThread)
		{
			System.out.println(currThread.getName()+
			"线程执行function2方法！！！");
		}	
	}
	//自定义线程类
	class MyThread08 extends Thread
	{
		//资源对象的引用
		Resource rs;
		//构造器
		public MyThread08(String tName,Resource rs)
		{
			this.setName(tName);
			this.rs=rs;
		}
		public void run()
		{
			if(this.getName().equals("Thread1"))
			{//如果线程名称是Thread1访问资源的function1方法
			     rs.function1(this);			
			}
			else
			{//如果线程名称不是Thread1访问资源的function2方法
				System.out.println("Thread2启动，等待进入同步方法function2！！！");
				rs.function2(this);
			}
		}
	}
	//主类
	public class Sample16_08
	{
		public static void main(String args[])
		{
	         Resource rs=new Resource();
	         MyThread08 t1=new MyThread08("Thread1",rs);
	         MyThread08 t2=new MyThread08("Thread2",rs);
	         t1.start();
			 try
			 {
				Thread.sleep(10);
		 	 }
			 catch(Exception e)
			 {
				e.printStackTrace();
		 }         
	         t2.start();
		}
	}
