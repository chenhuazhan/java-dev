package ch12;

public class Sample12_20 {
	public static void main(String[] args) {
		// 调用myFunction方法
		myFunction(-12);
	}

	private static void myFunction(int i) {
		// 使用断言对程序逻辑进行判断
		assert (i >= 0) : " 断言失败，数值i小于0，其值为i=" + i;
		System.out.println("恭喜你，断言判断成功，程序继续正常运行！！");
	}
}
