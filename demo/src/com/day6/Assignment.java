package com.day6;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		//1. 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� ����
		//   ���� ū���� �������� ���

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int temp;
		
		System.out.println("5���� ���� �Է��Ͻÿ�");
		
		
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
		}System.out.println("���� ���� ��: " + num[0] + "���� ū ��: " + num[4]);
		
		
		
		
		
	}

}
