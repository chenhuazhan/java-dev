package ch14;
import java.util.*;
public class Sample14_18
{
     public static void main(String[] args)
     {
          //创建LinkedHashMap对象
          LinkedHashMap lhm=new LinkedHashMap();
          //向LinkedHashMap对象中添加内容不同的键值对
          lhm.put(Integer.valueOf(97005),"Tom");
          lhm.put(Integer.valueOf(97003),"Jerry");
          lhm.put(Integer.valueOf(97004),"Lucy");
          //打印输出LinkedHashMap中的内容
          System.out.print("这里是LinkedHashMap操作前的结果：");
          System.out.println(lhm);
          //替换键97003对应的值
          lhm.put(Integer.valueOf(97003),"David");
          //判断LinkedHashMap中是否存在内容为"Jerry"的值
          System.out.print("判断LinkedHashMap中是否存在内容为Jerry的值:");
          boolean b=lhm.containsValue("Jerry");
          System.out.println((b)?"存在！！！":"！！！不存在");
          //打印输出LinkedHashMap中的内容
          System.out.print("这里是LinkedHashMap操作后的结果：");
          System.out.println(lhm);
     }
}
