package ch29;

import java.io.*;

public class Sample29_2 {
	public static void RandomWriteFile(File file) {
		Employee[] employees = new Employee[4]; // ����Employee����
		// ��ʼ��Employee����
		employees[0] = new Employee("����", 23);
		employees[1] = new Employee("����", 24);
		employees[2] = new Employee("����", 25);
		employees[3] = new Employee("����", 22);
		RandomAccessFile randomAccessFile = null; // ����RandomAccessFile����
		try {
			randomAccessFile = new RandomAccessFile(file, "rw"); // ��ʼ��randomAccessFile
		} catch (FileNotFoundException e1) { // �����쳣
			e1.printStackTrace(); // ����쳣��Ϣ
		}
		try {
			for (Employee e : employees) // for����employees����
			{
				randomAccessFile.writeChars(e.getName()); // д������
				randomAccessFile.writeInt(e.getAge()); // д������
			}
			randomAccessFile.close(); // �ر�randomAccessFile
		} catch (IOException e1) { // �����쳣
			e1.printStackTrace(); // ����쳣��Ϣ
		}
	}

	private static String readName(RandomAccessFile randomAccessfile) throws IOException {
		char[] name = new char[8]; // ����char��������
		for (int i = 0; i < name.length; i++)
			name[i] = randomAccessfile.readChar(); // ��ȡ�ַ�
		// �����ַ�ȡ��Ϊ�ո��������
		return new String(name).replace('\0', ' ');
	}

	public static Employee[] RandomReadFile(File file) throws Exception {
		RandomAccessFile randomAccessFile; // ����RandomAccessFileʵ��
		randomAccessFile = new RandomAccessFile(file, "r"); // ��ʼ��randomAccessFile����
		// System.out.println(randomAccessFile.length()+"|"+Employee);
		Employee[] employee = new Employee[4]; // ����Employee����employee
		int num = (int) randomAccessFile.length() / Employee.size();// ����Employee���ռ�ÿռ��С
		for (int i = 0; i < num; i++) {
			randomAccessFile.seek((i) * Employee.size());
			// ʹ�ö�Ӧ��read������������
			employee[i] = new Employee(readName(randomAccessFile), randomAccessFile.readInt());
		}
		randomAccessFile.close(); // randomAccessFile�ر�
		return employee; // ��������
	}

	public static void main(String[] args) throws Exception {
		// ����������ʼ�ļ�����
		String filename = args[0] == null ? "D:\\Self-StudyManual\\random.txt" : args[0];
		File file = new File(filename); // ����������ʼFile����file
		RandomWriteFile(file); // ����RandomWriteFile����
		Employee[] employee = RandomReadFile(file); // �����ļ��б����employee����
		// ʹ��for������employee����
		for (Employee e : employee) {
			System.out.println("name = " + e.getName() + "\t| \tage = " + e.getAge());
		}
	}
}

class Employee {
	String name; // ����String���͵���name
	int age; // ����int���͵���age
	final static int LEN = 8; // ����������ʼ����̬��LEN

	public Employee(String name, int age) {
		if (name.length() > LEN) {
			name = name.substring(0, 8); // ��ȡ�ַ��������ַ���
		} else {
			while (name.length() < LEN)
				name = name + "\u0000";
		}
		this.name = name; // ��ʼ��name
		this.age = age; // ��ʼ��age
	}

	// ���ڷ���name
	public String getName() {
		return name; // ����name
	}

	// ���ڷ���age
	public int getAge() {
		return age; // ����age
	}

	// ����name
	public void setName(String name) {
		this.name = name; // �޸�name������
	}

	// ����age
	public void setAge(int age) {
		this.age = age; // �޸�age��ֵ
	}

	// ��ȡ��ռ�õĿռ�
	public static int size() {
		return 2 * 8 + 4;// �ַ���������8��һ���ַ�ռ��2���ֽڣ�һ��������4���ֽ�
	}
}
