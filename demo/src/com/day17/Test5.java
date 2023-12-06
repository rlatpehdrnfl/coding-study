package com.day17;

//Daemon 스레드(중요)
//다른 스레드에 도움을 주는 스레드로 메인 스레드가 종료되면 데몬 스레드가 완료되지 않아도 종료된다

class MyThread5 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

}

public class Test5 {

	public static void main(String[] args) {

		System.out.println("main 시작...");

		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());

		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}

		try {

			t1.join();// main너 우리 끝날때까지 기다려!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			t2.join();// 이건 꼭 try-catch문에다 써야함
			t3.join();

		} catch (Exception e) {

		}

		System.out.println("main 종료...");

	}

}
