package ch09_interface;
public class Sample9_14
{
	public static void main(String[] args)
	{
		String s=null;
		//对引用s进行String 类型的instanceof测试
		if(s instanceof String)
		{
			System.out.println("恭喜你，测试通过！！！");
		}	
		else
		{
			System.out.println("很遗憾，测试不通过！！！");
		}	
	}
}
