package ch15;
//�����ⲿ��
class Outter5
{
	//�����ⲿ��ĳ�Ա����x
	int x=100;
	//�����ڲ���
	class Inner
	{
		//�ڲ��������ⲿ��ͬ���ĳ�Ա����x
		int x=10000;
		//�����ڲ��෽��show��������ӡ���
		public void show()
		{
			//��ӡ������������ڲ������ⲿ��ĳ�Ա����
			System.out.println("�����ⲿ��Outter5�е�"+"��Ա������x = "+Outter5.this.x+"��");
			System.out.println("�����ڲ���Inner�е�"+"��Ա������x = "+this.x+"��");
		}
	}
}
//����
public class Sample15_05
{
	public static void main(String[] args)
	{
		//�����ⲿ�����
		Outter5 o=new Outter5();
		//�����ڲ������
		Outter5.Inner i=o.new Inner();
		//�����ڲ����е�show����
		i.show();
	}
}
