package ch15;
//外部类
class Outter9
{
	//定义普通成员变量
	static int x=100;
	//定义静态方法
	public static void getInner()
	{
		//定义内部类
		class Inner
		{
			//定义内部类方法show
			public void show()
			{
				//打印输出，并调用该方法中的局部变量
				System.out.println("访问方法中的局部变量，x = "+x);
			}
		}
		Inner i=new Inner();
		i.show();		
	}
}
//主类
public class Sample15_09
{
	public static void main(String[] args)
	{
		//调用静态方法
		Outter9.getInner();
	}
}
