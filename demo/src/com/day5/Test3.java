package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//���� ���ϱ�
		//��?2023
		//��?11
		//��?20
		//2023�� 11�� 20�� ������

		Scanner sc = new Scanner(System.in);

		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int y,m,d,nalsu,i,week;
		String yoil;

		do {
			System.out.print("�⵵?");//2023
			y = sc.nextInt();
		}while(y<1);


		//y���� �������� Ȯ���ؼ� 2���� ���� ���ϱ�
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}

		

		do {
			System.out.print("��?");//11
			m = sc.nextInt();
		}while(m<1||m>12);

		//��
		do {
			System.out.println("��?");//20
			d = sc.nextInt();
		}while(m<0||d>months[m-1]);

		//����
		yoil = "";



		//���⵵(y-1��)12��31�ϱ����� ����
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;  //���⸸ ���


		for(i=0;i<m-1;i++) {
			nalsu += months[i]; //nalsu = nalsu + months[i]

		}

		//
		nalsu +=d; //nalsu = nalsu + d

		//y��m��1���� ���� �������� Ȯ��(0~6)
		week = nalsu%7;

		//System.out.println(week);

		//���� ���
		/*
			if (nalsu%7 == 0) {
				yoil = "�Ͽ���";
			}else if (nalsu%7 == 1) {
				yoil = "������";
			}else if (nalsu%7 == 2) {
				yoil = "ȭ����";
			}else if (nalsu%7 == 3) {
				yoil = "������";
			}else if (nalsu%7 == 4) {
				yoil = "�����";
			}else if (nalsu%7 == 5) {
				yoil = "�ݿ���";
			}else  {
				yoil = "�����";
			}

			System.out.printf("%d" + "��" + "%d" +"��" + "%d" +"��" + "%s" ,y,m,d,yoil);

		 */
		//�迭 �����
		//String yoil1[] = {"��","��","ȭ","��","��","��","��"};

		//System.out.printf("%d�� %d�� %d�� %s����",y,m,d,yoil1[week]);

		char yoil1[] = {'��','��','ȭ','��','��'
				,'��','��'};

		System.out.printf("%d�� %d�� %d�� %c����",y,m,d,yoil1[week]);

	}

}


