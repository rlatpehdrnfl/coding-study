package com.day9;

import java.util.Scanner;

//생성자
//메모리를 할당 받을때 사용
//생성자는 클래스의 이름과 같다!!
//리턴값이 없기 때문에 property(반환값void, int...)가 없다!!
//property는 메소드만 가지고 있다
//중복정의가 가능하다
//객체생성,!!변수 초기화!!
//생성자 안에서 생성자 호출이 가능하다
//단 제일 선두에서만 가능하다


public class Test5 {

	private int x;
	
	public void set(int x) {
		this.x = x;
	}
	
	public Test5() {
		
		//this(200); //this는 클래스 이름
		System.out.println("기본 생성자");
		
	}
	//생성자 메모리 할당, 변수 초기화 할 때 사용
	
	
	public Test5(int x) {
		this(); // 생성자에서 생성자를 호출할 때는 무조건 맨 위에
		System.out.println("오버로딩된 생성자...");
		this.x = x;
		System.out.println("x: " + this.x);
	}
	
	public void print() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {

		Test5 ob1 = new Test5();
		ob1.set(10);
		ob1.print();

		Test5 ob2 = new Test5(100);
		ob2.print();
		
		
		//Scanner sc = new Scanner();
		
				
	}

}
