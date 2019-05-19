package ch14;
import java.util.*;
class Student5 implements Comparable
{
     //ѧ���ĳ�Ա����
     String name;
     int age;
     int classNum;
     //ѧ������޲ι�����
     public Student5(){}
     //ѧ������вι�����
     public Student5(String name,int age,int classNum)
     {
          this.name=name;
          this.age=age;
          this.classNum=classNum;
     }
     //��дtoString����
     public String toString()
     {
          //���������������������ַ�������
          return "ch14.Student5[name="+this.name
               +",age="+this.age
               +",classNum="+this.classNum
               +"]\n";
     }
     //ʵ��compareTo����
     public int compareTo(Object o)
     {
          //ǿ������ת��
          Student5 s=(Student5)o;
          //��classNum��Ϊ��׼��������
          return this.classNum-s.classNum;
     }
}
//����Ƚ���
class AgeCompare implements Comparator
{
     public int compare(Object o1,Object o2)
     {
          //�����ܵ��Ķ�������ý���ǿ������ת��
          Student5 s1=(Student5)o1;
          Student5 s2=(Student5)o2;
          //ָ���������������
          return s1.age-s2.age;
     }
}
//����
public class Sample14_13
{
     public static void main(String[] args)
     {
          //����TreeSet����ts1��ts2
          TreeSet ts1=new TreeSet();
          TreeSet ts2=new TreeSet(new AgeCompare());
          //��ts1��������ݲ�ͬ��ѧ�������Ԫ��
          ts1.add(new Student5("tom",21,97005));
          ts1.add(new Student5("jerry",19,97003));
          ts1.add(new Student5("lucy",18,97004));
          ts1.add(new Student5("smith",28,97001));
          ts1.add(new Student5("jc",23,97002));
          //��ts2�������ts1����ͬ��Ԫ��
          ts2.add(new Student5("tom",21,97005));
          ts2.add(new Student5("jerry",19,97003));
          ts2.add(new Student5("lucy",18,97004));
          ts2.add(new Student5("smith",28,97001));
          ts2.add(new Student5("jc",23,97002));
          //��ӡts1��ts2�е�Ԫ��
          System.out.println("==========================="+
                                  "==========================");
          System.out.println("�����SortedSet�ǰ���Ž��е�����");
          System.out.println(ts1);
          System.out.println("==========================="+
                                  "==========================");
          System.out.println("�����SortedSet�ǰ�������е�����");
          System.out.println(ts2);
     }
}
