package ch14;
import java.util.*;
public class Sample14_17
{
     public static void main(String[] args)
     {
          //创建了Hashtable对象
          Hashtable ht=new Hashtable();
          //向Hashtable对象中添加内容不同的键值对
          ht.put(Integer.valueOf(97005),"Tom");
          ht.put(Integer.valueOf(97003),"Jerry");
          ht.put(Integer.valueOf(97004),"Lucy");
          ht.put(Integer.valueOf(97001),"Smith");
          ht.put(Integer.valueOf(97002),"Jc");
          System.out.print("这里是Hashtable操作前的结果：");
          System.out.println(ht);
          //判断Hashtable对象中是否存在键为97001的值
          System.out.print("判断Hashtable对象中是否存在键为97001的值:");
          boolean b=ht.containsKey(97001);//使用了自动打包
          System.out.println((b)?"存在！！！":"！！！不存在");
          //替换键97002对应的值
          ht.put(Integer.valueOf(97002),"David");          
          //打印输出Hashtable中的内容
          System.out.print("这里是Hashtable操作后的结果：");
          System.out.println(ht);
          //取出指定键对应的值
          Object o=ht.get(97003);//使用了自动打包
          String s=(String)o;
          System.out.println("键97003对应的值为："+s+"，长度为："+s.length()+"。");
     }
}
