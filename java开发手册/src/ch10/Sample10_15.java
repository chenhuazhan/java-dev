package ch10;
class Singleton
{
	private static Singleton singleInstance;
	public static Singleton getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance=new Singleton();
		}
		return singleInstance;
	}
	private Singleton()
	{
		System.out.println("ִ�е���ģʽ��Ĺ�����������");
	}
}
public class Sample10_15
{
	public static void main(String[] args)
	{
			//��ȡ����
			Singleton s1=Singleton.getInstance();
			Singleton s2=Singleton.getInstance();
			//�Ƚ�����
			if(s1==s2)
			{
				System.out.println("��������ָ��ͬһ�����󣡣���");
			}	
			else
			{
				System.out.println("��������ָ��ͬ�Ķ��󣡣���");
			}
	}
}
