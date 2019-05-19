package ch17;
import java.util.concurrent.*;
//����ִ��ָ���������
class MyTask05 implements Runnable
{
	//��������
	private String tname;
	//�вι�����
	public MyTask05(String tname)
	{
		this.tname=tname;
	}
	//ִ�������run����
	public void run()
	{
		System.out.print("[����"+tname+"��ʼִ��]");
		for(int i=0;i<10;i++)
		{
		  	System.out.print("["+tname+"_"+i+"] ");
		  	//����ִ�й����ж�ʱ�����Դﵽ����ִ�е�Ч��
		  	try
		  	{
		  		Thread.sleep(100);
		  	}
		  	catch(Exception e)
		  	{
		  		e.printStackTrace();
		  	}
		}
		System.out.print("[����"+tname+"ִ�н���]");
	}
}
//����
public class Sample17_05
{
	public static void main(String[] args)
	{
		//���������ȴ�����
		BlockingQueue workQueue=new ArrayBlockingQueue(3);
		//�����ߴ��Զ���������̳߳�
		ThreadPoolExecutor myThreadPool=
		    new ThreadPoolExecutor(2,4,100,TimeUnit.MILLISECONDS,workQueue);
		//�����ĸ��������
		MyTask05 mt1=new MyTask05("MT1");
		MyTask05 mt2=new MyTask05("MT2");
		MyTask05 mt3=new MyTask05("MT3");
		MyTask05 mt4=new MyTask05("MT4");
		//�����ĸ�����ִ��
		myThreadPool.execute(mt1);
		myThreadPool.execute(mt2);
		myThreadPool.execute(mt3);
		myThreadPool.execute(mt4);
		//��ӡ�̳߳ص�ʵ�ʴ�С
		System.out.println("�̳߳ص�ʵ�ʴ�СΪ��"+myThreadPool.getPoolSize());		
		//��������ִ�н�����ر��̳߳�
		myThreadPool.shutdown();	
	}
}
