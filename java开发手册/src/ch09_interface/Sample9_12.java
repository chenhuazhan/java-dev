package ch09_interface;
//�ӿڻص�
interface MyListener
{
	void specialProcessEvent();
}
class MyMoniter
{
	MyListener ml;
	//ע�����������
	public void regListener(MyListener ml)
	{
		this.ml=ml;
	}
	//�¼�������
	public void generalProcessEvent()
	{
		this.ml.specialProcessEvent();
	}
}

class ProcessorA implements MyListener
{
	public void specialProcessEvent()
	{
		System.out.println("�Ҳ���A���Դ����¼�������");
	}
}

class ProcessorB implements MyListener
{
	public void specialProcessEvent()
	{
		System.out.println("�Ҳ���B���Դ����¼�������");
	}
}

public class Sample9_12
{
	public static void main(String[] args)
	{
		//��������
		MyMoniter mm=new MyMoniter();
		ProcessorA pa=new ProcessorA();
		ProcessorB pb=new ProcessorB();
		//ע��A������
		mm.regListener(pa);
		//�����¼���������
		mm.generalProcessEvent();
		//ע��B������
		mm.regListener(pa);
		//�����¼���������
		mm.generalProcessEvent();		
	}
}
