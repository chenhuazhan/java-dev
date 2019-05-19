package ch15;
//定义父类
class Father
{
	//定义父类中的方法
	public void show()
	{
		//打印输出
		System.out.println("这里是Father类的方法");
	}
}
//主类
public class Sample15_11
{
	public static void main(String[] args)
	{
		//定义匿名内部类并创建其对象
		Father f=new Father()
		{
			//重写了其父类的方法
			public void show()
			{
				//打印输出
				System.out.println("恭喜你，成功的创"
				+"建了匿名内部类的对象！！！");
			}	
		};
		//访问匿名内部类中重写的方法
		f.show();
	}
}
