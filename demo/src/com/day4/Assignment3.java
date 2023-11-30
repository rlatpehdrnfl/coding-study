package com.day4;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		//3. 네 개의 정수를 입력받고 제일 큰 숫자와 제일 작은 숫자를 구분해서 출력(if문)



		Scanner sc = new Scanner(System.in);

		int a,b,c,d,max=0,min=0;

		System.out.print("4개의 정수입력 ?");

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();

		max = min = a;

		if(a > max)
			max = a;

		if(a < min)
			min = a;

		if(b > max)
			max = b;

		if(b < min)
			min = b;

		if(c > max)
			max = c;

		if(c < min)
			min = c;

		if(d > max)
			max = d;

		if(d < min)
			min = d;

		//else if나 삼항 연산자로는 불가능

		System.out.println("제일 큰 숫자 "+ max +", 제일 작은 숫자 "+ min);

	}





}





