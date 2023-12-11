
package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

//�ҽ��� �� �� �ִ� â frame  �����

public class Test8 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private TextArea ta;
	private TextField tf;

	public Test8() {

		ta = new TextArea();
		add(ta);

		tf = new TextField();
		tf.addActionListener(this);
		add(tf, BorderLayout.NORTH);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}
		});

		setTitle("HTML Viewer");
		setSize(400, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test8();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			String str;

			URL url = new URL(tf.getText()); // �Է��� �ּҸ� �о url�� �Ѿ��
			ta.setText(""); // �����͸� ���ο�� �Է��ϱ����ؼ� �ʱ�ȭ

			InputStream is = url.openStream(); // url�� ã�ư��� �������� ã�� -> ip�� ã����? �� ���� openStream ��θ� ���� is������
												// boderlayout�� ����

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while ((str = br.readLine()) != null) {

				if (ta.getText().equals("")) { // �ƹ��͵� ���� ó�� �� �� ��
					ta.setText(str); // textarea�� str�� �Է��ϰ�
				} else {
					ta.setText(ta.getText() + "\r\n" + str); // i=i+1
				}
			}

			is.close();

		} catch (Exception e2) {

		}

	}

}