package com.day4;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		//2. 두 개의 정수를 입력받고 제일 큰 숫자와 제일 작은 숫자를 구분해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,temp;
		
		System.out.print("두 개의 정수를 입력하시오");
		num1= sc.nextInt();
		num2= sc.nextInt();
		
		if (num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("결과: %d %d",num1,num2);
		

	}

}
