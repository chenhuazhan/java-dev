package ch09_interface;
/*
 * �ӿ����ü�ĸ�ֵ
 */
interface Developer{}
interface JavaDeveloper extends Developer{}
interface Lecture{}
class Person implements JavaDeveloper{}
public class Sample9_4
{
	public static void main(String[] args)
	{
		//�������󲢵��÷���
		JavaDeveloper jd=new Person();
		Developer d=jd;
//		jd=d;
//		Lecture l=d;
		jd=(JavaDeveloper)d;
		Lecture l=(Lecture)d;
	}
}
