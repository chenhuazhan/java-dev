package ch08_father_and_son;

class Adder
{
	//接收两个int型参数执行加法
	public int add(int i,int j)
	{
		System.out.print("两个int参数的方法被调用，");
		return i+j;
	}
	//接收两个double型参数执行加法
	public double add(double i,double j)
	{
		System.out.print("两个double参数的方法被调用，");
		return i+j;
	}
}

class Vehicle2{}
//Car类继承自Vehicle类
class Car2 extends Vehicle2{}
//Truck类继承自Car类
class Truck2 extends Car2 {}
class UseCar
{
	//该方法参数为Vehicle型
	public void show(Vehicle2 v)
	{
		System.out.println("调用的是具有Vehicle参数的方法！！！");
	}
	//该方法参数为Car型
	public void show(Car2 c)
	{
		System.out.println("调用的是具有Car参数的方法！！！");
	}
}


//类A
class A{}
//类B
class B{}
class UseMethod
{
	//该方法参数为A型
	public void show(A a)
	{
		System.out.println("调用的是具有A类型参数的方法！！！");
	}
	//该方法参数为B型
	public void show(B b)
	{
		System.out.println("调用的是具有B类型参数的方法！！！");
	}
}


public class Function_overload {
	public static void main(String[] args)
	{
		//创建对象并调用方法
		Adder a1=new Adder();
		//使用参数2、5调用add方法
		System.out.println("2+5="+a1.add(2,5));
		////使用参数5、30.8调用add方法
		System.out.println("5+30.8="+a1.add(5,30.8));
		
		
		//创建对象，调用方法
				UseCar a=new UseCar();
				//声明Vehicle类引用并将其指向该类的对象
				Vehicle2 v=new Vehicle2();
				//声明Car类引用并将其指向该类的对象
				Car2 c=new Car2();
				//声明Truck类引用并将其指向该类的对象
				Truck2 t=new Truck2();
				System.out.print("用Vehicle类型参数调用：");
				//使用引用v作为参数调用show方法
				a.show(v);
				System.out.print("用Car类型参数调用：");
				//使用引用c作为参数调用show方法
				a.show(c);
				System.out.print("用Truck类型参数调用：");
				//使用引用t作为参数调用show方法
				a.show(t);
				System.out.print("用null类型参数调用：");
				//用null作为参数对show方法进行调用
				a.show(null);
				
				
				UseMethod u=new UseMethod();
				System.out.print("用null类型参数调用：");
				//用null作为参数对show方法进行调用
				//u.show(null);//编译出错
				u.show((A)null);//指定null的类型
				u.show((B)null);
	}
}
