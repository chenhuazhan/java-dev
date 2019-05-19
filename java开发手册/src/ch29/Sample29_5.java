package ch29;

import java.io.*;

public class Sample29_5 {
	public static void main(String[] args) {
		try {
			byte[] data = new byte[1]; // 创建byte类型数组
			File srcFile = new File(args[0]); // 创建，并初始化File对象srcFile
			File desFile = new File(args[1]); // 创建，并初始化File对象desFile
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile)); // 创建并初始化BufferedInputStream对象
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desFile)); // 创建并初始化BufferedOutputStream对象
			System.out.println("复制文件：" + srcFile.length() + "字节"); // 输出文件长度
			while (bufferedInputStream.read(data) != -1) // 循环读取数据
			{
				bufferedOutputStream.write(data); // 循环写入数据
			}
			bufferedOutputStream.flush(); // 将缓冲区中的数据全部写出
			bufferedInputStream.close(); // 关闭输入流对象
			bufferedOutputStream.close(); // 关闭输出流对象
			System.out.println("复制完成"); // 输出字符串信息
		} catch (Exception e) { // 捕获异常
			e.printStackTrace(); // 输出异常信息
		}
	}
}
