package ch09_interface;
class Father3
{}
class Son3 extends Father3
{}
public class Sample9_16
{
	public static void main(String[] args)
	{
		//��ͨ�������
		Son3 s=null;
		if(s instanceof Father3)	{}
		//if(s instanceof String)	{}//���������
		//ԭʼ������������
		int[] intArray=null;
		//if(intArray instanceof long[]){}//���������
		//������������		
		Son3[] sonArray=null;
		if(sonArray instanceof Father3[]){}
		//if(sonArray instanceof String[]){}	//���������
	}
}
