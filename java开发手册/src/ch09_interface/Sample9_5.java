package ch09_interface;
//�����������ӿ���ˮ�Ϻ������ӿ�
interface Flyer3
{ }
interface Sailer3
{ }
//������ͨ�ɻ���
class NormalPlane implements Flyer3
{ }
public class Sample9_5
{
	public static void main(String[] args)
	{
		Flyer3 f=new NormalPlane();
		//Sailer3 s=(Sailer3)f;//ǿ������ת��ʧ��
	}
}
