package ch08_father_and_son;
/*
 * ƻ�����棬����ͨ�������в�ͨ��
 */
public class Type_change_appleToPear {

	public static void main(String[] args)
	{
      Fruit f=new Apple();
      Pear p=(Pear)f;
	}    
}
//ˮ����
class Fruit
{
}
//ƻ����
class Apple extends Fruit
{
}
//����
class Pear extends Fruit
{
}