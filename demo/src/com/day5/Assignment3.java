package com.day5;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,i,sum=0,temp;
		
		System.out.println("두 수를 입력하시오");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 >= num2) {
			
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (i=num1;num2>=i;i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
