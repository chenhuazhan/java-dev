package ch14;
import java.util.*;
public class Sample14_17
{
     public static void main(String[] args)
     {
          //������Hashtable����
          Hashtable ht=new Hashtable();
          //��Hashtable������������ݲ�ͬ�ļ�ֵ��
          ht.put(Integer.valueOf(97005),"Tom");
          ht.put(Integer.valueOf(97003),"Jerry");
          ht.put(Integer.valueOf(97004),"Lucy");
          ht.put(Integer.valueOf(97001),"Smith");
          ht.put(Integer.valueOf(97002),"Jc");
          System.out.print("������Hashtable����ǰ�Ľ����");
          System.out.println(ht);
          //�ж�Hashtable�������Ƿ���ڼ�Ϊ97001��ֵ
          System.out.print("�ж�Hashtable�������Ƿ���ڼ�Ϊ97001��ֵ:");
          boolean b=ht.containsKey(97001);//ʹ�����Զ����
          System.out.println((b)?"���ڣ�����":"������������");
          //�滻��97002��Ӧ��ֵ
          ht.put(Integer.valueOf(97002),"David");          
          //��ӡ���Hashtable�е�����
          System.out.print("������Hashtable������Ľ����");
          System.out.println(ht);
          //ȡ��ָ������Ӧ��ֵ
          Object o=ht.get(97003);//ʹ�����Զ����
          String s=(String)o;
          System.out.println("��97003��Ӧ��ֵΪ��"+s+"������Ϊ��"+s.length()+"��");
     }
}
