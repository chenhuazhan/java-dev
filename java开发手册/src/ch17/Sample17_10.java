package ch17;
import java.util.*;
public class Sample17_10
{
	public static void main(String args[])
	{
		//创建队列对象
		Queue queue=new LinkedList();
		//向队列中添加10个元素
		for(int i=0;i<10;i++)
		{
			queue.offer(""+i);
		}
		//将队列中的元素取出并打印
		System.out.print("队列中的元素为：");
		Object o=queue.poll();
		while(o!=null)
		{
			System.out.print("["+o+"] ");
			o=queue.poll();
		}
		System.out.println();
	}
}
