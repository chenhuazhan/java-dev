package ch10;
class MyClassFather
{
	public MyClassFather()
	{
		System.out.println("ִ��Ҫ���������ุ��Ĺ�����������");
	}
}

class MyClass extends MyClassFather
{
	//�Ǿ�̬��Ա
	Unstatic u=new Unstatic();
	final UnstaticFinal uf=new UnstaticFinal();
	{
		System.out.println("ִ�зǾ�̬���飡����");
	}
	//��̬��Ա
	static
	{
		System.out.println("ִ�о�̬���飡����");
	}	
	static final StaticFinal sf=new StaticFinal();
	static Static s=new Static();
	//�๹����
	MyClass()
	{
		System.out.println("ִ��Ҫ����������Ĺ�����������");
	}	
}
//������ӡ�ྲ̬final�ĳ�Ա��������
class StaticFinal
{
	StaticFinal()
	{
		System.out.println("��̬final�ĳ�Ա������ʼ��������");
	}
}
//������ӡ�ྲ̬��final�ĳ�Ա��������
class Static
{
	Static()
	{
		System.out.println("��̬��final�ĳ�Ա������ʼ��������");
	}
}
//������ӡ��Ǿ�̬final�ĳ�Ա��������
class UnstaticFinal
{
	UnstaticFinal()
	{
		System.out.println("�Ǿ�̬final�ĳ�Ա������ʼ��������");
	}
}
//������ӡ��Ǿ�̬��final�ĳ�Ա��������
class Unstatic
{
	Unstatic()
	{
		System.out.println("�Ǿ�̬��final�ĳ�Ա������ʼ��������");
	}
}
public class Sample10_16
{
	public static void main(String[] args)
	{
		//��������
		new MyClass();
	}
}
