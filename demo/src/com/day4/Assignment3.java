package com.day4;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		//3. �� ���� ������ �Է¹ް� ���� ū ���ڿ� ���� ���� ���ڸ� �����ؼ� ���(if��)



		Scanner sc = new Scanner(System.in);

		int a,b,c,d,max=0,min=0;

		System.out.print("4���� �����Է� ?");

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

		//else if�� ���� �����ڷδ� �Ұ���

		System.out.println("���� ū ���� "+ max +", ���� ���� ���� "+ min);

	}





}





