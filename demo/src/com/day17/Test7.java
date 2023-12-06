package com.day17;

//인터럽트

class MyThread7 extends Thread {

	private Thread next;

	public void setNext(Thread next) {
		this.next = next;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {

			try {

				sleep(1000);

			} catch (Exception e) {

			}

			System.out.println(getName() + ":" + i);

			if (next.isAlive()) {
				next.interrupt();
			}

		}

	}

}

public class Test7 {

	public static void main(String[] args) {

		System.out.println("main 시작...");

		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();

		t1.setNext(t2);
		t2.setNext(t3);
		t3.setNext(t1);

		t1.interrupt();// 시작점//반복되는 스레드의 순서를 정할대 사용

		t1.start();
		t2.start();
		t3.start();

		try {

			t1.join();// 기다려
			t2.join();
			t3.join();

		} catch (Exception e) {

		}

		System.out.println("main 종료...");
	}

}
