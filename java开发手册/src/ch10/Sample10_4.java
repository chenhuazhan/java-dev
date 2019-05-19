package ch10;
class Animal1
{
	String name;
	int size;
	//定义有参数的构造器
	public Animal1(String name,int size)
	{
		this.name=name;
		this.size=size;
		System.out.println("有参构造器Animal(String name,int size)执行！！！");
	}
}
public class Sample10_4
{
	public static void main(String[] args)
	{
		//将指定参数传递给构造器创建对象
		Animal1 a=new Animal1("tom",40);
		System.out.println("我的名字叫"+a.name+"   我的身体长"+a.size+"厘米");
	}
}
