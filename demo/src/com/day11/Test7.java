package com.day11;

import java.util.Calendar;

public class Test7 {

	public static void main(String[] args) {

		// Calendar로 만년 달력을 만드세요

		String[] yoil = { "일", "월", "화", "수", "목", "금", "토" };

		Calendar now = Calendar.getInstance();

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1;// 0~11
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);// 1~7,1:일요일

		System.out.println(y + "-" + m + '-' + d + "-" + yoil[w - 1]);

		int startDay = now.getActualMinimum(Calendar.DATE);// 1
		int endDay = now.getActualMaximum(Calendar.DATE);// 30

		// now.set(2020, 5 - 1, 20);

		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;// 0~11
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);// 1~7,1:일요일

		// 달력 출력
		System.out.printf("%13d년 %d월", y, m);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");

		int i;
		// 앞에 빈공간 채우기
		for (i = 0; i < w; i++) {
			System.out.print("    ");// 4byte = 공백 4칸
		}

		// 월의 날짜 출력
		for (i = 1; i < startDay; i++) {
			System.out.print("    ");
			w++;
		}

		for (i = 1; i <= endDay; i++) {
			System.out.printf("%4d", i);
			w++;
			if (w % 7 == 0) {
				System.out.println();
			}
		}

		if (w % 7 != 0) {
			System.out.println();
		}
		System.out.println("------------------------------");

	}

}
