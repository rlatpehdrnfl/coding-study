package com.day6;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler;

public class Assignment2 {

	public static void main(String[] args) throws IOException {

		/*2. 1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임
   (3번안에 알아맞추지 못하면 발생된 난수를 출력)

	예)
	정수입력?[1번째기회] : 3
	틀렸어요!!
	정수입력?[2번째기회] : 5
	틀렸어요!!
	정수입력?[3번째기회] : 7
	틀렸어요!!

	정답은 2입니다

	계속할래?[Y/N] : 
	------------------------------
	정수입력?[1번째기회] : 7
	틀렸어요!!
	정수입력?[2번째기회] : 4
	틀렸어요!!
	정수입력?[3번째기회] : 9
	맞았어요!!

	정답은 9입니다

	계속할래?[Y/N] : 
		 */


		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		int[] num = new int[1];
		char ch;

		int i,a,k;
		int n=1;	
		while(true) {



			num[0] = rd.nextInt(10)+1;

			while(n<4) {					//몇번을 반복해야하는지 몰라서 while문 쓰는 것


				System.out.println("정수입력?");
				a = sc.nextInt();


				if (a!=num[0]) {
					System.out.println("틀렸어요!");
				}else {
					System.out.println("맞았어요!");
					break;
				}
				n++;
			}
		}


		/*
		int n1=1;
		if (n1 == 4) {
		System.out.println("정답은" + num[0] + "입니다");


			System.out.print("계속할래[Y/N]?");

			ch = (char)System.in.read();		 

			if(ch!='y'&& ch!='Y') { 
				break;

			}
		 */
	}
}










