package ch08_father_and_son;
/*
 * USES-A:类A用到了类B（对象）的成员
 */
class SaloonCar
{
	public void startUp(Benzine b)
	{
		//判断汽油量是否充足
		if(b.isEnough())
		{
			System.out.println("恭喜你，汽油的储备量充足，汽车可以启动！！！");
		}			
	}
}
class Benzine
{ 
	private int cubage=100;
	public boolean isEnough()
	{
		//大于80为充足，反之不充足
		if(cubage>80)
		{
			return true;
		}			
		else
		{
			return false;
		}			
	}
}

public class Uses_A {
	public static void main(String[] args)
	{
		//创建对象
		Benzine b=new Benzine();
		SaloonCar sc=new SaloonCar ();
		//调用方法
		sc.startUp(b);
	}
}
