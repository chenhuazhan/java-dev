package ch14;

class Student1 {
	// ѧ���ĳ�Ա����
	String name;
	int age;
	int classNum;

	// ѧ������޲ι�����
	public Student1() {
	}

	// ѧ������вι�����
	public Student1(String name, int age, int classNum) {
		this.name = name;
		this.age = age;
		this.classNum = classNum;
	}

	// ��дtoString����
	public String toString() {
		// ���������������������ַ�������
		return "ch14.Student1[name=" + this.name + ",age=" + this.age + ",classNum=" + this.classNum + "]";
	}
}

// ����
public class Sample14_01 {
	// ������
	public static void main(String[] args) {
		// ������Ϊjc������Ϊ21��ѧ��Ϊ97001��ѧ������
		Object wyf = new Student1("jc", 21, 97001);
		// ��ӡ���ѧ������
		System.out.println(wyf.toString());
		System.out.println(wyf);
	}
}
