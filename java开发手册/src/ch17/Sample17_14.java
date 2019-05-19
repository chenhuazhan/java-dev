package ch17;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
class MyTask implements Runnable
{
	//Ҫ������ԭ����������
	AtomicLongArray ala;
	//���������
	String tname;
	//�вι�����
	public MyTask(AtomicLongArray ala,String tname)
	{
		this.ala=ala;
		this.tname=tname;
	}
	//��ʾ�����run����
	public void run()
	{
		//���ù��ܷ���������Ԫ�ز���
		ala.set(9,12);
		long l=ala.addAndGet(3,15);
		ala.set(4,l);
	}
}
//����
public class Sample17_14
{
	public static void main(String[] args) throws InterruptedException
	{
		//����long����
		long[] la=new long[]{1,23,45,1,2,3,4,5,6,7,8,8,9,2,4,5,6,7,8};		
		//����ԭ���������
		AtomicLongArray ala=new AtomicLongArray(la);
		//�����̳߳�
		ExecutorService threadPool=Executors.newFixedThreadPool(3);	
		//������������ִ��
		for(int i=0;i<3;i++)
		{
			threadPool.execute(new MyTask(ala,i+""));
		}
		//�ر��̳߳�
		threadPool.shutdown();
	}
}
