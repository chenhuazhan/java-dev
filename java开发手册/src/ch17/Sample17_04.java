package ch17;
import java.util.concurrent.*;
//����ִ��ָ���������
class MyScheduledTask implements Runnable
{
	//��������
	private String tname;
	//�вι�����
	public MyScheduledTask(String tname)
	{
		this.tname=tname;
	}
	//ִ�������run����
	public void run()
	{
		System.out.println(tname+"����ʱ��2��ִ�У�����");
	}
}
//����
public class Sample17_04
{
	public static void main(String[] args)
	{
		//������ͨ�ӳ��̳߳�
		ScheduledExecutorService scheduledThreadPool
		                     =Executors.newScheduledThreadPool(2);
		//�������߳��ӳ��̳߳�
		ScheduledExecutorService singleScheduledThreadPool
		            =Executors.newSingleThreadScheduledExecutor();
		//���������������
		MyScheduledTask mt1=new MyScheduledTask("MT1");
		MyScheduledTask mt2=new MyScheduledTask("MT2");
		//��scheduledThreadPool����MT1����ִ��
		scheduledThreadPool.schedule(mt1,2,TimeUnit.SECONDS);
		//��singleScheduledThreadPool����MT2����ִ��
        singleScheduledThreadPool.schedule(mt2,2000,TimeUnit.MILLISECONDS);
		//��������ִ�н�����ر������̳߳�
		scheduledThreadPool.shutdown();
		singleScheduledThreadPool.shutdown();
			
	}
}
