package ch08_father_and_son;

/*
 * 抽象方法只能存在于抽象类中，抽象类中的方法可以不是抽象的，抽象方法没有方法体
 * 抽象类的第一个非抽象子类必须实现其父类所有的抽象方法，包括父类继承的抽象方法
 * 
 * abstract和final有着相反的目的，不能同时修饰同一个方法
 * abstract和private亦不可同时使用
 */
abstract class Car3 {
	private double price;
	private String brand;
	private int speed;

	public abstract void startUp(); // 抽象方法的声明

	// 抽象方法不能是private的，因为它必须要被继承才可以用，错误用法：
	// private abstract void show();
}

// 定义抽象类Audi并使该类继承自Car
abstract class Audi extends Car3 {
	// 定义抽象方法turbo
	public abstract void turbo();
}

// 定义非抽象类Audi_A6继承自Audi
class Audi_A6 extends Audi {
	// 实现startUp方法
	public void startUp() {
		System.out.println("调用了奥迪A6的启动功能！！！");
	}

	// 实现turbo方法
	public void turbo() {
		System.out.println("调用了奥迪A6的加速功能！！！");
	}
}

// 定义非抽象类Audi_A8继承自Audi
class Audi_A8 extends Audi {
	// 实现startUp方法
	public void startUp() {
		System.out.println("调用了奥迪A8的启动功能！！！");
	}

	// 实现turbo方法
	public void turbo() {
		System.out.println("调用了奥迪A8的加速功能！！！");
	}
}

public class Abstract_and_extends {
	public static void main(String[] args) {
		Car3 c; // 可以声明
		// c=new Car3();//不能实例化抽象类

		// 创建Audi_A6对象并使该类引用a6指向该对象
		Audi_A6 a6 = new Audi_A6();
		// 调用Audi_A6对象中的方法
		a6.startUp();
		a6.turbo();
		// 创建Audi_A8对象并使该类引用a8指向该对象
		Audi_A8 a8 = new Audi_A8();
		// 调用Audi_A8对象中的方法
		a8.startUp();
		a8.turbo();
	}

}
