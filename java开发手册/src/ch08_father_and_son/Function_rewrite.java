package ch08_father_and_son;
/*
 * ��������д����
 * ����������Ϊ�����������ͣ��򷵻����ͱ�����ͬ����Ϊ�����������ͣ�
 * �������ͬ���Ǹ����ͣ���ӣ������ͣ����ʼ�������һ�����ܱȱ���д������խ
 * 
 * tip:
 * ��д�ǻ��ڼ̳еģ�������ܼ̳�һ���������򲻹�����д��Ҳ�Ͳ�����ѭ��д����
 * ��private���εķ������ܱ��̳У�����������ͬ������Ҳ��������д
 * 
 * ��̬�������Ա��̳У���̬����û����д
 * 1.�Ǿ�̬������ͼ��д��̬�����������
 * 2.��̬������д��̬����ʱʵ���������ظ��ྲ̬������������д
 */

class Vehicle
{
	public void startUp()
	{
		System.out.println("һ�㽻ͨ���ߵ���������������");
	}
}
class Car extends Vehicle
{
	public void startUp()
	{
		//��д��չ���๦��
		//super.startUp();
		
		System.out.println("�γ�����������������");
	}
}
public class Function_rewrite {
	
	public static void main(String[] args)
	{
		//�������󲢵��÷���
		Car c=new Car();
		System.out.print("ʵ�ʵ��õķ���Ϊ��");
		c.startUp();
	}
}