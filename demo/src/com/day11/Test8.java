package com.day11;

import java.util.Calendar;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		// �⵵:2020
		// ��:5
		// ��:20
		// ��ĥ��?100
		// ������:2020�� 5�� 20�� ?����
		// 100�� ��: 2020�� ?�� ?�� ?����

		String[] yoil = { "��", "��", "ȭ", "��", "��", "��", "��" };

		Scanner sc = new Scanner(System.in);

		System.out.println("��⿡ ��������?");
		int inputYear = sc.nextInt();

		System.out.println("����� ��������?");
		int inputMonth = sc.nextInt();

		System.out.println("���Ͽ� ��������?");
		int inputDay = sc.nextInt();

		System.out.println("���� �ڸ� Ȯ���ϰ� �ͳ���?");
		int daysToAdd = sc.nextInt();

		Calendar now = Calendar.getInstance();
		now.set(inputYear, inputMonth - 1, inputDay);

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1;
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK) - 1; // �Ͽ��Ϻ��� 0~6

		System.out.println("���� ��: " + y + "�� " + m + "�� " + d + "�� " + yoil[w] + "����");

		// �Է¹��� ��¥�κ��� �� �� �� ���
		now.add(Calendar.DATE, daysToAdd);
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK) - 1; // �Ͽ��Ϻ��� 0~6

		System.out.println(daysToAdd + "�� ��: " + y + "�� " + m + "�� " + d + "�� " + yoil[w] + "����");

	}

}
