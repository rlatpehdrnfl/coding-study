package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1 {

	public static void main(String[] args) throws IOException{
		//1. 정수를 입력받아서 짝수, 홀수를 구분해서 출력
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int su=0;
		String str;
				
		System.out.println("정수를 입력하세요");
		su = Integer.parseInt(br.readLine());
				
		if(su%2==0); {
		str = "짝수입니다";
		}
		if(su%2!=0); {
		str = "홀수입니다";
		}
		
		System.out.println(su + ":" + str);
		
		
		
		

	}

}
