package ch17;
import java.util.*;
import java.util.concurrent.*;
//自定义的元素类
class MyElement
{
	//表示元素内容的成员
	String content;
	//有参构造器
	public MyElement(String content)
	{
		this.content=content;	
	}	
	//重写toString方法
	public String toString()
	{
		return "[内容为“"+content+"”] ";
	}
}
//主类
public class Sample17_12
{
	//主方法用再抛出的方式对异常进行处理	
	public static void main(String args[]) throws InterruptedException
	{
		//创建阻塞队列，尺寸为10
		BlockingQueue bq=new ArrayBlockingQueue(10);	
		//向队列中添加10个元素
		for(int i=0;i<10;i++)
		{
			bq.put(new MyElement("No"+i));
		}	
		System.out.println("成功向队列中添加10个元素！！！");
		//再向队列中添加10个元素
		for(int i=10;i<20;i++)
		{
			bq.put(new MyElement("No"+i));
		}	
		System.out.println("再次成功向队列中添加10个元素！！！");	
	}
}
