package ch14;
import java.util.*;
//�Զ�����ıȽ���
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		//�����ý���ǿ������ת��
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		//����ֵ�Ӵ�С��˳������
		return i2.intValue()-i1.intValue();
	}
}
//����
public class Sample14_19
{
     public static void main(String[] args)
     {
          //������ͨ��TreeMap����
          TreeMap tmp=new TreeMap();
          //��TreeMap������������ݲ�ͬ�ļ�ֵ��
          tmp.put(Integer.valueOf(97004),"Lucy");
          tmp.put(Integer.valueOf(97001),"Smith");
          tmp.put(Integer.valueOf(97002),"Jc");
          //����ָ���Ƚ�����TreeMap����
          TreeMap tmc=new TreeMap(new MyComparator());
          //��TreeMap������������ݲ�ͬ�ļ�ֵ��
          tmc.put(Integer.valueOf(97004),"Lucy");
          tmc.put(Integer.valueOf(97001),"Smith");
          tmc.put(Integer.valueOf(97002),"Jc");
          //��ӡ��ͨ��TreeMap�����е�����
          System.out.println("=============================="
               +"===========================================");
          System.out.print("��ͨ��TreeMap�е�����Ϊ��");
          System.out.println(tmp);
          //��ӡָ���Ƚ�����TreeMap�����е�����
          System.out.println("=============================="
               +"===========================================");
          System.out.print("ָ���Ƚ�����TreeMap�е�����Ϊ��");
          System.out.println(tmc);
          //�Ƴ�����ͨTreeMap�����м�Ϊ97001��ֵ
          tmp.remove(Integer.valueOf(97001));
          //�滻��ͨTreeMap�����м�97002��Ӧ��ֵ
          tmp.put(Integer.valueOf(97002),"David");          
          //��ӡ����������ͨTreeMap�е�����
          System.out.println("=============================="
               +"===========================================");
          System.out.print("�������ͨTreeMap�е����ݣ�");
          System.out.println(tmp);
          System.out.println("=============================="
               +"===========================================");
     }
}
