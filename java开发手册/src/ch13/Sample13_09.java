package ch13;
//方法链的使用

class MyClass {
	// 方法a，返回MyClass类型
	public MyClass a() {
		System.out.println("恭喜你，成功使用了方法链，现在调用到了方法a");
		return this;
	}

	// 方法b，返回MyClass类型
	public MyClass b() {
		System.out.println("恭喜你，成功使用了方法链，现在调用到了方法b");
		return this;
	}

	// 方法c什么也不返回
	public void c() {
		System.out.println("恭喜你，成功使用了方法链，现在调用到了方法c");
	}
}

public class Sample13_09 {
	public static void main(String[] args) {
		// 创建对象
		MyClass mc = new MyClass();
		// 调用方法链
		mc.a().b().c();
	}
}
