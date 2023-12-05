package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();

		int ch;

		while (true) {

			do {
				System.out.println("1.입력 2.출력 3. 삭제하기 4.업데이트 하기 5.학번 찾기 6.이름 찾기 7.종료: ");

				ch = sc.nextInt();

			} while (ch < 1);

			switch (ch) {
			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.delete();
				break;
			case 4:
				ob.update();
				break;
			case 5:
				ob.findHak();
				break;
			case 6:
				ob.findName();
				break;
			default:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}

	}

}
