package ch18;
//����һ������
class Father
{
	//��д��finalize����
	public void finalize() throws Throwable
	{
		//���ø����finalize����
		super.finalize();
		//�Լ�����������
		System.out.println("��ϲ�㣬������Father�࣬"
					+"����ǰ�ɹ�������finalize����!!!");
	}
}
//����һ���̳���Father������
class Son extends Father
{
	//����Ҳ��д��finalize����
	public void finalize() throws Throwable
	{
		//���ø����finalize����
		super.finalize();
		//�Լ�����������
		System.out.println("��ϲ�㣬������Son�࣬"
					+"����ǰ�ɹ�������finalize����!!!");
	}	
}
//����
public class Sample18_2
{
	public static void main(String[] args)
	{
		//����Son����ʹ���Ϊ"����"
		new Son();
		//���������ռ���ִ��
		System.gc();
		//���߳����ߣ��Ӵ�����ɹ��Ļ���
		try
		{
			Thread.sleep(100);//���߳�����100����
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
