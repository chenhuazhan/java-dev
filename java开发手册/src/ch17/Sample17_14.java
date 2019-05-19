package ch17;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
class MyTask implements Runnable
{
	//要操作的原子数组引用
	AtomicLongArray ala;
	//任务的名称
	String tname;
	//有参构造器
	public MyTask(AtomicLongArray ala,String tname)
	{
		this.ala=ala;
		this.tname=tname;
	}
	//表示任务的run方法
	public void run()
	{
		//调用功能方法对数组元素操作
		ala.set(9,12);
		long l=ala.addAndGet(3,15);
		ala.set(4,l);
	}
}
//主类
public class Sample17_14
{
	public static void main(String[] args) throws InterruptedException
	{
		//声明long数组
		long[] la=new long[]{1,23,45,1,2,3,4,5,6,7,8,8,9,2,4,5,6,7,8};		
		//创建原子数组对象
		AtomicLongArray ala=new AtomicLongArray(la);
		//创建线程池
		ExecutorService threadPool=Executors.newFixedThreadPool(3);	
		//启动三个任务执行
		for(int i=0;i<3;i++)
		{
			threadPool.execute(new MyTask(ala,i+""));
		}
		//关闭线程池
		threadPool.shutdown();
	}
}
