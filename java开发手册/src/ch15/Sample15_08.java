package ch15;
//�����ֲ��ڲ���Ҫʵ�ֵĽӿ�
interface ForInner
{
	void sayHello();
}
//�ⲿ��
class Outter
{	
	//�����ⲿ���н�ָ��ֲ��ڲ�����������
	ForInner forInner=null;
	public void getInner()
	{
		//����ֲ��ڲ���
		class Inner implements ForInner
		{
			//ʵ�ֽӿ��еķ��� sayHello
			public void  sayHello()
			{
				System.out.println("��ã����Ǿֲ��ڲ�������һ����ڣ�����");
			}
		}
		//�����ֲ��ڲ������
		forInner=new Inner();		
	}
}
//����
public class Sample15_08
{
	public static void main(String[] args)
	{
		//�����ⲿ�����
		Outter o=new Outter();
		//�����ⲿ���е�getInner����
		o.getInner();
		//���þֲ��ڲ�������sayHello����
		o.forInner.sayHello();
	}
}
