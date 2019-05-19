package ch12;
//异常的隐性再抛出

import java.io.*;
import java.net.*;

public class Sample12_12 {
	// 声明方法myFunction将有可能抛出IOException异常
	public static void myFunction() throws IOException {
		// 创建ServerSocket对象
		ServerSocket ss = new ServerSocket(9999);
	}

	public static void main(String[] args) {
		// 受监视的代码
		try {
			// 调用myFunction方法
			myFunction();
		}
		// 异常处理代码
		catch (IOException e) {
			// 打印调用栈信息
			e.printStackTrace();
		}
		System.out.println("恭喜你，程序正常运行结束！！！");
	}
}
