package ch09_interface;
//创建飞行器接口与水上航行器接口
interface Flyer3
{ }
interface Sailer3
{ }
//创建普通飞机类
class NormalPlane implements Flyer3
{ }
public class Sample9_5
{
	public static void main(String[] args)
	{
		Flyer3 f=new NormalPlane();
		//Sailer3 s=(Sailer3)f;//强制类型转换失败
	}
}
