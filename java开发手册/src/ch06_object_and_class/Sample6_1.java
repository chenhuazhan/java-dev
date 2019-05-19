package ch06_object_and_class;
public class Sample6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student tom=new Student();
		Student jerry=new Student();
		tom.sage=21;
		tom.sname="Tom";
		tom.sclass="97402";
		jerry.sage=23;
		jerry.sname="Jerry";
		jerry.sclass="97403";
		jerry=new Student(24,"Jerry","97404");
		System.out.println(tom.sage+" "+tom.sname+" "+tom.sclass);
		System.out.println(jerry.sage+" "+jerry.sname+" "+jerry.sclass);

	}

}
