package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 수 하나를 입력받아서 3의 배수 또는 4의 배수인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		String str;
		
		
		System.out.print("수 입력");//9
		su = sc.nextInt();
		
		if(su%3==0 && su%4==0) {			//값이 크고 조건이 여러개인 것을 상단에 배치해야 함
			str = "3과 4의 배수입니다";
		}else if(su%3==0) {
			str = "3의 배수입니다";
		}else if(su%4==0) {
			str = "4의 배수입니다";
		}else {
			str = "3과 4의 배수가 아닙니다";
		}
		
		System.out.println(su + ":" + str);
		
		
		
	}

}
