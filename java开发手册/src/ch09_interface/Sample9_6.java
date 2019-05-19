package ch09_interface;
//类引用与接口引用间的赋值
//IFEx1接口
interface IFEx1
{
}
//IFEx2接口
interface IFEx2
{
}
// CEx类实现了IFEx1接口
class CEx implements IFEx1
{
}
public class Sample9_6
{
	public static void main(String[] args)
	{
		//声明CEx类的引用c并将其指向该类的对象
		CEx c=new CEx();
		//声明IFEx1引用ifex1并将其指向引用c所指向的对象
		IFEx1 ifex1=c;
		//将引用c指向引用ifex1所指向的对象
		c=(CEx)ifex1;
//		//声明IFEx2接口的引用ifex2并将其指向引用c所指向的对象
//		IFEx2 ifex2=c;
//		//声明字符串类型的引用s并将其指向引用ifex1所指向的对象
//		String s=(String)ifex1;
	}
}
