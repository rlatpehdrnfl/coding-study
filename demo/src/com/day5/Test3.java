package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//요일 구하기
		//년?2023
		//월?11
		//일?20
		//2023년 11월 20일 월요일

		Scanner sc = new Scanner(System.in);

		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int y,m,d,nalsu,i,week;
		String yoil;

		do {
			System.out.print("년도?");//2023
			y = sc.nextInt();
		}while(y<1);


		//y년이 윤년인지 확인해서 2월의 날수 구하기
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}

		

		do {
			System.out.print("월?");//11
			m = sc.nextInt();
		}while(m<1||m>12);

		//일
		do {
			System.out.println("일?");//20
			d = sc.nextInt();
		}while(m<0||d>months[m-1]);

		//요일
		yoil = "";



		//전년도(y-1년)12월31일까지의 날수
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;  //윤년만 출력


		for(i=0;i<m-1;i++) {
			nalsu += months[i]; //nalsu = nalsu + months[i]

		}

		//
		nalsu +=d; //nalsu = nalsu + d

		//y년m월1일이 무슨 요일인지 확인(0~6)
		week = nalsu%7;

		//System.out.println(week);

		//요일 출력
		/*
			if (nalsu%7 == 0) {
				yoil = "일요일";
			}else if (nalsu%7 == 1) {
				yoil = "월요일";
			}else if (nalsu%7 == 2) {
				yoil = "화요일";
			}else if (nalsu%7 == 3) {
				yoil = "수요일";
			}else if (nalsu%7 == 4) {
				yoil = "목요일";
			}else if (nalsu%7 == 5) {
				yoil = "금요일";
			}else  {
				yoil = "토요일";
			}

			System.out.printf("%d" + "년" + "%d" +"월" + "%d" +"일" + "%s" ,y,m,d,yoil);

		 */
		//배열 만들기
		//String yoil1[] = {"일","월","화","수","목","금","토"};

		//System.out.printf("%d년 %d월 %d일 %s요일",y,m,d,yoil1[week]);

		char yoil1[] = {'일','월','화','수','목'
				,'금','토'};

		System.out.printf("%d년 %d월 %d일 %c요일",y,m,d,yoil1[week]);

	}

}


