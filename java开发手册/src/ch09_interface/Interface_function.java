package ch09_interface;
/*
 * �ӿ��еķ���������"public abstract"�ģ����Ҳ������������η�����
 * �ӿ��еķ��������Ǿ�̬�ģ�Ҳ���������յ�
 * 
 * ʹ�ùؼ���implements����ʹĳ����ʵ��ָ����һ�������ӿ�
 */

//�������ӿ�
interface Flyer
{
	public void fly();
}
//ˮ�Ϻ������ӿ�
interface Sailer
{
	public void dock();
}
//�ɻ�������
abstract class AriPlane implements Flyer
{
	public abstract void doAirPlaneThing();
}
//ˮ�Ϸɻ���
class SeaPlane extends AriPlane implements Sailer
{
	//ʵ�ֽӿںͳ������еĳ��󷽷�
	public void fly()
	{
		System.out.println("ˮ�Ϸɻ����Է��У���");
	}
	public void dock ()
	{
		System.out.println("ˮ�Ϸɻ����Ժ��У���");
	}
	public void doAirPlaneThing()
	{
		System.out.println("ˮ�Ϸɻ���һ���ɻ�����");
	}
}

public class Interface_function {
	public static void main(String[] args)
	{
		//�������󲢵��÷���
		SeaPlane sp=new SeaPlane();
		sp.fly();
		sp.dock();
		sp.doAirPlaneThing();
	}

}
