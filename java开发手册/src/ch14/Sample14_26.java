package ch14;
import java.util.*;
public class Sample14_26
{
     public static void main(String[] args)
     {
          //����ArrayList����
          ArrayList al=new ArrayList();
          //��13������ӽ��б�
          for(int i=1;i<14;i++)
          {
               //��ָ�������ַ���������ʾ
               String s=null;
               switch(i)
               {
               	 case 1: case 2: case 3: case 4:
               	 case 5: case 6: case 7: case 8:
               	  s=(i+1)+"";
               	 break;
               	 case 9:  s="10";	 break;
               	 case 10: s="J";   	 break;  
               	 case 11: s="Q";   	 break;   
               	 case 12: s="K";	 break;   
               	 case 13: s="A";  	 break; 
               }                               
               al.add("����"+s);
               al.add("����"+s);
               al.add("÷��"+s);
               al.add("��Ƭ"+s);
          }
          al.add("����");
          al.add("С��");
          //��ӡ��ʼ˳��
          System.out.println("�����˿��Ƶĳ�ʼ˳��");
          System.out.println(al);
          //����ϴ��
          Collections.shuffle(al);
          //��ӡϴ���ƺ��˳��
          System.out.println("\n�����˿��Ƶ�ϴ���ƺ��˳��");
          System.out.println(al);
     }
}
