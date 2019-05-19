package ch14;
import java.util.*;
public class Sample14_26
{
     public static void main(String[] args)
     {
          //创建ArrayList对象
          ArrayList al=new ArrayList();
          //将13张牌添加进列表
          for(int i=1;i<14;i++)
          {
               //将指定的数字翻译成牌面表示
               String s=null;
               switch(i)
               {
               	 case 1: case 2: case 3: case 4:
               	 case 5: case 6: case 7: case 8:
               	  s=(i+1)+"";
               	 break;
               	 case 9:  s="10";	 break;
               	 case 10: s="J";   	 break;  
               	 case 11: s="Q";   	 break;   
               	 case 12: s="K";	 break;   
               	 case 13: s="A";  	 break; 
               }                               
               al.add("黑桃"+s);
               al.add("红桃"+s);
               al.add("梅花"+s);
               al.add("方片"+s);
          }
          al.add("大王");
          al.add("小王");
          //打印初始顺序
          System.out.println("这是扑克牌的初始顺序：");
          System.out.println(al);
          //进行洗牌
          Collections.shuffle(al);
          //打印洗过牌后的顺序
          System.out.println("\n这是扑克牌的洗过牌后的顺序：");
          System.out.println(al);
     }
}
