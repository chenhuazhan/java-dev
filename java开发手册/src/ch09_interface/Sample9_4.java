package ch09_interface;
/*
 * 接口引用间的赋值
 */
interface Developer{}
interface JavaDeveloper extends Developer{}
interface Lecture{}
class Person implements JavaDeveloper{}
public class Sample9_4
{
	public static void main(String[] args)
	{
		//创建对象并调用方法
		JavaDeveloper jd=new Person();
		Developer d=jd;
//		jd=d;
//		Lecture l=d;
		jd=(JavaDeveloper)d;
		Lecture l=(Lecture)d;
	}
}
