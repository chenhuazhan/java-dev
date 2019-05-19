package ch07_visit_control;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FinalErrorDemo
{
  private final FileInputStream in;		//final�ĳ�Ա����in��
  public FinalErrorDemo()			//���캯����
  {
    FileInputStream temp;		//�ֲ�������
    temp = null;
    try
    {
      temp = new FileInputStream("in.txt");		//���ɶ���
    }
    catch (FileNotFoundException ex)		//����ļ������ڡ�
    {
      try
      {
        temp = new FileInputStream("err.txt");		//���ɶ���
      }
      catch (FileNotFoundException ex1)		//����ļ������ڡ�
      {
        ex.printStackTrace();		//�������
      }
    }
    in = temp;		//��final�ĳ�Ա������ʼ����
    in.getClass();
  }
}
/*�������ӣ�
 * public FinalErrorDemo()		//���캯����
  {
    try		//try�ؼ��֡�
    {
      in = new FileInputStream("in.txt");		//���ɶ���
    }
    catch (FileNotFoundException ex)		//����ļ������ڡ�
    {
      try
      {
        in = new FileInputStream("err.txt");		//���ɶ���
      }
      catch (FileNotFoundException ex1)		//����ļ������ڡ�
      {
        ex.printStackTrace();		//�������
      }
    }
  }*/
