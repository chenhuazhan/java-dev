package ch10;
class Animal2
{
	String name;
	int size;
	//�޲ι�����
	public Animal2()
	{}
	//һ�������Ĺ�����
	public Animal2(String name)
	{
		this.name=name;
	}
	//���������Ĺ�����
	public Animal2(String name,int size)
	{
		this.name=name;
		this.size=size;
	}
}
public class Sample10_5
{
	public static void main(String[] args)
	{
		//���ò�ͬ�汾��������������
		Animal2 a=new Animal2("tom",40);
		Animal2 b=new Animal2("tom");
		Animal2 c=new Animal2();
		System.out.println("�ҵ����ֽ�"+a.name+"   �ҵ����峤"+a.size+"����");
		System.out.println("�ҵ����ֽ�"+b.name+"   �ҵ����峤"+b.size+"����");	
		System.out.println("�ҵ����ֽ�"+c.name+"   �ҵ����峤"+c.size+"����");	
	}
}
