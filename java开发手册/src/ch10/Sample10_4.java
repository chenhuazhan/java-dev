package ch10;
class Animal1
{
	String name;
	int size;
	//�����в����Ĺ�����
	public Animal1(String name,int size)
	{
		this.name=name;
		this.size=size;
		System.out.println("�вι�����Animal(String name,int size)ִ�У�����");
	}
}
public class Sample10_4
{
	public static void main(String[] args)
	{
		//��ָ���������ݸ���������������
		Animal1 a=new Animal1("tom",40);
		System.out.println("�ҵ����ֽ�"+a.name+"   �ҵ����峤"+a.size+"����");
	}
}
