package ch09_interface;
class Father3
{}
class Son3 extends Father3
{}
public class Sample9_16
{
	public static void main(String[] args)
	{
		//普通引用情况
		Son3 s=null;
		if(s instanceof Father3)	{}
		//if(s instanceof String)	{}//不允许测试
		//原始类型数组的情况
		int[] intArray=null;
		//if(intArray instanceof long[]){}//不允许测试
		//引用数组的情况		
		Son3[] sonArray=null;
		if(sonArray instanceof Father3[]){}
		//if(sonArray instanceof String[]){}	//不允许测试
	}
}
