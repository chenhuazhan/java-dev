package ch14;

class Student3 {
	// ѧ���ĳ�Ա����
	String name;
	int age;
	int classNum;

	// ѧ������޲ι�����
	public Student3() {
	}

	// ѧ������вι�����
	public Student3(String name, int age, int classNum) {
		this.name = name;
		this.age = age;
		this.classNum = classNum;
	}

	// ��дequals����
	public boolean equals(Object o) {
		// �����Ƿ�ָ��ͬһ������
		if (this == o) {
			return true;
		}
		// ��������o�Ƿ�Ϊnull
		if (o == null) {
			System.out.print("o");
			return false;
		}
		// ����oָ��Ķ��Ƿ���Կ���Student����
		if (o instanceof Student3) {
			// �����ý���ǿ������ת��
			Student3 s = (Student3) o;
			// ����������Ե�����
			if (this.name.equals(s.name)// ����name����
					&& this.age == s.age// ����age����
					&& this.classNum == s.classNum)// ����classNum����
			{
				return true;
			} else {
				System.out.print("ooo");

				return false;
			}
		}
		return false;
	}

	// ��дhashCode����
	public int hashCode() {
		// ����һ���µĹ�ϣ�룬�������Ա�����й�
		return 7 * this.name.hashCode() + 13 * Integer.valueOf(this.age).hashCode()
				+ 17 * Integer.valueOf(this.classNum).hashCode();
	}
}

// ����
public class Sample14_03 {
	// ������
	public static void main(String[] args) {
		// ����������Ա������ͬ��ѧ������
		Student3 s1 = new Student3("jc", 21, 97001);
		Student3 s2 = new Student3("jc", 21, 97001);
		// ʹ��equals������������ѧ�������Ƿ���ͬ
		if (s1.equals(s2)) {
			System.out.println("ѧ������s1��s2�ǵȼ۵ģ����ϣ��ֱ�Ϊ��");
			// ��ӡ��������Ĺ�ϣ��
			System.out.print("s1.hashCode() = " + s1.hashCode() + ", ");
			System.out.println("s2.hashCode() = " + s2.hashCode());
		} else {
			System.out.println("ѧ������s1��s2�ǲ��ȼ۵ģ���");
		}
	}
}
