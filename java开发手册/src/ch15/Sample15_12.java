package ch15;
//定义接口
interface MyInterface
{
	//定义接口中的方法
	public void show();
}
//主类
public class Sample15_12
{
	public static void main(String[] args)
	{
		//定义匿名内部类并创建其对象
		MyInterface mi=new MyInterface()
		{
			//实现了其父类的方法
			public void show()
			{
				//打印输出
				System.out.println("恭喜你创建了匿"
				+"名内部类的对象，该类实现了MyInterface接口！！！");
			}	
		};
		//访问匿名内部类中实现的方法
		mi.show();
	}
}
