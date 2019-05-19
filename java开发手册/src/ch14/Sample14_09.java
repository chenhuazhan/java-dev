package ch14;
import java.util.*;
//����Ϊ����Ԫ�����͵�Student��
class Student4 
{
     //ѧ�����������Ա����
     String name;
     //ѧ������޲ι�����
     public Student4()
     {}
     //ѧ������вι�����
     public Student4(String name)
     {
          this.name=name;
     }
     //��дtoString����
     public String toString()
     {
          //��������ֵ���ַ���
          return "["+this.name+"]";
     }
     //��дequals����
     public boolean equals(Object o)
     {
          //��ӡ��ʾ������Ϣ
          System.out.println("������"+this.name+"��equals��������"
                                    +((Student4)o).name+"�ȣ�����");  
          //�����Ƿ�ָ��ͬһ������
          if(this==o) {return true;}
          //��������o�Ƿ�Ϊnull
          if(o==null){ return false;}
          //����o�Ƿ�ͬStudent��intanceof����
          if(!(o instanceof Student4)) {return false;}
          //����������ǿ������ת��
          Student4 s=(Student4)o;
          //���������Ƿ���ͬ
          if(this.name.equals(s.name))
          {
          	return true;
          }               
          else
          {
          	return false;
          }               
     }
     //��дhashCode����
     public int hashCode()
     {
     	  //�����ϣ��
     	  int hc=7*this.name.charAt(0);         
          //��ӡ��ʾ������Ϣ
          System.out.println("������"+this.name
			+"��hashCode��������ϣ��Ϊ��"+hc+"������");
          //���ؼ���õ��Ĺ�ϣ��
          return hc;
     }
}
//����
public class Sample14_09
{
     public static void main(String[] args)
     {
          //������HashSet����
          HashSet hs=new HashSet();
          //���HashSet���������Ϊtom��Student����
          System.out.println("========================="
                            +"===========================");
          System.out.println("���HashSet���������Ϊtom��Ԫ��");
          hs.add(new Student4("tom"));
          System.out.print("��ʱHashSet���Ԫ��Ϊ��");
          System.out.println(hs);
          System.out.println("========================="
                            +"===========================");
          //��ڶ�����Ͱ���������Ϊwyf��Student����
          System.out.println("��HashSet���������Ϊwjc��Ԫ��");
          hs.add(new Student4("wjc"));
          System.out.print("��ʱHashSet���Ԫ��Ϊ��");
          System.out.println(hs);
          System.out.println("========================="
                            +"===========================");
          //��ڶ�����Ͱ���������Ϊjc��Student����
          System.out.println("��HashSet���������Ϊwyf��Ԫ��");
          hs.add(new Student4("wyf"));
          System.out.print("��ʱHashSet���Ԫ��Ϊ��");
          System.out.println(hs);
          System.out.println("========================="
                            +"===========================");
          //��ڶ�����Ͱ���ٴ��������Ϊjc��Student����
          System.out.println("��HashSet���ٴ��������Ϊwjc��Ԫ��");
          hs.add(new Student4("wjc"));
          System.out.print("��ʱHashSet���Ԫ��Ϊ��");
          System.out.println(hs);
          System.out.println("========================="
                            +"===========================");
     }
}
