package ch16;
	//����Runnable��ʵ����
	class MyRunnable05 implements Runnable
	{
		//������ʶ�̵߳������ַ���
		private String flagl;
		private String flagr;
		//MyRunnable�Ĺ�����
		public MyRunnable05(String flagl,String flagr)
		{
			//��ʼ����ʶ�ַ���
			this.flagl=flagl;
			this.flagr=flagr;
		}	
		//��дrun������ָ�����߳�ִ�еĴ���
		public void run()
		{
			for(int i=0;i<30;i++)
			{
				System.out.print(flagl+i+flagr);
				//����yield����ʹ��ǰ����ִ�е��߳��ò�
				Thread.yield();
			}
		}
	}
	//����
	public class Sample16_05
	{
		public static void main(String[] args)
		{
			//��������ʵ��Runnable�ӿڵ���Ķ���
			MyRunnable05 mr1=new MyRunnable05("[","] ");
			MyRunnable05 mr2=new MyRunnable05("<","> ");
			//���������߳�Thread���󣬲�ָ��ִ�е�target
			Thread t1=new Thread(mr1);
			Thread t2=new Thread(mr2);
			//�����߳�t1��t2
			t1.start();	
			t2.start();	
		}
	}
