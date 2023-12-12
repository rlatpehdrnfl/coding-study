package com.day21;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

//TCP/IP
//UDP
//D Class : 224.0.0.0 ~ 239.255.255.255

public class ChatCS extends Frame implements Runnable, ActionListener {

	private static final long serialVersionUID = 1L;

	// 다수의 클라이언트에게 데이터그램을 전송
	// DatagramSocket, DatagramPacket
	private MulticastSocket ms = null;
	private InetAddress xGroup = null;

	private String host = "230.0.0.7";
	private int port = 7777;
	private String userName = "이담";

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	public ChatCS() {

		ta.setEnabled(false);
		add(ta, BorderLayout.CENTER);

		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}
		});
		setTitle("그룹채팅 [" + host + "]");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();

	}

	public void setup() {

		try {

			xGroup = InetAddress.getByName(host);// 230.0.0.1
			ms = new MulticastSocket(port);// 7777

			ms.joinGroup(xGroup);

			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void disConnection() {

		try {

			ms.leaveGroup(xGroup);
			ms.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {

		new ChatCS().setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String str = tf.getText().trim();

		if (str.equals("")) {
			return;
		}

		byte[] buffer = (userName + "]" + str).getBytes();

		try {

			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);

			ms.send(dp);
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {
			System.out.println(e2.toString());
		}

	}

	@Override
	public void run() {

		try {

			while (true) {

				byte[] buffer = new byte[512];

				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

				ms.receive(dp);
				String str = new String(dp.getData()).trim();

				ta.append(str + "\r\n");

			}

		} catch (Exception e) {
			System.out.println(e.toString());
			disConnection();
		}
	}

}
