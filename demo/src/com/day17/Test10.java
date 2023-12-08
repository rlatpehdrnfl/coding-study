package com.day17;

import java.util.Random;
import java.util.Scanner;

class MyThread10 extends Thread {

	int cnt = 0;
	String str = "";

	@Override
	public void run() {

		while (true) {
			System.out.print(".");

			try {
				sleep(300);

				if (cnt == 20) {
					break;
				}

				cnt++;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}

	}
}

public class Test10 {

	public static void main(String[] args) {

		Thread ob = new MyThread10();

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] num;
		int inwon, i, n;

		String[] name = { "박지민", "전준범", "이재완", "최원재", "김지은", "유경훈", "임경민", "박기범", "김세빈", "이혜민", "박진영", "김석현", "이후석",
				"박  솔", "윤수인", "염  진", "박사온" };

		do {
			System.out.print("발표자 인원수[최대" + name.length + "명]?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > name.length);

		num = new int[inwon];

		n = 0;
		while (n < inwon) {

			num[n] = rd.nextInt(name.length) + 1;

			for (i = 0; i < n; i++) {
				if (num[i] == num[n]) {
					n--;
					break;
				}
			}
			n++;
		}

		System.out.print("AI 고민중");

		ob.start();

		try {
			ob.join();
		} catch (Exception e) {

		}

		System.out.println();
		System.out.println();
		System.out.println("축하합니다! 발표자 입니다");

		int cnt = 1;
		for (int su : num) {
			System.out.printf(cnt + "번 발표자; %4s\n", name[su - 1]);
			cnt++;
		}

	}

}
