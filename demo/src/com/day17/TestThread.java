
package com.day17;

import java.util.Random;
import java.util.Scanner;

public class TestThread extends Thread {

	Scanner scanner = new Scanner(System.in);
	Random rd = new Random();

	String[] name = { "������", "���ع�", "�����", "�ֿ���", "������", "������", "�Ӱ��", "�ڱ��", "�輼��", "������", "������", "�輮��", "���ļ�", "��  ��",
			"������", "��  ��", "�ڻ��" };
	int num;

	private TestThread() {

		System.out.println("��ǥ�� �ο���[�ִ� 17��]?");
		num = scanner.nextInt();

		int random[] = new int[num];
		int n = 0;

//		while (n < num) {
//			random[n] = rd.nextInt(name.length);
//			for (int i = 0; i < n; i++) {
//
//				if (random[i] == random[n]) {
//					n--;
//					break;
//				}
//			}
//			n++;
//		}

		for (n = 0; n < num; n++) {
			random[n] = rd.nextInt(name.length);

			for (int i = 0; i < n; i++) {

				if (random[i] == random[n]) {

					n--;

				}
			}

		}

		for (int i = 0; i < random.length; i++) {
			System.out.printf("%d�� ��ǥ��: %s \n", i + 1, name[random[i]]);
		}
	}

	public static void main(String[] args) {

		TestThread ob = new TestThread();

	}

}