package ch13;

//����ʵ��
public class Sample13_08 {
	public static void main(String[] args) {
		// �����ַ�������s
		String s = "JavaSE6.0";
		// ����StringBuffer����sb
		StringBuffer sb = new StringBuffer("JavaSE6.0");
		// �����ַ�������str
		String str = "���ļ�����ȫ";
		// ��str�������ַ���s
		s.concat(str);
		// ��str������StringBuffer����sb
		sb.append(str);
		// ��ӡ���Ӻ�Ľ��
		System.out.println("��String����s�Լ�StringBuffer����sb���ַ������Ӳ�����������£�");
		System.out.println("������s = " + s);
		System.out.println("������sb = " + sb);
	}
}
