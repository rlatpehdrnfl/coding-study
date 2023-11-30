package com.day5;

public class Assignment2 {

	public static void main(String[] args) {
		//2. 1에서 100까지의 수중 3의 배수의 갯수
		//3의 배수의 개수 : 33
		
		/*3의 배수의 합
		int n,sum=0;
		for(n=3;n<=100;n+=3) {
			sum+=n;
		}
		
		System.out.println("결과: " + sum);
		*/
		
		
		int count=0;
				
		for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
		System.out.println(count);
		
		
		
	}

}
