package com.day14;

//내부클래스1(inner class)
//클래스 안에 클래스가 들어감

class Outer1 {

	static int a = 10; // 스테틱 변수
	int b = 20; // 앞에 protected가 생략되어 있음 /인스턴스변수

	// Outer1이 객체가 생성이 안되면 Inner1도 객체가생성이 안됨
	// Outer1이 객체가 생성됐다고 해서 Inner1이 객체가 생성된 것은 아니다

	// Nested Class
	public class Inner1 {// 객체 생성하는 2가지 방법이 있음(내부 생성/밖에서 생성)

		int c = 30;

		public void write() {

			System.out.println(a);// 왜 에러가 안날까?
			System.out.println(b);// 순서대로 거쳐와야 함
			System.out.println(c);
		}

	}

	public void print() {
		Inner1 ob = new Inner1();
		ob.write();

	}

}

public class Test1 {

	public static void main(String[] args) {

		// 밖에서 생성
		Outer1 out = new Outer1();// 기본

		out.print();// 첫번째 방법

		Outer1.Inner1 in = out.new Inner1();// 두번째 방법
		in.write();

	}

}
