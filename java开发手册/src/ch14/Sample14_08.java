package ch14;
import java.util.*;
public class Sample14_08
{
     public static void main(String[] args)
     {
          //����HashSet����
          HashSet hs=new HashSet();
          //��HashSet�������������������Ϊ5��1��3��2��4���ַ���
          hs.add(String.valueOf(5));
          hs.add(String.valueOf(1));
          hs.add(String.valueOf(3));
          hs.add(String.valueOf(2));
          hs.add(String.valueOf(4));
          //�Ƴ���HashSet����������Ϊ"5"���ַ���
          hs.remove(String.valueOf(5));
          //�����һ������Ϊ"1"���ַ���
          hs.add(String.valueOf(1));
          //��nullֵ����˽�HashSet��
          hs.add(null);
          //��ӡHashSet�����е�����
          System.out.println("������HashSet������Ľ����");
          System.out.println(hs);
     }
}
