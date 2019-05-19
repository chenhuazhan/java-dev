package ch14;
import java.util.*;
public class Sample14_16
{
     public static void main(String[] args)
     {
          //创建了HashMap对象
          HashMap hm=new HashMap();
          //向HashMap对象中添加内容不同的键值对
          hm.put(Integer.valueOf(97005),"Tom");
          hm.put(Integer.valueOf(97003),"Jerry");
          hm.put(Integer.valueOf(97004),"Lucy");
          hm.put(Integer.valueOf(97001),"Smith");
          hm.put(Integer.valueOf(97002),"Jc");
          System.out.print("这里是HashMap操作前的结果：");
          System.out.println(hm);
          //移除了HashMap对象中键为97001的值
          hm.remove(Integer.valueOf(97001));
          //替换键97002对应的值
          hm.put(Integer.valueOf(97002),"David");
          //打印输出HashMap中的内容
          System.out.print("这里是HashMap操作后的结果：");
          System.out.println(hm);
          //取出指定键对应的值
          Object o=hm.get(97003);//使用了自动打包功能
          String s=(String)o;
          System.out.println("键97003对应的值为："+s+"，长度为："+s.length()+"。");
     }
}
