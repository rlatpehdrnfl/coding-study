package com.day19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test4 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private Button btn;
	private TextArea ta;
	private TextField tf;

	public Test4() {

		btn = new Button("추가");
		ta = new TextArea();
		tf = new TextField();

		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setTitle("윈도우");
		setSize(200, 300);

		tf.addActionListener(this);
		btn.addActionListener(this);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}

		});

		setVisible(true);
	}

	public static void main(String[] args) {

		new Test4();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {

		Object ob = evt.getSource();

		if (ob instanceof Button || ob instanceof TextField) {

			String str = tf.getText();

			if (!str.equals("")) {

				ta.append(str + "\r\n");// append는 문자열 누적

			}

			tf.setText("");
			tf.requestFocus();
		}

	}

}
