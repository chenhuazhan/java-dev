package ch17;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
//�Զ������Դ��
class MyResource 
{
	//��/д�������Ա
	public ReadWriteLock lock=new ReentrantReadWriteLock(false);
	//����/д����Դ
	private String msg="init";
	//����Դ�ķ���
	public String getMsg()
	{
		return msg;
	}
	//д��Դ�ķ���
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
}
//���ж�д������û���
class MyUser implements Runnable
{
	//�û�������
	private String uname;
	//����Ĺ��ܺ� 0-��  1-д
	private int functionCode;
	//д����Ҫд������
	private String msg;
	//Ҫ���ʵ���Դ
	private MyResource mr;
	//�вι�����
	public MyUser(String uname,int functionCode,String msg,MyResource mr)
	{
		this.uname=uname;
		this.functionCode=functionCode;
		this.msg=msg;
		this.mr=mr;
	}
	//���������run����
	public void run()
	{
		if(functionCode==0)
		{//������
			try
			{
				//��ȡ����
				mr.lock.readLock().lock();
				//���ж�����
				System.out.println(uname
				     +"�û��ɹ����ж���������������Ϊ����"+mr.getMsg()+"��!!!");
				//�������ɹ������Ŷ���˯��
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				//�ͷŶ���
				mr.lock.readLock().unlock();
			}
		}
		else
		{//д����
			try
			{
				//��ȡд��
				mr.lock.writeLock().lock();
				//����д����
				mr.setMsg(msg);
				System.out.println(uname
				     +"�û��ɹ�����д������д�������Ϊ����"+mr.getMsg()+"��!!!");
				//д�����ɹ�������д��˯��
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}			
			finally
			{
				//�ͷ�д��
				mr.lock.writeLock().unlock();
			}			
		}
	}
}
//����
public class Sample17_08
{
	public static void main(String args[])
	{
		//�����ʻ���Դ����
		MyResource mr=new MyResource();
		//�����̳߳�
		ExecutorService threadPool= Executors.newFixedThreadPool(4);
		//ִ����������
		threadPool.execute(new MyUser("User1",0,null,mr));
		threadPool.execute(new MyUser("User2",0,null,mr));	
		threadPool.execute(new MyUser("User3",1,"Hello World",mr));
		//�ر��̳߳�
		threadPool.shutdown();
	}
}
