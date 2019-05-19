package ch08_father_and_son;
/*
 * HAS-A:类A拥有类B
 */
class Car0
{
	private Tyre t=new Tyre();
	public Tyre getTyre()  //访问器方法
	{ 
		return t;
	}
}
class Tyre
{ 
	private String material="橡胶";
	private String color="黑色";
	public String getMaterial()  //访问器方法
	{ 
		return material;
	}
	public String getColor()  //访问器方法
	{
		return color;
	}	
}
public class Has_A
{
	public static void main(String[] args)
	{
		//创建对象
		Car0 c=new Car0();
		//访问成员
		System.out.println("轿车所使用轮胎的颜色为："+c.getTyre().getColor());
		System.out.println("轿车所使用轮胎的材料为："+c.getTyre().getMaterial());
	}
}


