package ch16;
	class Resource
	{
		synchronized void function1(Thread currThread)
		{
			System.out.println(currThread.getName()+
			"�߳�ִ��function1����������");
		try
			{
				Thread.sleep(1000);
				System.out.println(currThread.getName()
				+"�߳�˯���ˣ�����");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
		synchronized void function2(Thread currThread)
		{
			System.out.println(currThread.getName()+
			"�߳�ִ��function2����������");
		}	
	}
	//�Զ����߳���
	class MyThread08 extends Thread
	{
		//��Դ���������
		Resource rs;
		//������
		public MyThread08(String tName,Resource rs)
		{
			this.setName(tName);
			this.rs=rs;
		}
		public void run()
		{
			if(this.getName().equals("Thread1"))
			{//����߳�������Thread1������Դ��function1����
			     rs.function1(this);			
			}
			else
			{//����߳����Ʋ���Thread1������Դ��function2����
				System.out.println("Thread2�������ȴ�����ͬ������function2������");
				rs.function2(this);
			}
		}
	}
	//����
	public class Sample16_08
	{
		public static void main(String args[])
		{
	         Resource rs=new Resource();
	         MyThread08 t1=new MyThread08("Thread1",rs);
	         MyThread08 t2=new MyThread08("Thread2",rs);
	         t1.start();
			 try
			 {
				Thread.sleep(10);
		 	 }
			 catch(Exception e)
			 {
				e.printStackTrace();
		 }         
	         t2.start();
		}
	}
