package ch28;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

public class Sample28_10 extends Applet implements ActionListener {
	AudioClip ac;

	Button button_play, button_loop, button_stop;

	public void init() {
		this.setSize(260, 130); // ����Applet�Ĵ��ڴ�С,260��130�ֱ��17 �Ⱥ͸� ��
		try {
			URL url = new URL("http://r01.mmstoon.com/ring/953404.mid"); // ����20
																			// URL
																			// ��ַ
			ac = getAudioClip(url); // ������Ƶ����Զ�̻�ȡ��Ƶ����
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Label label = new Label("Զ����������ɹ�!�����ť��ʼ����!");
		add(label);
		button_play = new Button("��ʼ����"); // ��Ӱ�ť����
		button_loop = new Button("ѭ������");
		button_stop = new Button("ֹͣ����");
		button_play.addActionListener(this); // ��ť����¼�������
		button_stop.addActionListener(this);
		button_loop.addActionListener(this);
		add(button_play);
		add(button_loop);
		add(button_stop);
	}

	public void actionPerformed(ActionEvent e) { // ʵ�ּ���������
		if (e.getSource() == button_play) {
			ac.play(); // ��ʼ����
		} else if (e.getSource() == button_loop) {
			ac.loop(); // ѭ������
		}
		if (e.getSource() == button_stop) {
			ac.stop(); // ֹͣ����
		}
	}
}
