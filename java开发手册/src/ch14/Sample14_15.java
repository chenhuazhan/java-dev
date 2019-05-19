package ch14;
import java.util.*;
//元素类
class MyEntryForEach
{
	//元素的成员变量声明
	int intMember;
	//构造器
	public MyEntryForEach(int intMember)
	{
		this.intMember=intMember;
	}
	//重写toString方法
	public String toString()
	{
		return this.intMember+"";
	}
}
//主类
public class Sample14_15
{
	public static void main(String[] args)
	{
	     //创建了HashSet对象
	     HashSet hs=new HashSet();
	     //向HashSet对象中添加内容不同的学生对象元素
	     hs.add(new MyEntryForEach(23));
	     hs.add(new MyEntryForEach(24));
	     hs.add(new MyEntryForEach(25));
	     hs.add(new MyEntryForEach(27));
	     hs.add(new MyEntryForEach(29));
	     //打印输出HashSet中的内容
		 System.out.print("这里是HashSet操作前的结果：");
	     System.out.println(hs);
	     //通过for-each循环得到元素并修改其中的元素
	     for(Object o:hs)
	     {
	          //对元素引用进行强制类型转换
	          MyEntryForEach temp=(MyEntryForEach)o;
	          temp.intMember=55;
	     }
	     //打印输出HashSet中的内容
		 System.out.print("这里是HashSet操作后的结果：");
	     System.out.println(hs);
	}
}
