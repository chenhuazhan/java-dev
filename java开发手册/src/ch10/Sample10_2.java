package ch10;
class Animal
{
	//˽�й�����
	private Animal()
	{
		System.out.println("����˽�����͵Ĺ�����������");
	}
	//��̬��������
	public static Animal getMe()
	{
		return new Animal();
	}
	
	public void Animal()
	{
		System.out.println("������Ϊ�ǹ������͵Ĺ�����������");
	}
}
public class Sample10_2
{
	public static void main(String[] args)
	{
//		new Animal();
		Animal a=Animal.getMe();
		a.Animal();
	}
}
