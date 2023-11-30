package com.day12;

//final : 상수변수
//instance 변수에 final을 붙이면 : 한번만 초기화 가능
//Method에 final을 붙이면 "Override"가 불가
//Class에 final을 붙이면 상속이 불가하다

class TestB {

	public static final double PI;

	static {
		PI = 3.14;
	}

	// PI// = 3.1415;

	public double area;

	public void write(String title) {
		System.out.println(title + ":" + area);
	}

	public void circleArea(int r) {
		area = r * r * PI;
	}
}

public class Test3 extends TestB {

	// @Override
	// public void write(String title){
	// System.out.println("야호~~~");
	// }

	public static void main(String[] args) {

		Test3 ob = new Test3();
		ob.circleArea(10);
		ob.write("원");

	}
}
