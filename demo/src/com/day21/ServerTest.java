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
			System.out.println("���� ����...");

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

		private Socket sc;// ���� ������ client

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

				clients.add(sc);// ���� ������ Ŭ���̾�Ʈ

				// �ٸ� Ŭ���̾�Ʈ���� ���ӻ���� �˸�
				msg = ip + "]�� �����߽��ϴ�";

				for (Socket ss : clients) {

					if (ss == sc) {
						continue;// break�� ����� ����. breaks�� ������ for���� ����. continue�� �̹��� ����
					}
					PrintWriter pw = new PrintWriter(ss.getOutputStream(), true);
					pw.println(msg);
				}

				System.out.println(msg);

				// �޼���
				while ((msg = br.readLine()) != null) {
					for (Socket ss : clients) {

						if (ss == sc) {
							continue;// break�� ����� ����. breaks�� ������ for���� ����. continue�� �̹��� ����
						}
						PrintWriter pw = new PrintWriter(ss.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg);
				}

			} catch (Exception e) {

				msg = ip + "]�� �����߽��ϴ�.";

				try {

					for (Socket ss : clients) {

						if (ss == sc) {
							continue;// break�� ����� ����. breaks�� ������ for���� ����. continue�� �̹��� ����
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
