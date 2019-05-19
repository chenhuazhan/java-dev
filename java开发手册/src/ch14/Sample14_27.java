package ch14;
import java.util.*;
public class Sample14_27
{
     public static void main(String[] args)
     {
          //分别创建3个空的ArrayList对象
          List l1=new ArrayList();
          List l2=new ArrayList();
          List l3=new ArrayList();
          //对ArrayList对象l1与l2进行初始化操作
          for(int i=0;i<12;i++)
          {
               l1.add(Integer.valueOf(i));
               l2.add(Integer.valueOf(i+50));
          }
          //使用copy方法
          System.out.println("===================================copy"
          +"=====================================");
          System.out.println("方法使用前元素为："+l1);
          Collections.copy(l1,l2);
          System.out.println("方法使用后元素为："+l1);
          //使用disjoint方法
          System.out.println("==================================disjoint"+
          "==================================");
          if(!Collections.disjoint(l1,l2))
               System.out.println("列表l1与l2中有相同的元素！！！");
          System.out.println("====================================addAll"+
          "==================================");
          System.out.println("方法使用前元素为："+l1);
          Collections.addAll(l1,new String[]{"tom","jc"});
          System.out.println("方法使用后元素为："+l1);
          //使用fill方法
          System.out.println("=======================================fill"
          +"=================================");
          System.out.println("方法使用前元素为："+l2);
          Collections.fill(l2,"0");
          System.out.println("方法使用后元素为："+l3);
          //使用frequency方法
          System.out.println("=================================frequency"+
          "==================================");
          int i=Collections.frequency(l3,"0");
          System.out.println("l3中有元素'0' "+i+" 个！！！");
          //使用replaceAll方法
          System.out.println("=================================replaceAll"
          +"=================================");
          System.out.println("方法使用前元素为："+l2);
          Collections.replaceAll(l2,"0","3");
          System.out.println("方法使用后元素为："+l2);
          //使用reverse方法
          System.out.println("====================================reverse"
          +"=================================");
          System.out.println("方法使用前元素为："+l1);
          Collections.reverse(l1);
          System.out.println("方法使用后元素为："+l1);
          //使用rotate方法
          System.out.println("=====================================rotate"
          +"=================================");
          System.out.println("方法使用前元素为："+l1);
          Collections.rotate(l1,6);
          System.out.println("方法使用后元素为："+l1);
          //使用swap方法
          System.out.println("=======================================swap"+
          "==================================");
          System.out.println("方法使用前元素为："+l1);
          Collections.swap(l1,6,10);
          System.out.println("方法使用后元素为："+l1);     
     }
}
