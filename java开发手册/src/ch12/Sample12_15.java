package ch12;

//自定义异常类
class MyException extends Exception {
	// 两种版本的构造器
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}
}

// 主类
public class Sample12_15 {
	public static void main(String[] args) {
		// 创建自定义异常类对象
		MyException me = new MyException("自定义异常类");
		// 调用继承的方法
		System.out.println("自定义异常对象的字符串表示为：“" + me.toString() + "”。");
		System.out.println("自定义异常对象携带的出错信息为：“" + me.getMessage() + "”。");
	}
}
