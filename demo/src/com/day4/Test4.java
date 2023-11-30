package com.day4;

public class Test4 {

	public static void main(String[] args) {
		
		int n,sum=0;
		
		//100까지의 합
		for(n=1;n<=100;n++) {//n=n+1
			sum+=n; //sum = sum + n;
		}
		
		//홀수의 합
		sum=0;
		for(n=1;n<=100;n+=2) {//n=n+2
			sum+=n;
		}
	
		//짝수의 합
		sum=0;
		for(n=2;n<=100;n+=2) {
			sum+=n;//sum = sum + n;
		}
		
		System.out.println("결과: " + sum);
		
		//3의 배수의 합
		sum=0;
		for(n=3;n<=100;n+=3) {
			sum+=n;
		}
		
		System.out.println("결과: " + sum);
		
		

	}

}
