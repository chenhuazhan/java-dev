package ch13;

public class Sample13_11 {
	public static void main(String[] args) { // ����StringBuilder����sb
		StringBuilder sb = new StringBuilder("Java6.0");
		System.out.println("����֮ǰ����sb1������Ϊ��" + sb);
		// ��StringBuilder����sb�������ӡ����롢ɾ���Լ����ò���
		sb.append("���ļ�����ȫ").insert(4, "SE").delete(9, 15).reverse();
		// ��ӡStringBuilder����sb
		System.out.println("һϵ�в���֮�����sb1������Ϊ��" + sb);
	}
}
