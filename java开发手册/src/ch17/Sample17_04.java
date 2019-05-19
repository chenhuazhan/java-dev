package ch17;
import java.util.concurrent.*;
//定义执行指定任务的类
class MyScheduledTask implements Runnable
{
	//任务名称
	private String tname;
	//有参构造器
	public MyScheduledTask(String tname)
	{
		this.tname=tname;
	}
	//执行任务的run方法
	public void run()
	{
		System.out.println(tname+"任务时延2秒执行！！！");
	}
}
//主类
public class Sample17_04
{
	public static void main(String[] args)
	{
		//创建普通延迟线程池
		ScheduledExecutorService scheduledThreadPool
		                     =Executors.newScheduledThreadPool(2);
		//创建单线程延迟线程池
		ScheduledExecutorService singleScheduledThreadPool
		            =Executors.newSingleThreadScheduledExecutor();
		//创建两个任务对象
		MyScheduledTask mt1=new MyScheduledTask("MT1");
		MyScheduledTask mt2=new MyScheduledTask("MT2");
		//用scheduledThreadPool启动MT1任务执行
		scheduledThreadPool.schedule(mt1,2,TimeUnit.SECONDS);
		//用singleScheduledThreadPool启动MT2任务执行
        singleScheduledThreadPool.schedule(mt2,2000,TimeUnit.MILLISECONDS);
		//所有任务执行结束后关闭两个线程池
		scheduledThreadPool.shutdown();
		singleScheduledThreadPool.shutdown();
			
	}
}
