package com.day7;

import java.util.Scanner;

class Hap{

	int su, sum; //매소드 바깥 클래스 안에 만든 인스턴스 변수이기 때문에 0이 들어가 있음

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 하나입력?");//100
		su = sc.nextInt();

	}

	public int cnt( ) {

		for(int i=1;i<=su;i++) {
			sum+=i; // sum = sum + i
		}
		return sum;

	}

	public void print(int i) {
		System.out.println("합계: " + i);
	}

}

public class Test4 {

	public static void main(String[] args) {

		Hap ob = new Hap();
		
		ob.input();
		int sum = ob.cnt();
		ob.print(sum);

	}

}
//main이 있는 곳에만 public이 있어야 한다