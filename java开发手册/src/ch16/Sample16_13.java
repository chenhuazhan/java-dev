package ch16;
	//����
	public class Sample16_13
	{
		public static void main(String args[])
		{
	         //��ȡ��ǰ����ִ��main�������߳�id
	         long id=Thread.currentThread().getId();
	         //��ȡ��ǰ����ִ��main�������߳�����
	         String name=Thread.currentThread().getName();
	         //��ȡ��ǰ����ִ��main�������߳����ȼ�
	         int priority=Thread.currentThread().getPriority();         
	         //��ӡ��ȡ����Ϣ
	         System.out.println("===================================");
	         System.out.println("�߳�id\t|�߳�����\t|�߳����ȼ�");
	         System.out.println(id+"\t|"+name+"\t\t|"+priority);
	         System.out.println("===================================");
		}
	}
