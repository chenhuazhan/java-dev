package ch14;
import java.util.*;
//主类
public class Sample14_04
{
     public static void main(String[] args)
     {
          //创建列表ArrayList的对象
          ArrayList al=new ArrayList();
          //初始化ArrayList对象中的元素
          for(int i=0;i<50;i++)
          {
               al.add(String.valueOf(i));
          }
          //对ArrayList进行操作
          for(int i=60;i<75;i++)
          {
               al.set(i-45,String.valueOf(i));
          }
          //打印ArrayList列表中的内容
          System.out.println("这里是ArrayList操作后的结果：");
          System.out.println(al);
          //取出指定索引的元素并处理
          Object o=al.get(22); 
          String s=(String)o;
          System.out.println("索引为22的元素长度为："+s.length());
     }
}
