package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	int inwon, score;
	Scanner sc = new Scanner(System.in);

	Record[] rec;

	@Override
	public void set() {
		// 인원수

		do {
			System.out.println("인원수?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];
	}

	@Override
	public void input() {

		// 입력
		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.println((i + 1) + "번째 학번");
			rec[i].hak = sc.next();

			System.out.println((i + 1) + "이름");
			rec[i].name = sc.next();

			System.out.println("국어?");
			rec[i].kor = sc.nextInt();

			System.out.println("영어?");
			rec[i].eng = sc.nextInt();

			System.out.println("수학?");
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

	// 학번 이름 국어(A) 영어(B) 수학(D) 총점 평균

}
