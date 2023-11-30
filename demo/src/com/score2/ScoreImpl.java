package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	int inwon, score;
	Scanner sc = new Scanner(System.in);

	Record[] rec;

	@Override
	public void set() {
		// �ο���

		do {
			System.out.println("�ο���?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];
	}

	@Override
	public void input() {

		// �Է�
		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.println((i + 1) + "��° �й�");
			rec[i].hak = sc.next();

			System.out.println((i + 1) + "�̸�");
			rec[i].name = sc.next();

			System.out.println("����?");
			rec[i].kor = sc.nextInt();

			System.out.println("����?");
			rec[i].eng = sc.nextInt();

			System.out.println("����?");
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = (int) (rec[i].tot / 3.0);

		}
	}

	private String panjung(int score) {

		String pan = "";

		switch (score / 10) {
		case 10:
		case 9:
			pan = "A";
			break;
		case 8:
			pan = "B";
			break;
		case 7:
			pan = "C";
			break;
		case 6:
			pan = "D";
			break;
		default:
			pan = "F";
		}

		return pan;

	}

	@Override
	public void print() {

		for (int i = 0; i < inwon; i++) {

			System.out.printf("4s 6s %4d(%s) 4s 6s %4d(%s) 4s 6s %4d(%s) %4d %4d\n", rec[i].hak, rec[i].name,
					rec[i].kor, panjung(rec[i].kor), rec[i].eng, panjung(rec[i].eng), rec[i].mat, panjung(rec[i].mat),
					rec[i].tot, rec[i].avg);

		}
	}

	// �й� �̸� ����(A) ����(B) ����(D) ���� ���

}
