package ch06_object_and_class;

public class Use_this {
	// 定义了成员变量i，初始值为500
	int i = 500;

	void showI() {
		// 定义了局部变量i，初始值为300
		int i = 300;
		System.out.println("The value of i is " + i + ".");
	}

	public static void main(String[] args) {
		// 创建对象并调用方法
		new Use_this().showI();
	}

}
