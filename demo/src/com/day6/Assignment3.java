package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		/*
 3. 1~3������ ������ �߻����� ����,����,�� ���� ���α׷� �ۼ�
  1:����, 2:����, 3:��

��)
1:����, 2:����, 3:�� ?1
��ǻ�� :�� ��� :����
����� �̰���ϴ�

1:����, 2:����, 3:�� ?1
��ǻ�� :���� ��� :����
��ǻ�Ͱ� �̰���ϴ�

		 */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int rps,su,num = 0,n=0;

		do {
		System.out.print("1:����, 2:����, 3:�� ? ");
		rps = sc.nextInt();					
		}while (rps<1 || rps>3);
			

		num = rd.nextInt(2)+1;

		

		System.out.println("��ǻ��" + num + "��� :" + rps);

		if (num>rps) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		}else if (num<rps) {
			System.out.println("����� �̰���ϴ�");
		}else {
			System.out.println("�����ϴ�");
		}
	}
}


