package ch08_father_and_son;

class son0 extends Father{
	
	public void getShow(){
		System.out.println("�����ڴ�����ý����"+this.str1);
		//System.out.println("�����ڴ�����ý����"+this.str2);
		System.out.println("�����ڴ�����ý����"+this.str3);
		System.out.println("�����ڴ�����ý����"+this.str4);
	}
	
	String s="����ĳ�Ա����";
	public void show(){
		System.out.println("������õ��ǣ�"+s);
		System.out.println("������õ��ǣ�"+super.s);
	}

}
public class Son{

	public static void main(String[] args) {
		son0 s=new son0();
		System.out.println("�����������ý����"+s.str1);
		//System.out.println("�����������ý����"+s.str2);
		System.out.println("�����������ý����"+s.str3);
		System.out.println("�����������ý����"+s.str4);
		s.getShow();
		
		s.show();
	}

}
