package ch16;
	//����ʵ��Runnable�ӿڵ���
	class MyRunnable103 implements Runnable
	{
		//��дrun������ָ�����߳�ִ�еĴ���
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("["+i+"] �����߳�1������");
				//ʹ���߳̽���˯��״̬
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}			
			}
		}
	}
	//��������һ��ʵ��Runnable�ӿڵ���
	class MyRunnable203 implements Runnable
	{
		//��дrun������ָ�����߳�ִ�еĴ���
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("<"+i+"> �����߳�2������");
				//ʹ���߳̽���˯��״̬
				try
		{
					Thread.sleep(100);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}			
			}
		}
	}
	public class Sample16_03
	{
		public static void main(String[] args)
		{
			//����ʵ��Runnable�ӿڵ���
			MyRunnable103 mr1=new MyRunnable103();
			MyRunnable203 mr2=new MyRunnable203();
			//�����߳�Thread���󣬲�ָ�����Ե�target
			Thread t1=new Thread(mr1);
			Thread t2=new Thread(mr2);
			//�����߳�t1
			t1.start();
			//ʹ���߳̽���˯��״̬
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}		
			//�����߳�t2
			t2.start();
		}
	}
