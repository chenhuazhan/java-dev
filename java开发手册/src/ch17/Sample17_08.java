package ch17;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
//自定义的资源类
class MyResource 
{
	//读/写锁对象成员
	public ReadWriteLock lock=new ReentrantReadWriteLock(false);
	//被读/写的资源
	private String msg="init";
	//读资源的方法
	public String getMsg()
	{
		return msg;
	}
	//写资源的方法
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
}
//进行读写任务的用户类
class MyUser implements Runnable
{
	//用户的名称
	private String uname;
	//任务的功能号 0-读  1-写
	private int functionCode;
	//写任务要写的内容
	private String msg;
	//要访问的资源
	private MyResource mr;
	//有参构造器
	public MyUser(String uname,int functionCode,String msg,MyResource mr)
	{
		this.uname=uname;
		this.functionCode=functionCode;
		this.msg=msg;
		this.mr=mr;
	}
	//代表任务的run方法
	public void run()
	{
		if(functionCode==0)
		{//读任务
			try
			{
				//获取读锁
				mr.lock.readLock().lock();
				//进行读操作
				System.out.println(uname
				     +"用户成功进行读操作，读出内容为：“"+mr.getMsg()+"”!!!");
				//读操作成功后拿着读锁睡眠
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				//释放读锁
				mr.lock.readLock().unlock();
			}
		}
		else
		{//写任务
			try
			{
				//获取写锁
				mr.lock.writeLock().lock();
				//进行写操作
				mr.setMsg(msg);
				System.out.println(uname
				     +"用户成功进行写操作，写入后内容为：“"+mr.getMsg()+"”!!!");
				//写操作成功后拿着写锁睡眠
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}			
			finally
			{
				//释放写锁
				mr.lock.writeLock().unlock();
			}			
		}
	}
}
//主类
public class Sample17_08
{
	public static void main(String args[])
	{
		//创建帐户资源对象
		MyResource mr=new MyResource();
		//创建线程池
		ExecutorService threadPool= Executors.newFixedThreadPool(4);
		//执行三个任务
		threadPool.execute(new MyUser("User1",0,null,mr));
		threadPool.execute(new MyUser("User2",0,null,mr));	
		threadPool.execute(new MyUser("User3",1,"Hello World",mr));
		//关闭线程池
		threadPool.shutdown();
	}
}
