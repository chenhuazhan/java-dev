package ch15;
//����ӿ�
interface MyInterface
{
	//����ӿ��еķ���
	public void show();
}
//����
public class Sample15_12
{
	public static void main(String[] args)
	{
		//���������ڲ��ಢ���������
		MyInterface mi=new MyInterface()
		{
			//ʵ�����丸��ķ���
			public void show()
			{
				//��ӡ���
				System.out.println("��ϲ�㴴������"
				+"���ڲ���Ķ��󣬸���ʵ����MyInterface�ӿڣ�����");
			}	
		};
		//���������ڲ�����ʵ�ֵķ���
		mi.show();
	}
}
