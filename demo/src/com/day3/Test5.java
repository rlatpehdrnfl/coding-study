package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {


		//제어문
		//if,for,while,do-while,switch

		/*
	 	if(조건){ 
		작업
		}
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int num = 0;
		String str = "";
		//클래스는 초기값이 null

		System.out.print("수입력?"); //123
		num = Integer.parseInt(br.readLine());
		
		/*
		//단일 if문
		if(num%2==0) {
			str = "짝수";
		}

		if(num%2!=0) {
			str = "홀수";
		}
		
		//단일 문장 모두 실행
		
		System.out.println(num + ":" + str);

		*/
		
		
		//if~else문
		if(num%2==0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		//위에서 걸리면 밑에 있는 것은 실행하지 않는다
		//따라서 단일 if문보다 속도가 빠르다
		//조건 하나에 실행하는 작업이 2번일 때 -> else는 한 번만 사용 가능
		
		
		System.out.println(num + ":" + str);

	}
}



