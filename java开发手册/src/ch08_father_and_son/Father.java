package ch08_father_and_son;

public class Father {
	//继承也是一种访问
	public String str1="该成员变量为public类型，可以被子类继承";
	private String str2="该成员变量为private类型，可以被子类继承";  
	//protected和默认类型只在继承时有差别
	String str3="该成员变量为默认类型，其在包内可以被子类继承";
	protected String str4="该成员变量为默认类型，可以被包外子类继承";
	
	String s="父类的成员变量";
	

}
