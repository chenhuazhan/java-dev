package ch15;
//���常��
class Father
{
	//���常���еķ���
	public void show()
	{
		//��ӡ���
		System.out.println("������Father��ķ���");
	}
}
//����
public class Sample15_11
{
	public static void main(String[] args)
	{
		//���������ڲ��ಢ���������
		Father f=new Father()
		{
			//��д���丸��ķ���
			public void show()
			{
				//��ӡ���
				System.out.println("��ϲ�㣬�ɹ��Ĵ�"
				+"���������ڲ���Ķ��󣡣���");
			}	
		};
		//���������ڲ�������д�ķ���
		f.show();
	}
}
