package ch14;
import java.util.*;
//主类
public class Sample14_11
{
     public static void main(String[] args)
     {
          //创建了TreeSet对象
          TreeSet ts=new TreeSet();
          ////向TreeSet对象中依次添加了数字为5、6、3、2、4的字符串
          ts.add(String.valueOf(5));
          ts.add(String.valueOf(6));
          ts.add(String.valueOf(3));
          ts.add(String.valueOf(2));
          ts.add(String.valueOf(4));
          //移除了HashSet对象中内容为"5"的字符串
          ts.remove(String.valueOf(5));
          //将内容为"1"的字符串添加了进HashSet对象
          ts.add(String.valueOf(1));
          //打印输出TreeSet中的内容
          System.out.print("这里是TreeSet操作后的结果：");
          System.out.println(ts);
     }
}
