package ch09_interface;
//�ӿڵĶ�̬
//ʳ��ӿ�
interface Food
{
	//��ʳ��ķ���
	public void doEat();
}
//ˮ��������
abstract class Fruit
{ }
//�������
abstract class Meat 
{ }
//ƻ����̳���ˮ����ʵ����ʳ��ӿ�
class Apple extends Fruit implements Food
{
	//ʵ�ֽӿ��еķ���
	public void doEat()
	{
		System.out.println("����ƻ����������ˮ�����ҿ��Գ䵱ʳ�ﱻ�Ե�����");
	}
}
//ţ����̳�������ʵ����ʳ��ӿ�
class Beef extends Meat implements Food
{
	//ʵ�ֽӿ��еķ���
	public void doEat()
	{
		System.out.println("����ţ�⣬���������࣬�ҿ��Գ䵱ʳ�ﱻ�Ե�����");
	}
}
public class Sample9_11
{
	public static void main(String[] args)
	{
		//����ƻ������
		Food f=new Apple();
		//����ƻ���Եķ���
		f.doEat();
		//����ţ�����
		f=new Beef();
		//����ţ��Եķ���
		f.doEat();
	}
}
