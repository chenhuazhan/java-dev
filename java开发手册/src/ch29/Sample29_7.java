package ch29;

import java.io.*;
import java.util.*;

public class Sample29_7 {
	public static void main(String[] args) {
		String file = "Sample29_7.txt"; // 创建，并初始化文件名
		Person[] persons = { new Person("张三", 23), // 创建，并初始化Person数组
				new Person("李四", 25) };
		// 写入新文件
		writeObjectsToFile(persons, file);
		try {
			// 读取文件数据
			persons = readObjectsFromFile(file);
			// 遍历，并输出读取的对象
			for (Person person : persons) {
				System.out.printf("%s\t%d%n", person.getName(), person.getAge()); // 格式化输出
			}
			System.out.println(); // 输出换行符
			// 初始化persons数组
			persons = new Person[2];
			persons[0] = new Person("王五", 21);
			persons[1] = new Person("李六", 25);
			// 附加新对象至文件
			appendObjectsToFile(persons, file);
			// 读取文件数据
			persons = readObjectsFromFile(file); // 调用readObjectsFromFile读回保存的对象
			// 显示读回的对象
			for (Person person : persons) {
				System.out.printf("%s\t%d%n", person.getName(), person.getAge()); // 格式化输出
			}
		} catch (ArrayIndexOutOfBoundsException e) { // 捕获异常ArrayIndexOutOfBoundsException
			System.out.println("没有指定文件名"); // 输出文件名
		} catch (FileNotFoundException e) { // 捕获异常FileNotFoundException
			e.printStackTrace(); // 异常输出
		}
	}

	// 将指定的对象写入至指定的文件
	public static void writeObjectsToFile(Object[] objs, String filename) {
		File file = new File(filename); // 创建，并初始化File对象file
		try {
			// 创建，并初始化ObjectOutputStream对象objOutputStream
			ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			for (Object obj : objs) {
				// 将对象写入文件
				objOutputStream.writeObject(obj);
			}
			// 关闭流objOutputStream
			objOutputStream.close();
		} catch (IOException e) { // 捕获异常IOException
			e.printStackTrace(); // 异常信息输出
		}
	}

	// 将指定文件中的对象数据读回
	public static Person[] readObjectsFromFile(String filename) throws FileNotFoundException {
		File file = new File(filename);
		// 如果文件不存在就丢出异常
		if (!file.exists())
			throw new FileNotFoundException();
		// 使用List先存储读回的对象
		List<Person> list = new ArrayList<Person>();
		try {
			FileInputStream fileInputStream = new FileInputStream(file); // 创建，并初始化FileInputStream
			// 创建，并初始化ObjectInputStream对象objInputStream
			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
			while (fileInputStream.available() > 0) {
				list.add((Person) objInputStream.readObject()); // 读取一个对象，并添加与列表中
			}
			objInputStream.close(); // 关闭objInputStream
		} catch (ClassNotFoundException e) { // 捕获ClassNotFoundException异常
			e.printStackTrace(); // 异常信息输出
		} catch (IOException e) { // 捕获IOException异常
			e.printStackTrace(); // 异常信息输出
		}
		Person[] persons = new Person[list.size()]; // 创建，并初始化Person数组
		return list.toArray(persons);
	}

	// 将对象附加至指定的文件之后
	public static void appendObjectsToFile(Object[] objs, String filename) throws FileNotFoundException {
		File file = new File(filename); // 创建，并初始化File对象file
		// 如果文件不存在则丢出异常
		if (!file.exists())
			throw new FileNotFoundException(); // 抛出异常
		try {
			// 附加模式
			ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(file, true)) {
				// 如果要附加对象至文件后，必须重新定义这个方法
				protected void writeStreamHeader() throws IOException {
				} // 抛出异常
			};
			for (Object obj : objs) {
				// 将对象写入文件
				objOutputStream.writeObject(obj);
			}
			objOutputStream.close(); // objOutputStream关闭
		} catch (IOException e) { // 捕获异常
			e.printStackTrace(); // 异常信息输出
		}
	}
}

class Person implements Serializable { // 类进行序列号
	// 声明Person类的构造方法
	public Person() {
	}

	// 声明带参数Person类的构造方法
	public Person(String name, int age) {
		// 初始化域
		this.name = name;
		this.age = age;
	}

	// 设置name的值
	public void setName(String name) {
		this.name = name;
	}

	// 设置age的值
	public void setAge(int age) {
		this.age = age;
	}

	// 返回name的值
	public String getName() {
		return name;
	}

	// 返回age的值
	public int getAge() {
		return age;
	}

	private String name; // 声明字符串类型域name
	private int age; // 声明整数类型域age
}
