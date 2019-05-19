package ch17;
import java.util.concurrent.*;
//用于完成子任务的类
class PartTask implements Runnable
{
	//指向障碍器的引用
	CyclicBarrier cb;
	//子任务的名称
	String ptname;
	//代表子任务的持续时间
	int duringTime;
	//构造器
	public PartTask(CyclicBarrier cb,String ptname,int duringTime)
	{
		this.cb=cb;
		this.ptname=ptname;
		this.duringTime=duringTime;
	}
	//表示任务的方法
	public void run()
	{
		System.out.println(ptname+"子任务开始执行！！！");
		try
		{
			Thread.sleep(duringTime);
			System.out.println(ptname+"子任务执行结束！！！");
			//子任务结束，调用await方法通知障碍器
			cb.await();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
//表示所有子任务结束后任务的类
class FinalTask implements Runnable
{
	//表示任务的方法
	public void run()
	{
		System.out.println("最后的任务被执行！！！");
	}	
}
//主类
public class Sample17_15
{
	public static void main(String args[])
	{
       //创建障碍器对象，并指定最后的任务
       CyclicBarrier cb=new CyclicBarrier(5,new FinalTask());
       //创建线程池对象
       ExecutorService threadPool=Executors.newFixedThreadPool(5);
       //启动5个子任务
       for(int i=0;i<5;i++)
       {
       		threadPool.execute(new PartTask(cb,"PartTask"+i,1000));
       }
       //关闭线程池
       threadPool.shutdown();
	}
}
