package ch17;
import java.util.*;
public class Sample17_10
{
	public static void main(String args[])
	{
		//�������ж���
		Queue queue=new LinkedList();
		//����������10��Ԫ��
		for(int i=0;i<10;i++)
		{
			queue.offer(""+i);
		}
		//�������е�Ԫ��ȡ������ӡ
		System.out.print("�����е�Ԫ��Ϊ��");
		Object o=queue.poll();
		while(o!=null)
		{
			System.out.print("["+o+"] ");
			o=queue.poll();
		}
		System.out.println();
	}
}
