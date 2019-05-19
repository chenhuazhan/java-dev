package ch14;

class Student1 {
	// 学生的成员属性
	String name;
	int age;
	int classNum;

	// 学生类的无参构造器
	public Student1() {
	}

	// 学生类的有参构造器
	public Student1(String name, int age, int classNum) {
		this.name = name;
		this.age = age;
		this.classNum = classNum;
	}

	// 重写toString方法
	public String toString() {
		// 将类名引导的属性序列字符串返回
		return "ch14.Student1[name=" + this.name + ",age=" + this.age + ",classNum=" + this.classNum + "]";
	}
}

// 主类
public class Sample14_01 {
	// 主方法
	public static void main(String[] args) {
		// 创建名为jc，年龄为21，学号为97001的学生对象
		Object wyf = new Student1("jc", 21, 97001);
		// 打印这个学生对象
		System.out.println(wyf.toString());
		System.out.println(wyf);
	}
}
