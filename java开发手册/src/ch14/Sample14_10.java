package ch14;
import java.util.*;
public class Sample14_10
{
     public static void main(String[] args)
     {
          //������LinkedHashSet����
          LinkedHashSet lhs=new LinkedHashSet();
          //��LinkedHashSet�������������������Ϊ5��1��3��2��4���ַ���
          lhs.add(String.valueOf(5));
          lhs.add(String.valueOf(1));
          lhs.add(String.valueOf(3));
          lhs.add(String.valueOf(2));
          lhs.add(String.valueOf(4));
          //�Ƴ���HashSet����������Ϊ"5"���ַ���
          lhs.remove(String.valueOf(5));
          //��nullֵ����˽�HashSet����
          lhs.add(null);
          //��ӡ���LinkedHashSet�е�Ԫ������
          System.out.print("������LinkedHashSet������Ľ����");
          System.out.println(lhs);
     }
}
