package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args)  {

		/*6. �̸��� 3������ ������ �Է� �޾� �������ǿ� ���� ���
		-��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
		-�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
		-����� 60�� �̸��̸� ���հ�
		 */
		

		Scanner sc = new Scanner(System.in);


		int num1,num2,num3,avg;
		String name;


		System.out.println("�̸� ����1 ����2 ����3");
		name = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		avg = (num1 + num2 + num3)/3;



		if (avg>=60) {

			if (num1>=40 && num2>=40 && num3>=40) {

				System.out.println("�հ�");
			}else  {
				System.out.println("����");
			}
		}
		else {
			System.out.println("���հ�");
		}

		
		
	}

}



/*

if (num1>=40 && num2>=40 && num3>=40) {
	if (avg>=60) {
		System.out.println("�հ�");

	}
}else if (num1<40 || num2<40 || num3<40) {
	if (avg<= 60) {
		System.out.println("����");
	}
}else if(avg<=60) {
	System.out.println("���հ�");
}
//if (num1<40 || num2<40 || num3<40) {
//	if (avg<= 60) {
//		System.out.println("����");

 */

