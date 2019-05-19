package ch08_father_and_son;

class son0 extends Father{
	
	public void getShow(){
		System.out.println("子类内代码调用结果："+this.str1);
		//System.out.println("子类内代码调用结果："+this.str2);
		System.out.println("子类内代码调用结果："+this.str3);
		System.out.println("子类内代码调用结果："+this.str4);
	}
	
	String s="子类的成员变量";
	public void show(){
		System.out.println("这里调用的是："+s);
		System.out.println("这里调用的是："+super.s);
	}

}
public class Son{

	public static void main(String[] args) {
		son0 s=new son0();
		System.out.println("子类外代码调用结果："+s.str1);
		//System.out.println("子类外代码调用结果："+s.str2);
		System.out.println("子类外代码调用结果："+s.str3);
		System.out.println("子类外代码调用结果："+s.str4);
		s.getShow();
		
		s.show();
	}

}
