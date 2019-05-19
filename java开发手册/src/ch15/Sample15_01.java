package ch15;
/*
 * 在外部类之外声明内部类引用时，需要用外部类类名加以标识（Outter3.Inner i=o.new Inner();）
 * 创建内部类对象时，首先需要创建外部类的对象，然后才能创建内部类对象
 * 
 * 在内部类中可以访问外部类的任何成员，在外部类中也可以访问内部类的任何成员
 * 在外部类中访问内部类非静态成员时，需要先创建内部类对象，内部类不允许有静态成员
 * 
 */


//外部类
class Outter1 {
	// 定义外部类的私有成员变量
	private int x = 100;

	// 定义内部类
	class Inner {
		// 定义内部类方法show，用来打印输出
		public void show() {
			// 打印输出
			System.out.println("恭喜你，创建了内部类的对象，" + "并且调用了内部类中的方法！！！");
			// 打印输出，并调用外部类的私有成员变量
			System.out.println("外部类的成员变量x的值为：" + x + "！！！");
		}

		// 定义内部类方法show，用来打印输出
		private void show1() {
			System.out.println("恭喜你，成功调用了内部类中的私有方法！！！");
		}
	}

	// 外部类中的方法
	public void createrInner() {
		// 在外部类中创建内部类的对象
		Inner i = new Inner();
		// 调用内部类中的方法
		i.show();
	}

	// 定义外部类的方法getInnerShow,调用内部类的非静态成员
	public void getInnerShow() {
		// 创建内部类对象
		Inner i = new Inner();
		// 调用内部类中私有方法
		i.show1();
	}
}

// 主类
public class Sample15_01 {
	public static void main(String[] args) {
		// 创建外部类的对象
		Outter1 o = new Outter1();
		// 调用外部类中创建内部类对象的方法
		o.createrInner();
		// 创建内部类的对象
		Outter1.Inner i = o.new Inner();
		// 调用内部类中的方法
		i.show();
		o.getInnerShow();
	}
}
