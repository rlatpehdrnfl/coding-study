package com.day4;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		//2. �� ���� ������ �Է¹ް� ���� ū ���ڿ� ���� ���� ���ڸ� �����ؼ� ���
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,temp;
		
		System.out.print("�� ���� ������ �Է��Ͻÿ�");
		num1= sc.nextInt();
		num2= sc.nextInt();
		
		if (num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("���: %d %d",num1,num2);
		

	}

}
