package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//����޷� (�迭�ǽ�1)
		//�����
		Scanner sc = new Scanner(System.in);
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int y,m,nalsu,i,week;
		
		do {
			System.out.print("������ �Է��Ͻÿ�");//2023
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("��?");//11
			m = sc.nextInt();
		}while(m<1||m>12);
		
		//y���� �������� Ȯ���ؼ� 2���� ���� ���ϱ�
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
			//System.out.println("����");
		}
		
		//���⵵(y-1��)12��31�ϱ����� ����
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;  //���⸸ ���	//and�� ���� or�� ���ϱ�		
		//int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;	// ���� ���
		//System.out.println(nalsu + ":" + yy);
				
		
		//y�� (m-1)�������� ����
		//index : 0 ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11
		//�迭 : {31,28,31,30,31,30,31,31,30,31,30,31};
		//��(m):  1  2  3  4  5  6  7  8  9  10  11  12
		
		for(i=0;i<m-1;i++) {
			nalsu += months[i]; //nalsu = nalsu + months[i]	//+=�� �����̴�
			
		}
		
		//y�� m�� 1�� ������ ����
		nalsu += 1;
		
		//y��m��1���� ���� �������� Ȯ��(0~6)
		week = nalsu%7;
		
		//System.out.println(week);
		
		//�޷� ���
		System.out.printf("%13d�� %d��",y, m);
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
		//�տ� ����� ä���
		for(i=0;i<week;i++) {
			System.out.print("    ");//4byte = ���� 4ĭ
		}
		
		//���� ��¥ ���
		for(i=1;i<=months[m-1];i++) {
			System.out.printf("%4d", i);
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("------------------------------");

		
		
		
	}

}
