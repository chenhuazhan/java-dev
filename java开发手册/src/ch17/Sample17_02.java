package ch17;
import java.util.concurrent.*;
//����ִ��ָ���������
class MyTaskSingle implements Runnable
{
	//��������
	private String tname;
	//�вι�����
	public MyTaskSingle(String tname)
	{
		this.tname=tname;
	}
	//��ʾ�����run����
	public void run()
	{
		System.out.println("========����"+tname+"��ʼִ��========");
		for(int i=0;i<40;i++)
		{
		  	System.out.print("["+tname+"_"+i+"] ");
		}
		System.out.println("\n========����"+tname+"ִ�н���========");
	}
}
//����
public class Sample17_02
{
	public static void main(String[] args)
	{
		//��������������̳߳�
		ExecutorService singleThreadPool=Executors.newSingleThreadExecutor();
		//���������������
		MyTaskSingle mt1=new MyTaskSingle("MT1");
		MyTaskSingle mt2=new MyTaskSingle("MT2");
		MyTaskSingle mt3=new MyTaskSingle("MT3");
		//������������ִ��
		singleThreadPool.execute(mt1);
		singleThreadPool.execute(mt2);
		singleThreadPool.execute(mt3);
		//��������ִ�н�����ر��̳߳�
		singleThreadPool.shutdown();
	}
}
