package ch15;
//声明局部内部类要实现的接口
interface ForInner
{
	void sayHello();
}
//外部类
class Outter
{	
	//声明外部类中将指向局部内部类对象的引用
	ForInner forInner=null;
	public void getInner()
	{
		//定义局部内部类
		class Inner implements ForInner
		{
			//实现接口中的方法 sayHello
			public void  sayHello()
			{
				System.out.println("你好，我是局部内部类对象，我还存在！！！");
			}
		}
		//创建局部内部类对象
		forInner=new Inner();		
	}
}
//主类
public class Sample15_08
{
	public static void main(String[] args)
	{
		//创建外部类对象
		Outter o=new Outter();
		//调用外部类中的getInner方法
		o.getInner();
		//调用局部内部类对象的sayHello方法
		o.forInner.sayHello();
	}
}
