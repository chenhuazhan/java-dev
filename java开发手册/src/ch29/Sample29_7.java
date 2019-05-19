package ch29;

import java.io.*;
import java.util.*;

public class Sample29_7 {
	public static void main(String[] args) {
		String file = "Sample29_7.txt"; // ����������ʼ���ļ���
		Person[] persons = { new Person("����", 23), // ����������ʼ��Person����
				new Person("����", 25) };
		// д�����ļ�
		writeObjectsToFile(persons, file);
		try {
			// ��ȡ�ļ�����
			persons = readObjectsFromFile(file);
			// �������������ȡ�Ķ���
			for (Person person : persons) {
				System.out.printf("%s\t%d%n", person.getName(), person.getAge()); // ��ʽ�����
			}
			System.out.println(); // ������з�
			// ��ʼ��persons����
			persons = new Person[2];
			persons[0] = new Person("����", 21);
			persons[1] = new Person("����", 25);
			// �����¶������ļ�
			appendObjectsToFile(persons, file);
			// ��ȡ�ļ�����
			persons = readObjectsFromFile(file); // ����readObjectsFromFile���ر���Ķ���
			// ��ʾ���صĶ���
			for (Person person : persons) {
				System.out.printf("%s\t%d%n", person.getName(), person.getAge()); // ��ʽ�����
			}
		} catch (ArrayIndexOutOfBoundsException e) { // �����쳣ArrayIndexOutOfBoundsException
			System.out.println("û��ָ���ļ���"); // ����ļ���
		} catch (FileNotFoundException e) { // �����쳣FileNotFoundException
			e.printStackTrace(); // �쳣���
		}
	}

	// ��ָ���Ķ���д����ָ�����ļ�
	public static void writeObjectsToFile(Object[] objs, String filename) {
		File file = new File(filename); // ����������ʼ��File����file
		try {
			// ����������ʼ��ObjectOutputStream����objOutputStream
			ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			for (Object obj : objs) {
				// ������д���ļ�
				objOutputStream.writeObject(obj);
			}
			// �ر���objOutputStream
			objOutputStream.close();
		} catch (IOException e) { // �����쳣IOException
			e.printStackTrace(); // �쳣��Ϣ���
		}
	}

	// ��ָ���ļ��еĶ������ݶ���
	public static Person[] readObjectsFromFile(String filename) throws FileNotFoundException {
		File file = new File(filename);
		// ����ļ������ھͶ����쳣
		if (!file.exists())
			throw new FileNotFoundException();
		// ʹ��List�ȴ洢���صĶ���
		List<Person> list = new ArrayList<Person>();
		try {
			FileInputStream fileInputStream = new FileInputStream(file); // ����������ʼ��FileInputStream
			// ����������ʼ��ObjectInputStream����objInputStream
			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
			while (fileInputStream.available() > 0) {
				list.add((Person) objInputStream.readObject()); // ��ȡһ�����󣬲�������б���
			}
			objInputStream.close(); // �ر�objInputStream
		} catch (ClassNotFoundException e) { // ����ClassNotFoundException�쳣
			e.printStackTrace(); // �쳣��Ϣ���
		} catch (IOException e) { // ����IOException�쳣
			e.printStackTrace(); // �쳣��Ϣ���
		}
		Person[] persons = new Person[list.size()]; // ����������ʼ��Person����
		return list.toArray(persons);
	}

	// �����󸽼���ָ�����ļ�֮��
	public static void appendObjectsToFile(Object[] objs, String filename) throws FileNotFoundException {
		File file = new File(filename); // ����������ʼ��File����file
		// ����ļ��������򶪳��쳣
		if (!file.exists())
			throw new FileNotFoundException(); // �׳��쳣
		try {
			// ����ģʽ
			ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(file, true)) {
				// ���Ҫ���Ӷ������ļ��󣬱������¶����������
				protected void writeStreamHeader() throws IOException {
				} // �׳��쳣
			};
			for (Object obj : objs) {
				// ������д���ļ�
				objOutputStream.writeObject(obj);
			}
			objOutputStream.close(); // objOutputStream�ر�
		} catch (IOException e) { // �����쳣
			e.printStackTrace(); // �쳣��Ϣ���
		}
	}
}

class Person implements Serializable { // ��������к�
	// ����Person��Ĺ��췽��
	public Person() {
	}

	// ����������Person��Ĺ��췽��
	public Person(String name, int age) {
		// ��ʼ����
		this.name = name;
		this.age = age;
	}

	// ����name��ֵ
	public void setName(String name) {
		this.name = name;
	}

	// ����age��ֵ
	public void setAge(int age) {
		this.age = age;
	}

	// ����name��ֵ
	public String getName() {
		return name;
	}

	// ����age��ֵ
	public int getAge() {
		return age;
	}

	private String name; // �����ַ���������name
	private int age; // ��������������age
}
