package ch15;
//定义外部类
class Outter5
{
	//定义外部类的成员变量x
	int x=100;
	//定义内部类
	class Inner
	{
		//内部类中与外部类同名的成员变量x
		int x=10000;
		//定义内部类方法show，用来打印输出
		public void show()
		{
			//打印输出，并调用内部类与外部类的成员变量
			System.out.println("访问外部类Outter5中的"+"成员变量，x = "+Outter5.this.x+"。");
			System.out.println("访问内部类Inner中的"+"成员变量，x = "+this.x+"。");
		}
	}
}
//主类
public class Sample15_05
{
	public static void main(String[] args)
	{
		//创建外部类对象
		Outter5 o=new Outter5();
		//创建内部类对象
		Outter5.Inner i=o.new Inner();
		//调用内部类中的show方法
		i.show();
	}
}
