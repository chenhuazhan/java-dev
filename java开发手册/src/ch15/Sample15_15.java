package ch15;

//定义外部类
class OuterClass {
	// 定义非静态内部接口
	public interface InnerInterface {
		public void show();
	}

	// 定义实现自InnerInterface接口的内部类
	public class InnerClass implements InnerInterface {
		// 实现接口中的方法
		public void show() {
			System.out.println("这里是内部类中的方法，该内部" + "类实现了私有内部接口InnerInterface！！！");
		}
	}

	// 定义获得该内部类对象的方法
	public InnerInterface getIn() {
		return new InnerClass();
	}
}

// 实现内部接口的普通类
class Common implements OuterClass.InnerInterface {
	// 实现接口中的方法
	public void show() {
		System.out.println("这里是普通类中的方法，该普通" + "类实现了私有内部接口InnerInterface！！！");
	}
}

// 主类
public class Sample15_15 {
	public static void main(String[] args) {
		// 创建外部类对象
		OuterClass oc = new OuterClass();
		// 声明内部接口的引用
		OuterClass.InnerInterface ic = null;
		// 获得实现内部接口的内部类对象
		ic = oc.getIn();
		// 访问内部接口中的方法
		ic.show();
		// 创建实现内部接口的普通类对象
		ic = new Common();
		// 访问内部接口中的方法
		ic.show();
	}
}
