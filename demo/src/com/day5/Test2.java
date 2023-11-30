package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//만년달력 (배열실습1)
		//선언부
		Scanner sc = new Scanner(System.in);
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int y,m,nalsu,i,week;
		
		do {
			System.out.print("연도를 입력하시오");//2023
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월?");//11
			m = sc.nextInt();
		}while(m<1||m>12);
		
		//y년이 윤년인지 확인해서 2월의 날수 구하기
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
			//System.out.println("윤년");
		}
		
		//전년도(y-1년)12월31일까지의 날수
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;  //윤년만 출력	//and는 빼기 or는 더하기		
		//int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;	// 날수 출력
		//System.out.println(nalsu + ":" + yy);
				
		
		//y년 (m-1)월까지의 날수
		//index : 0 ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11
		//배열 : {31,28,31,30,31,30,31,31,30,31,30,31};
		//월(m):  1  2  3  4  5  6  7  8  9  10  11  12
		
		for(i=0;i<m-1;i++) {
			nalsu += months[i]; //nalsu = nalsu + months[i]	//+=는 누적이다
			
		}
		
		//y년 m월 1일 까지의 날수
		nalsu += 1;
		
		//y년m월1일이 무슨 요일인지 확인(0~6)
		week = nalsu%7;
		
		//System.out.println(week);
		
		//달력 출력
		System.out.printf("%13d년 %d월",y, m);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		//앞에 빈공간 채우기
		for(i=0;i<week;i++) {
			System.out.print("    ");//4byte = 공백 4칸
		}
		
		//월의 날짜 출력
		for(i=1;i<=months[m-1];i++) {
			System.out.printf("%4d", i);
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("------------------------------");

		
		
		
	}

}
