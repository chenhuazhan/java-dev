package ch14;
import java.util.*;
public class Sample14_16
{
     public static void main(String[] args)
     {
          //������HashMap����
          HashMap hm=new HashMap();
          //��HashMap������������ݲ�ͬ�ļ�ֵ��
          hm.put(Integer.valueOf(97005),"Tom");
          hm.put(Integer.valueOf(97003),"Jerry");
          hm.put(Integer.valueOf(97004),"Lucy");
          hm.put(Integer.valueOf(97001),"Smith");
          hm.put(Integer.valueOf(97002),"Jc");
          System.out.print("������HashMap����ǰ�Ľ����");
          System.out.println(hm);
          //�Ƴ���HashMap�����м�Ϊ97001��ֵ
          hm.remove(Integer.valueOf(97001));
          //�滻��97002��Ӧ��ֵ
          hm.put(Integer.valueOf(97002),"David");
          //��ӡ���HashMap�е�����
          System.out.print("������HashMap������Ľ����");
          System.out.println(hm);
          //ȡ��ָ������Ӧ��ֵ
          Object o=hm.get(97003);//ʹ�����Զ��������
          String s=(String)o;
          System.out.println("��97003��Ӧ��ֵΪ��"+s+"������Ϊ��"+s.length()+"��");
     }
}
