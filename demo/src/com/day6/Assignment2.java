package com.day6;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler;

public class Assignment2 {

	public static void main(String[] args) throws IOException {

		/*2. 1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ����
   (3���ȿ� �˾Ƹ����� ���ϸ� �߻��� ������ ���)

	��)
	�����Է�?[1��°��ȸ] : 3
	Ʋ�Ⱦ��!!
	�����Է�?[2��°��ȸ] : 5
	Ʋ�Ⱦ��!!
	�����Է�?[3��°��ȸ] : 7
	Ʋ�Ⱦ��!!

	������ 2�Դϴ�

	����ҷ�?[Y/N] : 
	------------------------------
	�����Է�?[1��°��ȸ] : 7
	Ʋ�Ⱦ��!!
	�����Է�?[2��°��ȸ] : 4
	Ʋ�Ⱦ��!!
	�����Է�?[3��°��ȸ] : 9
	�¾Ҿ��!!

	������ 9�Դϴ�

	����ҷ�?[Y/N] : 
		 */


		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		int[] num = new int[1];
		char ch;

		int i,a,k;
		int n=1;	
		while(true) {



			num[0] = rd.nextInt(10)+1;

			while(n<4) {					//����� �ݺ��ؾ��ϴ��� ���� while�� ���� ��


				System.out.println("�����Է�?");
				a = sc.nextInt();


				if (a!=num[0]) {
					System.out.println("Ʋ�Ⱦ��!");
				}else {
					System.out.println("�¾Ҿ��!");
					break;
				}
				n++;
			}
		}


		/*
		int n1=1;
		if (n1 == 4) {
		System.out.println("������" + num[0] + "�Դϴ�");


			System.out.print("����ҷ�[Y/N]?");

			ch = (char)System.in.read();		 

			if(ch!='y'&& ch!='Y') { 
				break;

			}
		 */
	}
}










