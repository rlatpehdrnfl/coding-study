package com.score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();

		int ch;
		while (true) {

			do {
				System.out.print("1. 입력 2. 출력 3. 종료");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {

			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			default:
				System.exit(0);// 강제종료
			}

		}

	}

}
