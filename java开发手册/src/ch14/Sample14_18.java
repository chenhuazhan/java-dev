package ch14;
import java.util.*;
public class Sample14_18
{
     public static void main(String[] args)
     {
          //����LinkedHashMap����
          LinkedHashMap lhm=new LinkedHashMap();
          //��LinkedHashMap������������ݲ�ͬ�ļ�ֵ��
          lhm.put(Integer.valueOf(97005),"Tom");
          lhm.put(Integer.valueOf(97003),"Jerry");
          lhm.put(Integer.valueOf(97004),"Lucy");
          //��ӡ���LinkedHashMap�е�����
          System.out.print("������LinkedHashMap����ǰ�Ľ����");
          System.out.println(lhm);
          //�滻��97003��Ӧ��ֵ
          lhm.put(Integer.valueOf(97003),"David");
          //�ж�LinkedHashMap���Ƿ��������Ϊ"Jerry"��ֵ
          System.out.print("�ж�LinkedHashMap���Ƿ��������ΪJerry��ֵ:");
          boolean b=lhm.containsValue("Jerry");
          System.out.println((b)?"���ڣ�����":"������������");
          //��ӡ���LinkedHashMap�е�����
          System.out.print("������LinkedHashMap������Ľ����");
          System.out.println(lhm);
     }
}
