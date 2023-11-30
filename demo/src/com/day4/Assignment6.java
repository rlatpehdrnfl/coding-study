package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args)  {

		/*6. 이름과 3과목의 점수를 입력 받아 다음조건에 따라 출력
		-모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
		-한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
		-평균이 60점 미만이면 불합격
		 */
		

		Scanner sc = new Scanner(System.in);


		int num1,num2,num3,avg;
		String name;


		System.out.println("이름 과목1 과목2 과목3");
		name = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		avg = (num1 + num2 + num3)/3;



		if (avg>=60) {

			if (num1>=40 && num2>=40 && num3>=40) {

				System.out.println("합격");
			}else  {
				System.out.println("과락");
			}
		}
		else {
			System.out.println("불합격");
		}

		
		
	}

}



/*

if (num1>=40 && num2>=40 && num3>=40) {
	if (avg>=60) {
		System.out.println("합격");

	}
}else if (num1<40 || num2<40 || num3<40) {
	if (avg<= 60) {
		System.out.println("과락");
	}
}else if(avg<=60) {
	System.out.println("불합격");
}
//if (num1<40 || num2<40 || num3<40) {
//	if (avg<= 60) {
//		System.out.println("과락");

 */

