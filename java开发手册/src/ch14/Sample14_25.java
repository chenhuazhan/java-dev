package ch14;
import java.util.*;
public class Sample14_25
{
     public static void main(String[] args)
     {
          //����ArrayList����
          ArrayList al=new ArrayList();
          //ΪArrayList��ʼ���������
          for(int i=0;i<20;i++)
          {
               al.add(Integer.valueOf((int)(Math.random()*100)));
          }
          //��ArrayList�е�Ԫ�ؽ�������
          Collections.sort(al);
          //��ArrayList�в���ָ��Ԫ�أ�
          int index=Collections.binarySearch(al,Integer.valueOf(20));
          //��ӡ�������
          if(index<0)//û���ҵ���ӡ���
          {
               System.out.println("���б���û������Ҫ�ҵ������������ٴ��������ԣ�");
          }
          else//�ҵ���Ĵ�ӡ���
          {
               System.out.println("��ϲ�㣬�ҵ�������Ҫ�ҵ�Ԫ�أ��������ǣ�"+index);
               //��ӡArrayList��ÿһ�� Ԫ�أ������Ҫ�ҵ�Ԫ��
               System.out.print("{");
               for(int i=0;i<al.size();i++)
               {
                    if(i==index)//��ӡָ���ҵ�Ԫ��
                    {
                         System.out.print("["+al.get(i)+"]��");
                    }
                    else//��ӡ����Ԫ��
                    {
                         System.out.print(al.get(i)+"��");
                    }
               }
               System.out.println("}");
          }
     }
}
