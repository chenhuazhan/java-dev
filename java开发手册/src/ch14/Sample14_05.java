package ch14;
import java.util.*;
//主类
public class Sample14_05
{
     public static void main(String[] args)
     {
          //创建Vector类的对象
          Vector v=new Vector();
          //初始化Vector对象中的元素值
          for(int i=0;i<50;i++)
          {
               v.add(String.valueOf(i));
          }
          //对Vector进行操作
          for(int i=50;i<100;i++)
          {
               v.add(String.valueOf(99-i+50));
          }
          //打印Vector列表
          System.out.println("这里是Vector操作后的结果：");
          System.out.println(v);
     }
}
