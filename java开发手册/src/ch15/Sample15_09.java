package ch15;
//�ⲿ��
class Outter9
{
	//������ͨ��Ա����
	static int x=100;
	//���徲̬����
	public static void getInner()
	{
		//�����ڲ���
		class Inner
		{
			//�����ڲ��෽��show
			public void show()
			{
				//��ӡ����������ø÷����еľֲ�����
				System.out.println("���ʷ����еľֲ�������x = "+x);
			}
		}
		Inner i=new Inner();
		i.show();		
	}
}
//����
public class Sample15_09
{
	public static void main(String[] args)
	{
		//���þ�̬����
		Outter9.getInner();
	}
}
