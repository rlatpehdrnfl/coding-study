package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4 {

	public static void main(String[] args) throws IOException {

		//4. 년도를 입력받고, 윤년인지 아닌지를 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String str;
		
		System.out.print("수를 입력하시오"); 
		num = Integer.parseInt(br.readLine());

		
		str = num%4==0 && num%100!=0 || num%400==0 ? "윤년" : "평년";
		
		System.out.println(str);

		
		

	}

}
