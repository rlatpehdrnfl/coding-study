package com.day6;

import java.util.Scanner;
import com.day2.Test3;

public class Test1 {

	public static void main(String[] args) {

		//10�� �̳��� �̸��� ������ �Է¹޾� 
		//������ ������������ ���(ū��~������)

		Scanner sc = new Scanner(System.in);

		String name[];
		int score[];
		int[] rank;  // []�� ��ġ�� �߿����� ����

		int inwon,i,j,t1,t3;
		String t2;

		do {
			System.out.print("�ο���[1~10]?");//3
			inwon = sc.nextInt();

		}while(inwon<1||inwon>10);

		//�迭�� �޸� �Ҵ�(��ü ����)
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];


		for (i=0;i<inwon;i++) {

			System.out.print((i+1) + "�̸�?");//suzi   
			            
			name[i] = sc.next();

			System.out.print("����?");//40
			score[i] = sc.nextInt();
		}

		//���� �ʱ�ȭ

		for(i=0;i<inwon;i++) {
			rank[i]=1;//rank[i]++	 //	
		}

		//���� �����

		for(i=0;i<inwon-1;i++) {			

			for(j=i+1;j<inwon;j++) {

				if(score[i]>score[j]) {
					rank[j]++;

				}else if (score[i]<score[j])
					rank[i]++;

			}
		}


		//���� ������������ ����
		//Selection Sort

		for(i=0;i<inwon-1;i++) {			

			for(j=i+1;j<inwon;j++) {


				if(score[i]<score[j]) {

					//���� �ڸ��ٲ�
					t1 = score[i];
					score[i] = score[j];
					score[j] = t1;

					//�̸� �ڸ��ٲ�
					t2 = name[i];
					name[i] = name[j];
					name[j] = t2;

					//���� �ڸ��ٲ�
					t3 = rank[i];
					rank[i] = rank[j];
					rank[j] = t3;


				}
			}
		}


		for(i=0;i<inwon;i++) {
			System.out.printf("%6s %4d %4d\n",name[i],score[i],rank[i]);

		}

	}
}
