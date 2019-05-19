package ch12;

//创建一个异常类
class NoSuchScoreException extends Exception {
	// 定义两个构造器
	public NoSuchScoreException() {
	}

	public NoSuchScoreException(String msg) {
		super(msg);
	}
}

public class Sample12_16 {
	// 声明findGrade方法将抛出NoSuchScoreException异常
	public static int findGrade(double score) throws NoSuchScoreException {
		// 分数在0到60之间
		if (score >= 0 && score < 60) {
			return 5;
		}
		// 分数在60到75之间
		else if (score >= 60 && score < 75) {
			return 4;
		}
		// 分数在75到85之间
		else if (score >= 75 && score < 85) {
			return 3;
		}
		// 分数在85到100之间
		else if (score >= 85 && score <= 100) {
			return 1;
		}
		// 出现异常
		else {
			throw new NoSuchScoreException("不合法的成绩：" + score + "!!!");
		}
	}

	public static void main(String[] args) {
		// 使用功能方法
		try {
			int grade = findGrade(67);
			System.out.println("67分的等级为：" + grade + "。");
			// 这里将出现异常
			grade = findGrade(-20);
			System.out.println("-20分的等级为：" + grade + "。");
		}
		// 异常处理程序
		catch (NoSuchScoreException e) {
			e.printStackTrace();
		}
	}
}
