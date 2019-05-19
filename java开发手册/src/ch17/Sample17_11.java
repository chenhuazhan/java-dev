package ch17;
import java.util.*;
//自定义的元素类
class MyElement11 implements Comparable
{
	//表示优先级的成员
	int priority;
	//表示元素内容的成员
	String content;
	//有参构造器
	public MyElement11(int priority,String content)
	{
		this.priority=priority;
		this.content=content;	
	}	
	//实现确定自然顺序的compareTo方法
	public int compareTo(Object o)
	{
		//按优先级从小到大排序
		return this.priority-((MyElement11)o).priority;
	}
	//重写toString方法
	public String toString()
	{
		return "[优先极为："+priority+"，内容为“"+content+"”] ";
	}
}
//自定义的比较器
class MyComparator implements Comparator
{
	//实现确定顺序的compare方法
	public int compare(Object o1,Object o2)
	{
		//按优先级从大到小排序
		return ((MyElement11)o2).priority-((MyElement11)o1).priority;
	}
}
//主类
public class Sample17_11
{
	//访问指定队列所有元素的方法
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
	//主方法	
	public static void main(String args[])
	{
		//创建SortedSet集合
		SortedSet ss=new TreeSet();
		//向SortedSet集合中添加10个元素
		for(int i=0;i<10;i++)
		{
			ss.add(new MyElement11((int)Math.round(Math.random()*100),"第"+i+"个"));
		}
		//将SortedSet集合中的元素添加到优先级队列中
		Queue pq1=new PriorityQueue(ss);
		//对第一个优先级队列访问
		System.out.println("=============对第一个优先级队列访问=============");
		scanQueue(pq1);
		//创建优先级队列对象，并指定比较器
		Queue pq2=new PriorityQueue(10,new MyComparator());
		//向优先级队列中添加10个元素
		for(int i=0;i<10;i++)
		{
			pq2.offer(new MyElement11((int)Math.round(Math.random()*100),"第"+i+"个"));
		}
		//对第二个优先级队列访问
		System.out.println("=============对第二个优先级队列访问=============");
		scanQueue(pq2);		
	}
}
