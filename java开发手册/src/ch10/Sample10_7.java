package ch10;
class Animal4
{
	public Animal4 ()
	{
 		System.out.println("ִ��Animal����޲ι�����������");
	}
	public Animal4 (int a)
	{
 		System.out.println("ִ��Animal�����һ��int�����Ĺ������������յ��Ĳ���ֵΪ"+a+"������");
	}	
}
class Bird4 extends Animal4
{
	public Bird4()
	{
		//���ø����޲ι�����
		super();
		System.out.println("ִ��Bird����޲ι�����������");
	}
	public Bird4(int a)
	{
		//���ø������һ�������Ĺ�����
		super(a);
		System.out.println("ִ��Bird�����һ��int�����Ĺ�����,�����յ��Ĳ���ֵΪ"+a+"������");
	}	
}
public class Sample10_7
{
	public static void main(String[] args)
	{
		//���ò�ͬ��������������
		new Bird4();
		System.out.println("=========================================================");
		new Bird4(2);
	}
}
