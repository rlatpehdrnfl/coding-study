package com.day9;

//생성자,static,초기화블럭

public class Test7 {

	int a = 5;//인스턴스 블럭

	{//초기화 블럭 : new를 만나면 자동으로 실행이 되고 한번 실행되면 다시는 실행하지 않음
		System.out.println("초기화 블럭a: " + a);
		a = 10;
		System.out.println("초기화 블럭a: " + a);
	}

	static int b;

	static { // static 블록은 new를 만나지 않아도 자동으로 메모리에 올라감
		b= 10;
		System.out.println("static 블럭b: " + b);
	}

	final int C;//상수변수 : 대문자로 씀, 상수는 항상 만드는 그 순간에 초기화를 해야 함

	public Test7() {
		System.out.println("생성자...");
		C = 100;
		System.out.println("C: " + C);
	}
	
	
	
	public static void main(String[] args) {

		Test7 ob1 = new Test7();
		
		Test7 ob2 = new Test7();

		
		
		
	}

}
