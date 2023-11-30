package com.day6;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		//1. 5개의 정수를 입력받아 입력받은 수를 출력하고 입력받은 수중
		//   가장 큰수와 적은수를 출력

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int temp;
		
		System.out.println("5개의 수를 입력하시오");
		
		
		for(int i=0;i<num.length;i++) {
			num[i]= sc.nextInt();
			System.out.println("num[" + i + "]: " + num[i]);
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				
				if (num[i]<num[j]) {
					temp = num[i];
					num[i] = num[j];
				
					num[i] = temp;
					
					
					
				}
			}
		}System.out.println("가장 작은 수: " + num[0] + "가장 큰 수: " + num[4]);
		
		
		
		
		
	}

}
