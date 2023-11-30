package com.day11;

import java.util.Calendar;

public class Test6 {

	public static void main(String[] args) {

		// Calendar
		// 현재 컴퓨터 시스템의 날짜, 시간을 다루는 클래스

		String[] yoil = { "일", "월", "화", "수", "목", "금", "토" };

		Calendar now = Calendar.getInstance();

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1;// 0~11
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);// 1~7,1:일요일

		System.out.println(y + "-" + m + "-" + d + "-" + yoil[w - 1]);

		int startDay = now.getActualMinimum(Calendar.DATE);// 1
		int endDay = now.getActualMaximum(Calendar.DATE);// 30

		System.out.printf(startDay + ":" + endDay);

		System.out.printf("%tF\n", now);
		System.out.printf("%tT\n", now);

		System.out.printf("%1$tF %1$tT\n", now);

		now.set(2024, 10 - 1, 10);

		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;// 0~11
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);// 1~7,1:일요일

		System.out.println(y + "-" + m + '-' + d + "-" + yoil[w - 1]);

	}

}
