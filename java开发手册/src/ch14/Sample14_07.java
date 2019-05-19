package ch14;
import java.util.*;
//主类
public class Sample14_07
{
     public static void main(String[] args)
     {
          //创建字符串一维数组对象
          String[] s={"tom","jerry","lucy","jc"};
          //将一维字符串数组对象转换为列表
          List l=Arrays.asList(s);
          //打印转换后的列表中的内容
          System.out.print("这是将字符串数组转换为列表后的结果：");
          System.out.println(l);
     }
}
