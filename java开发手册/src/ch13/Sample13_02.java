package ch13;
//�����ʽת��
public class Sample13_02 {
	public static void main(String[] args) throws Exception {
		// �����ַ�������
		String s1 = "Java���ļ�����ȫ";
		// ���ַ���ת��Ϊiso8859_1���뷽ʽ�����
		String s2 = new String(s1.getBytes(), "iso8859_1");
		System.out.println("��s1ת��ΪISO8859_1�����ʽ�����Ϊ��" + s2);
		// ���ַ���ת��Ϊgb2312���뷽ʽ�����
		String s3 = new String(s2.getBytes("iso8859_1"), "gb2312");
		System.out.println("��s1��ת��Ϊgb2312�����ʽ�����Ϊ��" + s3);
	}
}
