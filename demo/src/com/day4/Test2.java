package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//반복문(for,while,do~while)
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("몇단?");//7
		int dan = sc.nextInt();
		
		
		//for(시작값;최대값;증가값)  	//시작값, 끝값, 중간값을 알고 있을때
		for(int i1=1;i1<=9;i1++) {// i=i+1
			
			System.out.println(dan + "*" + i1 + "=" + (i1*dan));
			
		}
			
		System.out.println("------------------------------------------------");
		
		//시작값                     	//몇번을 돌려할지 모를 때
		//while(최대값(조건)){			//while문 안에 시작값이 있으면 항상 1이 나옴
		//증가값						//DB에서 데이터 가져올때 많이 씀
		//}
		
		int j=1;
		while(j<=9) { // 초기값이 0일 경우 =을 지워줌
			
			//j++; 여기다 쓰면 7*10까지 나옴 -> 9까지 나오려면 초기값을 j=0으로 설정해야 함
			System.out.println(dan + "*" + j + "=" + (dan*j));
			j++;
		
		}
		
		System.out.println("------------------------------------------------");

		
		//시작값						//한 번은 무조건 실행 -> 상대방에게 vlaue값을 먼저 받아낼 때
		//do{ 증가값 }while(최대값);
		int k=1;
		do {
			System.out.println(dan + "*" +k + "=" + (dan*k));
			k++;
		}while(k<=9);					
		

		//무한루프 						//빠져나오는 방법 : break
		
		//while(true) {
		//	System.out.println("돌고있어...");
		//}
		
		
		
		
	}

}
