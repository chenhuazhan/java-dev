package ch10;
class MyClassFather
{
	public MyClassFather()
	{
		System.out.println("执行要创建对象类父类的构造器！！！");
	}
}

class MyClass extends MyClassFather
{
	//非静态成员
	Unstatic u=new Unstatic();
	final UnstaticFinal uf=new UnstaticFinal();
	{
		System.out.println("执行非静态语句块！！！");
	}
	//静态成员
	static
	{
		System.out.println("执行静态语句块！！！");
	}	
	static final StaticFinal sf=new StaticFinal();
	static Static s=new Static();
	//类构造器
	MyClass()
	{
		System.out.println("执行要创建对象类的构造器！！！");
	}	
}
//用来打印类静态final的成员变量的类
class StaticFinal
{
	StaticFinal()
	{
		System.out.println("静态final的成员变量初始化！！！");
	}
}
//用来打印类静态非final的成员变量的类
class Static
{
	Static()
	{
		System.out.println("静态非final的成员变量初始化！！！");
	}
}
//用来打印类非静态final的成员变量的类
class UnstaticFinal
{
	UnstaticFinal()
	{
		System.out.println("非静态final的成员变量初始化！！！");
	}
}
//用来打印类非静态非final的成员变量的类
class Unstatic
{
	Unstatic()
	{
		System.out.println("非静态非final的成员变量初始化！！！");
	}
}
public class Sample10_16
{
	public static void main(String[] args)
	{
		//创建对象
		new MyClass();
	}
}
