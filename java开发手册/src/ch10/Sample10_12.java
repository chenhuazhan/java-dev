package ch10;
class Animal7
{
	public Animal7(String name)
	{
		System.out.println("����Animal��Ĺ�����,����name="+name);
	}
	public Animal7()
	{
		//�����ֵܹ�����
		this("tom");
	}
}
public class Sample10_12
{
	public static void main(String[] args)
	{
		//��������
		new Animal7();
	}
}
