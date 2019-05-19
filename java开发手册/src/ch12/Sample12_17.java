package ch12;

//声明自定义异常类
class MyExceptionToHighLevel extends Exception {
	// 定义MyExceptionToHighLevel类的两个构造器
	public MyExceptionToHighLevel() {
	}

	public MyExceptionToHighLevel(String msg) {
		super(msg);
	}
}

class MyExceptionFromLowLevel extends Exception {
	// 定义MyExceptionFromLowLevel类的两个构造器
	public MyExceptionFromLowLevel() {
	}

	public MyExceptionFromLowLevel(String msg) {
		super(msg);
	}
}

// 执行业务的类
class MyClass {
	public void doLowLevelStaff(int a) throws MyExceptionFromLowLevel {
		// 执行判断
		if (a > 50) {// 正常情况
			System.out.println("恭喜你，低层方法执行成功！！！");
		} else {// 不正常情况，抛出异常
			System.out.println("低层发生事故，上报！！！");
			throw new MyExceptionFromLowLevel("值不大于50，发生事故！！！");
		}
	}

	// 定义doMiddleLevelStaff方法将抛出MyExceptionToHighLevel异常
	public void doMiddleLevelStaff() throws MyExceptionToHighLevel {
		// 受监视的代码
		try {
			int value = (int) Math.round(Math.random() * 100);
			System.out.println("调用值为：" + value + "。");
			this.doLowLevelStaff(value);
		}
		// 异常处理代码
		catch (MyExceptionFromLowLevel e) {
			System.out.println("发生事故，中层先进行一些处理，然后上报到上层！！！");
			// 再次抛出异常
			throw new MyExceptionToHighLevel("有事故发生，请上层处理！！！");
		}
	}

	// 定义doHighLevelStaff方法
	public void doHighLevelStaff() {
		// 受监视的代码
		try {
			this.doMiddleLevelStaff();
		}
		// 异常处理代码
		catch (MyExceptionToHighLevel e) {
			System.out.println("上层最终处理事故！！！");
		}
	}
}

public class Sample12_17 {
	public static void main(String[] args) {
		// 创建MyClass对象
		MyClass mc = new MyClass();
		// 调用doHighLevelStaff方法
		mc.doHighLevelStaff();
	}
}
