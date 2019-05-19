package ch12;

//����һ���쳣��
class NoSuchScoreException extends Exception {
	// ��������������
	public NoSuchScoreException() {
	}

	public NoSuchScoreException(String msg) {
		super(msg);
	}
}

public class Sample12_16 {
	// ����findGrade�������׳�NoSuchScoreException�쳣
	public static int findGrade(double score) throws NoSuchScoreException {
		// ������0��60֮��
		if (score >= 0 && score < 60) {
			return 5;
		}
		// ������60��75֮��
		else if (score >= 60 && score < 75) {
			return 4;
		}
		// ������75��85֮��
		else if (score >= 75 && score < 85) {
			return 3;
		}
		// ������85��100֮��
		else if (score >= 85 && score <= 100) {
			return 1;
		}
		// �����쳣
		else {
			throw new NoSuchScoreException("���Ϸ��ĳɼ���" + score + "!!!");
		}
	}

	public static void main(String[] args) {
		// ʹ�ù��ܷ���
		try {
			int grade = findGrade(67);
			System.out.println("67�ֵĵȼ�Ϊ��" + grade + "��");
			// ���ｫ�����쳣
			grade = findGrade(-20);
			System.out.println("-20�ֵĵȼ�Ϊ��" + grade + "��");
		}
		// �쳣�������
		catch (NoSuchScoreException e) {
			e.printStackTrace();
		}
	}
}
