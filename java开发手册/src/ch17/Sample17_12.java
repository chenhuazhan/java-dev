package ch17;
import java.util.*;
import java.util.concurrent.*;
//�Զ����Ԫ����
class MyElement
{
	//��ʾԪ�����ݵĳ�Ա
	String content;
	//�вι�����
	public MyElement(String content)
	{
		this.content=content;	
	}	
	//��дtoString����
	public String toString()
	{
		return "[����Ϊ��"+content+"��] ";
	}
}
//����
public class Sample17_12
{
	//�����������׳��ķ�ʽ���쳣���д���	
	public static void main(String args[]) throws InterruptedException
	{
		//�����������У��ߴ�Ϊ10
		BlockingQueue bq=new ArrayBlockingQueue(10);	
		//����������10��Ԫ��
		for(int i=0;i<10;i++)
		{
			bq.put(new MyElement("No"+i));
		}	
		System.out.println("�ɹ�����������10��Ԫ�أ�����");
		//������������10��Ԫ��
		for(int i=10;i<20;i++)
		{
			bq.put(new MyElement("No"+i));
		}	
		System.out.println("�ٴγɹ�����������10��Ԫ�أ�����");	
	}
}
