package ch10;
class Animal
{
	//私有构造器
	private Animal()
	{
		System.out.println("我是私有类型的构造器！！！");
	}
	//静态工厂方法
	public static Animal getMe()
	{
		return new Animal();
	}
	
	public void Animal()
	{
		System.out.println("我自认为是公有类型的构造器！！！");
	}
}
public class Sample10_2
{
	public static void main(String[] args)
	{
//		new Animal();
		Animal a=Animal.getMe();
		a.Animal();
	}
}
