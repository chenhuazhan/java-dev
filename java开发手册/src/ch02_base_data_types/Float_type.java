package ch02_base_data_types;

public class Float_type {
	/*
	 * float 32λ 1.4E-45~3.4E+38,-1.4E-45~-3.4E+38 double 64λ
	 * 4.9E-324~1.7E+308,-4.9E-324~-1.7E+308
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b;
		double c, d;
		a = 20.1f; // �����ȸ����������f��F
		b = -10.13455f;
		c = -100.64656; // ˫���ȸ������ɼ�d��D��Ҳ�ɲ���
		d = 3.27;
		// �����Щ������ֵ
		System.out.println("a��ֵΪ��" + a);
		System.out.println("b��ֵΪ��" + b);
		System.out.println("c��ֵΪ��" + c);
		System.out.println("d��ֵΪ��" + d);

		// ����һ��˫���ȸ������pi����ʾԲ����
		double pi;
		// ����һ��˫���ȸ������r����ʾ�뾶
		double r;
		// ����һ��˫���ȸ������squ����ʾ���
		double squ;
		// ��ֵ3.141593��������pi
		pi = 3.141593;
		// ��ֵ12.15��������r
		r = 12.15;
		// ����������Ѽ���Ľ����������squ
		squ = pi * r * r * 60 / 360;
		// ������
		System.out.println(squ);

	}

}
