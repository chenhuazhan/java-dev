package ch20;

//����swing��
import javax.swing.*;

//��չJFrame��
public class Sample20_1 extends JFrame {
	// �����ǩ��Ա
	private JLabel jLableWelcome;

	// ���幹����
	public Sample20_1() {
		// ���ô���Ĳ��ֹ�����Ϊnull
		this.setLayout(null);
		// ������ǩ����Ϊ���ʼ����ʾ��������Ϣ
		jLableWelcome = new JLabel();
		// ���ñ�ǩ����Ҫ��ʾ��������Ϣ
		jLableWelcome.setText("��ӭ������Swing�ı�����磬" + "�⽫������һ��ͼ�ν��潻�����򣡣���");
		// ���ñ�ǩ�ڴ����е�λ��
		jLableWelcome.setBounds(40, 30, 450, 30);
		// ����ǩ��ӽ�������
		this.add(jLableWelcome);
		// ���ô���ı��⡢λ�ô�С�Լ��ɼ���
		this.setTitle("��һ��Swing����");
		this.setBounds(330, 250, 500, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// �����������
		new Sample20_1();
	}
}
