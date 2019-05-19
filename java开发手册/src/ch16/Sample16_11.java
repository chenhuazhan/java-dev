package ch16;
	//�Զ����߳���
	class MyThread11 extends Thread
	{
		//��Ҫ���ʵ�������Դ��������
		private Object resource1;
		private Object resource2;
		//�޲ι�����
		public MyThread11()
		{	}
		//�вι�����
		public MyThread11(Object resource1,Object resource2,String name)
		{
			//������Դ���������
			this.resource1=resource1;
			this.resource2=resource2;
			//�����̵߳�����
			this.setName(name);
		}
		//��дrun����
		public void run()
		{
			//�����Դo1����������Դo1���в���
			synchronized(resource1)
			{
				System.out.println(this.getName()+"�߳��õ�"
				                 +resource1+"�������������");
				//˯��10����
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{	
				    e.printStackTrace();
			}
				System.out.println(this.getName()+"�ȴ�"
				            +resource1+"��������ͷţ�����");
				//��������Դo1����ͬʱ����Ҫ�õ�
				//��Դo2������������Դͬʱ���в���
				synchronized(resource2)
				{
					System.out.println(this.getName()
					+"�߳��õ���"+resource2.toString()+"����������");
					System.out.println(this.getName()
					       +"���Զ�������Դͬʱ�����ˣ�����");
				}
			}
		}	
	}
	//����
	public class Sample16_11
	{
		public static void main(String args[])
		{
			//����3����Դ����
			String s1="tom";
			String s2="jerry";
			String s3="lucy";
			//����3���̶߳���
			MyThread11 mt1=new MyThread11(s1,s2,"MT1");
			MyThread11 mt2=new MyThread11(s2,s3,"MT2");
			MyThread11 mt3=new MyThread11(s3,s1,"MT3");
			//��������3���߳�
			mt1.start();
			mt2.start();
			mt3.start();
		}
	}
