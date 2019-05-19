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
		System.out.println("执行单列模式类的构造器！！！");
	}
}
public class Sample10_15
{
	public static void main(String[] args)
	{
			//获取对象
			Singleton s1=Singleton.getInstance();
			Singleton s2=Singleton.getInstance();
			//比较引用
			if(s1==s2)
			{
				System.out.println("两个引用指向同一个对象！！！");
			}	
			else
			{
				System.out.println("两个引用指向不同的对象！！！");
			}
	}
}
