package ch07_visit_control;

public class FinalArrayDemo
{
  private final String[] names;		//fianl的成员变量names。
  public FinalArrayDemo()		//构造函数。
  {
    names = new String[]{"Jack", "Mike", "Tom"};
  }
  public void printArray()		//输出names。
  {
    for(int i = 0;i < names.length;i++)
    {
      System.out.println("names[" + i + "]: " + names[i]);
    }
  }
  public void changeArray()		//改变names里的值。
  {
    names[0] = "Jerry";
    names[1] = "Michael";
    names[2] = "John";
  }
  public static void main(String[] args)
  {
    FinalArrayDemo demo;		//对象引用变量。
    demo = new FinalArrayDemo();		//生成对象。
    demo.printArray();
    demo.changeArray();
    demo.printArray();
  }
}

