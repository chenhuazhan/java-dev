package ch10;
class Animal5
{
	public Animal5 ()
	{
		System.out.println("ִ��Animal��Ĺ�����������");
	}
}
class Bird5 extends Animal5
{}
public class Sample10_8
{
	public static void main(String[] args)
	{
		//��������
		new Bird5();
	}
}
