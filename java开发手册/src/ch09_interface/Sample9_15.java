package ch09_interface;
class Father2
{}
class Son2 extends Father2
{}
public class Sample9_15
{
	public static void main(String[] args)
	{
		//����������������
		int[] intArray=new int[5];
		if(intArray instanceof int[])
		{
			System.out.println("intArray��int[]���͵ģ�����");
		}
		//������������		
		Son2[] sonArray=new Son2[12];
		if(sonArray instanceof Son2[])
		{
			System.out.println("sonArray��Son[]���͵ģ�����");
		}	
		if(sonArray instanceof Father2[])
		{
			System.out.println("sonArray��Father[]���͵ģ�����");
		}
	}
}
