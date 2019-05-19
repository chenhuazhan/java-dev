package ch10;
class Animal4
{
	public Animal4 ()
	{
 		System.out.println("执行Animal类的无参构造器！！！");
	}
	public Animal4 (int a)
	{
 		System.out.println("执行Animal类的有一个int参数的构造器，本次收到的参数值为"+a+"！！！");
	}	
}
class Bird4 extends Animal4
{
	public Bird4()
	{
		//调用父类无参构造器
		super();
		System.out.println("执行Bird类的无参构造器！！！");
	}
	public Bird4(int a)
	{
		//调用父类具有一个参数的构造器
		super(a);
		System.out.println("执行Bird类的有一个int参数的构造器,本次收到的参数值为"+a+"！！！");
	}	
}
public class Sample10_7
{
	public static void main(String[] args)
	{
		//调用不同构造器创建对象
		new Bird4();
		System.out.println("=========================================================");
		new Bird4(2);
	}
}
