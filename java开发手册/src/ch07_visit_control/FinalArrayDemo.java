package ch07_visit_control;

public class FinalArrayDemo
{
  private final String[] names;		//fianl�ĳ�Ա����names��
  public FinalArrayDemo()		//���캯����
  {
    names = new String[]{"Jack", "Mike", "Tom"};
  }
  public void printArray()		//���names��
  {
    for(int i = 0;i < names.length;i++)
    {
      System.out.println("names[" + i + "]: " + names[i]);
    }
  }
  public void changeArray()		//�ı�names���ֵ��
  {
    names[0] = "Jerry";
    names[1] = "Michael";
    names[2] = "John";
  }
  public static void main(String[] args)
  {
    FinalArrayDemo demo;		//�������ñ�����
    demo = new FinalArrayDemo();		//���ɶ���
    demo.printArray();
    demo.changeArray();
    demo.printArray();
  }
}

