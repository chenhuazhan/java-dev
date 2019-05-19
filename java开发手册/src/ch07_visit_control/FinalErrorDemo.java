package ch07_visit_control;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FinalErrorDemo
{
  private final FileInputStream in;		//final的成员变量in。
  public FinalErrorDemo()			//构造函数。
  {
    FileInputStream temp;		//局部变量。
    temp = null;
    try
    {
      temp = new FileInputStream("in.txt");		//生成对象。
    }
    catch (FileNotFoundException ex)		//如果文件不存在。
    {
      try
      {
        temp = new FileInputStream("err.txt");		//生成对象。
      }
      catch (FileNotFoundException ex1)		//如果文件不存在。
      {
        ex.printStackTrace();		//输出错误。
      }
    }
    in = temp;		//对final的成员变量初始化。
    in.getClass();
  }
}
/*错误例子：
 * public FinalErrorDemo()		//构造函数。
  {
    try		//try关键字。
    {
      in = new FileInputStream("in.txt");		//生成对象。
    }
    catch (FileNotFoundException ex)		//如果文件不存在。
    {
      try
      {
        in = new FileInputStream("err.txt");		//生成对象。
      }
      catch (FileNotFoundException ex1)		//如果文件不存在。
      {
        ex.printStackTrace();		//输出错误。
      }
    }
  }*/
