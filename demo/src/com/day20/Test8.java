
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

//소스를 볼 수 있는 창 frame  만들기

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

			URL url = new URL(tf.getText()); // 입력한 주소를 읽어서 url로 넘어옴
			ta.setText(""); // 데이터를 새로운거 입력하기위해서 초기화

			InputStream is = url.openStream(); // url에 찾아가서 도메인을 찾고 -> ip를 찾겠지? 그 다음 openStream 통로를 통해 is내용을
												// boderlayout에 넣음

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while ((str = br.readLine()) != null) {

				if (ta.getText().equals("")) { // 아무것도 없고 처음 딱 쓸 때
					ta.setText(str); // textarea에 str를 입력하고
				} else {
					ta.setText(ta.getText() + "\r\n" + str); // i=i+1
				}
			}

			is.close();

		} catch (Exception e2) {

		}

	}

}