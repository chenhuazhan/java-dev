package ch06_object_and_class;

import java.util.Arrays;

public class Bianchangcanshu {
	public static void sortAndPrint(int... entrys)
	{
		//对收到的数组进行排序
		Arrays.sort(entrys);
		//获取数组大小
		int size = entrys.length;
		//循环输出排序结果
		System.out.print("排序结果为");
		for(int i=0;i<size;i++)
			System.out.print(entrys[i]+" ");
	}

}
