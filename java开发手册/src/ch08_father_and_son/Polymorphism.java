package ch08_father_and_son;
/*
 * 多态：多种实现方法
 */

//定义抽象类Car
abstract class Car4
{
	//定义抽象方法brake
	public abstract void brake();
}
//定义非抽象类Truck继承自Car类
class Truck4 extends Car4
{
	//实现brake方法
	public void brake()
	{
		System.out.println("正在卡车上刹车！！");
	}
} 
//定义非抽象类Mini继承自Car类
class Mini extends Car4
{
	////实现brake方法
	public void brake()
	{
		System.out.println("正在面包车上刹车！！");
	}
}
public class Polymorphism
{
	public static void main(String[] args)
	{
		//声明Car引用c并将其指向Truck类的对象
		Car4 c=new Truck4();
		System.out.print("调用的方法为：");
		//使用引用c调用brake方法
		c.brake();
		//将引用c指向Mini类的对象
		c=new Mini();
		System.out.print("调用的方法为：");
		//使用引用c调用brake方法
		c.brake();
	}
}
