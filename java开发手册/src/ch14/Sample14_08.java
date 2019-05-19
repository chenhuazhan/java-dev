package ch14;
import java.util.*;
public class Sample14_08
{
     public static void main(String[] args)
     {
          //创建HashSet对象
          HashSet hs=new HashSet();
          //向HashSet对象中依次添加了内容为5、1、3、2、4的字符串
          hs.add(String.valueOf(5));
          hs.add(String.valueOf(1));
          hs.add(String.valueOf(3));
          hs.add(String.valueOf(2));
          hs.add(String.valueOf(4));
          //移除了HashSet对象中内容为"5"的字符串
          hs.remove(String.valueOf(5));
          //再添加一个内容为"1"的字符串
          hs.add(String.valueOf(1));
          //将null值添加了进HashSet中
          hs.add(null);
          //打印HashSet对象中的内容
          System.out.println("这里是HashSet操作后的结果：");
          System.out.println(hs);
     }
}
