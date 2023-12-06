package com.day17;

import java.util.Random;
import java.util.Scanner;

public class RunnableTest extends Thread {

	Scanner scanner = new Scanner(System.in);
	Random rd = new Random();

	String[] name = { "박지민", "전준범", "이재완", "최원재", "김지은", "유경훈", "임경민", "박기범", "김세빈", "이혜민", "박진영", "김석현", "이후석", "박  솔",
			"윤수인", "염  진", "박사온" };
	int num;

	private RunnableTest() {

		System.out.println("발표자 인원수[최대 17명]?");
		num = scanner.nextInt();

		int random[] = new int[num];
		int n = 0;

		while (n < num) {
			random[n] = rd.nextInt(name.length);
			for (int i = 0; i < n; i++) {

				if (random[i] == random[n]) {
					n--;
					break;
				}
			}
			n++;
		}

		for (int i = 0; i < random.length; i++) {
			System.out.printf("%d번 발표자: %s \n", i + 1, name[random[i]]);
		}
	}

	public static void main(String[] args) {

		RunnableTest ob = new RunnableTest();

	}

}