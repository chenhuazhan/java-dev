package ch16;
	//����Runnable��ʵ����
	class MyThread extends Thread
	{
		//��дrun������ָ�����߳�ִ�еĴ���
		public void run()
		{
			//ѭ����ӡ����
			for(int i=0;i<30;i++)
			{
				System.out.print("["+i+"] ");
			}
			//��ӡ�����Ϣ
			System.out.print("{���߳�ִ�н���} ");
		}
	}
	//����
	public class Sample16_06
	{
		public static void main(String[] args)
		{
			//����MyThread����
			Thread t=new MyThread();
			//�����߳�t1
			t.start();	
			//�����߳��ڴ�ӡ����
			for(int i=0;i<30;i++)
			{
				if(i==10)
				{
					//����join����ʹ���߳̽����ò�
					try
					{
						System.out.print("{ʹ����Jion����} ");
						t.join();
					}
					catch(InterruptedException ie)
					{
						ie.printStackTrace();
					}				
				}
				System.out.print("<"+i+"> ");
			}
		}
	}
