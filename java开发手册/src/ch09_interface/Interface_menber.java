package ch09_interface;

/*
 * 接口的成员变量隐含是"public static final"的，如果没写系统会自动加上
 * 只能初始化一次，必须在声明时初始化
 * 通过接口名可以直接访问成员变量，也可以通过实现了接口的类名或引用来调用
 */
interface Flyer2 {
	// HIGH、MIDDLE、LOW分别表示高空，中等，低空飞行
	public static final int HIGH = 1;
	public static final int MIDDLE = 2;
	public static final int LOW = 3;
}

class AirPlane2 implements Flyer2 {
	public void setFlyHeight(int height) {
		switch (height) { // 判断处在何种飞行状态
		case HIGH:
			System.out.println("我现在处在高空飞行状态！！！");
			break;
		case MIDDLE:
			System.out.println("我现在处在中等高度飞行状态！！！");
			break;
		case LOW:
			System.out.println("我现在处在低空飞行状态！！！");
			break;
		}
	}
}

public class Interface_menber {
	public static void main(String[] args) {
		// 创建对象，调用方法
		AirPlane2 ap = new AirPlane2();
		//通过接口名可以直接访问成员变量，也可以通过实现了接口的类名或引用来调用
		ap.setFlyHeight(Flyer2.HIGH);
		ap.setFlyHeight(AirPlane2.MIDDLE);
		ap.setFlyHeight(ap.LOW);
	}
}
