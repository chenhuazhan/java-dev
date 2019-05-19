package ch29;

import java.io.*;

public class Sample29_6 {
	public static void main(String[] args) {
		String filename = "D:\\Sample29_6.txt"; // ����������ʼ���ļ����ַ���
		// ����������ʼ��Employee��������
		Employee[] employees = { new Employee("����", 23), new Employee("����", 24), new Employee("����", 25),
				new Employee("����", 22) };
		try {
			DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filename)); // ����DataOutputStream����
			for (Employee Employee : employees) // ʹ��for����
			{
				// д��UTF�ַ���
				dataOutputStream.writeUTF(Employee.getName());
				// д��int����
				dataOutputStream.writeInt(Employee.getAge());
			}
			// ��������������Ŀ�ĵ�
			dataOutputStream.flush();
			// �ر���
			dataOutputStream.close();
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filename));
			// �������ݲ���ԭΪ����
			for (int i = 0; i < employees.length; i++) {
				// ����UTF�ַ���
				String name = dataInputStream.readUTF();
				// ����int����
				int score = dataInputStream.readInt();
				employees[employees.length - 1 - i] = new Employee(name, score);
			}
			// �ر���
			dataInputStream.close();
			// �����ԭ�������
			for (Employee Employee : employees) {
				System.out.printf("%s\t%d%n", Employee.getName(), Employee.getAge()); // ��ʽ�����
			}
		} catch (IOException e) { // �����쳣
			e.printStackTrace(); // �쳣��Ϣ���
		}
	}
}
