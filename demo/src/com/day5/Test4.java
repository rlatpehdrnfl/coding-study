package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// Selection Sort : ���� �������� �������� �����ϴ� ��
		int i,j,temp;

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		System.out.print("5���� ���� �Է�");// 5 7 6 2 3
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt() ;
		}
		
		
		System.out.print("Source Data:");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();

		//����
		for(i=0;i<num.length-1;i++) {			//selection sort ������ �� �� ���� �ϱ�

			for(j=i+1;j<num.length;j++) {

				//System.out.println(i + ":" + j);

				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
			}
		}
		System.out.print("Sorted Data:");
		for(int su : num) {			 //Ȯ��for��  for(������ : �迭)
			System.out.printf("%4d",su);
		}
		System.out.println();
	}
}