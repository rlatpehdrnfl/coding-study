package com.score1;

import java.util.Scanner;

public class Score {

	//Ŭ������ �ڷ����̴�

	int inwon;
	Record[] rec;

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.println("�ο���?");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);

		//�迭�� ��ü�� ����
		rec = new Record[inwon];
		
	}

	public void input() {

		String[] title = {"����?","����?","����?"};

		for(int i=0;i<inwon;i++) {


			rec[i] = new Record(); //�迭�ȿ� ���ڵ� ��ü ���� -> �ݵ�� for�� �ȿ� �� �־�� ��

			System.out.print((i+1) + "��° �̸�?");//suzi
			rec[i].name = sc.next();


			for(int j=0;j<3;j++) {
				System.out.print(title[j]);//������
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];//����
			}

			rec[i].avg = rec[i].tot / 3;

		}

	}
	private void ranking() {//���λ������ ���ٰ��� �ܺλ������ ���ٺҰ�

		int i,j;

		//���� �ʱ�ȭ
		for(i=0;i<inwon;i++) {
			rec[i].rank=1;	
		}

		//���� ���ϱ�(selection sort)
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
					rec[i].grade = "��";
				}else if(rec[i].score[j]>=80) {
					rec[i].grade = "��";
				}else if(rec[i].score[j]>=70) {
					rec[i].grade = "��";
				}else if(rec[i].score[j]>=60) {
					rec[i].grade = "��";
				}else {
					rec[i].grade = "��";
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

