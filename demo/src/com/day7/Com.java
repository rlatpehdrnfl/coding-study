package com.day7;

import java.util.Scanner;

public class Com {

	int w,h;//instance 변수, 전역변수, default가 초기화되어 있음
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로?");
		w = sc.nextInt();
		
		System.out.println("세로?");
		h = sc.nextInt();
		
		//return;//stop의 의미, void일 때는 써야하는게 정석
		
	}
	
	public int area( ) {
		
		int result;
		
		result = w*h;  //넓이
		
		return result;
 		
	}
	
	public int length( ) {
		
	return (w+h)*2; //둘레
		
	}
	/*public int length( ) {
		
		int result;
		
		result = (w+h)*2;
		
		return result;
		
	}
*/
	public void print(int area,int length) { //int a : 인수, 매개변수
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + area);
		System.out.println("둘레: " + length);
	}
	
	
	
}
