package ch14;
import java.util.*;
class Student
{
//学生的成员属性
     String name;
     int age;
     int classNum;
     //学生类的无参构造器
     public Student()
     {}
     //学生类的有参构造器
     public Student(String name,int age,int classNum)
     {
          this.name=name;
          this.age=age;
          this.classNum=classNum;
     }
     //重写toString方法
     public String toString()
     {
          //将类名引导的属性序列字符串返回
          return "ch14.Student[name="+this.name
               +",age="+this.age
               +",classNum="+this.classNum
               +"]\n";
     }
}
//主类
public class Sample14_14
{
     public static void main(String[] args)
     {
          //创建HashSet对象
          HashSet hs=new HashSet();
          //向HashSet对象中添加内容不同的学生对象元素
          hs.add(new Student("tom",21,97005));
          hs.add(new Student("jerry",19,97003));
          hs.add(new Student("lucy",18,97004));
          //打印输出HashSet中的内容
          System.out.println("这里是HashSet操作前的内容：");
          System.out.println(hs);
          //获取集合对应的迭代器
          Iterator it=hs.iterator();
          //通过迭代器遍历集合，并修改元素的内容
          while(it.hasNext())
          {
               //对获取的元素引用进行强制类型转换
               Student temp=(Student)it.next();
               //修改元素的成员值
               temp.classNum=2003001;
          }
          //打印输出HashSet中的内容
          System.out.println("这里是HashSet操作后的内容：");
          System.out.println(hs);
     }
}
