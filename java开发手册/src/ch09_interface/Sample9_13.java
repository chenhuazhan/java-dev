package ch09_interface;
//interfaceof的使用
interface IFather
{
}
interface ISon extends IFather 
{
}
//声明类
class Father
{
}
class Son extends Father implements ISon
{
}

public class Sample9_13
{
	public static void main(String[] args)
	{
		//创建对象，进行instanceof测试
		Son s=new Son();
		if(s instanceof Son)
		{
			System.out.println("s指向的对象可以看作Son类型！！！");
		}
		if(s instanceof Father)
		{
			System.out.println("s指向的对象可以看作Father类型！！！");
		}
		if(s instanceof ISon)
		{
			System.out.println("s指向的对象可以看作ISon类型！！！");
		}	
		if(s instanceof IFather)
		{
			System.out.println("s指向的对象可以看作IFather类型！！！");
		}						
	}
}
