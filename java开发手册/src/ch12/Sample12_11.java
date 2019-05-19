package ch12;

import java.io.*;

public class Sample12_11 {
	// 声明方法myFunction将抛出EOFException异常
	public void myFunction() throws EOFException {
		// 创建IOException对象
		//IOException e = new EOFException();
		EOFException e = new EOFException();
		// 将异常抛出
		throw e;
	}
}