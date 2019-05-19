package ch17;
import java.util.*;
//�Զ����Ԫ����
class MyElement11 implements Comparable
{
	//��ʾ���ȼ��ĳ�Ա
	int priority;
	//��ʾԪ�����ݵĳ�Ա
	String content;
	//�вι�����
	public MyElement11(int priority,String content)
	{
		this.priority=priority;
		this.content=content;	
	}	
	//ʵ��ȷ����Ȼ˳���compareTo����
	public int compareTo(Object o)
	{
		//�����ȼ���С��������
		return this.priority-((MyElement11)o).priority;
	}
	//��дtoString����
	public String toString()
	{
		return "[���ȼ�Ϊ��"+priority+"������Ϊ��"+content+"��] ";
	}
}
//�Զ���ıȽ���
class MyComparator implements Comparator
{
	//ʵ��ȷ��˳���compare����
	public int compare(Object o1,Object o2)
	{
		//�����ȼ��Ӵ�С����
		return ((MyElement11)o2).priority-((MyElement11)o1).priority;
	}
}
//����
public class Sample17_11
{
	//����ָ����������Ԫ�صķ���
	public static void scanQueue(Queue queue)
	{
		Object o=queue.poll();
		while(o!=null)
		{
			System.out.print(o);
			o=queue.poll();
		}
		System.out.println();		
	}	
	//������	
	public static void main(String args[])
	{
		//����SortedSet����
		SortedSet ss=new TreeSet();
		//��SortedSet���������10��Ԫ��
		for(int i=0;i<10;i++)
		{
			ss.add(new MyElement11((int)Math.round(Math.random()*100),"��"+i+"��"));
		}
		//��SortedSet�����е�Ԫ����ӵ����ȼ�������
		Queue pq1=new PriorityQueue(ss);
		//�Ե�һ�����ȼ����з���
		System.out.println("=============�Ե�һ�����ȼ����з���=============");
		scanQueue(pq1);
		//�������ȼ����ж��󣬲�ָ���Ƚ���
		Queue pq2=new PriorityQueue(10,new MyComparator());
		//�����ȼ����������10��Ԫ��
		for(int i=0;i<10;i++)
		{
			pq2.offer(new MyElement11((int)Math.round(Math.random()*100),"��"+i+"��"));
		}
		//�Եڶ������ȼ����з���
		System.out.println("=============�Եڶ������ȼ����з���=============");
		scanQueue(pq2);		
	}
}
