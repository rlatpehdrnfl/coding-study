package com.day5;

import java.util.Iterator;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//배열                                        	//배열은 시작,끝,증가값을 알기 때문에 for문을 씀
		//int num[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];							//배열은 선언만 해도 초기화가 되어있음

		System.out.println("5개의 정수 입력"); // 6 8 2 5 10
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println(num.length + "개");  		//배열에 있는 length라는 메소드는 뒤에 ()가 안옴.
		
		for(int i=0;i<num.length;i++) {					//length를 쓰면 <=가 아닌 <를 쓴다
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
