package com.day4;

public class Test4 {

	public static void main(String[] args) {
		
		int n,sum=0;
		
		//100������ ��
		for(n=1;n<=100;n++) {//n=n+1
			sum+=n; //sum = sum + n;
		}
		
		//Ȧ���� ��
		sum=0;
		for(n=1;n<=100;n+=2) {//n=n+2
			sum+=n;
		}
	
		//¦���� ��
		sum=0;
		for(n=2;n<=100;n+=2) {
			sum+=n;//sum = sum + n;
		}
		
		System.out.println("���: " + sum);
		
		//3�� ����� ��
		sum=0;
		for(n=3;n<=100;n+=3) {
			sum+=n;
		}
		
		System.out.println("���: " + sum);
		
		

	}

}
