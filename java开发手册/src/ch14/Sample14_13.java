package ch14;
import java.util.*;
class Student5 implements Comparable
{
     //学生的成员属性
     String name;
     int age;
     int classNum;
     //学生类的无参构造器
     public Student5(){}
     //学生类的有参构造器
     public Student5(String name,int age,int classNum)
     {
          this.name=name;
          this.age=age;
          this.classNum=classNum;
     }
     //重写toString方法
     public String toString()
     {
          //将类名引导的属性序列字符串返回
          return "ch14.Student5[name="+this.name
               +",age="+this.age
               +",classNum="+this.classNum
               +"]\n";
     }
     //实现compareTo方法
     public int compareTo(Object o)
     {
          //强制类型转换
          Student5 s=(Student5)o;
          //用classNum作为基准进行排序
          return this.classNum-s.classNum;
     }
}
//定义比较器
class AgeCompare implements Comparator
{
     public int compare(Object o1,Object o2)
     {
          //将接受到的对象的引用进行强制类型转换
          Student5 s1=(Student5)o1;
          Student5 s2=(Student5)o2;
          //指定按年龄进行排序
          return s1.age-s2.age;
     }
}
//主类
public class Sample14_13
{
     public static void main(String[] args)
     {
          //创建TreeSet对象ts1与ts2
          TreeSet ts1=new TreeSet();
          TreeSet ts2=new TreeSet(new AgeCompare());
          //向ts1中添加内容不同的学生对象的元素
          ts1.add(new Student5("tom",21,97005));
          ts1.add(new Student5("jerry",19,97003));
          ts1.add(new Student5("lucy",18,97004));
          ts1.add(new Student5("smith",28,97001));
          ts1.add(new Student5("jc",23,97002));
          //想ts2中添加与ts1中相同的元素
          ts2.add(new Student5("tom",21,97005));
          ts2.add(new Student5("jerry",19,97003));
          ts2.add(new Student5("lucy",18,97004));
          ts2.add(new Student5("smith",28,97001));
          ts2.add(new Student5("jc",23,97002));
          //打印ts1与ts2中的元素
          System.out.println("==========================="+
                                  "==========================");
          System.out.println("这里的SortedSet是按班号进行的排序：");
          System.out.println(ts1);
          System.out.println("==========================="+
                                  "==========================");
          System.out.println("这里的SortedSet是按年龄进行的排序：");
          System.out.println(ts2);
     }
}
