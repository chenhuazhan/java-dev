package ch14;
import java.util.*;
//Ԫ����
class MyEntryForEach
{
	//Ԫ�صĳ�Ա��������
	int intMember;
	//������
	public MyEntryForEach(int intMember)
	{
		this.intMember=intMember;
	}
	//��дtoString����
	public String toString()
	{
		return this.intMember+"";
	}
}
//����
public class Sample14_15
{
	public static void main(String[] args)
	{
	     //������HashSet����
	     HashSet hs=new HashSet();
	     //��HashSet������������ݲ�ͬ��ѧ������Ԫ��
	     hs.add(new MyEntryForEach(23));
	     hs.add(new MyEntryForEach(24));
	     hs.add(new MyEntryForEach(25));
	     hs.add(new MyEntryForEach(27));
	     hs.add(new MyEntryForEach(29));
	     //��ӡ���HashSet�е�����
		 System.out.print("������HashSet����ǰ�Ľ����");
	     System.out.println(hs);
	     //ͨ��for-eachѭ���õ�Ԫ�ز��޸����е�Ԫ��
	     for(Object o:hs)
	     {
	          //��Ԫ�����ý���ǿ������ת��
	          MyEntryForEach temp=(MyEntryForEach)o;
	          temp.intMember=55;
	     }
	     //��ӡ���HashSet�е�����
		 System.out.print("������HashSet������Ľ����");
	     System.out.println(hs);
	}
}
