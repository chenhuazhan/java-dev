package ch14;
import java.util.*;
//实现Comparable接口的元素类
class MyEntry implements Comparable
{
     //MyEntry的成员属性
     int size;
     //MyEntry类的无参构造器
     public MyEntry()
     {}
     //MyEntry类的有参构造器
     public MyEntry(int size)
     {
          this.size=size;
     }
     //重写toString方法
     public String toString()
     {
          //将类名引导的属性序列字符串返回
          return "[size="+this.size+"]";
     }
     //实现compareTo方法
     public int compareTo(Object o)
     {
          //强制类型转换
          MyEntry me=(MyEntry)o;
          //打印方法调用的信息
          System.out.println(this.toString()+"与"
                  +me.toString()+" compareTo比！！！");
          //定义排序的规则
          return this.size-me.size;          
     }
     //重写equals方法
     public boolean equals(Object o)
     {
     	//强制类型转换
        MyEntry me=(MyEntry)o;
     	//打印方法调用的信息
     	System.out.println(this.toString()+"与"
     	          +me.toString()+" equals比！！！");     	
        return (me.size==this.size);
     }
     //重写hashCode方法
     public int hashCode()
     {
     	//打印方法调用的信息
     	System.out.println(this.toString()+" hashCode！！！");      	
     	return 12;
     }
}
//主类
public class Sample14_12
{
     public static void main(String[] args)
     {
          //创建了一个TreeSet集合的对象
          TreeSet ts=new TreeSet();
          //向其中依次添加不同属性的学生对象
          System.out.println("=============插入21===============");
          ts.add(new MyEntry(21));
          System.out.println("=============插入19===============");
          ts.add(new MyEntry(19));
          System.out.println("=============插入18===============");
          ts.add(new MyEntry(18));
          System.out.println("=============插入28===============");
          ts.add(new MyEntry(28));
          System.out.println("=========再次插入21===============");
          ts.add(new MyEntry(21));
          System.out.println("==================================");
          //打印输出TreeSet中的内容
          System.out.print("这里是TreeSet操作后的结果：");
          System.out.println(ts);
     }
}
