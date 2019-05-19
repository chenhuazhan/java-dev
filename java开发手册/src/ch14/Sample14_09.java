package ch14;
import java.util.*;
//将作为集合元素类型的Student类
class Student4 
{
     //学生类的姓名成员属性
     String name;
     //学生类的无参构造器
     public Student4()
     {}
     //学生类的有参构造器
     public Student4(String name)
     {
          this.name=name;
     }
     //重写toString方法
     public String toString()
     {
          //返回属性值的字符串
          return "["+this.name+"]";
     }
     //重写equals方法
     public boolean equals(Object o)
     {
          //打印显示调用信息
          System.out.println("调用了"+this.name+"的equals方法，与"
                                    +((Student4)o).name+"比！！！");  
          //测试是否指向同一个对象
          if(this==o) {return true;}
          //测试引用o是否为null
          if(o==null){ return false;}
          //测试o是否同Student的intanceof测试
          if(!(o instanceof Student4)) {return false;}
          //将引用类型强制类型转换
          Student4 s=(Student4)o;
          //测试内容是否相同
          if(this.name.equals(s.name))
          {
          	return true;
          }               
          else
          {
          	return false;
          }               
     }
     //重写hashCode方法
     public int hashCode()
     {
     	  //计算哈希码
     	  int hc=7*this.name.charAt(0);         
          //打印显示调用信息
          System.out.println("调用了"+this.name
			+"的hashCode方法，哈希码为："+hc+"！！！");
          //返回计算得到的哈希码
          return hc;
     }
}
//主类
public class Sample14_09
{
     public static void main(String[] args)
     {
          //创建空HashSet对象
          HashSet hs=new HashSet();
          //向空HashSet中添加名字为tom的Student对象
          System.out.println("========================="
                            +"===========================");
          System.out.println("向空HashSet中添加名字为tom的元素");
          hs.add(new Student4("tom"));
          System.out.print("此时HashSet里的元素为：");
          System.out.println(hs);
          System.out.println("========================="
                            +"===========================");
          //向第二个空桶里添加名字为wyf的Student对象
          System.out.println("向HashSet中添加名字为wjc的元素");
          hs.add(new Student4("wjc"));
          System.out.print("此时HashSet里的元素为：");
          System.out.println(hs);
          System.out.println("========================="
                            +"===========================");
          //向第二个空桶里添加名字为jc的Student对象
          System.out.println("向HashSet中添加名字为wyf的元素");
          hs.add(new Student4("wyf"));
          System.out.print("此时HashSet里的元素为：");
          System.out.println(hs);
          System.out.println("========================="
                            +"===========================");
          //向第二个空桶里再次添加名字为jc的Student对象
          System.out.println("向HashSet中再次添加名字为wjc的元素");
          hs.add(new Student4("wjc"));
          System.out.print("此时HashSet里的元素为：");
          System.out.println(hs);
          System.out.println("========================="
                            +"===========================");
     }
}
