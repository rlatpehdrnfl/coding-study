package com.day17;

class MyThread2 implements Runnable {// Runnable은 인터페이스

	private int num;
	private String name;

	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override // Runnable 구현하고 똑같이 Override
	public void run() {

		int i = 0;

		while (i < num) {

			System.out.println(name + ":" + i);
			i++;

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}

public class Test2 {

	public static void main(String[] args) {

		System.out.println("main 시작...");

		Thread t1 = new Thread(new MyThread2(100, "첫번째..."));
		Thread t2 = new Thread(new MyThread2(200, "두번째..."));

		t1.start();// 스레드가 다끝나야만 main이 종료된다
		t2.start();

		System.out.println("main 종료...");

	}

}
