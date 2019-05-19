package ch16;
	//�Զ�����߳���
	class MyThread10 extends Thread 
	{
		//������Ϊ��Դ����
		private Object resource;
		//�޲ι�����
		public MyThread10()
		{}
		//�вι�����
		public MyThread10(Object resource,String name)
		{
			//���߳̽��г�ʼ��
			this.resource=resource;
		this.setName(name);
		}
		public void run()
		{
			//ͬ������
			synchronized(resource)
			{
	            System.out.println(this.getName()
	            +"�̷߳�������Դ������");
	            System.out.println(this.getName()
	            +"�̴߳�����˯��ȥ�ˣ�����");
	            try
	            {
	            	Thread.sleep(1000);
	            }
	            catch(Exception e)
	            {
	            	e.printStackTrace();
	            }
	            System.out.println(this.getName()
	            +"�̴߳�����˯�Ѻ��ͷ�����������");
			}
		}
	}
	//����
	public class Sample16_10
	{
		public static void main(String[] args)
		{
			//������Դ����
			Object resource=new Object();
			//����2���߳�
			MyThread10 mt1=new MyThread10(resource,"MT1");
			MyThread10 mt2=new MyThread10(resource,"MT2");
			//������2���߳�
			mt1.start();
			mt2.start();
		}
	}
