package ch14;
import java.util.*;
//ʵ��Comparable�ӿڵ�Ԫ����
class MyEntry implements Comparable
{
     //MyEntry�ĳ�Ա����
     int size;
     //MyEntry����޲ι�����
     public MyEntry()
     {}
     //MyEntry����вι�����
     public MyEntry(int size)
     {
          this.size=size;
     }
     //��дtoString����
     public String toString()
     {
          //���������������������ַ�������
          return "[size="+this.size+"]";
     }
     //ʵ��compareTo����
     public int compareTo(Object o)
     {
          //ǿ������ת��
          MyEntry me=(MyEntry)o;
          //��ӡ�������õ���Ϣ
          System.out.println(this.toString()+"��"
                  +me.toString()+" compareTo�ȣ�����");
          //��������Ĺ���
          return this.size-me.size;          
     }
     //��дequals����
     public boolean equals(Object o)
     {
     	//ǿ������ת��
        MyEntry me=(MyEntry)o;
     	//��ӡ�������õ���Ϣ
     	System.out.println(this.toString()+"��"
     	          +me.toString()+" equals�ȣ�����");     	
        return (me.size==this.size);
     }
     //��дhashCode����
     public int hashCode()
     {
     	//��ӡ�������õ���Ϣ
     	System.out.println(this.toString()+" hashCode������");      	
     	return 12;
     }
}
//����
public class Sample14_12
{
     public static void main(String[] args)
     {
          //������һ��TreeSet���ϵĶ���
          TreeSet ts=new TreeSet();
          //������������Ӳ�ͬ���Ե�ѧ������
          System.out.println("=============����21===============");
          ts.add(new MyEntry(21));
          System.out.println("=============����19===============");
          ts.add(new MyEntry(19));
          System.out.println("=============����18===============");
          ts.add(new MyEntry(18));
          System.out.println("=============����28===============");
          ts.add(new MyEntry(28));
          System.out.println("=========�ٴβ���21===============");
          ts.add(new MyEntry(21));
          System.out.println("==================================");
          //��ӡ���TreeSet�е�����
          System.out.print("������TreeSet������Ľ����");
          System.out.println(ts);
     }
}
