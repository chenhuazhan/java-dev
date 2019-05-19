package ch14;
import java.util.*;
//自定义键的比较器
class MyComparator implements Comparator
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
public class Sample14_19
{
     public static void main(String[] args)
     {
          //创建普通的TreeMap对象
          TreeMap tmp=new TreeMap();
          //向TreeMap对象中添加内容不同的键值对
          tmp.put(Integer.valueOf(97004),"Lucy");
          tmp.put(Integer.valueOf(97001),"Smith");
          tmp.put(Integer.valueOf(97002),"Jc");
          //创建指定比较器的TreeMap对象
          TreeMap tmc=new TreeMap(new MyComparator());
          //向TreeMap对象中添加内容不同的键值对
          tmc.put(Integer.valueOf(97004),"Lucy");
          tmc.put(Integer.valueOf(97001),"Smith");
          tmc.put(Integer.valueOf(97002),"Jc");
          //打印普通的TreeMap对象中的内容
          System.out.println("=============================="
               +"===========================================");
          System.out.print("普通的TreeMap中的内容为：");
          System.out.println(tmp);
          //打印指定比较器的TreeMap对象中的内容
          System.out.println("=============================="
               +"===========================================");
          System.out.print("指定比较器的TreeMap中的内容为：");
          System.out.println(tmc);
          //移除了普通TreeMap对象中键为97001的值
          tmp.remove(Integer.valueOf(97001));
          //替换普通TreeMap对象中键97002对应的值
          tmp.put(Integer.valueOf(97002),"David");          
          //打印输出处理后普通TreeMap中的内容
          System.out.println("=============================="
               +"===========================================");
          System.out.print("处理后普通TreeMap中的内容：");
          System.out.println(tmp);
          System.out.println("=============================="
               +"===========================================");
     }
}
