package com.day17;

//스레드 생명주기

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("스레드 시작...");

			System.out.println("우선순위: " + this.getPriority());// this는 생략가능
			System.out.println("스레드 이름 : " + this.getName());// 기본은 무조건 5

			sleep(500);

			setPriority(2);
			System.out.println("변경된 우선순위: " + getPriority());

			System.out.println("스레드 종료...");

		} catch (Exception e) {

		}

	}

}

public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();// 현재 스레드(main)의 이름을 집어넣는 것
		Thread t2 = new MyThread6();

		System.out.println("메인 스레드 우선순위: " + t1.getPriority());
		System.out.println("메인 스레드 이름: " + t1.getName());
		System.out.println("t2 스레드 시작전 상태: " + t2.isAlive());// 살아있냐고 물어보는거

		t2.start();

		System.out.println("t2우선순위: " + t2.getPriority());

		t2.setPriority(1);

		try {

			Thread.sleep(100);// main 너 0.1초 쉬어!!

			System.out.println("t2 살아있냐?: " + t2.isAlive());

			Thread.sleep(1000);// main너 또 1초 쉬어!

			System.out.println("1초 후 t2살아있냐?: " + t2.isAlive());

			t2.join();// main 기다려

			System.out.println("t2살아있냐?: " + t2.isAlive());

		} catch (Exception e) {

		}

	}

}
