package ch09_interface;
//�ӿ��������ıȽ�
//�����������ӿ���ˮ�Ϻ�������ӿ�
interface Flyer4
{
	public void fly();
}
interface Sailer4
{
	public void cruise();
}
//��������������
abstract class Vehicle4 
{
	public abstract void consume();
}
//�������������
abstract class Animal4
{
	public abstract void eat();
}
//�����ɻ�������
abstract class AirPlane4 extends Vehicle4 implements Flyer4
{ 
	//ʵ�ֳ��󷽷�
	public void consume()
	{
		System.out.println("����Ҫ�������ͣ�����");
	}
	public void fly()
	{
		System.out.println("�ҿ����÷ɻ��ķ�ʽ����շɣ�����");
	}
}
//����ˮ�Ϸɻ���
class SeaPlane4 extends AirPlane4 implements Sailer4
{
	//ʵ�ּ̳еĳ��󷽷�
	public void cruise()
	{
		System.out.println("�ҿ����ô��ķ�ʽ��ˮ�к��У�����");
	}
}
//��������
class Bird4 extends Animal4 implements Flyer4
{
	//ʵ�ּ̳еĳ��󷽷�
	public void eat()
	{
		System.out.println("����Ҫ�Զ�������");
	}	
	public void fly()
	{
		System.out.println("�ҿ����ö���ķ�ʽ����շɣ�����");
	}
}
public class Sample9_10
{
	public static void main(String[] args)
	{
		//����ˮ�Ϸɻ��������������
		SeaPlane4 sp=new SeaPlane4();
		Bird4 b=new Bird4();
		//ˮ�Ϸɻ�ִ�еĶ���
		System.out.println("=========ˮ�Ϸɻ�ִ�еĶ���=========");
		sp.fly();
		sp.consume();
		sp.cruise();
		//��ִ�еĶ���
		System.out.println("============��ִ�еĶ���============");
		b.fly();
		b.eat();
	}
}
