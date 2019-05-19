package ch09_interface;
//接口回调
interface MyListener
{
	void specialProcessEvent();
}
class MyMoniter
{
	MyListener ml;
	//注册监听器方法
	public void regListener(MyListener ml)
	{
		this.ml=ml;
	}
	//事件处理方法
	public void generalProcessEvent()
	{
		this.ml.specialProcessEvent();
	}
}

class ProcessorA implements MyListener
{
	public void specialProcessEvent()
	{
		System.out.println("我采用A策略处理事件！！！");
	}
}

class ProcessorB implements MyListener
{
	public void specialProcessEvent()
	{
		System.out.println("我采用B策略处理事件！！！");
	}
}

public class Sample9_12
{
	public static void main(String[] args)
	{
		//创建对象
		MyMoniter mm=new MyMoniter();
		ProcessorA pa=new ProcessorA();
		ProcessorB pb=new ProcessorB();
		//注册A处理器
		mm.regListener(pa);
		//发送事件处理请求
		mm.generalProcessEvent();
		//注册B处理器
		mm.regListener(pa);
		//发送事件处理请求
		mm.generalProcessEvent();		
	}
}
