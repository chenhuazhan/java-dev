package ch14;
import java.util.*;
//�Զ�����ıȽ���
class MyComparator1 implements Comparator
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
public class Sample14_24
{
     public static void main(String[] args)
     {
          //����ArrayList����
          ArrayList al=new ArrayList();
          //ΪArrayList��ʼ���������
          for(int i=0;i<50;i++)
          {
               al.add(Integer.valueOf((int)(Math.random()*100)));
          }
          //��ӡ��ʼ����ArrayList�е�Ԫ��
          System.out.println("����������֮ǰArrayList�е�Ԫ�أ�");
          System.out.println(al);
          //��ArrayList�е�Ԫ�ؽ�������
          Collections.sort(al);
          //��ӡ������ArrayList����
          System.out.println("����������֮��ArrayList�е�Ԫ�أ�");
          System.out.println(al);
          //��ArrayList�е�Ԫ��ʹ�ñȽ�����������
          Collections.sort(al,new MyComparator1());
          //��ӡʹ�ñȽ���������ArrayList����
          System.out.println("������ʹ�ñȽ�������֮��ArrayList�е�Ԫ�أ�");
          System.out.println(al);
     }
}
