package com.score1;

import java.util.Scanner;

public class Score {

	//클래스는 자료형이다

	int inwon;
	Record[] rec;

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.println("인원수?");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);

		//배열의 객체를 생성
		rec = new Record[inwon];
		
	}

	public void input() {

		String[] title = {"국어?","영어?","수학?"};

		for(int i=0;i<inwon;i++) {


			rec[i] = new Record(); //배열안에 레코드 객체 형성 -> 반드시 for문 안에 들어가 있어야 함

			System.out.print((i+1) + "번째 이름?");//suzi
			rec[i].name = sc.next();


			for(int j=0;j<3;j++) {
				System.out.print(title[j]);//국영수
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];//총점
			}

			rec[i].avg = rec[i].tot / 3;

		}

	}
	private void ranking() {//내부사람들은 접근가능 외부사람들은 접근불가

		int i,j;

		//석차 초기화
		for(i=0;i<inwon;i++) {
			rec[i].rank=1;	
		}

		//석차 구하기(selection sort)
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {

				if(rec[i].tot>rec[j].tot) {
					rec[j].rank++;
				}else if (rec[i].tot<rec[j].tot)
					rec[i].rank++;

			}
		}
	} 
	
	
	private void grade() {

		int i,j = 0;

		for (i=0;i<inwon;i++) {
			for(j=0;j<3;j++) {



				if(rec[i].score[j]>=90) {
					rec[i].grade = "수";
				}else if(rec[i].score[j]>=80) {
					rec[i].grade = "우";
				}else if(rec[i].score[j]>=70) {
					rec[i].grade = "미";
				}else if(rec[i].score[j]>=60) {
					rec[i].grade = "양";
				}else {
					rec[i].grade = "가";
				}

			}

		}
	}

	public void print() {

		ranking();

		for(int i=0;i<inwon;i++) {

			System.out.printf("%6s",rec[i].name);

			for(int j=0;j<3;j++) {
				System.out.printf("%4d",rec[i].score[j]);
			

				System.out.printf("%4d",rec[i].tot);
				System.out.printf("%4d",rec[i].avg);
				System.out.printf("%4d\n",rec[i].rank);

			}
		}


	}
}

