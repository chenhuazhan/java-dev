package ch17;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
//��Ҫ���Ⲣ�����ʵ��ʻ���Դ��������Դ��
class MyCount
{
	//��ʾ�ʻ����ĳ�Ա����
	private int count;
	//�вι�����
	public MyCount(int count)
	{
		this.count=count;
	}
	//��ȡ�ʻ����ķ���
	public int getCount()
	{
		return count;
	}
	//�����ʻ����ķ���
	public void setCount(int count)
	{
		this.count=count;
	}
}
//��ʾ���ʻ����в������û�����
class MyUser07 implements Runnable
{
	//��ʾ�û����Ƶĳ�Ա����
	private String userName;
	//����������
	private Lock countLock;
	//�ʻ���������
	private MyCount mc;
	//ȡ��������������ʾ��������ʾȡ�
	private int taskSum;
	//�вι�����
	public MyUser07(String userName,Lock countLock,MyCount mc,int taskSum)
	{
		this.userName=userName;
		this.countLock=countLock;
		this.mc=mc;
		this.taskSum=taskSum;
	}
	//��ʾ�����run����
	public void run()
	{
		//��ʾ�Ƿ�ɹ������ı�־
		boolean okFlag=false;
		while(!okFlag)
		{//������ɹ���������Բ���
			try
			{
				//��ȡ�ʻ���
				countLock.lock();
				if(taskSum<0)
				{//ȡ��Ĳ���
				   if(taskSum+mc.getCount()>=0)
				   {//�����������ȡ��
				   		mc.setCount(mc.getCount()+taskSum);
				   		System.out.println(userName+"�ɹ�ȡ��"+(-taskSum)+"Ԫ�����Ϊ��"
				   		+mc.getCount()+"Ԫ��");
				   		okFlag=true;
				   }
				}
				else
				{//���Ĳ���
					mc.setCount(mc.getCount()+taskSum);
				   	System.out.println(userName+"�ɹ����"+taskSum+"Ԫ�����Ϊ��"
				   	+mc.getCount()+"Ԫ��");					
					okFlag=true;
				}
			}
			finally
			{
				//�ͷ��ʻ���
				countLock.unlock();
			}
			if(okFlag==true){break;}
			try
			{
				System.out.println(userName+"�����㣬�ȴ�һ��ʱ�����ԣ�����");
				//���㣬�ȴ�һ��ʱ������
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
//����
public class Sample17_07
{
	public static void main(String args[])
	{
		//�����ʻ���Դ����
		MyCount mc=new MyCount(50);
		//����������
		Lock countLock=new ReentrantLock();
		//�����̳߳�
		ExecutorService threadPool= Executors.newFixedThreadPool(2);
		//ִ����������
		threadPool.execute(new MyUser07("User1",countLock,mc,-200));
		threadPool.execute(new MyUser07("User2",countLock,mc,200));
		//�ر��̳߳�
		threadPool.shutdown();
	}
}
