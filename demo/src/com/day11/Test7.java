package com.day11;

import java.util.Calendar;

public class Test7 {

	public static void main(String[] args) {

		// Calendar�� ���� �޷��� ���弼��

		String[] yoil = { "��", "��", "ȭ", "��", "��", "��", "��" };

		Calendar now = Calendar.getInstance();

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1;// 0~11
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);// 1~7,1:�Ͽ���

		System.out.println(y + "-" + m + '-' + d + "-" + yoil[w - 1]);

		int startDay = now.getActualMinimum(Calendar.DATE);// 1
		int endDay = now.getActualMaximum(Calendar.DATE);// 30

		// now.set(2020, 5 - 1, 20);

		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;// 0~11
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);// 1~7,1:�Ͽ���

		// �޷� ���
		System.out.printf("%13d�� %d��", y, m);
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");

		int i;
		// �տ� ����� ä���
		for (i = 0; i < w; i++) {
			System.out.print("    ");// 4byte = ���� 4ĭ
		}

		// ���� ��¥ ���
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
