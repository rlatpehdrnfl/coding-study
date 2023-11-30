package com.day3;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		//오름차순 : 작은 수부터 정렬 <-> 내림차순

		//선언
		Scanner sc = new Scanner(System.in);

		int num1,num2,num3,temp;


		//입력
		System.out.print("세개의 수?");//50 30 20
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		//연산
		/*
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}


		//출력
		System.out.printf("결과 : %d %d %d\n",num1,num2,num3);

		 */

		//두번째 방법
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if(num1>num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}

		if (num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.printf("결과 : %d %d %d\n",num1,num2,num3);	
	}

	
	
	

}

