package ch14;
import java.util.*;
//主类
public class Sample14_06
{
     public static void main(String[] args)
     {
          //创建列表LinkedList类的对象
          LinkedList ll=new LinkedList();
          //初始化LinkedList对象
          for(int i=0;i<50;i++)
          {
               ll.add(String.valueOf(i));
          }
          //对LinkedList进行插入操作
          for(int i=15;i<30;i++)
          {
               ll.add(i,String.valueOf(30-i+15));
          }
          //打印LinkedList列表
          System.out.println("这里是LinkedList操作后的结果：");
          System.out.println(ll);
     }
}
