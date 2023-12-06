package com.day17;

import java.util.Calendar;

//1초마다 시간 읽어서 표시하기

class MytThread3 implements Runnable {

	@Override
	public void run() {

		// 1초마다 시간 읽기

		while (true) {

			System.out.printf("%1$tF %1$tT\n", Calendar.getInstance());

			try {

				Thread.sleep(1000);

			} catch (Exception e) {

			}

		}

	}

}

public class Test3 {

	public static void main(String[] args) {

		// System.out.printf("%1$tF %1$tT", Calendar.getInstance());

		// MytThread3 myThread = new MytThread3();
		// Thread t1 = new Thread(myThread);
		Thread t1 = new Thread(new MytThread3());
		t1.start();
	}

}
