package ch14;
import java.util.*;
public class Sample14_22
{
     public static void main(String[] args)
     {
          //����ջ����
          Deque stack=new ArrayDeque();
          //����Ҫ���������
          String[] sa=new String[]{"1","a","2","b","3","c","4","d"};
          //��ӡ�����ʼ���ݲ�������Ԫ����ջ
          System.out.print("������Ԫ�صĳ�ʼ˳��Ϊ��");
          for(String temps:sa)
          {
          	//��ӡ����Ԫ��
          	System.out.print(temps+", ");
          	//����Ԫ����ջ
          	stack.push(temps);
          }          
          //��ӡ������Ԫ��
          System.out.print("\n������Ԫ�ص������Ϊ��");
          while(stack.size()!=0)
          {
          	System.out.print(stack.pop()+", ");
          }
          System.out.println("");//��ӡ����          
     }
}
