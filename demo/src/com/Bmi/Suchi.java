package com.Bmi;

import java.util.Scanner;

public class Suchi {

	int inwon;
	Record[] rec;

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.println("인원수?");
			inwon = sc.nextInt();
		} while (inwon<1 || inwon>100);

		rec = new Record[inwon];
	}

	public void input() {

		String[] title = {"키?","몸무게?"};

		for(int i=0;i<inwon;i++) {

			rec[i] = new Record();

			System.out.println((i+1) + "번째 이름?");
			rec[i].name = sc.next();

			for(int j=0;j<2;j++) {
				System.out.println(title[j]);
				rec[i].suchi[j] = sc.nextInt();

				rec[i].kimom = rec[i].suchi[0]-rec[i].suchi[1];

			}


		}
	}

	private void calculateBMI() {

		int i;

		for(i=0;i<inwon;i++) {

			rec[i].bmi = (int) (rec[i].suchi[1] / ((rec[i].suchi[0] / 100.0) * (rec[i].suchi[0] / 100.0)));

		}

	}
	public void print() {
		calculateBMI();

		for(int i=0;i<inwon;i++) {
			System.out.printf("%6s",rec[i].name);

			
				System.out.printf("%4d",rec[i].kimom);
				System.out.printf("%4d",rec[i].bmi);
			}

		}
	}
