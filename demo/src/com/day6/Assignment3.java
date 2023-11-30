package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		/*
 3. 1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
  1:가위, 2:바위, 3:보

예)
1:가위, 2:바위, 3:보 ?1
컴퓨터 :보 사람 :가위
당신이 이겼습니다

1:가위, 2:바위, 3:보 ?1
컴퓨터 :바위 사람 :가위
컴퓨터가 이겼습니다

		 */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int rps,su,num = 0,n=0;

		do {
		System.out.print("1:가위, 2:바위, 3:보 ? ");
		rps = sc.nextInt();					
		}while (rps<1 || rps>3);
			

		num = rd.nextInt(2)+1;

		

		System.out.println("컴퓨터" + num + "사람 :" + rps);

		if (num>rps) {
			System.out.println("컴퓨터가 이겼습니다");
		}else if (num<rps) {
			System.out.println("사람이 이겼습니다");
		}else {
			System.out.println("비겼습니다");
		}
	}
}


