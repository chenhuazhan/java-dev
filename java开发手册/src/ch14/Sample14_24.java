package ch14;
import java.util.*;
//自定义键的比较器
class MyComparator1 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		//将引用进行强制类型转换
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		//按数值从大到小的顺序排序
		return i2.intValue()-i1.intValue();
	}
}
//主类
public class Sample14_24
{
     public static void main(String[] args)
     {
          //创建ArrayList对象
          ArrayList al=new ArrayList();
          //为ArrayList初始化随机整数
          for(int i=0;i<50;i++)
          {
               al.add(Integer.valueOf((int)(Math.random()*100)));
          }
          //打印初始化后ArrayList中的元素
          System.out.println("这里是排序之前ArrayList中的元素：");
          System.out.println(al);
          //对ArrayList中的元素进行排序
          Collections.sort(al);
          //打印排序后的ArrayList对象
          System.out.println("这里是排序之后ArrayList中的元素：");
          System.out.println(al);
          //对ArrayList中的元素使用比较器进行排序
          Collections.sort(al,new MyComparator1());
          //打印使用比较器排序后的ArrayList对象
          System.out.println("这里是使用比较器排序之后ArrayList中的元素：");
          System.out.println(al);
     }
}
