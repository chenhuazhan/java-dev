package ch08_father_and_son;
/*
 * USES-A:��A�õ�����B�����󣩵ĳ�Ա
 */
class SaloonCar
{
	public void startUp(Benzine b)
	{
		//�ж��������Ƿ����
		if(b.isEnough())
		{
			System.out.println("��ϲ�㣬���͵Ĵ��������㣬������������������");
		}			
	}
}
class Benzine
{ 
	private int cubage=100;
	public boolean isEnough()
	{
		//����80Ϊ���㣬��֮������
		if(cubage>80)
		{
			return true;
		}			
		else
		{
			return false;
		}			
	}
}

public class Uses_A {
	public static void main(String[] args)
	{
		//��������
		Benzine b=new Benzine();
		SaloonCar sc=new SaloonCar ();
		//���÷���
		sc.startUp(b);
	}
}
