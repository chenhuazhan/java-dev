package ch12;
//异常的显性再抛出
import java.net.*;
import java.io.*;

public class Sample12_10 {
	// 定义connect方法将有可能抛出IOException异常
	public void connect() throws IOException {
		// 受监视的代码
		try {
			// 创建ServerSocket对象
			ServerSocket ss = new ServerSocket(9999);
		}
		// 异常处理代码
		catch (IOException e) {
			// 将异常抛出
			throw e;
		}
	}
}
