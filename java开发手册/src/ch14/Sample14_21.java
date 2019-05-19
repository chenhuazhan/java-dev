package ch14;
import java.util.*;
public class Sample14_21
{
     public static void main(String[] args)
     {
          //创建栈对象
          Stack s=new Stack();
          //创建列表ArrayList对象
          ArrayList al=new ArrayList();
          //对ArrayList对象进行初始化操作
          for(int i=0;i<50;i++)
          {
               al.add(Integer.valueOf(i));
          }
          //打印ArrayList对象初始化后的内容
          System.out.println("ArrayList中元素的初始顺序：");
          System.out.println(al);
          //将ArrayList对象中的元素依次压栈
          for(int i=0;i<50;i++)
          {
               s.push(al.get(i));
          }
          //将栈中的的元素依次出栈并设置给ArrayList对象
          for(int i=0;i<50;i++)
          {
               al.set(i,s.pop());
          }
          //打印经过栈处理后的ArrayList对象中的内容
          System.out.println("使用过栈后，ArrayList中元素的顺序：");
          System.out.println(al);
     }
}
