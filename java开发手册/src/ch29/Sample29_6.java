package ch29;

import java.io.*;

public class Sample29_6 {
	public static void main(String[] args) {
		String filename = "D:\\Sample29_6.txt"; // 创建，并初始化文件名字符串
		// 创建，并初始化Employee类型数组
		Employee[] employees = { new Employee("张三", 23), new Employee("赵云", 24), new Employee("李四", 25),
				new Employee("王五", 22) };
		try {
			DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filename)); // 创建DataOutputStream对象
			for (Employee Employee : employees) // 使用for变量
			{
				// 写入UTF字符串
				dataOutputStream.writeUTF(Employee.getName());
				// 写入int数据
				dataOutputStream.writeInt(Employee.getAge());
			}
			// 读出所有数据至目的地
			dataOutputStream.flush();
			// 关闭流
			dataOutputStream.close();
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filename));
			// 读出数据并还原为对象
			for (int i = 0; i < employees.length; i++) {
				// 读出UTF字符串
				String name = dataInputStream.readUTF();
				// 读出int数据
				int score = dataInputStream.readInt();
				employees[employees.length - 1 - i] = new Employee(name, score);
			}
			// 关闭流
			dataInputStream.close();
			// 输出还原后的数据
			for (Employee Employee : employees) {
				System.out.printf("%s\t%d%n", Employee.getName(), Employee.getAge()); // 格式化输出
			}
		} catch (IOException e) { // 捕获异常
			e.printStackTrace(); // 异常信息输出
		}
	}
}
