package ch08_father_and_son;

class Adder
{
	//��������int�Ͳ���ִ�мӷ�
	public int add(int i,int j)
	{
		System.out.print("����int�����ķ��������ã�");
		return i+j;
	}
	//��������double�Ͳ���ִ�мӷ�
	public double add(double i,double j)
	{
		System.out.print("����double�����ķ��������ã�");
		return i+j;
	}
}

class Vehicle2{}
//Car��̳���Vehicle��
class Car2 extends Vehicle2{}
//Truck��̳���Car��
class Truck2 extends Car2 {}
class UseCar
{
	//�÷�������ΪVehicle��
	public void show(Vehicle2 v)
	{
		System.out.println("���õ��Ǿ���Vehicle�����ķ���������");
	}
	//�÷�������ΪCar��
	public void show(Car2 c)
	{
		System.out.println("���õ��Ǿ���Car�����ķ���������");
	}
}


//��A
class A{}
//��B
class B{}
class UseMethod
{
	//�÷�������ΪA��
	public void show(A a)
	{
		System.out.println("���õ��Ǿ���A���Ͳ����ķ���������");
	}
	//�÷�������ΪB��
	public void show(B b)
	{
		System.out.println("���õ��Ǿ���B���Ͳ����ķ���������");
	}
}


public class Function_overload {
	public static void main(String[] args)
	{
		//�������󲢵��÷���
		Adder a1=new Adder();
		//ʹ�ò���2��5����add����
		System.out.println("2+5="+a1.add(2,5));
		////ʹ�ò���5��30.8����add����
		System.out.println("5+30.8="+a1.add(5,30.8));
		
		
		//�������󣬵��÷���
				UseCar a=new UseCar();
				//����Vehicle�����ò�����ָ�����Ķ���
				Vehicle2 v=new Vehicle2();
				//����Car�����ò�����ָ�����Ķ���
				Car2 c=new Car2();
				//����Truck�����ò�����ָ�����Ķ���
				Truck2 t=new Truck2();
				System.out.print("��Vehicle���Ͳ������ã�");
				//ʹ������v��Ϊ��������show����
				a.show(v);
				System.out.print("��Car���Ͳ������ã�");
				//ʹ������c��Ϊ��������show����
				a.show(c);
				System.out.print("��Truck���Ͳ������ã�");
				//ʹ������t��Ϊ��������show����
				a.show(t);
				System.out.print("��null���Ͳ������ã�");
				//��null��Ϊ������show�������е���
				a.show(null);
				
				
				UseMethod u=new UseMethod();
				System.out.print("��null���Ͳ������ã�");
				//��null��Ϊ������show�������е���
				//u.show(null);//�������
				u.show((A)null);//ָ��null������
				u.show((B)null);
	}
}
