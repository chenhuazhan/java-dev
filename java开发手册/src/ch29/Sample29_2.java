package ch29;

import java.io.*;

public class Sample29_2 {
	public static void RandomWriteFile(File file) {
		Employee[] employees = new Employee[4]; // 创建Employee数组
		// 初始化Employee数组
		employees[0] = new Employee("张三", 23);
		employees[1] = new Employee("赵云", 24);
		employees[2] = new Employee("李四", 25);
		employees[3] = new Employee("王五", 22);
		RandomAccessFile randomAccessFile = null; // 创建RandomAccessFile对象
		try {
			randomAccessFile = new RandomAccessFile(file, "rw"); // 初始化randomAccessFile
		} catch (FileNotFoundException e1) { // 捕获异常
			e1.printStackTrace(); // 输出异常信息
		}
		try {
			for (Employee e : employees) // for遍历employees数组
			{
				randomAccessFile.writeChars(e.getName()); // 写入名字
				randomAccessFile.writeInt(e.getAge()); // 写入年龄
			}
			randomAccessFile.close(); // 关闭randomAccessFile
		} catch (IOException e1) { // 捕获异常
			e1.printStackTrace(); // 输出异常信息
		}
	}

	private static String readName(RandomAccessFile randomAccessfile) throws IOException {
		char[] name = new char[8]; // 创建char类型数组
		for (int i = 0; i < name.length; i++)
			name[i] = randomAccessfile.readChar(); // 读取字符
		// 将空字符取代为空格符并返回
		return new String(name).replace('\0', ' ');
	}

	public static Employee[] RandomReadFile(File file) throws Exception {
		RandomAccessFile randomAccessFile; // 创建RandomAccessFile实例
		randomAccessFile = new RandomAccessFile(file, "r"); // 初始化randomAccessFile对象
		// System.out.println(randomAccessFile.length()+"|"+Employee);
		Employee[] employee = new Employee[4]; // 创建Employee数组employee
		int num = (int) randomAccessFile.length() / Employee.size();// 返回Employee类的占用空间大小
		for (int i = 0; i < num; i++) {
			randomAccessFile.seek((i) * Employee.size());
			// 使用对应的read方法读出数据
			employee[i] = new Employee(readName(randomAccessFile), randomAccessFile.readInt());
		}
		randomAccessFile.close(); // randomAccessFile关闭
		return employee; // 返回数组
	}

	public static void main(String[] args) throws Exception {
		// 创建，并初始文件名称
		String filename = args[0] == null ? "D:\\Self-StudyManual\\random.txt" : args[0];
		File file = new File(filename); // 创建，并初始File对象file
		RandomWriteFile(file); // 调用RandomWriteFile方法
		Employee[] employee = RandomReadFile(file); // 返回文件中保存的employee数组
		// 使用for，遍历employee数组
		for (Employee e : employee) {
			System.out.println("name = " + e.getName() + "\t| \tage = " + e.getAge());
		}
	}
}

class Employee {
	String name; // 创建String类型的域name
	int age; // 创建int类型的域age
	final static int LEN = 8; // 创建，并初始化静态域LEN

	public Employee(String name, int age) {
		if (name.length() > LEN) {
			name = name.substring(0, 8); // 截取字符串的子字符串
		} else {
			while (name.length() < LEN)
				name = name + "\u0000";
		}
		this.name = name; // 初始化name
		this.age = age; // 初始化age
	}

	// 用于返回name
	public String getName() {
		return name; // 返回name
	}

	// 用于返回age
	public int getAge() {
		return age; // 返回age
	}

	// 设置name
	public void setName(String name) {
		this.name = name; // 修改name的引用
	}

	// 设置age
	public void setAge(int age) {
		this.age = age; // 修改age的值
	}

	// 获取类占用的空间
	public static int size() {
		return 2 * 8 + 4;// 字符串长度是8，一个字符占用2个字节，一个整型是4个字节
	}
}
