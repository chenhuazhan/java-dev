package ch17;
import java.util.concurrent.*;
//����������������
class PartTask implements Runnable
{
	//ָ���ϰ���������
	CyclicBarrier cb;
	//�����������
	String ptname;
	//����������ĳ���ʱ��
	int duringTime;
	//������
	public PartTask(CyclicBarrier cb,String ptname,int duringTime)
	{
		this.cb=cb;
		this.ptname=ptname;
		this.duringTime=duringTime;
	}
	//��ʾ����ķ���
	public void run()
	{
		System.out.println(ptname+"������ʼִ�У�����");
		try
		{
			Thread.sleep(duringTime);
			System.out.println(ptname+"������ִ�н���������");
			//���������������await����֪ͨ�ϰ���
			cb.await();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
//��ʾ����������������������
class FinalTask implements Runnable
{
	//��ʾ����ķ���
	public void run()
	{
		System.out.println("��������ִ�У�����");
	}	
}
//����
public class Sample17_15
{
	public static void main(String args[])
	{
       //�����ϰ������󣬲�ָ����������
       CyclicBarrier cb=new CyclicBarrier(5,new FinalTask());
       //�����̳߳ض���
       ExecutorService threadPool=Executors.newFixedThreadPool(5);
       //����5��������
       for(int i=0;i<5;i++)
       {
       		threadPool.execute(new PartTask(cb,"PartTask"+i,1000));
       }
       //�ر��̳߳�
       threadPool.shutdown();
	}
}
