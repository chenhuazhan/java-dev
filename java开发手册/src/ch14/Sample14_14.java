package ch14;
import java.util.*;
class Student
{
//ѧ���ĳ�Ա����
     String name;
     int age;
     int classNum;
     //ѧ������޲ι�����
     public Student()
     {}
     //ѧ������вι�����
     public Student(String name,int age,int classNum)
     {
          this.name=name;
          this.age=age;
          this.classNum=classNum;
     }
     //��дtoString����
     public String toString()
     {
          //���������������������ַ�������
          return "ch14.Student[name="+this.name
               +",age="+this.age
               +",classNum="+this.classNum
               +"]\n";
     }
}
//����
public class Sample14_14
{
     public static void main(String[] args)
     {
          //����HashSet����
          HashSet hs=new HashSet();
          //��HashSet������������ݲ�ͬ��ѧ������Ԫ��
          hs.add(new Student("tom",21,97005));
          hs.add(new Student("jerry",19,97003));
          hs.add(new Student("lucy",18,97004));
          //��ӡ���HashSet�е�����
          System.out.println("������HashSet����ǰ�����ݣ�");
          System.out.println(hs);
          //��ȡ���϶�Ӧ�ĵ�����
          Iterator it=hs.iterator();
          //ͨ���������������ϣ����޸�Ԫ�ص�����
          while(it.hasNext())
          {
               //�Ի�ȡ��Ԫ�����ý���ǿ������ת��
               Student temp=(Student)it.next();
               //�޸�Ԫ�صĳ�Աֵ
               temp.classNum=2003001;
          }
          //��ӡ���HashSet�е�����
          System.out.println("������HashSet����������ݣ�");
          System.out.println(hs);
     }
}
