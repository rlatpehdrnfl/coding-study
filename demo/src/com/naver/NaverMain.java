package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Naver ob = new NaverImpl();

		int ch;
		while (true) {

			do {
				System.out.println("1.회원가입 2.회원정보 3.회원검색 4.종료");
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
				ob.search();
				break;
			default:
				System.exit(0);

			}

		}

	}

}
