package ch14;
import java.util.*;
public class Sample14_22
{
     public static void main(String[] args)
     {
          //创建栈对象
          Deque stack=new ArrayDeque();
          //声明要倒序的数组
          String[] sa=new String[]{"1","a","2","b","3","c","4","d"};
          //打印数组初始内容并将数组元素入栈
          System.out.print("数组中元素的初始顺序为：");
          for(String temps:sa)
          {
          	//打印数组元素
          	System.out.print(temps+", ");
          	//数组元素入栈
          	stack.push(temps);
          }          
          //打印倒序后的元素
          System.out.print("\n数组中元素倒序后结果为：");
          while(stack.size()!=0)
          {
          	System.out.print(stack.pop()+", ");
          }
          System.out.println("");//打印换行          
     }
}
