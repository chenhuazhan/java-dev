package ch14;
//ѧ����
class Student2
{
     //ѧ���ĳ�Ա����
     String name;
     int age;
     int classNum;
     //ѧ������޲ι�����
     public Student2(){}
     //ѧ������вι�����
     public Student2(String name,int age,int classNum)
     {
          this.name=name;
          this.age=age;
          this.classNum=classNum;
     }
     
}
//����
public class Sample14_02
{
     //������
     public static void main(String[] args)
     {
          //��������������ͬ��ѧ������s1��s2
          Student2 s1=new Student2("jc",21,97001);
          Student2 s2=new Student2("jc",21,97001);
          //ʹ��equals��������ѧ������s1��s2�Ƿ�ȼۣ������Ƿ���ͬ��
          if(s1.equals(s2))
          {
          		System.out.println("ѧ������s1��s2����ͬ�ģ���");
          }               
          else
          {
          		System.out.println("ѧ������s1��s2�ǲ���ͬ�ģ���");
          }
     }
}
