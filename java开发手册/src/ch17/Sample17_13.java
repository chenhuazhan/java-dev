package ch17;
import java.util.*;
import java.util.concurrent.*;
public class Sample17_13
{
	public static void main(String[] args) throws InterruptedException
	{
		//��������ջ���󣬲�ָ���̶�����Ϊ8
		BlockingDeque blockingStack=new LinkedBlockingDeque(8);
		//��ջ������8��Ԫ��
		for(int i=0;i<8;i++)
		{
			blockingStack.putFirst(i+"");
		}
		//��ӡ��ʾ��Ϣ
		System.out.println("��ϲ�㣬�ɹ���ջ�в���8��Ԫ�أ�����");
		//����ջ������8��Ԫ��
		for(int i=8;i<16;i++)
		{
			blockingStack.putFirst(i+"");
		}	
		//�ٴδ�ӡ��ʾ��Ϣ
		System.out.println("��ϲ�㣬�ֳɹ���ջ�в���8��Ԫ�أ�����");			
	}
}
