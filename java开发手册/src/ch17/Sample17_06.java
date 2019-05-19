package ch17;
import java.util.concurrent.*;
//ʵ����Callable�ӿڵ�������
class MyCallableImpl implements Callable
{ 
	//��¼�������Ƶĳ�Ա
	String taskName;
	//�вι�����
	public MyCallableImpl(String taskName) 
	{
	this.taskName=taskName;
	}
	//�����������run����
	public Object call()
	{
		System.out.println(taskName+"����ɹ�ִ��!!!");
		//��������ķ���ֵ
		return "��ϲ��,����ɹ�ִ��,���Ƿ�����Ϣ!!!";
	}
}
//����
public class Sample17_06
{
	public static void main(String[] args)
	{
		//�����̳߳�
		ExecutorService threadPool= Executors.newSingleThreadExecutor();
		//�����̳߳ص�submit����ִ������
		Future future =threadPool.submit(new MyCallableImpl("TaskA"));
		try 
		{
			//������������get��ȡ����ķ���ֵ
			System.out.println(future.get());
		} 
		catch (Exception ex) 
		{
			//���񲢴�������׳����쳣
			ex.printStackTrace();
		}
		//�ر��̳߳أ���������
		threadPool.shutdown();
	}
}
