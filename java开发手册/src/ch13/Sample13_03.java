package ch13;
//String��ĳ��÷���
public class Sample13_03 {
	public static void main(String args[]) {
		String s1 = "JavaSE6.0���ļ�����ȫ��ӭ������";
		String s2 = new String("��ϲ��ֱ������ֲ�ͬ���﷨�������ַ�������");
		String s3;
		// ʹ��charAt������ȡ�ַ�����ĳ���ַ�
		System.out.println("=====================charAt=======================");
		char c = s1.charAt(4);
		System.out.println("��0��ʼ�����ַ���s1�е�4���ַ�Ϊ��" + c);
		// ʹ��toCharArray�������ַ���ת��Ϊ�ַ�����
		System.out.println("=====================toCharArray==================");
		char[] array = s1.toCharArray();
		System.out.print("��char���鵹�Ŵ�ӡ��");
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i]);
		// ʹ��concat�������������ַ���
		System.out.println("\n=====================concat=======================");
		s3 = s1.concat(s2);
		System.out.println("�������ַ������Ӻ�Ľ��Ϊ��" + s3);
		// ʹ��equals�����Ƚ������ַ���������
		System.out.println("=====================equals=======================");
		s3 = "JavaSE6.0���ļ�����ȫ��ӭ������";
		if (s1.equals(s3))
			System.out.println("��ϲ����Գɹ���s1��s3�е���������ȫ��ͬ�ģ���");
		// ʹ��equalsIgnoreCase�����ڲ����ִ�Сд������±Ƚ������ַ���������
		System.out.println("=================equalsIgnoreCase=================");
		s3 = "JAVASE6.0���ļ�����ȫ��ӭ������";
		if (s1.equalsIgnoreCase(s3))
			System.out.println("s1��s3�е������ڲ����ִ�Сд�����������ͬ�ģ���");
		// ʹ��length������ȡ�ַ����ĳ���
		System.out.println("======================length======================");
		int size = s1.length();
		System.out.println("s1���ַ��ĸ���Ϊ��" + size);
		// ʹ��replace�����滻�ַ�����ĳ���ַ�
		System.out.println("======================replace=====================");
		s3 = s1.replace('a', 'X');
		System.out.println("��s1�����е���ĸa������ĸX��" + s3);
		// ʹ��substring������ȡ�ַ�����ĳ���Ӵ�
		System.out.println("======================substring===================");
		s3 = s1.substring(10);
		System.out.println("��0��ʼ����s1�е�10���ַ������ַ���Ϊ��" + s3);
		s3 = s1.substring(2, 10);
		System.out.println("��0��ʼ����s1�е�2���ַ�����10���ַ����ַ���Ϊ��" + s3);
		// ʹ��toLowerCase�������ַ������ַ�ȫ����Сд
		System.out.println("======================toLowerCase=================");
		s3 = s1.toLowerCase();
		System.out.println("��s1�е��ַ�ȫ����Сд��" + s3);
		// ʹ��toUpperCase�������ַ������ַ�ȫ���ɴ�д
		System.out.println("======================toUpperCase=================");
		s3 = s1.toUpperCase();
		System.out.println("��s1�е��ַ�ȫ���ɴ�д��" + s3);
		// ʹ��trim����ȥ���ַ���ͷ����β���Ĳ��ɼ��ַ�
		System.out.println("======================trim========================");
		s3 = "          Java SE6.0        ";
		System.out.println("s3û���ù�trim����ǰ��[" + s3 + "]");
		s3 = s3.trim();
		System.out.println("s3�ù�trim������[" + s3 + "]");
	}
}
