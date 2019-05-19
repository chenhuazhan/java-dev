package ch08_father_and_son;
class Car1 {
	String aMember = "我是汽车类的成员变量";
}

class Truck extends Car1 {
	String aMember = "我是卡车类的成员变量，汽车类也有";
	String Member = "我是卡车";
}

public class Type_change {

	public static void main(String[] args) {
		Car1 c = new Truck();    //父类引用对象可以指向（间接）子类的对象
		//默认访问的是引用类型（父类）
		System.out.println("访问的成员为：" + c.aMember + "!");
		//强制类型转换
		System.out.println("访问的成员为：" + ((Truck)c).aMember + "!");
		//System.out.println("访问的成员为：" + c.Member + "!");//不能调用子类特有成员
	}

}

