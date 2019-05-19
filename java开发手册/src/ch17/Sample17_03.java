package ch17;
import java.util.concurrent.*;
//定义执行指定任务的类
class MyShrinkTask implements Runnable
{
	//任务名称
	private String tname;
	//有参构造器
	public MyShrinkTask(String tname)
	{
		this.tname=tname;
	}
	
	public void run()
	{
		System.out.println("\n========任务"+tname+"开始执行========");
		for(int i=0;i<40;i++)
		{
		  	System.out.print("<"+tname+"_"+i+"> ");
		}
		System.out.println("\n========任务"+tname+"执行结束========");
	}
}
//主类
public class Sample17_03
{
	public static void main(String[] args)
	{
		//创建可变尺寸的线程池
		ExecutorService shrinkThreadPool=Executors.newCachedThreadPool();
		//创建三个任务对象
		MyShrinkTask mt1=new MyShrinkTask("MT1");
		MyShrinkTask mt2=new MyShrinkTask("MT2");
		MyShrinkTask mt3=new MyShrinkTask("MT3");
		//启动三个任务执行
		shrinkThreadPool.execute(mt1);
		shrinkThreadPool.execute(mt2);
		shrinkThreadPool.execute(mt3);
		//所有任务执行结束后关闭线程池
		shrinkThreadPool.shutdown();	
	}
}
