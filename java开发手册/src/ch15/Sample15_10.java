package ch15;
import java.util.*;
//外部类
class Outter10
{
	//定义内部类
	static class Inner
	{
		//定义内部类方法show
		public void show()
		{
			//打印输出
			System.out.println("恭喜你，成功的创"+
			"建了静态内部类的对象！！！");
		}
	}
	//定义外部类中普通的方法
	public void getInner()
	{		
		//在外部类中创建内部类对象
		Inner ii=new Inner();
		ii.show();
	}
}
//主类
public class Sample15_10
{
	public static void main(String[] args)
	{
		//在外部类外创建静态内部类的对象
		Outter10.Inner i=new Outter10.Inner();
		i.show();
		//在外部内中使用静态内部类的对象
		new Outter10().getInner();
	}
}
