package ch15;
class Outter6
{
	public void getInner()
	{
		//定义局部内部类
		class Inner
		{
			//定义内部类方法show
			public void show()
			{ 
				System.out.println("恭喜你，定义并创建了局部内部类的对象！！");
			}
		}
		//创建局部内部类对象
		Inner i=new Inner();
		i.show();		
	}
}
public class Sample15_06
{
	public static void main(String[] args)
	{
		//创建外部类对象
		Outter6 o=new Outter6();
		//调用外部类中的getInner方法
		o.getInner();
	}
}
