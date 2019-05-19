package ch12;

public class Sample12_1 {
	public static void main(String[] args) {
		// 被监视的代码块
		try {
			// 创建数组对象
			int[] a = new int[4];
			System.out.println("整型数组创建完毕！！");
			// 访问数组元素
			a[3] = 9;
			System.out.println("整型数组中第四个元素的数值为" + a[3] + "!!!");
		}
		// 处理下标越界异常
		catch (ArrayIndexOutOfBoundsException aiobe) {
			// 打印提示信息
			System.out.println("这里出现的错误类型是：数组下标越界！！");
		}
		// 处理空引用异常
		catch (NullPointerException npe) {
			// 打印提示信息
			System.out.println("这里出现的错误类型是：空引用！！");
		}
		System.out.println("主程序正常结束！！！");
	}
}
