package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Assignment3_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] str = {"가위","바위","보"};
		Random rd = new Random();
		
		int com = rd.nextInt(3)+1;
		
		//System.out.println(com);

		int user;
		do {
			System.out.println("1:가위, 2:바위, 3:보");
			user = sc.nextInt();
		}while(user<1||user>3);
		
		
		System.out.println("사용자: " + str[user-1] + ", 컴퓨터: " + str[com-1]);
		
		String result;
		
		result = "무승부 입니다";
				
		if((user==1 && com==3) || (user>com && !(com==1 && user ==3))) {
			result = "사용자가 이겼습니다";
		}
		
		if((com==1 && user==3) || (com>user && !(user==1 && com==3))) {
			result = "컴퓨터가 이겼습니다";
		}
		System.out.println("결과: " + result);
	}

}
