package ch17;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
//需要避免并发访问的帐户资源（互斥资源）
class MyCount
{
	//表示帐户余额的成员变量
	private int count;
	//有参构造器
	public MyCount(int count)
	{
		this.count=count;
	}
	//获取帐户余额的方法
	public int getCount()
	{
		return count;
	}
	//设置帐户余额的方法
	public void setCount(int count)
	{
		this.count=count;
	}
}
//表示对帐户进行操作的用户对象
class MyUser07 implements Runnable
{
	//表示用户名称的成员变量
	private String userName;
	//锁对象引用
	private Lock countLock;
	//帐户对象引用
	private MyCount mc;
	//取款或存款数额（正数表示存款，负数表示取款）
	private int taskSum;
	//有参构造器
	public MyUser07(String userName,Lock countLock,MyCount mc,int taskSum)
	{
		this.userName=userName;
		this.countLock=countLock;
		this.mc=mc;
		this.taskSum=taskSum;
	}
	//表示任务的run方法
	public void run()
	{
		//表示是否成功操作的标志
		boolean okFlag=false;
		while(!okFlag)
		{//如果不成功则继续尝试操作
			try
			{
				//获取帐户锁
				countLock.lock();
				if(taskSum<0)
				{//取款的操作
				   if(taskSum+mc.getCount()>=0)
				   {//如果余额充足则取款
				   		mc.setCount(mc.getCount()+taskSum);
				   		System.out.println(userName+"成功取款"+(-taskSum)+"元，余额为："
				   		+mc.getCount()+"元。");
				   		okFlag=true;
				   }
				}
				else
				{//存款的操作
					mc.setCount(mc.getCount()+taskSum);
				   	System.out.println(userName+"成功村款"+taskSum+"元，余额为："
				   	+mc.getCount()+"元。");					
					okFlag=true;
				}
			}
			finally
			{
				//释放帐户锁
				countLock.unlock();
			}
			if(okFlag==true){break;}
			try
			{
				System.out.println(userName+"：余额不足，等待一段时间再试！！！");
				//余额不足，等待一段时间再试
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
//主类
public class Sample17_07
{
	public static void main(String args[])
	{
		//创建帐户资源对象
		MyCount mc=new MyCount(50);
		//创建锁对象
		Lock countLock=new ReentrantLock();
		//创建线程池
		ExecutorService threadPool= Executors.newFixedThreadPool(2);
		//执行两个任务
		threadPool.execute(new MyUser07("User1",countLock,mc,-200));
		threadPool.execute(new MyUser07("User2",countLock,mc,200));
		//关闭线程池
		threadPool.shutdown();
	}
}
