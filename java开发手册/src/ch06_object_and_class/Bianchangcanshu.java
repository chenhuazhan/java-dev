package ch06_object_and_class;

import java.util.Arrays;

public class Bianchangcanshu {
	public static void sortAndPrint(int... entrys)
	{
		//���յ��������������
		Arrays.sort(entrys);
		//��ȡ�����С
		int size = entrys.length;
		//ѭ�����������
		System.out.print("������Ϊ");
		for(int i=0;i<size;i++)
			System.out.print(entrys[i]+" ");
	}

}
