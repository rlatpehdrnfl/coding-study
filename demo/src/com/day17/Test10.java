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

		String[] name = { "������", "���ع�", "�����", "�ֿ���", "������", "������", "�Ӱ��", "�ڱ��", "�輼��", "������", "������", "�輮��", "���ļ�",
				"��  ��", "������", "��  ��", "�ڻ��" };

		do {
			System.out.print("��ǥ�� �ο���[�ִ�" + name.length + "��]?");
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

		System.out.print("AI �����");

		ob.start();

		try {
			ob.join();
		} catch (Exception e) {

		}

		System.out.println();
		System.out.println();
		System.out.println("�����մϴ�! ��ǥ�� �Դϴ�");

		int cnt = 1;
		for (int su : num) {
			System.out.printf(cnt + "�� ��ǥ��; %4s\n", name[su - 1]);
			cnt++;
		}

	}

}
