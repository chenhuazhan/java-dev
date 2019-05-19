package ch15;

import java.util.*;

class Student implements Comparable {
	// ѧ���ĳ�Ա����
	String name;
	int age;
	int classNum;

	// ѧ������޲ι�����
	public Student() {
	}

	// ѧ������вι�����
	public Student(String name, int age, int classNum) {
		this.name = name;
		this.age = age;
		this.classNum = classNum;
	}

	// ��дtoString����
	public String toString() {
		// ���������������������ַ�������
		return "ch15.Student[name=" + this.name + ",age=" + this.age + ",classNum=" + this.classNum + "]\n";
	}

	// ʵ��compareTo����
	public int compareTo(Object o) {
		// ǿ������ת��
		Student s = (Student) o;
		// ��classNum��Ϊ��׼��������
		return this.classNum - s.classNum;
	}
}

// ����
public class Sample15_14 {
	public static void main(String[] args) {
		// ���������ڲ��ഴ���Ƚ���
		TreeSet ts1 = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				// �����յ��Ķ�������ý���ǿ������ת��
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				// ָ���������������
				return s2.age - s1.age;
			}
		});
		// ��ts1��������ݲ�ͬ��ѧ�������Ԫ��
		ts1.add(new Student("tom", 21, 97005));
		ts1.add(new Student("jerry", 19, 97003));
		ts1.add(new Student("lucy", 18, 97004));
		ts1.add(new Student("smith", 28, 97001));
		ts1.add(new Student("jc", 23, 97002));
		// ��ӡts1�е�Ԫ��
		System.out.println("�����Sorted���ǰ�����Ӵ�С���е�����");
		System.out.println(ts1);
	}
}
