package Day8;

import java.util.Scanner;

public class Student {

	int inwon;
	Record22[] rec;

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.println("�ο���?");
			inwon = sc.nextInt();
		}while(inwon<1);

		rec = new Record22[inwon];


	}

	public void input() {

		int tot;

		String[] title = {"����?","����?","����?"};

		for(int i=0;i<inwon;i++) {

			rec[i] = new Record22();

			System.out.println((i+1 + "��° �̸�?"));
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
                    rec[i].grade[j] = '��';
                } else if (rec[i].score[j] >= 80) {
                    rec[i].grade[j] = '��';
                } else if (rec[i].score[j] >= 70) {
                    rec[i].grade[j] = '��';
                } else if (rec[i].score[j] >= 60) {
                    rec[i].grade[j] = '��';
                } else {
                    rec[i].grade[j] = '��';
                }
            }
        }
    }


    public void print() {
        grade();
        for (int i = 0; i < inwon; i++) {
            System.out.println((i + 1) + "��° �л�: " + rec[i].name);
            for (int j = 0; j < 3; j++) {
                System.out.println("����: " + (j + 1) + ", ����: " + rec[i].score[j] + ", ����: " + Character.toString(rec[i].grade[j]));
            }
        }
    }
}