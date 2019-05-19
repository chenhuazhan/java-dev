package ch23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

public class Sample23_5 extends JFrame implements ActionListener {
	// ������ǩ
	JLabel jl = new JLabel("��ã�����һ����ǩ������", JLabel.CENTER);
	// �����˵���
	JMenuBar jmb = new JMenuBar();
	// ���������á��˵�
	JMenu jm = new JMenu("����");
	// ������ɫ���ļ��˵���
	JMenuItem jmiColor = new JMenuItem("������ɫ");
	JMenuItem jmiFile = new JMenuItem("���ļ�");
	// �����ļ�ѡ����
	JFileChooser jfc = new JFileChooser("d:\\");

	public Sample23_5() {
		// ���˵�����ӵ�������
		this.setJMenuBar(jmb);
		// �����ò˵���ӵ��˵�����
		jmb.add(jm);
		// ���˵�����ӵ��˵���
		jm.add(jmiColor);
		jm.add(jmiFile);
		// Ϊ�˵���ע��ActionEvent�¼�������
		jmiColor.addActionListener(this);
		jmiFile.addActionListener(this);
		// ����ǩ��ӵ�������
		this.add(jl);
		// ���ļ�ѡ�������г�ʼ��
		// ɾ��ԭ�е��ļ�ѡ����
		jfc.removeChoosableFileFilter(jfc.getChoosableFileFilters()[0]);
		// ��ӿ��Խ���jpegͼƬ�ļ���ѡ����
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("JPEGͼƬ�ļ�", "jpg", "jpeg"));
		// ��ӿ��Խ���gifͼƬ�ļ���ѡ����
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("gifͼƬ�ļ�", "gif", "GIF"));
		// ���ô���Ĺرն��������⡢��Сλ���Լ��ɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��ɫ�ļ��Ի���ʾ��");
		this.setBounds(100, 100, 300, 90);
		this.setVisible(true);
	}

	// ʵ��ActionListener�����ӿ��еķ���
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jmiColor) {// ѡ��������ɫ�˵���
			Color c = JColorChooser.showDialog(this, "��ѡ���ǩ������ɫ", Color.cyan);
			jl.setForeground(c);
		} else if (e.getSource() == jmiFile) {// ѡ�д��ļ��˵���
			jfc.showOpenDialog(this);
			jl.setText("��ѡ����ļ���" + jfc.getSelectedFile().getName());
		}
	}

	public static void main(String[] args) {
		// ����Sample23_5�������
		new Sample23_5();
	}
}
