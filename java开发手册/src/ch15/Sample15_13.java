package ch15;
//定义父类
abstract class FatherForInner
{
	int count;
	abstract void show();
}
//主类
public class Sample15_13
{
	public static void main(String[] args)
	{
		//定义匿名内部类并创建其对象
		FatherForInner ffi=new FatherForInner()
		{
			//定义非静态语句块
			{
				//对成员count进行初始化
				count=(int)(100*Math.random());
			}
			//实现了其父类的方法
			public void show()
			{
				//打印输出
				System.out.println("初始化后count的值为："+count+"。");
			}	
		};
		//调用show方法
		ffi.show();
	}
}
