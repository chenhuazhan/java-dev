package ch14;
import java.util.*;
public class Sample14_20
{
     public static void main(String[] args)
     {
          //����HashMap����
          Map hm=new HashMap();
          //��Map�в����/ֵ��
          hm.put(Integer.valueOf(10001),"Tom");
          hm.put(Integer.valueOf(10003),"Jerry");
          hm.put(Integer.valueOf(10002),"John");
          hm.put(Integer.valueOf(10004),"Lili");
          //��ȡMap�ļ�����
          Set keySet=hm.keySet();
          //��ȡ�����ϵĵ�����
          Iterator ii=keySet.iterator();
          //ͨ�������������ٰ缯��������HashMap
          System.out.println("==========ͨ�������϶�Map���б���==========");
          while(ii.hasNext())
          {
          	Object okey=ii.next();
          	//����ȡ�ļ����ý���ǿ������ת��
          	Integer i=(Integer)okey;
          	//ͨ������ȡ��Ӧ��ֵ
          	Object ovalue=hm.get(okey);
          	//����ȡ��ֵ���ý���ǿ������ת��
          	String s=(String)ovalue;
          	//��ӡ����ֵ�����
          	System.out.println("����"+i.intValue()
          	        +"��ֵ��"+s+"��ֵ���ȣ�"+s.length()+"��");
          }
          //��ȡMap������ֵ��Collection
          Collection cvalue=hm.values();
          //��for-eachѭ��������ֵ���б���
          System.out.println("=======��for-eachѭ��������ֵ���б���=======");
          for(Object otemp:cvalue)
          {
          	//�����ý���ǿ������ת��
          	String s=(String)otemp;
          	System.out.println("ֵ��"+s+"��ֵ���ȣ�"+s.length()+"��");
          }
     }
}
