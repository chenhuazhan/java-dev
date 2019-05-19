package ch17;
import java.util.concurrent.*;
//����ִ��ָ���������
class MyTask01 implements Runnable
{
	//��������
	private String tname;
	//�вι�����
	public MyTask01(String tname)
	{
		this.tname=tname;
	}
	//��ʾ�����run����
	public void run()
	{
		System.out.println("\n========����"+tname+"��ʼִ��========");
		for(int i=0;i<50;i++)
		{
		  	System.out.print("["+tname+"_"+i+"] ");
		}
		System.out.println("\n========����"+tname+"ִ�н���========");
	}
}
//����
public class Sample17_01
{
	public static void main(String[] args)
	{
		//�����ߴ�Ϊ2�Ĺ̶��̳߳�
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		//���������������
		MyTask01 mt1=new MyTask01("MT1");
		MyTask01 mt2=new MyTask01("MT2");
		MyTask01 mt3=new MyTask01("MT3");
		//������������ִ��
		threadPool.execute(mt1);
		threadPool.execute(mt2);
		threadPool.execute(mt3);
	}
}
