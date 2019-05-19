package ch12;
//子类重写父类方法要注意异常不能比被重写方法范围大
import java.io.*;

class Father1 {
	// 父类方法，没有抛出异常
	public void myFunction() throws Exception{
		System.out.println("这里是父类方法，该方法抛出Exception异常！！");
	}
}

class Son extends Father1 {
	// 子类重写父类方法，有捕获异常抛出
	public void myFunction() throws InterruptedException {
		System.out.println("这里是子类方法，该方法抛出InterruptedException异常！！");
	}
}

public class Sample12_13 {
	public static void main(String[] args) {
		// 创建子类对象
		Son s = new Son();
		// 受监视的代码
		try {
			s.myFunction();
		}
		// 异常处理代码
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
