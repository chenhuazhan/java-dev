package ch09_interface;
//接口的多态
//食物接口
interface Food
{
	//吃食物的方法
	public void doEat();
}
//水果抽象类
abstract class Fruit
{ }
//肉抽象类
abstract class Meat 
{ }
//苹果类继承自水果类实现了食物接口
class Apple extends Fruit implements Food
{
	//实现接口中的方法
	public void doEat()
	{
		System.out.println("我是苹果，我属于水果，我可以充当食物被吃掉！！");
	}
}
//牛肉类继承自肉类实现了食物接口
class Beef extends Meat implements Food
{
	//实现接口中的方法
	public void doEat()
	{
		System.out.println("我是牛肉，我属于肉类，我可以充当食物被吃掉！！");
	}
}
public class Sample9_11
{
	public static void main(String[] args)
	{
		//创建苹果对象
		Food f=new Apple();
		//调用苹果吃的方法
		f.doEat();
		//创建牛肉对象
		f=new Beef();
		//调用牛肉吃的方法
		f.doEat();
	}
}
