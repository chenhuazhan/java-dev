package ch08_father_and_son;
/*
 * ��̬������ʵ�ַ���
 */

//���������Car
abstract class Car4
{
	//������󷽷�brake
	public abstract void brake();
}
//����ǳ�����Truck�̳���Car��
class Truck4 extends Car4
{
	//ʵ��brake����
	public void brake()
	{
		System.out.println("���ڿ�����ɲ������");
	}
} 
//����ǳ�����Mini�̳���Car��
class Mini extends Car4
{
	////ʵ��brake����
	public void brake()
	{
		System.out.println("�����������ɲ������");
	}
}
public class Polymorphism
{
	public static void main(String[] args)
	{
		//����Car����c������ָ��Truck��Ķ���
		Car4 c=new Truck4();
		System.out.print("���õķ���Ϊ��");
		//ʹ������c����brake����
		c.brake();
		//������cָ��Mini��Ķ���
		c=new Mini();
		System.out.print("���õķ���Ϊ��");
		//ʹ������c����brake����
		c.brake();
	}
}
