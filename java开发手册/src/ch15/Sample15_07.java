package ch15;
class Outter7
{
	public void getInner()
	{
		//����ֲ�����
		final int x=100;
		//����ֲ��ڲ���
		class Inner
		{
			//����ֲ��ڲ��෽��show
			public void show()
			{
				//��ӡ����������ø÷����еľֲ�����
				System.out.println("���ʷ����еľֲ�������x = "+x);
			}
		}
		//�����ֲ��ڲ������
		Inner i=new Inner();
		i.show();		
	}
}
public class Sample15_07
{
	public static void main(String[] args)
	{
		//�����ⲿ�����
		Outter7 o=new Outter7();
		//�����ⲿ���е�getInner����
		o.getInner();
	}
}
