package ch14;
import java.util.*;
//����
public class Sample14_11
{
     public static void main(String[] args)
     {
          //������TreeSet����
          TreeSet ts=new TreeSet();
          ////��TreeSet�������������������Ϊ5��6��3��2��4���ַ���
          ts.add(String.valueOf(5));
          ts.add(String.valueOf(6));
          ts.add(String.valueOf(3));
          ts.add(String.valueOf(2));
          ts.add(String.valueOf(4));
          //�Ƴ���HashSet����������Ϊ"5"���ַ���
          ts.remove(String.valueOf(5));
          //������Ϊ"1"���ַ�������˽�HashSet����
          ts.add(String.valueOf(1));
          //��ӡ���TreeSet�е�����
          System.out.print("������TreeSet������Ľ����");
          System.out.println(ts);
     }
}
