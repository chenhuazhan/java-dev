package ch14;
import java.util.*;
public class Sample14_21
{
     public static void main(String[] args)
     {
          //����ջ����
          Stack s=new Stack();
          //�����б�ArrayList����
          ArrayList al=new ArrayList();
          //��ArrayList������г�ʼ������
          for(int i=0;i<50;i++)
          {
               al.add(Integer.valueOf(i));
          }
          //��ӡArrayList�����ʼ���������
          System.out.println("ArrayList��Ԫ�صĳ�ʼ˳��");
          System.out.println(al);
          //��ArrayList�����е�Ԫ������ѹջ
          for(int i=0;i<50;i++)
          {
               s.push(al.get(i));
          }
          //��ջ�еĵ�Ԫ�����γ�ջ�����ø�ArrayList����
          for(int i=0;i<50;i++)
          {
               al.set(i,s.pop());
          }
          //��ӡ����ջ������ArrayList�����е�����
          System.out.println("ʹ�ù�ջ��ArrayList��Ԫ�ص�˳��");
          System.out.println(al);
     }
}
