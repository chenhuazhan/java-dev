package ch14;
import java.util.*;
//����
public class Sample14_04
{
     public static void main(String[] args)
     {
          //�����б�ArrayList�Ķ���
          ArrayList al=new ArrayList();
          //��ʼ��ArrayList�����е�Ԫ��
          for(int i=0;i<50;i++)
          {
               al.add(String.valueOf(i));
          }
          //��ArrayList���в���
          for(int i=60;i<75;i++)
          {
               al.set(i-45,String.valueOf(i));
          }
          //��ӡArrayList�б��е�����
          System.out.println("������ArrayList������Ľ����");
          System.out.println(al);
          //ȡ��ָ��������Ԫ�ز�����
          Object o=al.get(22); 
          String s=(String)o;
          System.out.println("����Ϊ22��Ԫ�س���Ϊ��"+s.length());
     }
}
