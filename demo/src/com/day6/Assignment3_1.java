package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Assignment3_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] str = {"����","����","��"};
		Random rd = new Random();
		
		int com = rd.nextInt(3)+1;
		
		//System.out.println(com);

		int user;
		do {
			System.out.println("1:����, 2:����, 3:��");
			user = sc.nextInt();
		}while(user<1||user>3);
		
		
		System.out.println("�����: " + str[user-1] + ", ��ǻ��: " + str[com-1]);
		
		String result;
		
		result = "���º� �Դϴ�";
				
		if((user==1 && com==3) || (user>com && !(com==1 && user ==3))) {
			result = "����ڰ� �̰���ϴ�";
		}
		
		if((com==1 && user==3) || (com>user && !(user==1 && com==3))) {
			result = "��ǻ�Ͱ� �̰���ϴ�";
		}
		System.out.println("���: " + result);
	}

}
