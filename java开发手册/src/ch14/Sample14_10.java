package ch14;
import java.util.*;
public class Sample14_10
{
     public static void main(String[] args)
     {
          //创建了LinkedHashSet对象
          LinkedHashSet lhs=new LinkedHashSet();
          //向LinkedHashSet对象中依次添加了内容为5、1、3、2、4的字符串
          lhs.add(String.valueOf(5));
          lhs.add(String.valueOf(1));
          lhs.add(String.valueOf(3));
          lhs.add(String.valueOf(2));
          lhs.add(String.valueOf(4));
          //移除了HashSet对象中内容为"5"的字符串
          lhs.remove(String.valueOf(5));
          //将null值添加了进HashSet对象
          lhs.add(null);
          //打印输出LinkedHashSet中的元素内容
          System.out.print("这里是LinkedHashSet操作后的结果：");
          System.out.println(lhs);
     }
}
