package ch10;
class Animal2
{
	String name;
	int size;
	//无参构造器
	public Animal2()
	{}
	//一个参数的构造器
	public Animal2(String name)
	{
		this.name=name;
	}
	//两个参数的构造器
	public Animal2(String name,int size)
	{
		this.name=name;
		this.size=size;
	}
}
public class Sample10_5
{
	public static void main(String[] args)
	{
		//调用不同版本构造器创建对象
		Animal2 a=new Animal2("tom",40);
		Animal2 b=new Animal2("tom");
		Animal2 c=new Animal2();
		System.out.println("我的名字叫"+a.name+"   我的身体长"+a.size+"厘米");
		System.out.println("我的名字叫"+b.name+"   我的身体长"+b.size+"厘米");	
		System.out.println("我的名字叫"+c.name+"   我的身体长"+c.size+"厘米");	
	}
}
