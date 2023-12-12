package com.day21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest {

	private ArrayList<Socket> clients = new ArrayList<Socket>();

	public void serverStart() {

		try {

			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 시작...");

			while (true) {
				Socket sc = ss.accept();// block

				// Thread
				WorkThread wt = new WorkThread(sc);
				wt.start();

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	class WorkThread extends Thread {

		private Socket sc;// 현재 접속한 client

		public WorkThread(Socket sc) {
			this.sc = sc;
		}

		@Override
		public void run() {

			String msg = null;
			String ip = null;

			try {

				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));

				ip = sc.getInetAddress().getHostAddress();

				clients.add(sc);// 현재 접속한 클라이언트

				// 다른 클라이언트에게 접속사실을 알림
				msg = ip + "]가 입장했습니다";

				for (Socket ss : clients) {

					if (ss == sc) {
						continue;// break와 비슷한 개념. breaks를 만나면 for문이 끝남. continue는 이번만 생략
					}
					PrintWriter pw = new PrintWriter(ss.getOutputStream(), true);
					pw.println(msg);
				}

				System.out.println(msg);

				// 메세지
				while ((msg = br.readLine()) != null) {
					for (Socket ss : clients) {

						if (ss == sc) {
							continue;// break와 비슷한 개념. breaks를 만나면 for문이 끝남. continue는 이번만 생략
						}
						PrintWriter pw = new PrintWriter(ss.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg);
				}

			} catch (Exception e) {

				msg = ip + "]가 퇴장했습니다.";

				try {

					for (Socket ss : clients) {

						if (ss == sc) {
							continue;// break와 비슷한 개념. breaks를 만나면 for문이 끝남. continue는 이번만 생략
						}
						PrintWriter pw = new PrintWriter(ss.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg);
					sc = null;

				} catch (Exception e2) {

				}

			}

		}

	}

	public static void main(String[] args) {

		new ServerTest().serverStart();

	}

}
