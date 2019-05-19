package ch15;
//定义外部接口
interface OuterInterface
{
	//定义内部接口
	interface InnerInterface
	{
		//定义内部接口中的方法
		public void inShow();
	}
	//定义外部接口中的方法
	public void outShow();
}
//定义实现自内部接口的类
class InnerInterfaceImpl implements OuterInterface.InnerInterface
{
	//实现内部接口中的方法
	public void inShow()
	{
		System.out.println("恭喜你，这个类成功的实现了内部接口！！！");
	}
}
//定义实现外部接口的方法
class OutInterfaceImpl implements OuterInterface
{
	//实现外部接口中的方法
	public void outShow()
	{
		System.out.println("恭喜你，这个类成功的实现了外部接口！！！");
	}
}
//主类
public class Sample15_16
{
	public static void main(String[] args)
	{
		//创建实现自内部接口与外部接口类的对象
		OuterInterface.InnerInterface iic=new InnerInterfaceImpl();
		OuterInterface oic=new OutInterfaceImpl();
		//调用两个对象中的方法
		iic.inShow();
		oic.outShow();
	}
}
