package ch29;

import java.io.*;
import java.util.*;

public class Sample29_1 {
	public void ReadFileList(File file, Filter filter) {
		if (file.isDirectory()) // 判断file是否为目录
		{
			try {
				// 列出所有的文件及目录
				File[] files = file.listFiles(filter); // 创建目录数组
				ArrayList<File> fileList = new ArrayList<File>(); // 通过数组创建数组列表
				for (int i = 0; i < files.length; i++) { // for循环变量数组
					// 先列出目录
					if (files[i].isDirectory()) { // 判断是否为目录
						System.out.println("[" + files[i].getPath() + "]"); // 输出路径名
						ReadFileList(files[i], filter); // 递归调用ReadFileList方法
					} else {
						// 文件先存入fileList，待会再列出
						fileList.add(files[i]);
					}
				}
				// 列出文件
				for (File f : fileList) { // for-each变量数组
					ReadFileList(f, filter); // 调用ReadFileList方法
				}
				System.out.println(); // 输出换行符
			} catch (ArrayIndexOutOfBoundsException e) { // 捕获异常
				e.printStackTrace(); // 打印异常信息
			}
		} else if (file.isFile()) // 当file为文件时
		{
			FileDesc(file); // 调用FileDesc方法
		}

	}

	public void FileDesc(File file)
		{
	        if(file.isFile()) { // 判断是否为文件
	            System.out.print(file.toString() + " \n该文件");	//输出字符串信息
	            System.out.print(file.canRead() ? "可读 " : "不可读 ");		//判断文件是否可读
	            System.out.print(file.canWrite() ? "可写 " : "不可写 ");		//判断文件是否可写
	            System.out.println(file.length() + "字节");				//输出字节数
	        }
		}

	public static void main(String[] args) {
		String filename = args[0]; // 由参数获取文件名
		File file = new File(filename); // 创建，并初始化由文件名决定的文件对象
		Filter filter = new Filter("java"); // 创建，并初始化文件过滤器
		new Sample29_1().ReadFileList(file, filter); // 创建Sample29_1实例，并调用ReadFileList方
	}
}

class Filter implements FilenameFilter {
	String extent;

	// 声明，实现Filter的构造方法
	Filter(String extent) {
		this.extent = extent; // 初始化成员变量extent
	}

	// 覆盖父类的accept方法
	public boolean accept(File dir, String name) {
		return name.endsWith("." + extent); // 返回文件的后缀名
	}
}
