package ch09_interface;
//interfaceof��ʹ��
interface IFather
{
}
interface ISon extends IFather 
{
}
//������
class Father
{
}
class Son extends Father implements ISon
{
}

public class Sample9_13
{
	public static void main(String[] args)
	{
		//�������󣬽���instanceof����
		Son s=new Son();
		if(s instanceof Son)
		{
			System.out.println("sָ��Ķ�����Կ���Son���ͣ�����");
		}
		if(s instanceof Father)
		{
			System.out.println("sָ��Ķ�����Կ���Father���ͣ�����");
		}
		if(s instanceof ISon)
		{
			System.out.println("sָ��Ķ�����Կ���ISon���ͣ�����");
		}	
		if(s instanceof IFather)
		{
			System.out.println("sָ��Ķ�����Կ���IFather���ͣ�����");
		}						
	}
}
