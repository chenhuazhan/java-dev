package ch17;
import java.util.concurrent.*;
//定义执行指定任务的类
class MyTask05 implements Runnable
{
	//任务名称
	private String tname;
	//有参构造器
	public MyTask05(String tname)
	{
		this.tname=tname;
	}
	//执行任务的run方法
	public void run()
	{
		System.out.print("[任务"+tname+"开始执行]");
		for(int i=0;i<10;i++)
		{
		  	System.out.print("["+tname+"_"+i+"] ");
		  	//任务执行过程中定时休眠以达到交替执行的效果
		  	try
		  	{
		  		Thread.sleep(100);
		  	}
		  	catch(Exception e)
		  	{
		  		e.printStackTrace();
		  	}
		}
		System.out.print("[任务"+tname+"执行结束]");
	}
}
//主类
public class Sample17_05
{
	public static void main(String[] args)
	{
		//创建工作等待队列
		BlockingQueue workQueue=new ArrayBlockingQueue(3);
		//创建尺寸自定义参数的线程池
		ThreadPoolExecutor myThreadPool=
		    new ThreadPoolExecutor(2,4,100,TimeUnit.MILLISECONDS,workQueue);
		//创建四个任务对象
		MyTask05 mt1=new MyTask05("MT1");
		MyTask05 mt2=new MyTask05("MT2");
		MyTask05 mt3=new MyTask05("MT3");
		MyTask05 mt4=new MyTask05("MT4");
		//启动四个任务执行
		myThreadPool.execute(mt1);
		myThreadPool.execute(mt2);
		myThreadPool.execute(mt3);
		myThreadPool.execute(mt4);
		//打印线程池的实际大小
		System.out.println("线程池的实际大小为："+myThreadPool.getPoolSize());		
		//所有任务执行结束后关闭线程池
		myThreadPool.shutdown();	
	}
}
