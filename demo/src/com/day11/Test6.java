package com.day11;

import java.util.Calendar;

public class Test6 {

	public static void main(String[] args) {

		// Calendar
		// ���� ��ǻ�� �ý����� ��¥, �ð��� �ٷ�� Ŭ����

		String[] yoil = { "��", "��", "ȭ", "��", "��", "��", "��" };

		Calendar now = Calendar.getInstance();

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1;// 0~11
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);// 1~7,1:�Ͽ���

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
		w = now.get(Calendar.DAY_OF_WEEK);// 1~7,1:�Ͽ���

		System.out.println(y + "-" + m + '-' + d + "-" + yoil[w - 1]);

	}

}
