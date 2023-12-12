package com.day21;

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
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClinetTest extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private Socket sc = null;
	private int port = 7777;
	private String host = "127.0.0.1"; // localhost 네트워크에서 영어의 ME와 같음

	public ClinetTest() {
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}

		});

		setTitle("채팅 클라이언트");
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {

		new ClinetTest().connect();

	}

	@Override
	public void run() {

		// 상대가 보내는 메세지를 받을때

		String str;

		try {

			if (sc == null) {
				return;
			}

			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// 메세지
			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str);
			}

		} catch (Exception e) {

			ta.append("\r\n 서버 연결 종료!!");
			sc = null;
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 내가 보내는 메세지

		String str = tf.getText();

		if (str.trim().equals("")) {
			return;
		}

		if (sc == null) {
			return;
		}

		try {

			OutputStream os = sc.getOutputStream();

			PrintWriter pw = new PrintWriter(os, true);// flush : 자동으로 buffer칸이 다 차지 않아도 내보냄

			pw.println("클라이언트] " + str);// client에 보내는 메세지

			ta.append("\r\n클라이언트] " + str);// 자신의 창에 띄우는 것
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {
			ta.append("\r\n 서버와 접속이 끊겼습니다");
			sc = null;
		}

	}

	public void connect() {

		try {

			// 서버 소켓 생성(포트번호 7777)
			sc = new Socket(host, port);

			Thread th = new Thread(this);

			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

}
// 소켓 + 서버소켓 = accept
