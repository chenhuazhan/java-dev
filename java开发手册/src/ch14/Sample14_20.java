package ch14;
import java.util.*;
public class Sample14_20
{
     public static void main(String[] args)
     {
          //创建HashMap对象
          Map hm=new HashMap();
          //向Map中插入键/值对
          hm.put(Integer.valueOf(10001),"Tom");
          hm.put(Integer.valueOf(10003),"Jerry");
          hm.put(Integer.valueOf(10002),"John");
          hm.put(Integer.valueOf(10004),"Lili");
          //获取Map的键集合
          Set keySet=hm.keySet();
          //获取键集合的迭代器
          Iterator ii=keySet.iterator();
          //通过迭代器遍历假扮集合来遍历HashMap
          System.out.println("==========通过键集合对Map进行遍历==========");
          while(ii.hasNext())
          {
          	Object okey=ii.next();
          	//将获取的键引用进行强制类型转换
          	Integer i=(Integer)okey;
          	//通过键获取相应的值
          	Object ovalue=hm.get(okey);
          	//将获取的值引用进行强制类型转换
          	String s=(String)ovalue;
          	//打印键、值的情况
          	System.out.println("键："+i.intValue()
          	        +"，值："+s+"，值长度："+s.length()+"。");
          }
          //获取Map中所有值的Collection
          Collection cvalue=hm.values();
          //用for-each循环对所有值进行遍历
          System.out.println("=======用for-each循环对所有值进行遍历=======");
          for(Object otemp:cvalue)
          {
          	//对引用进行强制类型转换
          	String s=(String)otemp;
          	System.out.println("值："+s+"，值长度："+s.length()+"。");
          }
     }
}
