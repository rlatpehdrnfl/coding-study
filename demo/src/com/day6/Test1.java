package com.day6;

import java.util.Scanner;
import com.day2.Test3;

public class Test1 {

	public static void main(String[] args) {

		//10명 이내의 이름과 점수를 입력받아 
		//점수를 내림차순으로 출력(큰값~작은값)

		Scanner sc = new Scanner(System.in);

		String name[];
		int score[];
		int[] rank;  // []의 위치는 중요하지 않음

		int inwon,i,j,t1,t3;
		String t2;

		do {
			System.out.print("인원수[1~10]?");//3
			inwon = sc.nextInt();

		}while(inwon<1||inwon>10);

		//배열의 메모리 할당(객체 생성)
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];


		for (i=0;i<inwon;i++) {

			System.out.print((i+1) + "이름?");//suzi   
			            
			name[i] = sc.next();

			System.out.print("점수?");//40
			score[i] = sc.nextInt();
		}

		//석차 초기화

		for(i=0;i<inwon;i++) {
			rank[i]=1;//rank[i]++	 //	
		}

		//석차 만들기

		for(i=0;i<inwon-1;i++) {			

			for(j=i+1;j<inwon;j++) {

				if(score[i]>score[j]) {
					rank[j]++;

				}else if (score[i]<score[j])
					rank[i]++;

			}
		}


		//점수 내림차순으로 정렬
		//Selection Sort

		for(i=0;i<inwon-1;i++) {			

			for(j=i+1;j<inwon;j++) {


				if(score[i]<score[j]) {

					//점수 자리바꿈
					t1 = score[i];
					score[i] = score[j];
					score[j] = t1;

					//이름 자리바꿈
					t2 = name[i];
					name[i] = name[j];
					name[j] = t2;

					//석차 자리바꿈
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
