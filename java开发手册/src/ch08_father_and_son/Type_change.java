package ch08_father_and_son;
class Car1 {
	String aMember = "����������ĳ�Ա����";
}

class Truck extends Car1 {
	String aMember = "���ǿ�����ĳ�Ա������������Ҳ��";
	String Member = "���ǿ���";
}

public class Type_change {

	public static void main(String[] args) {
		Car1 c = new Truck();    //�������ö������ָ�򣨼�ӣ�����Ķ���
		//Ĭ�Ϸ��ʵ����������ͣ����ࣩ
		System.out.println("���ʵĳ�ԱΪ��" + c.aMember + "!");
		//ǿ������ת��
		System.out.println("���ʵĳ�ԱΪ��" + ((Truck)c).aMember + "!");
		//System.out.println("���ʵĳ�ԱΪ��" + c.Member + "!");//���ܵ����������г�Ա
	}

}

