package ch14;
import java.util.*;
//����
public class Sample14_06
{
     public static void main(String[] args)
     {
          //�����б�LinkedList��Ķ���
          LinkedList ll=new LinkedList();
          //��ʼ��LinkedList����
          for(int i=0;i<50;i++)
          {
               ll.add(String.valueOf(i));
          }
          //��LinkedList���в������
          for(int i=15;i<30;i++)
          {
               ll.add(i,String.valueOf(30-i+15));
          }
          //��ӡLinkedList�б�
          System.out.println("������LinkedList������Ľ����");
          System.out.println(ll);
     }
}
