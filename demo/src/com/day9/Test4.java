package com.day9;

import java.util.Scanner;

class Rect{

	private int w,h;

	public void set(int w,int h) {
		this.w = w;
		this.h = h;
	}

	public int area() {
		return w*h;
	}

	public int length() {
		return(w+h)*2;
	}

	public void print(int a, int l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}

	//메소드 중복정의(overloading)
	//하나의 클래스 안에서 작업이 비슷한 메소드의 이름을 통일시키는 작업
	//메소드의 이름은 통일시키고 매개변수의 개수나 자료형이 다르면 다른 메소드로 인식한다

	public void print() {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
	}

	public void print(int a) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
	}

	//자료형이 틀리면 다른 메소드로 인식되어 충돌이 안난다
	public void print(double l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("둘레: " + l);
	}
}





public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rect ob = new Rect();

		int w,h;

		System.out.println("가로?");
		w = sc.nextInt();

		System.out.println("세로?");
		h = sc.nextInt();

		ob.set(w,h);
		int a = ob.area();
		int l = ob.length();
		
		ob.print(a, l);
		ob.print();
		ob.print(a);
		ob.print(l);

		

	}

}
