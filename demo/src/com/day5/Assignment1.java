package com.day5;

public class Assignment1 {

	public static void main(String[] args) {
		
		/*
		1. 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��
		¦���� : 2550
		Ȧ���� : 2500
		�� : 5050
		*/
		
		int n,sum=0,sum1=0,sum2=0;
		
		//100���� �� : sum1
		
		for (n=1;n<=100;n++) {
			sum+=n;
		}
		System.out.println(sum);
			
			
		//¦����
		
		for (n=2;n<=100;n+=2) {
			sum1+=n;
		}
		System.out.println(sum1);

		//Ȧ����
		
		for (n=1;n<=100;n+=2) {
			sum2+=n;
		}
		System.out.println(sum2);
		
		
		
	}

}
