package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// Selection Sort : 왼쪽 기준으로 오름차순 정리하는 법
		int i,j,temp;

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		System.out.print("5개의 정수 입력");// 5 7 6 2 3
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt() ;
		}
		
		
		System.out.print("Source Data:");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();

		//정렬
		for(i=0;i<num.length-1;i++) {			//selection sort 공식은 두 줄 정도 암기

			for(j=i+1;j<num.length;j++) {

				//System.out.println(i + ":" + j);

				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
			}
		}
		System.out.print("Sorted Data:");
		for(int su : num) {			 //확장for문  for(변수명 : 배열)
			System.out.printf("%4d",su);
		}
		System.out.println();
	}
}