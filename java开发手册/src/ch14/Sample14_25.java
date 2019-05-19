package ch14;
import java.util.*;
public class Sample14_25
{
     public static void main(String[] args)
     {
          //创建ArrayList对象
          ArrayList al=new ArrayList();
          //为ArrayList初始化随机整数
          for(int i=0;i<20;i++)
          {
               al.add(Integer.valueOf((int)(Math.random()*100)));
          }
          //对ArrayList中的元素进行排序
          Collections.sort(al);
          //在ArrayList中查找指定元素，
          int index=Collections.binarySearch(al,Integer.valueOf(20));
          //打印搜索结果
          if(index<0)//没有找到打印结果
          {
               System.out.println("该列表中没有您需要找的整数，请您再次运行试试！");
          }
          else//找到后的打印结果
          {
               System.out.println("恭喜你，找到了您需要找的元素，其索引是："+index);
               //打印ArrayList中每一个 元素，并标出要找的元素
               System.out.print("{");
               for(int i=0;i<al.size();i++)
               {
                    if(i==index)//打印指定找的元素
                    {
                         System.out.print("["+al.get(i)+"]，");
                    }
                    else//打印其他元素
                    {
                         System.out.print(al.get(i)+"，");
                    }
               }
               System.out.println("}");
          }
     }
}
