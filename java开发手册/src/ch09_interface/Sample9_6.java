package ch09_interface;
//��������ӿ����ü�ĸ�ֵ
//IFEx1�ӿ�
interface IFEx1
{
}
//IFEx2�ӿ�
interface IFEx2
{
}
// CEx��ʵ����IFEx1�ӿ�
class CEx implements IFEx1
{
}
public class Sample9_6
{
	public static void main(String[] args)
	{
		//����CEx�������c������ָ�����Ķ���
		CEx c=new CEx();
		//����IFEx1����ifex1������ָ������c��ָ��Ķ���
		IFEx1 ifex1=c;
		//������cָ������ifex1��ָ��Ķ���
		c=(CEx)ifex1;
//		//����IFEx2�ӿڵ�����ifex2������ָ������c��ָ��Ķ���
//		IFEx2 ifex2=c;
//		//�����ַ������͵�����s������ָ������ifex1��ָ��Ķ���
//		String s=(String)ifex1;
	}
}
