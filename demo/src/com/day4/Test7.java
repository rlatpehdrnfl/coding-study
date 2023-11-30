package com.day4;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		
		//switch
		Scanner sc = new Scanner(System.in);

		int su;

		System.out.print("1~3사이의 수?");
		su = sc.nextInt();


		switch(su) {

		case 3:
			System.out.println("***");break;
		case 2:
			System.out.print("**");break;
		case 1:
			System.out.print("*");break;
		default:		// default는 생략가능
			System.out.print("숫자 입력오류");

		}



	}

}
