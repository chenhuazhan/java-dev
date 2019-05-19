package ch17;
import java.util.concurrent.*;
//实现了Callable接口的任务类
class MyCallableImpl implements Callable
{ 
	//记录任务名称的成员
	String taskName;
	//有参构造器
	public MyCallableImpl(String taskName) 
	{
	this.taskName=taskName;
	}
	//存放任务代码的run方法
	public Object call()
	{
		System.out.println(taskName+"任务成功执行!!!");
		//返回任务的返回值
		return "恭喜你,任务成功执行,我是返回消息!!!";
	}
}
//主类
public class Sample17_06
{
	public static void main(String[] args)
	{
		//创建线程池
		ExecutorService threadPool= Executors.newSingleThreadExecutor();
		//调用线程池的submit方法执行任务
		Future future =threadPool.submit(new MyCallableImpl("TaskA"));
		try 
		{
			//调用阻塞方法get获取任务的返回值
			System.out.println(future.get());
		} 
		catch (Exception ex) 
		{
			//捕获并处理可能抛出的异常
			ex.printStackTrace();
		}
		//关闭线程池，结束程序
		threadPool.shutdown();
	}
}
