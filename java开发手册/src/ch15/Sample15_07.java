package ch15;
class Outter7
{
	public void getInner()
	{
		//定义局部变量
		final int x=100;
		//定义局部内部类
		class Inner
		{
			//定义局部内部类方法show
			public void show()
			{
				//打印输出，并调用该方法中的局部变量
				System.out.println("访问方法中的局部变量，x = "+x);
			}
		}
		//创建局部内部类对象
		Inner i=new Inner();
		i.show();		
	}
}
public class Sample15_07
{
	public static void main(String[] args)
	{
		//创建外部类对象
		Outter7 o=new Outter7();
		//调用外部类中的getInner方法
		o.getInner();
	}
}
