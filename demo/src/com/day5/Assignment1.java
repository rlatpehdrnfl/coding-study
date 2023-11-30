package com.day5;

public class Assignment1 {

	public static void main(String[] args) {
		
		/*
		1. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
		짝수합 : 2550
		홀수합 : 2500
		합 : 5050
		*/
		
		int n,sum=0,sum1=0,sum2=0;
		
		//100까지 합 : sum1
		
		for (n=1;n<=100;n++) {
			sum+=n;
		}
		System.out.println(sum);
			
			
		//짝수합
		
		for (n=2;n<=100;n+=2) {
			sum1+=n;
		}
		System.out.println(sum1);

		//홀수합
		
		for (n=1;n<=100;n+=2) {
			sum2+=n;
		}
		System.out.println(sum2);
		
		
		
	}

}
