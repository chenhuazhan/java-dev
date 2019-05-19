package ch17;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
//自定义的资源池类
class MyResourcePool 
{
   	public Semaphore sp;
   	public MyResourcePool(int count)
   	{
   		sp=new Semaphore(count);
   	}
}
//表示任务的类
class MyTask09 implements Runnable
{
	//表示任务名称的成员
	private String tname;
	//资源池类的成员引用
	private MyResourcePool mrp;
	//任务申请的资源数量
	private int count;
	//有参构造器
	public MyTask09(String tname,MyResourcePool mrp,int count)
	{
		this.tname=tname;
		this.mrp=mrp;
		this.count=count;
	}
	//表示任务的run方法
	public void run()
	{
		try
		{
			//申请指定数量的资源许可
			mrp.sp.acquire(count);
			System.out.println(tname+"任务成功申请了"+count+"个资源执行完毕！！！");
			//拿着资源许可休眠一段时间
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			mrp.sp.release(count);
		}
	}
}
//主类
public class Sample17_09
{
	public static void main(String args[])
	{
		//创建资源池对象
		MyResourcePool  mrp=new MyResourcePool(10);
		//创建线程池
		ExecutorService threadPool= Executors.newFixedThreadPool(4);
		//执行三个任务			
		threadPool.execute(new MyTask09("Task1",mrp,8));	
		threadPool.execute(new MyTask09("Task2",mrp,4));
		threadPool.execute(new MyTask09("Task3",mrp,1));						
		//关闭线程池
		threadPool.shutdown();
	}
}
