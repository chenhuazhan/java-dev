package ch10;
class Animal5
{
	public Animal5 ()
	{
		System.out.println("执行Animal类的构造器！！！");
	}
}
class Bird5 extends Animal5
{}
public class Sample10_8
{
	public static void main(String[] args)
	{
		//创建对象
		new Bird5();
	}
}
