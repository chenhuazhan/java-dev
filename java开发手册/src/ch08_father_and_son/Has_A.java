package ch08_father_and_son;
/*
 * HAS-A:��Aӵ����B
 */
class Car0
{
	private Tyre t=new Tyre();
	public Tyre getTyre()  //����������
	{ 
		return t;
	}
}
class Tyre
{ 
	private String material="��";
	private String color="��ɫ";
	public String getMaterial()  //����������
	{ 
		return material;
	}
	public String getColor()  //����������
	{
		return color;
	}	
}
public class Has_A
{
	public static void main(String[] args)
	{
		//��������
		Car0 c=new Car0();
		//���ʳ�Ա
		System.out.println("�γ���ʹ����̥����ɫΪ��"+c.getTyre().getColor());
		System.out.println("�γ���ʹ����̥�Ĳ���Ϊ��"+c.getTyre().getMaterial());
	}
}


