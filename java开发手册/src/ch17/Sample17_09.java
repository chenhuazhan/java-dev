package ch17;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
//�Զ������Դ����
class MyResourcePool 
{
   	public Semaphore sp;
   	public MyResourcePool(int count)
   	{
   		sp=new Semaphore(count);
   	}
}
//��ʾ�������
class MyTask09 implements Runnable
{
	//��ʾ�������Ƶĳ�Ա
	private String tname;
	//��Դ����ĳ�Ա����
	private MyResourcePool mrp;
	//�����������Դ����
	private int count;
	//�вι�����
	public MyTask09(String tname,MyResourcePool mrp,int count)
	{
		this.tname=tname;
		this.mrp=mrp;
		this.count=count;
	}
	//��ʾ�����run����
	public void run()
	{
		try
		{
			//����ָ����������Դ���
			mrp.sp.acquire(count);
			System.out.println(tname+"����ɹ�������"+count+"����Դִ����ϣ�����");
			//������Դ�������һ��ʱ��
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			mrp.sp.release(count);
		}
	}
}
//����
public class Sample17_09
{
	public static void main(String args[])
	{
		//������Դ�ض���
		MyResourcePool  mrp=new MyResourcePool(10);
		//�����̳߳�
		ExecutorService threadPool= Executors.newFixedThreadPool(4);
		//ִ����������			
		threadPool.execute(new MyTask09("Task1",mrp,8));	
		threadPool.execute(new MyTask09("Task2",mrp,4));
		threadPool.execute(new MyTask09("Task3",mrp,1));						
		//�ر��̳߳�
		threadPool.shutdown();
	}
}
