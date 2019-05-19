package ch09_interface;
/*
 * 接口中的方法隐含是"public abstract"的，并且不能用其他修饰符修饰
 * 接口中的方法不能是静态的，也不能是最终的
 * 
 * 使用关键字implements可以使某个类实现指定的一个或多个接口
 */

//飞行器接口
interface Flyer
{
	public void fly();
}
//水上航行器接口
interface Sailer
{
	public void dock();
}
//飞机抽象类
abstract class AriPlane implements Flyer
{
	public abstract void doAirPlaneThing();
}
//水上飞机类
class SeaPlane extends AriPlane implements Sailer
{
	//实现接口和抽象类中的抽象方法
	public void fly()
	{
		System.out.println("水上飞机可以飞行！！");
	}
	public void dock ()
	{
		System.out.println("水上飞机可以航行！！");
	}
	public void doAirPlaneThing()
	{
		System.out.println("水上飞机是一个飞机！！");
	}
}

public class Interface_function {
	public static void main(String[] args)
	{
		//创建对象并调用方法
		SeaPlane sp=new SeaPlane();
		sp.fly();
		sp.dock();
		sp.doAirPlaneThing();
	}

}
