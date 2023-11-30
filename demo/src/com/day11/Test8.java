package com.day11;

import java.util.Calendar;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		// 년도:2020
		// 월:5
		// 일:20
		// 며칠후?100
		// 만난날:2020년 5월 20일 ?요일
		// 100일 후: 2020년 ?월 ?일 ?요일

		String[] yoil = { "일", "월", "화", "수", "목", "금", "토" };

		Scanner sc = new Scanner(System.in);

		System.out.println("몇년에 만났나요?");
		int inputYear = sc.nextInt();

		System.out.println("몇월에 만났나요?");
		int inputMonth = sc.nextInt();

		System.out.println("몇일에 만났나요?");
		int inputDay = sc.nextInt();

		System.out.println("몇일 뒤를 확인하고 싶나요?");
		int daysToAdd = sc.nextInt();

		Calendar now = Calendar.getInstance();
		now.set(inputYear, inputMonth - 1, inputDay);

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1;
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK) - 1; // 일요일부터 0~6

		System.out.println("만난 날: " + y + "년 " + m + "월 " + d + "일 " + yoil[w] + "요일");

		// 입력받은 날짜로부터 몇 일 후 계산
		now.add(Calendar.DATE, daysToAdd);
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK) - 1; // 일요일부터 0~6

		System.out.println(daysToAdd + "일 후: " + y + "년 " + m + "월 " + d + "일 " + yoil[w] + "요일");

	}

}
