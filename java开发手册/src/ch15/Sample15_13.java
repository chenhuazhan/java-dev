package ch15;
//���常��
abstract class FatherForInner
{
	int count;
	abstract void show();
}
//����
public class Sample15_13
{
	public static void main(String[] args)
	{
		//���������ڲ��ಢ���������
		FatherForInner ffi=new FatherForInner()
		{
			//����Ǿ�̬����
			{
				//�Գ�Աcount���г�ʼ��
				count=(int)(100*Math.random());
			}
			//ʵ�����丸��ķ���
			public void show()
			{
				//��ӡ���
				System.out.println("��ʼ����count��ֵΪ��"+count+"��");
			}	
		};
		//����show����
		ffi.show();
	}
}
