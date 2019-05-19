package ch15;

import java.util.*;

class Student implements Comparable {
	// 学生的成员属性
	String name;
	int age;
	int classNum;

	// 学生类的无参构造器
	public Student() {
	}

	// 学生类的有参构造器
	public Student(String name, int age, int classNum) {
		this.name = name;
		this.age = age;
		this.classNum = classNum;
	}

	// 重写toString方法
	public String toString() {
		// 将类名引导的属性序列字符串返回
		return "ch15.Student[name=" + this.name + ",age=" + this.age + ",classNum=" + this.classNum + "]\n";
	}

	// 实现compareTo方法
	public int compareTo(Object o) {
		// 强制类型转换
		Student s = (Student) o;
		// 用classNum作为基准进行排序
		return this.classNum - s.classNum;
	}
}

// 主类
public class Sample15_14 {
	public static void main(String[] args) {
		// 利用匿名内部类创建比较器
		TreeSet ts1 = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				// 将接收到的对象的引用进行强制类型转换
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				// 指定按年龄进行排序
				return s2.age - s1.age;
			}
		});
		// 向ts1中添加内容不同的学生对象的元素
		ts1.add(new Student("tom", 21, 97005));
		ts1.add(new Student("jerry", 19, 97003));
		ts1.add(new Student("lucy", 18, 97004));
		ts1.add(new Student("smith", 28, 97001));
		ts1.add(new Student("jc", 23, 97002));
		// 打印ts1中的元素
		System.out.println("这里的Sorted集是按年龄从大到小进行的排序：");
		System.out.println(ts1);
	}
}
