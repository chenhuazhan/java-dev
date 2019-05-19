package ch14;
//学生类
class Student2
{
     //学生的成员属性
     String name;
     int age;
     int classNum;
     //学生类的无参构造器
     public Student2(){}
     //学生类的有参构造器
     public Student2(String name,int age,int classNum)
     {
          this.name=name;
          this.age=age;
          this.classNum=classNum;
     }
     
}
//主类
public class Sample14_02
{
     //主方法
     public static void main(String[] args)
     {
          //创建两个内容相同的学生对象s1与s2
          Student2 s1=new Student2("jc",21,97001);
          Student2 s2=new Student2("jc",21,97001);
          //使用equals方法测试学生对象s1与s2是否等价（内容是否相同）
          if(s1.equals(s2))
          {
          		System.out.println("学生对象s1与s2是相同的！！");
          }               
          else
          {
          		System.out.println("学生对象s1与s2是不相同的！！");
          }
     }
}
