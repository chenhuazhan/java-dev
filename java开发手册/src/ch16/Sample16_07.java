package ch16;
//����ǰ̨�̵߳�target��
	class MyCommon implements Runnable
	{
		//��дrun������ָ�����߳�ִ�еĴ���
		public void run()
		{
			for(int i=0;i<10;i++)			
{
				System.out.print("["+i+"] ");
			}
			System.out.print("{ǰ̨�û��߳�ִ�����} ");
		}
	}
	//�����ػ��̵߳�target��
	class MyDaemon implements Runnable
	{
		//��дrun������ָ�����߳�ִ�еĴ���
		public void run()
		{
			for(int i=0;i<100000;i++)
			{
				System.out.print("<"+i+"> ");
			}
			System.out.print("{��̨�ػ��߳�ִ�����} ");
		}
	}
	//����
	public class Sample16_07
	{
		public static void main(String[] args)
		{
			//����ʵ��Runnable�ӿڵ���Ķ���
			Runnable mc=new MyCommon();
			Runnable md=new MyDaemon();
			//�����߳�Thread���󣬲�ָ��target
			Thread tc=new Thread(mc);
			Thread td=new Thread(md);
			//��t2����Ϊ�ػ��߳�
			td.setDaemon(true);
			//�����߳�
			tc.start();
			td.start();	
		}
	}
