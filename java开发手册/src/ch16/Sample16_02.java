package ch16;
	//����Runnableʵ�ֽӿڵ���
	class MyRunnable1 implements Runnable
	{
		//��дrun������ָ�����߳�ִ�еĴ���
		public void run()
		{
			for(int i=0;i<50;i++)
			{
				//��ӡ�߳����й��̵����
				System.out.print("["+i+"] ");
			}
		}
	}
	//��������һ��ʵ��Runnable�ӿڵ���
	class MyRunnable2 implements Runnable
	{
		//��дrun������ָ�����߳�ִ�еĴ���
		public void run()
		{
			for(int i=0;i<50;i++)
			{
				//��ӡ�߳����й��̵����
				System.out.print("<"+i+"> ");
			}
		}
	}
	//����
	public class Sample16_02
	{
		public static void main(String[] args)
		{
			//����ʵ��Runnable�ӿڵ���Ķ���
			MyRunnable1 mr1=new MyRunnable1();
			MyRunnable2 mr2=new MyRunnable2();
			//�����߳�Thread���󣬲�ָ��target
			Thread t1=new Thread(mr1);
			Thread t2=new Thread(mr2);
			//�����߳�
			t1.start();
			t2.start();
		}
	}
