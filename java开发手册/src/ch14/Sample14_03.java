package ch14;

class Student3 {
	// 学生的成员属性
	String name;
	int age;
	int classNum;

	// 学生类的无参构造器
	public Student3() {
	}

	// 学生类的有参构造器
	public Student3(String name, int age, int classNum) {
		this.name = name;
		this.age = age;
		this.classNum = classNum;
	}

	// 重写equals方法
	public boolean equals(Object o) {
		// 测试是否指向同一个对象
		if (this == o) {
			return true;
		}
		// 测试引用o是否为null
		if (o == null) {
			System.out.print("o");
			return false;
		}
		// 测试o指向的对是否可以看作Student类型
		if (o instanceof Student3) {
			// 将引用进行强制类型转换
			Student3 s = (Student3) o;
			// 测试相关属性的内容
			if (this.name.equals(s.name)// 测试name属性
					&& this.age == s.age// 测试age属性
					&& this.classNum == s.classNum)// 测试classNum属性
			{
				return true;
			} else {
				System.out.print("ooo");

				return false;
			}
		}
		return false;
	}

	// 重写hashCode方法
	public int hashCode() {
		// 返回一个新的哈希码，该码与成员属性有关
		return 7 * this.name.hashCode() + 13 * Integer.valueOf(this.age).hashCode()
				+ 17 * Integer.valueOf(this.classNum).hashCode();
	}
}

// 主类
public class Sample14_03 {
	// 主方法
	public static void main(String[] args) {
		// 创建两个成员属性相同的学生对象
		Student3 s1 = new Student3("jc", 21, 97001);
		Student3 s2 = new Student3("jc", 21, 97001);
		// 使用equals方法测试两个学生对象是否相同
		if (s1.equals(s2)) {
			System.out.println("学生对象s1与s2是等价的，其哈希码分别为：");
			// 打印两个对象的哈希码
			System.out.print("s1.hashCode() = " + s1.hashCode() + ", ");
			System.out.println("s2.hashCode() = " + s2.hashCode());
		} else {
			System.out.println("学生对象s1与s2是不等价的！！");
		}
	}
}
