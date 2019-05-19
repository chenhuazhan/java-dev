package ch10;
//定义Animal类
class Animal3
{
	public Animal3 ()
	{
		System.out.println("我是Animal类的构造器");
	}
}
//定义Bird继承自Animal类
class Bird3 extends Animal3
{
	public Bird3()
	{
		System.out.println("我是Bird类的构造器");
	}
}
public class Sample10_6
{
	public static void main(String[] args)
	{
		new Bird3();
	}
}
