package com.day5;

import java.util.Iterator;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//�迭                                        	//�迭�� ����,��,�������� �˱� ������ for���� ��
		//int num[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];							//�迭�� ���� �ص� �ʱ�ȭ�� �Ǿ�����

		System.out.println("5���� ���� �Է�"); // 6 8 2 5 10
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println(num.length + "��");  		//�迭�� �ִ� length��� �޼ҵ�� �ڿ� ()�� �ȿ�.
		
		for(int i=0;i<num.length;i++) {					//length�� ���� <=�� �ƴ� <�� ����
			System.out.println("num[" + i + "]: " + num[i]);
			
		}
		
		
		
		System.out.println("-------------------");
		num[2] = 300;
		
		System.out.println("num[2]: " + num[2]);

		num[4] = num[0];
		System.out.println("num[4]: " + num[4]);

		int a;
		a = num[2];
		System.out.println(a);
		
		
		a = num[1] + num[2];
		System.out.println(a);
		
		
	}

}
