package ch15;
class Outter6
{
	public void getInner()
	{
		//����ֲ��ڲ���
		class Inner
		{
			//�����ڲ��෽��show
			public void show()
			{ 
				System.out.println("��ϲ�㣬���岢�����˾ֲ��ڲ���Ķ��󣡣�");
			}
		}
		//�����ֲ��ڲ������
		Inner i=new Inner();
		i.show();		
	}
}
public class Sample15_06
{
	public static void main(String[] args)
	{
		//�����ⲿ�����
		Outter6 o=new Outter6();
		//�����ⲿ���е�getInner����
		o.getInner();
	}
}
