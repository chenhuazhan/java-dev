package ch11;
//����ת������
public class Sample11_8 {
	public static void main(String[] args) {
		String s = "";
		int i = 60; // ���ͱ�����
		s = Integer.toBinaryString(i); // ������ת����
		System.out.println(i + "ת��Ϊ�����ƣ�" + s);
		s = Integer.toOctalString(i); // �˽���ת����
		System.out.println(i + "ת��Ϊ�˽��ƣ�" + s);
		s = Integer.toHexString(i); // ʮ������ת����
		System.out.println(i + "ת��Ϊʮ�����ƣ�" + s);
	}
}