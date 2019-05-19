package ch15;
//�����ⲿ�ӿ�
interface OuterInterface
{
	//�����ڲ��ӿ�
	interface InnerInterface
	{
		//�����ڲ��ӿ��еķ���
		public void inShow();
	}
	//�����ⲿ�ӿ��еķ���
	public void outShow();
}
//����ʵ�����ڲ��ӿڵ���
class InnerInterfaceImpl implements OuterInterface.InnerInterface
{
	//ʵ���ڲ��ӿ��еķ���
	public void inShow()
	{
		System.out.println("��ϲ�㣬�����ɹ���ʵ�����ڲ��ӿڣ�����");
	}
}
//����ʵ���ⲿ�ӿڵķ���
class OutInterfaceImpl implements OuterInterface
{
	//ʵ���ⲿ�ӿ��еķ���
	public void outShow()
	{
		System.out.println("��ϲ�㣬�����ɹ���ʵ�����ⲿ�ӿڣ�����");
	}
}
//����
public class Sample15_16
{
	public static void main(String[] args)
	{
		//����ʵ�����ڲ��ӿ����ⲿ�ӿ���Ķ���
		OuterInterface.InnerInterface iic=new InnerInterfaceImpl();
		OuterInterface oic=new OutInterfaceImpl();
		//�������������еķ���
		iic.inShow();
		oic.outShow();
	}
}
