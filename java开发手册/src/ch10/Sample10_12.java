package ch10;
class Animal7
{
	public Animal7(String name)
	{
		System.out.println("我是Animal类的构造器,参数name="+name);
	}
	public Animal7()
	{
		//调用兄弟构造器
		this("tom");
	}
}
public class Sample10_12
{
	public static void main(String[] args)
	{
		//创建对象
		new Animal7();
	}
}
