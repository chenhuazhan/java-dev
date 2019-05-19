package ch08_father_and_son;
/*
 * 方法的重写规则
 * 返回类型若为基本数据类型，则返回类型必须相同，若为对象引用类型，
 * 则必须相同或是该类型（间接）子类型，访问级别限制一定不能比被重写方法的窄
 * 
 * tip:
 * 重写是基于继承的，如果不能继承一个方法，则不构成重写，也就不必遵循重写规则
 * 如private修饰的方法不能被继承，子类中若有同名方法也不构成重写
 * 
 * 静态方法可以被继承，静态方法没有重写
 * 1.非静态方法试图重写静态方法编译错误
 * 2.静态方法重写静态方法时实质上是隐藏父类静态方法，而非重写
 */

class Vehicle
{
	public void startUp()
	{
		System.out.println("一般交通工具的启动方法！！！");
	}
}
class Car extends Vehicle
{
	public void startUp()
	{
		//重写扩展父类功能
		//super.startUp();
		
		System.out.println("轿车的启动方法！！！");
	}
}
public class Function_rewrite {
	
	public static void main(String[] args)
	{
		//创建对象并调用方法
		Car c=new Car();
		System.out.print("实际调用的方法为：");
		c.startUp();
	}
}