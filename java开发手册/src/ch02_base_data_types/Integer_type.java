package ch02_base_data_types;

/*
 * byte  8λ    -128~127
 * short 16λ   -32768~32767
 * int   32λ  -2147483648~2147483647
 * long  64λ  -9223372036854775808~9223372036854775807
 */
public class Integer_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����һ����ΪΪa�����ͱ�������ֵ20�������a
		int a = 20;
		// ����һ����ΪΪx�����ͱ�������ֵ-10�������x
		int x = -10;
		// ����һ����ΪΪb�ĳ����ͱ�������ֵ-100�������b
		long b = -100L; // ���������ݺ���Ҫ��'L'
		// ����һ����ΪΪl�ĳ����ͱ�������ֵ50�������l
		long l = 50l;
		// ����һ����ΪΪc�Ķ����ͱ�������ֵ50�������c
		short c = 50;
		// ����һ����ΪΪy�Ķ����ͱ�������ֵ-1�������y
		short y = -1;
		// ����һ����ΪΪd���ֽ��ͱ�������ֵ4�������d
		byte d = 4;
		// ����һ����ΪΪz���ֽ��ͱ�������ֵ0�������z
		byte z = 0;
		// �����Щ������ֵ
		System.out.println("a��ֵΪ��" + a);
		System.out.println("x��ֵΪ��" + x);
		System.out.println("b��ֵΪ��" + b);
		System.out.println("l��ֵΪ��" + l);
		System.out.println("c��ֵΪ��" + c);
		System.out.println("y��ֵΪ��" + y);
		System.out.println("d��ֵΪ��" + d);
		System.out.println("z��ֵΪ��" + z);

		// ����������
		int i, k, j, m;
		i = 2147483647;
		k = -2147483648;
		j = i + 1;
		m = k - 1;
		System.out.println(j);
		System.out.println(m);

		// ����10����
		// ����һ�����ͱ�����ʾ����
		int lightSpeed;
		// ����һ�����ͱ�����ʾ����
		long seconds;
		// ����һ�������ͱ�����ʾ�⴫���ľ���
		long dis;
		// ����
		lightSpeed = 300000000;
		// ����ʮ�������
		seconds = 10 * 365 * 24 * 60 * 60;
		// ����ʮ����ľ���
		dis = lightSpeed * seconds;
		System.out.println("ʮ�����ԼΪ" + dis + "��");

	}
}
