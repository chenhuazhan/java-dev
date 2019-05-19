package ch16;
public class Sample16_09
	{
	public static void main(String args[])
		{
			//创建资源对象，初始面包有50个
			BreadContainer bc=new BreadContainer(50);
			//创建对应的生产者和消费者
			Producer p1=new Producer(50,bc,"P1");			
			Producer p2=new Producer(200,bc,"P2");
			Producer p3=new Producer(290,bc,"P3");
			Consumer c1=new Consumer(70,bc,"c1");
			Consumer c2=new Consumer(80,bc,"c2");
			//启动生产者消费者线程
			c1.start();
			c2.start();
			p1.start();
			p3.start();
			p2.start();
		}
	}
class BreadContainer{
	BreadContainer(int i){
		
	}
	
}

class Producer{
	Producer(int i,BreadContainer b,String s){
		
	}
void start(){
		
	}
}

class Consumer{
	Consumer(int i,BreadContainer b,String s){
		
	}
	void start(){
		
	}
}