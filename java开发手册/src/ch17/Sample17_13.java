package ch17;
import java.util.*;
import java.util.concurrent.*;
public class Sample17_13
{
	public static void main(String[] args) throws InterruptedException
	{
		//创建阻塞栈对象，并指定固定容量为8
		BlockingDeque blockingStack=new LinkedBlockingDeque(8);
		//向栈中推入8个元素
		for(int i=0;i<8;i++)
		{
			blockingStack.putFirst(i+"");
		}
		//打印提示信息
		System.out.println("恭喜你，成功向栈中插入8个元素！！！");
		//再向栈中推入8个元素
		for(int i=8;i<16;i++)
		{
			blockingStack.putFirst(i+"");
		}	
		//再次打印提示信息
		System.out.println("恭喜你，又成功向栈中插入8个元素！！！");			
	}
}
