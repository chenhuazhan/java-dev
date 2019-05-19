package ch17;
import java.util.concurrent.*;
//定义执行指定任务的类
class MyTask01 implements Runnable
{
	//任务名称
	private String tname;
	//有参构造器
	public MyTask01(String tname)
	{
		this.tname=tname;
	}
	//表示任务的run方法
	public void run()
	{
		System.out.println("\n========任务"+tname+"开始执行========");
		for(int i=0;i<50;i++)
		{
		  	System.out.print("["+tname+"_"+i+"] ");
		}
		System.out.println("\n========任务"+tname+"执行结束========");
	}
}
//主类
public class Sample17_01
{
	public static void main(String[] args)
	{
		//创建尺寸为2的固定线程池
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		//创建三个任务对象
		MyTask01 mt1=new MyTask01("MT1");
		MyTask01 mt2=new MyTask01("MT2");
		MyTask01 mt3=new MyTask01("MT3");
		//启动三个任务执行
		threadPool.execute(mt1);
		threadPool.execute(mt2);
		threadPool.execute(mt3);
	}
}
