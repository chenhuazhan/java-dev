package ch09_interface;
class Father2
{}
class Son2 extends Father2
{}
public class Sample9_15
{
	public static void main(String[] args)
	{
		//基本类型数组的情况
		int[] intArray=new int[5];
		if(intArray instanceof int[])
		{
			System.out.println("intArray是int[]类型的！！！");
		}
		//引用数组的情况		
		Son2[] sonArray=new Son2[12];
		if(sonArray instanceof Son2[])
		{
			System.out.println("sonArray是Son[]类型的！！！");
		}	
		if(sonArray instanceof Father2[])
		{
			System.out.println("sonArray是Father[]类型的！！！");
		}
	}
}
