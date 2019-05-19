package ch16;
	//主类
	public class Sample16_13
	{
		public static void main(String args[])
		{
	         //获取当前正在执行main方法的线程id
	         long id=Thread.currentThread().getId();
	         //获取当前正在执行main方法的线程名称
	         String name=Thread.currentThread().getName();
	         //获取当前正在执行main方法的线程优先级
	         int priority=Thread.currentThread().getPriority();         
	         //打印获取的信息
	         System.out.println("===================================");
	         System.out.println("线程id\t|线程名称\t|线程优先级");
	         System.out.println(id+"\t|"+name+"\t\t|"+priority);
	         System.out.println("===================================");
		}
	}
