package ch15;
import java.util.*;
//�ⲿ��
class Outter10
{
	//�����ڲ���
	static class Inner
	{
		//�����ڲ��෽��show
		public void show()
		{
			//��ӡ���
			System.out.println("��ϲ�㣬�ɹ��Ĵ�"+
			"���˾�̬�ڲ���Ķ��󣡣���");
		}
	}
	//�����ⲿ������ͨ�ķ���
	public void getInner()
	{		
		//���ⲿ���д����ڲ������
		Inner ii=new Inner();
		ii.show();
	}
}
//����
public class Sample15_10
{
	public static void main(String[] args)
	{
		//���ⲿ���ⴴ����̬�ڲ���Ķ���
		Outter10.Inner i=new Outter10.Inner();
		i.show();
		//���ⲿ����ʹ�þ�̬�ڲ���Ķ���
		new Outter10().getInner();
	}
}
