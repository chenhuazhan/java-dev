package ch10;
//����Animal��
class Animal3
{
	public Animal3 ()
	{
		System.out.println("����Animal��Ĺ�����");
	}
}
//����Bird�̳���Animal��
class Bird3 extends Animal3
{
	public Bird3()
	{
		System.out.println("����Bird��Ĺ�����");
	}
}
public class Sample10_6
{
	public static void main(String[] args)
	{
		new Bird3();
	}
}
