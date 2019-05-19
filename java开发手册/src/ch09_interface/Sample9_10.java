package ch09_interface;
//接口与抽象类的比较
//创建飞行器接口与水上航行器结接口
interface Flyer4
{
	public void fly();
}
interface Sailer4
{
	public void cruise();
}
//创建机器抽象类
abstract class Vehicle4 
{
	public abstract void consume();
}
//创建动物抽象类
abstract class Animal4
{
	public abstract void eat();
}
//创建飞机抽象类
abstract class AirPlane4 extends Vehicle4 implements Flyer4
{ 
	//实现抽象方法
	public void consume()
	{
		System.out.println("我需要消耗汽油！！！");
	}
	public void fly()
	{
		System.out.println("我可以用飞机的方式在天空飞！！！");
	}
}
//创建水上飞机类
class SeaPlane4 extends AirPlane4 implements Sailer4
{
	//实现继承的抽象方法
	public void cruise()
	{
		System.out.println("我可以用船的方式在水中航行！！！");
	}
}
//创建鸟类
class Bird4 extends Animal4 implements Flyer4
{
	//实现继承的抽象方法
	public void eat()
	{
		System.out.println("我需要吃东西！！");
	}	
	public void fly()
	{
		System.out.println("我可以用动物的方式在天空飞！！！");
	}
}
public class Sample9_10
{
	public static void main(String[] args)
	{
		//创建水上飞机对象与鸟类对象
		SeaPlane4 sp=new SeaPlane4();
		Bird4 b=new Bird4();
		//水上飞机执行的动作
		System.out.println("=========水上飞机执行的动作=========");
		sp.fly();
		sp.consume();
		sp.cruise();
		//鸟执行的动作
		System.out.println("============鸟执行的动作============");
		b.fly();
		b.eat();
	}
}
