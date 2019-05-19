package ch17;
import java.util.concurrent.*;
//定义执行指定任务的类
class MyTaskSingle implements Runnable
{
	//任务名称
	private String tname;
	//有参构造器
	public MyTaskSingle(String tname)
	{
		this.tname=tname;
	}
	//表示任务的run方法
	public void run()
	{
		System.out.println("========任务"+tname+"开始执行========");
		for(int i=0;i<40;i++)
		{
		  	System.out.print("["+tname+"_"+i+"] ");
		}
		System.out.println("\n========任务"+tname+"执行结束========");
	}
}
//主类
public class Sample17_02
{
	public static void main(String[] args)
	{
		//创建单个任务的线程池
		ExecutorService singleThreadPool=Executors.newSingleThreadExecutor();
		//创建三个任务对象
		MyTaskSingle mt1=new MyTaskSingle("MT1");
		MyTaskSingle mt2=new MyTaskSingle("MT2");
		MyTaskSingle mt3=new MyTaskSingle("MT3");
		//启动三个任务执行
		singleThreadPool.execute(mt1);
		singleThreadPool.execute(mt2);
		singleThreadPool.execute(mt3);
		//所有任务执行结束后关闭线程池
		singleThreadPool.shutdown();
	}
}
