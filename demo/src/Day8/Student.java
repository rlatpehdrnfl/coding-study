package Day8;

import java.util.Scanner;

public class Student {

	int inwon;
	Record22[] rec;

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.println("인원수?");
			inwon = sc.nextInt();
		}while(inwon<1);

		rec = new Record22[inwon];


	}

	public void input() {

		int tot;

		String[] title = {"국어?","영어?","수학?"};

		for(int i=0;i<inwon;i++) {

			rec[i] = new Record22();

			System.out.println((i+1 + "번째 이름?"));
			rec[i].name = sc.next();

			for(int j=0;j<3;j++) { 


				System.out.print(title[j]);

				rec[i].score[j] = sc.nextInt();
				rec[i].tot += rec[i].score[j];

			}

		}
	}


    private void grade() {
        for (int i = 0; i < inwon; i++) {
            for (int j = 0; j < 3; j++) {
                if (rec[i].score[j] >= 90) {
                    rec[i].grade[j] = '수';
                } else if (rec[i].score[j] >= 80) {
                    rec[i].grade[j] = '우';
                } else if (rec[i].score[j] >= 70) {
                    rec[i].grade[j] = '미';
                } else if (rec[i].score[j] >= 60) {
                    rec[i].grade[j] = '양';
                } else {
                    rec[i].grade[j] = '가';
                }
            }
        }
    }


    public void print() {
        grade();
        for (int i = 0; i < inwon; i++) {
            System.out.println((i + 1) + "번째 학생: " + rec[i].name);
            for (int j = 0; j < 3; j++) {
                System.out.println("과목: " + (j + 1) + ", 점수: " + rec[i].score[j] + ", 학점: " + Character.toString(rec[i].grade[j]));
            }
        }
    }
}