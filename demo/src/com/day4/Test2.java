package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//�ݺ���(for,while,do~while)
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("���?");//7
		int dan = sc.nextInt();
		
		
		//for(���۰�;�ִ밪;������)  	//���۰�, ����, �߰����� �˰� ������
		for(int i1=1;i1<=9;i1++) {// i=i+1
			
			System.out.println(dan + "*" + i1 + "=" + (i1*dan));
			
		}
			
		System.out.println("------------------------------------------------");
		
		//���۰�                     	//����� �������� �� ��
		//while(�ִ밪(����)){			//while�� �ȿ� ���۰��� ������ �׻� 1�� ����
		//������						//DB���� ������ �����ö� ���� ��
		//}
		
		int j=1;
		while(j<=9) { // �ʱⰪ�� 0�� ��� =�� ������
			
			//j++; ����� ���� 7*10���� ���� -> 9���� �������� �ʱⰪ�� j=0���� �����ؾ� ��
			System.out.println(dan + "*" + j + "=" + (dan*j));
			j++;
		
		}
		
		System.out.println("------------------------------------------------");

		
		//���۰�						//�� ���� ������ ���� -> ���濡�� vlaue���� ���� �޾Ƴ� ��
		//do{ ������ }while(�ִ밪);
		int k=1;
		do {
			System.out.println(dan + "*" +k + "=" + (dan*k));
			k++;
		}while(k<=9);					
		

		//���ѷ��� 						//���������� ��� : break
		
		//while(true) {
		//	System.out.println("�����־�...");
		//}
		
		
		
		
	}

}
