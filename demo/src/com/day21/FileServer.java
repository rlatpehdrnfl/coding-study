package com.day21;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	class WorkThread extends Thread {

		private Socket sc = null;

		public WorkThread(Socket sc) {
			this.sc = sc;
		}

		@Override
		public void run() {

			try {

				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());

				System.out.println("클라이언트 접속!!");

				FileOutputStream fos = null;
				Object ob = null;

				while ((ob = ois.readObject()) != null) {

					if (ob instanceof FileInfo) {

						FileInfo info = (FileInfo) ob;

						if (info.getCode() == 100) {// 파일전송시작

							String str = new String(info.getData());

							fos = new FileOutputStream(str);

							System.out.println(str + " 파일전송 시작!!");

						} else if (info.getCode() == 110) {// 데이터전송

							if (fos == null) {
								break;
							}

							fos.write(info.getData(), 0, info.getSize());

							System.out.println(info.getSize() + "bytes 받는 중!!");

						} else if (info.getCode() == 200) {// 파일 전송 종료

							String str = new String(info.getData());

							fos.close();

							System.out.println(str + " 파일전송 종료!!");

						}
					}

				}

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}

	}

	public void serverStart() {

		try {

			ServerSocket ss = new ServerSocket(7777);
			System.out.println("클라이언트 접속 대기중...");

			Socket sc = ss.accept();

			WorkThread wt = new WorkThread(sc);
			wt.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {

		new FileServer().serverStart();
	}
}
