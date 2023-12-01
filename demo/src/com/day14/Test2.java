package com.day14;
//공부 ㄴㄴ

//내부 클래스2(Local)

//메소드 안에 클래스가 들어감

class Outer2 {

	static int a = 10;
	int b = 20;

	public void write() {

		int c = 30;// 지역변수
		final int D = 40;

		class Local {

			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(D);

			}

		}

		Local ob = new Local();// 메소드 안에 있는 클래스는 메소드 안에서만 클래스를 생성할 수 있음
		ob.print();
	}

}

public class Test2 {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		out.write();

	}

}
